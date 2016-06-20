package de.upb.lina.cfg.tools.stringrepresentation;


import de.upb.lina.cfg.controlflow.WriteDefChainTransition;
import de.upb.lina.cfg.tools.CFGConstants;
import de.upb.lina.cfg.tools.StringUtils;
import de.upb.llvm_parser.llvm.Store;


/**
 * This class is responsible for creating the string representation of
 * {@link WriteDefChainTransition}s. After initializing an object of this class with the write def
 * chain transition that needs a string representation, the representation can be obtained by
 * calling the {{@link #createStringRepresentation()} method.
 * 
 * @author Alexander Hetzer
 *
 */
public class WriteDefChainToStringConverter {

   private StringConversionManager stringConversionManager;
   private WriteDefChainTransition writeDefChainTransition;
   private Store store;


   /**
    * Creates a new write def chain to string converter, which can be used to create the string
    * representation of the given write def chain transition.
    * 
    * @param writeDefChainTransition the write def chain transition to produce a string
    *           representation of
    * @param stringConversionManager the string conversion manager, which should be used to clean
    *           strings
    */
   public WriteDefChainToStringConverter(WriteDefChainTransition writeDefChainTransition, StringConversionManager stringConversionManager) {
      this.writeDefChainTransition = writeDefChainTransition;
      if (!(writeDefChainTransition.getInstruction() instanceof Store)) {
         throw new RuntimeException("Instruction on write def chain transition " + writeDefChainTransition + " is not a store instruction.");
      }
      this.store = (Store) writeDefChainTransition.getInstruction();
      this.stringConversionManager = stringConversionManager;
   }


   /**
    * Creates the string representation of the write def chain given to this object at construction.
    * 
    * @return the string representation of the write def chain given to this object at construction
    */
   public String createStringRepresentation() {
      StringBuilder stringBuilder = new StringBuilder();
      if (needsAddressRedefinition() && needsValueRedefinition()) {

         // copyAddress := storeTargetAddress;
         appendAddressRedefinitionAssignment(stringBuilder);

         // copyValue := storeValue;
         appendValueRedefinitionAssignment(stringBuilder);

         // store(copyValue, copyAddress);
         appendStoreRedefinition(stringBuilder, getRedefinedValueName(), getRedefinedAddressName());

      } else if (needsValueRedefinition()) {

         // copyValue := storeValue;
         appendValueRedefinitionAssignment(stringBuilder);

         // store(copyValue, storeAddress);
         appendStoreRedefinition(stringBuilder, getRedefinedValueName(), getOriginalAddressName());

      } else if (needsAddressRedefinition()) {

         // copyAddress := storeTargetAddress;
         appendAddressRedefinitionAssignment(stringBuilder);

         // store(storeValue, copyAddress);
         appendStoreRedefinition(stringBuilder, getOriginalValueName(), getRedefinedAddressName());
      } else {
         throw new RuntimeException("Found write def chain transition " + writeDefChainTransition
               + " without any redefinition (neither value nor address)");
      }
      return stringBuilder.toString();
   }


   /**
    * Returns the name of the original value of the store instruction linked to the local write def
    * chain transition.
    * 
    * @return the name of the original value of the store instruction linked to the local write def
    *         chain transition
    */
   private String getOriginalValueName() {
      return stringConversionManager.parameterValueToString(store.getValue());
   }


   /**
    * Returns the name of the original address of the store instruction linked to the local write
    * def chain transition.
    * 
    * @return the name of the original address of the store instruction linked to the local write
    *         def chain transition
    */
   private String getOriginalAddressName() {
      return stringConversionManager.parameterValueToString(store.getTargetAddress());
   }


   /**
    * Returns the name of the redefined value linked to the local write def chain transition.
    * 
    * @return name of the redefined value linked to the local write def chain transition
    */
   private String getRedefinedValueName() {
      return stringConversionManager.addressToString(writeDefChainTransition.getCopyValue());
   }


   /**
    * Returns the name of the redefined address linked to the local write def chain transition.
    * 
    * @return name of the redefined address linked to the local write def chain transition
    */
   private String getRedefinedAddressName() {
      return stringConversionManager.addressToString(writeDefChainTransition.getCopyAddress());
   }


   /**
    * Appends the string representation of a store instruction using the given value and address to
    * store to the given string builder.
    * 
    * @param stringBuilder the string builder to append to
    * @param valueToStore the value to store
    * @param addressToStoreIn the address in which the vaue should be stored
    */
   private void appendStoreRedefinition(StringBuilder stringBuilder, String valueToStore, String addressToStoreIn) {
      stringBuilder.append(CFGConstants.STORE);
      stringBuilder.append(StringUtils.LEFT_BRACKET);
      stringBuilder.append(valueToStore);
      stringBuilder.append(", ");
      stringBuilder.append(addressToStoreIn);
      stringBuilder.append(StringUtils.RIGHT_BRACKET);
   }


   /**
    * Appends the string representation of the value redefinition assignment to the given string
    * builder.
    * 
    * @param stringBuilder the string builder to append to
    */
   private void appendValueRedefinitionAssignment(StringBuilder stringBuilder) {
      stringBuilder.append(getRedefinedValueName());
      stringBuilder.append(CFGConstants.ASSIGN);
      stringBuilder.append(getOriginalValueName());
      stringBuilder.append("; ");
   }


   /**
    * Appends the string representation of the address redefinition assignment to the given string
    * builder.
    * 
    * @param stringBuilder the string builder to append to
    */
   private void appendAddressRedefinitionAssignment(StringBuilder stringBuilder) {
      stringBuilder.append(getRedefinedAddressName());
      stringBuilder.append(CFGConstants.ASSIGN);
      stringBuilder.append(getOriginalAddressName());
      stringBuilder.append("; ");
   }


   /**
    * Checks whether the value of the store linked to the local write def chain transition needs a
    * redefinition.
    * 
    * @return {@code true} if the value of the store linked to the local write def chain transition
    *         needs a redefinition, else {@code false}
    */
   private boolean needsValueRedefinition() {
      return writeDefChainTransition.getCopyValue() != null;
   }


   /**
    * Checks whether the address of the store linked to the local write def chain transition needs a
    * redefinition.
    * 
    * @return {@code true} if the address of the store linked to the local write def chain
    *         transition needs a redefinition, else {@code false}
    */
   private boolean needsAddressRedefinition() {
      return writeDefChainTransition.getCopyAddress() != null;
   }
}
