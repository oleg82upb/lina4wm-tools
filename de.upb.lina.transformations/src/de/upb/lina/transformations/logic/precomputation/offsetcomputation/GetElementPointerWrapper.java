package de.upb.lina.transformations.logic.precomputation.offsetcomputation;


import java.util.List;

import org.eclipse.emf.ecore.EObject;

import de.upb.llvm_parser.llvm.Address;
import de.upb.llvm_parser.llvm.GetElementPtr;
import de.upb.llvm_parser.llvm.NestedGetElementPtr;
import de.upb.llvm_parser.llvm.Parameter;


public class GetElementPointerWrapper {

   private List<Parameter> indices;
   private Parameter aggregate;
   private Address result;

   private EObject wrappedObject;


   private GetElementPointerWrapper(List<Parameter> indices, Parameter aggregate, Address result, EObject wrappedObject)
   {
      this.indices = indices;
      this.aggregate = aggregate;
      this.result = result;
      this.wrappedObject = wrappedObject;
   }


   public GetElementPointerWrapper(GetElementPtr getElementPointer)
   {
      this(getElementPointer.getIndices(), getElementPointer.getAggregate(), getElementPointer.getResult(), getElementPointer);
   }


   public GetElementPointerWrapper(NestedGetElementPtr nestedGetElementPointer)
   {
      this(nestedGetElementPointer.getIndices(), nestedGetElementPointer.getAggregate(), null, nestedGetElementPointer);
   }


   public List<Parameter> getIndices()
   {
      return indices;
   }


   public Parameter getAggregate()
   {
      return aggregate;
   }


   public Address getResult()
   {
      return result;
   }


   public EObject getWrappedObject()
   {
      return wrappedObject;
   }


}
