package de.upb.lina.cfg.tools.strategies;


import java.util.Iterator;

import de.upb.lina.cfg.controlflow.AddressValuePair;
import de.upb.lina.cfg.controlflow.ControlFlowLocation;
import de.upb.lina.cfg.controlflow.ControlflowFactory;
import de.upb.lina.cfg.controlflow.EarlyReadTransition;
import de.upb.lina.cfg.controlflow.StoreBuffer;
import de.upb.lina.cfg.tools.CFGConstants;
import de.upb.lina.cfg.tools.EMemoryModel;
import de.upb.llvm_parser.llvm.Address;
import de.upb.llvm_parser.llvm.AddressUse;
import de.upb.llvm_parser.llvm.FunctionDefinition;
import de.upb.llvm_parser.llvm.Instruction;
import de.upb.llvm_parser.llvm.Load;
import de.upb.llvm_parser.llvm.Parameter;
import de.upb.llvm_parser.llvm.Store;


public class PSOGraphGenerator extends TSOGraphGenerator {

   public PSOGraphGenerator(FunctionDefinition function) {
      super(function);
   }


   @Override
   protected void addInstructionTransitions(ControlFlowLocation currentLocation, Instruction nextInstruction) {
      if (nextInstruction instanceof Store) {
         Store store = (Store) nextInstruction;
         int writeType = typeOfWriteDefChain(store);
         StoreBuffer nextBuffer = cloneStoreBuffer(currentLocation.getBuffer());
         Parameter addressParam = store.getTargetAddress();

         Address address = ((AddressUse) addressParam.getValue()).getAddress();
         if (writeType == CFGConstants.WDC_BOTH || writeType == CFGConstants.WDC_ADDRESS) {
            // write def chain, we need a variable copy
            address = getOrCreateAddressCopyForWDC(store);
            addressParam = getOrCreateParamForAddress(address, addressParam);
         }

         AddressValuePair pair = findAddressValuePairByAddress(nextBuffer, addressParam);
         if (pair == null) {
            // first entry for this location, create new address value pair
            pair = createAddressValuePairForWrite(currentLocation.getBuffer(), store);
            nextBuffer.getAddressValuePairs().add(pair);
         } else {
            // not the first entry, add to values of existing address value
            // pair
            Parameter value = store.getValue();
            if (writeType == CFGConstants.WDC_BOTH || writeType == CFGConstants.WDC_VALUE) {
               Address valueAddress = getOrCreateValueCopyForWDC(store);
               value = getOrCreateParamForAddress(valueAddress, store.getValue());
            }
            pair.getValues().add(value);
         }

         ControlFlowLocation nextLoc = getLocationByPcAndBuffer(currentLocation.getPc() + 1, nextBuffer);

         if (nextLoc == null) {
            nextLoc = createControlFlowLocation(currentLocation.getPc() + 1, nextBuffer);
            this.toBeProcessedLocations.add(nextLoc);
         }

         createWriteTransition(currentLocation, store, nextLoc, pair, writeType);
         return;

      } else if (nextInstruction instanceof Load && isEarlyRead(currentLocation, (Load) nextInstruction)) {
         ControlFlowLocation nextLoc = getLocationByPcAndBuffer(currentLocation.getPc() + 1, currentLocation.getBuffer());
         if (nextLoc == null) {
            nextLoc = createControlFlowLocation(currentLocation.getPc() + 1, cloneStoreBuffer(currentLocation.getBuffer()));
            this.toBeProcessedLocations.add(nextLoc);
         }

         createEarlyReadTransition(currentLocation, (Load) nextInstruction, nextLoc);
         return;
      }

      // else super will take care of it
      super.addInstructionTransitions(currentLocation, nextInstruction);
   }


   @Override
   protected void addFlushTransition(ControlFlowLocation sourceLocation) {
      StoreBuffer srcBuffer = sourceLocation.getBuffer();
      int srcPC = sourceLocation.getPc();

      if (srcBuffer.getAddressValuePairs().isEmpty()) {
         // nothing to flush
         return;
      }

      // create flush transition for each address entry in buffer
      Iterator<AddressValuePair> i = srcBuffer.getAddressValuePairs().iterator();
      while (i.hasNext()) {
         AddressValuePair pair = i.next();
         StoreBuffer targetBuffer = cloneStoreBuffer(srcBuffer);
         AddressValuePair targetPair = findAddressValuePairByAddress(targetBuffer, pair.getAddress());
         if (targetPair == null) {
            throw new RuntimeException("Could not compute flush transition for "
                  + stringConversionManager.bufferToString(srcBuffer, srcPC, getMemoryModel()));
         }

         if (targetPair.getValues().size() > 1) {
            // remove first value from pair and create a new AddressValuePair that will be attached to FlushTransition
            Parameter flushedValue = targetPair.getValues().remove(0);
            Parameter flushedAddress = targetPair.getAddress();
            
            AddressValuePair flushedEntry = ControlflowFactory.eINSTANCE.createAddressValuePair();
            flushedEntry.setAddress(flushedAddress);
            flushedEntry.getValues().add(flushedValue);
            targetPair = flushedEntry;
         } else {
            // remove pair, no need to create a new AVP as we can reuse it in the FlushTransition
            targetBuffer.getAddressValuePairs().remove(targetPair);
         }

         ControlFlowLocation targetLocation = getLocationByPcAndBuffer(srcPC, targetBuffer);
         if (targetLocation == null) {
            targetLocation = createControlFlowLocation(srcPC, targetBuffer);
            this.toBeProcessedLocations.add(targetLocation);
         }

         createFlushTransition(sourceLocation, targetLocation, targetPair);
      }

   }


   private AddressValuePair findAddressValuePairByAddress(StoreBuffer targetBuffer, Parameter address) {
      Iterator<AddressValuePair> i = targetBuffer.getAddressValuePairs().iterator();
      while (i.hasNext()) {
         AddressValuePair pair = i.next();
         String a = stringConversionManager.valueToString(address.getValue());
         String b = stringConversionManager.valueToString(pair.getAddress().getValue());
         if (a.equals(b)) {
            return pair;
         }
      }
      return null;
   }


   @Override
   protected EarlyReadTransition createEarlyReadTransition(ControlFlowLocation source, Load load, ControlFlowLocation target) {
      EarlyReadTransition transition = ControlflowFactory.eINSTANCE.createEarlyReadTransition();
      // there should be only on, so we actually don't care if it's the latest
      // or not
      AddressValuePair pair = getLatestBufferEntry(source, load);
      // last value
      int lastIndex = pair.getValues().size();
      Parameter value = pair.getValues().get(lastIndex - 1);
      String valueInBuffer = stringConversionManager.valueToString(value.getValue());
      transition.setAssignmentExpression(valueInBuffer);
      transition.setInstruction(load);
      transition.setDiagram(this.graph);
      transition.setSource(source);
      transition.setTarget(target);
      return transition;
   }


   @Override
   public EMemoryModel getMemoryModel() {
      return EMemoryModel.PSO;
   }

}
