package de.upb.lina.transformations.logic.precomputation.sizecomputation;

import org.eclipse.emf.ecore.EObject;

import de.upb.lina.cfg.tools.StringUtils;
import de.upb.llvm_parser.llvm.Array;
import de.upb.llvm_parser.llvm.Vector;


/**
 * This wrapper offers common functionality for both {@link Array}s and {@link Vector}s.
 * 
 * As {@link Array}s and {@link Vector}s do have the same functionality in our model, they can be
 * treated equally. Since they do not have a common interface, this wrapper is used to treat them
 * equivalently for the memory size computation, thus reducing redundant code.
 *
 */
public class ArrayVectorWrapper {

   private int length;
   private EObject type;
   private String pointer;


   public ArrayVectorWrapper(Array array)
   {
      this(array.getLength(), array.getType(), array.getPointer());
   }


   public ArrayVectorWrapper(Vector vector)
   {
      // TODO check why the vector has no pointer...
      this(vector.getLength(), vector.getType(), StringUtils.EMPTY_STRING);
   }


   private ArrayVectorWrapper(int length, EObject type, String pointer)
   {
      this.length = length;
      this.type = type;
      this.pointer = pointer;
   }


   public int getLength()
   {
      return length;
   }


   public EObject getType()
   {
      return type;
   }


   public String getPointer()
   {
      return pointer;
   }


}
