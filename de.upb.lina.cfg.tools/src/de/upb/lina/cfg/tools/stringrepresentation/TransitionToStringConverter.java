package de.upb.lina.cfg.tools.stringrepresentation;


import de.upb.lina.cfg.controlflow.AddressValuePair;
import de.upb.lina.cfg.controlflow.EarlyReadTransition;
import de.upb.lina.cfg.controlflow.FlushTransition;
import de.upb.lina.cfg.controlflow.Transition;
import de.upb.lina.cfg.controlflow.WriteDefChainTransition;
import de.upb.lina.cfg.tools.CFGConstants;
import de.upb.lina.cfg.tools.GraphUtility;
import de.upb.lina.cfg.tools.StringUtils;
import de.upb.llvm_parser.llvm.Load;


/**
 * This class is responsible for creating the string representation of a transition.
 * 
 * @author Alexander Hetzer
 *
 */
public class TransitionToStringConverter {

   private StringConversionManager stringConversionManager;


   /**
    * Creates an instance of the transition to string converter using the given string conversion
    * manager.
    * 
    * @param stringConversionManager the string conversion manager, which should be used to clean
    *           strings
    */
   public TransitionToStringConverter(StringConversionManager stringConversionManager) {
      this.stringConversionManager = stringConversionManager;
   }


   /**
    * Creates an instance of the transition to string converter using the given string conversion
    * manager.
    */
   public TransitionToStringConverter() {
      this.stringConversionManager = new StringConversionManager();
   }


   /**
    * Creates a string representation of the given transition, consisting of the name of the
    * instruction linked with the transition and its parameters.
    * 
    * @param transition the transition to create the string representation of
    * @return string representation of the transition
    */
   public String createStringRepresentationOfTransition(Transition transition) {

      // check for special transitions first
      if (transition instanceof FlushTransition) {
         FlushTransition flushTransition = (FlushTransition) transition;
         return createFlushTransitionStringRepresentation(flushTransition);
      } else if (transition instanceof EarlyReadTransition) {
         EarlyReadTransition earlyReadTransition = (EarlyReadTransition) transition;
         return createEarlyReadTransitionStringRepresentation(earlyReadTransition);
      } else if (transition instanceof WriteDefChainTransition) {
         WriteDefChainTransition writeDefChainTransition = (WriteDefChainTransition) transition;
         return createWriteDefChainTransitionStringRepresentation(writeDefChainTransition);
      }

      if (transition.getInstruction() == null) {
         return CFGConstants.TODO;
      }

      InstructionToStringConverter instructionToStringConverter = new InstructionToStringConverter(transition, stringConversionManager);
      return instructionToStringConverter.createStringRepresentation();
   }


   /**
    * Creates the string representation of the given write def chain transition and returns it.
    * 
    * @param writeDefChainTransition the write def chain transition for which a string
    *           representation should be computed
    * @return the string representation of the given write def chain transition
    */
   private String createWriteDefChainTransitionStringRepresentation(WriteDefChainTransition writeDefChainTransition) {
      WriteDefChainToStringConverter writeDefChainToStringConverter = new WriteDefChainToStringConverter(writeDefChainTransition,
            stringConversionManager);
      return writeDefChainToStringConverter.createStringRepresentation();
   }


   /**
    * Creates the string representation of the given early read transition and returns it.
    * 
    * @param earlyReadTransition the early read transition for which a string representation should
    *           be computed
    * @return the string representation of the given early read transition
    */
   private String createEarlyReadTransitionStringRepresentation(EarlyReadTransition earlyReadTransition) {
      if (!(earlyReadTransition.getInstruction() instanceof Load)) {
         throw new RuntimeException("Instruction on early read transition " + earlyReadTransition + " is not a load instruction.");
      }
      Load earlyReadLoad = (Load) earlyReadTransition.getInstruction();
      String loadAddressName = stringConversionManager.addressToString(earlyReadLoad.getResult());
      StringBuilder stringBuilder = new StringBuilder(loadAddressName);
      stringBuilder.append(CFGConstants.ASSIGN);
      stringBuilder.append(earlyReadTransition.getAssignmentExpression());
      return stringBuilder.toString();
   }


   /**
    * Creates the string representation of the given flush transition and returns it.
    * 
    * @param flushTransition the flush transition for which a string representation should be
    *           computed
    * @return the string representation of the given flush transition
    */
   private String createFlushTransitionStringRepresentation(FlushTransition flushTransition) {
      if (!flushTransition.getSource().getBuffer().getAddressValuePairs().isEmpty()) {
         StringBuffer stringBuffer = new StringBuffer(CFGConstants.FLUSH);
         AddressValuePair flushedAddressValuePair = GraphUtility.getFlushedAddressValuePair(flushTransition);
         if (flushedAddressValuePair != null) {
            stringBuffer.append(StringUtils.LEFT_BRACKET);
            stringBuffer.append(stringConversionManager.addressValuePairToString(flushedAddressValuePair));
            stringBuffer.append(StringUtils.RIGHT_BRACKET);
         } else {
            throw new RuntimeException("Found flush transition which flushes no buffer entry.");
         }
         return stringBuffer.toString();
      }

      throw new RuntimeException("Found flush transition for an empty buffer!");
   }

}
