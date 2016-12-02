package de.upb.lina.transformations.logic.precomputation.sizecomputation.exception;


import de.upb.lina.transformations.logic.precomputation.sizecomputation.TypeUtils;


/**
 * The {@link TypeExplorationException} indicates a problem during exploring attributes of types.
 * Usually this exception will only be thrown by {@link TypeUtils}.
 *
 */
public class TypeExplorationException extends RuntimeException {

   private static final long serialVersionUID = 9031196467302328602L;


   public TypeExplorationException(String message)
   {
      super(message);
   }


   public TypeExplorationException(Throwable cause)
   {
      super(cause);
   }


   public TypeExplorationException(String message, Throwable cause)
   {
      super(message, cause);
   }

}
