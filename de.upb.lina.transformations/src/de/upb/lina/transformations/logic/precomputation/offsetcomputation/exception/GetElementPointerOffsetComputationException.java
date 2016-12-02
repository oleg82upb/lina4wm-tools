package de.upb.lina.transformations.logic.precomputation.offsetcomputation.exception;


import de.upb.llvm_parser.llvm.GetElementPtr;


/**
 * The {@link GetElementPointerOffsetComputationException} indicates a problem during the offset
 * computation of a {@link GetElementPtr}.
 */
public class GetElementPointerOffsetComputationException extends RuntimeException {

   private static final long serialVersionUID = -6562933416141876943L;


   public GetElementPointerOffsetComputationException()
   {
      super();
   }

   public GetElementPointerOffsetComputationException(String message, Throwable cause)
   {
      super(message, cause);
   }

   public GetElementPointerOffsetComputationException(String message)
   {
      super(message);
   }
   
}
