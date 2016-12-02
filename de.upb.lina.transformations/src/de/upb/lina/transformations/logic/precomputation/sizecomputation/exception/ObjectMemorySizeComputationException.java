package de.upb.lina.transformations.logic.precomputation.sizecomputation.exception;


/**
 * The {@link ObjectMemorySizeComputationException} indicates a problem during the memory size
 * computation of an object.
 *
 */
public class ObjectMemorySizeComputationException extends RuntimeException {

   private static final long serialVersionUID = 1958119372522840302L;


   public ObjectMemorySizeComputationException(String message)
   {
      super(message);
   }


   public ObjectMemorySizeComputationException(String message, Throwable cause)
   {
      super(message, cause);
   }

}
