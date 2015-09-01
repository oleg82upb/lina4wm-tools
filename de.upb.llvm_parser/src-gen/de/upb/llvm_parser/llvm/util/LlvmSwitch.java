/**
 */
package de.upb.llvm_parser.llvm.util;

import de.upb.llvm_parser.llvm.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.upb.llvm_parser.llvm.LlvmPackage
 * @generated
 */
public class LlvmSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static LlvmPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LlvmSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = LlvmPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case LlvmPackage.LLVM:
      {
        LLVM llvm = (LLVM)theEObject;
        T result = caseLLVM(llvm);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.ABSTRACT_ELEMENT:
      {
        AbstractElement abstractElement = (AbstractElement)theEObject;
        T result = caseAbstractElement(abstractElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.TOP_LEVEL_ENTITY:
      {
        TopLevelEntity topLevelEntity = (TopLevelEntity)theEObject;
        T result = caseTopLevelEntity(topLevelEntity);
        if (result == null) result = caseAbstractElement(topLevelEntity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.MAIN_LEVEL_ENTITY:
      {
        MainLevelEntity mainLevelEntity = (MainLevelEntity)theEObject;
        T result = caseMainLevelEntity(mainLevelEntity);
        if (result == null) result = caseAbstractElement(mainLevelEntity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.TYPE_DEFINITION:
      {
        TypeDefinition typeDefinition = (TypeDefinition)theEObject;
        T result = caseTypeDefinition(typeDefinition);
        if (result == null) result = caseMainLevelEntity(typeDefinition);
        if (result == null) result = caseAbstractElement(typeDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.GLOBAL_DEFINITION:
      {
        GlobalDefinition globalDefinition = (GlobalDefinition)theEObject;
        T result = caseGlobalDefinition(globalDefinition);
        if (result == null) result = caseMainLevelEntity(globalDefinition);
        if (result == null) result = caseAbstractElement(globalDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.FUNCTION_DEFINITION:
      {
        FunctionDefinition functionDefinition = (FunctionDefinition)theEObject;
        T result = caseFunctionDefinition(functionDefinition);
        if (result == null) result = caseMainLevelEntity(functionDefinition);
        if (result == null) result = caseAbstractElement(functionDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.ALIAS_DEFINITION:
      {
        AliasDefinition aliasDefinition = (AliasDefinition)theEObject;
        T result = caseAliasDefinition(aliasDefinition);
        if (result == null) result = caseMainLevelEntity(aliasDefinition);
        if (result == null) result = caseAbstractElement(aliasDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.TYPE_USE:
      {
        TypeUse typeUse = (TypeUse)theEObject;
        T result = caseTypeUse(typeUse);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.ADDRESS_USE:
      {
        AddressUse addressUse = (AddressUse)theEObject;
        T result = caseAddressUse(addressUse);
        if (result == null) result = caseTypeUse(addressUse);
        if (result == null) result = caseValue(addressUse);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.ADDRESS:
      {
        Address address = (Address)theEObject;
        T result = caseAddress(address);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.PREDEFINED:
      {
        Predefined predefined = (Predefined)theEObject;
        T result = casePredefined(predefined);
        if (result == null) result = caseTypeUse(predefined);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.VECTOR:
      {
        Vector vector = (Vector)theEObject;
        T result = caseVector(vector);
        if (result == null) result = caseAggregate_Type(vector);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.ARRAY:
      {
        Array array = (Array)theEObject;
        T result = caseArray(array);
        if (result == null) result = caseAggregate_Type(array);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.AGGREGATE_TYPE:
      {
        Aggregate_Type aggregate_Type = (Aggregate_Type)theEObject;
        T result = caseAggregate_Type(aggregate_Type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.CONSTANT:
      {
        Constant constant = (Constant)theEObject;
        T result = caseConstant(constant);
        if (result == null) result = caseValue(constant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.DECIMAL_CONSTANT:
      {
        DecimalConstant decimalConstant = (DecimalConstant)theEObject;
        T result = caseDecimalConstant(decimalConstant);
        if (result == null) result = caseConstant(decimalConstant);
        if (result == null) result = caseValue(decimalConstant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.INTEGER_CONSTANT:
      {
        IntegerConstant integerConstant = (IntegerConstant)theEObject;
        T result = caseIntegerConstant(integerConstant);
        if (result == null) result = caseConstant(integerConstant);
        if (result == null) result = caseValue(integerConstant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.PRIMITIVE_VALUE:
      {
        PrimitiveValue primitiveValue = (PrimitiveValue)theEObject;
        T result = casePrimitiveValue(primitiveValue);
        if (result == null) result = caseValue(primitiveValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.VALUE:
      {
        Value value = (Value)theEObject;
        T result = caseValue(value);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.VALUE_STRUCT:
      {
        ValueStruct valueStruct = (ValueStruct)theEObject;
        T result = caseValueStruct(valueStruct);
        if (result == null) result = caseValue(valueStruct);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.STRUCTURE:
      {
        Structure structure = (Structure)theEObject;
        T result = caseStructure(structure);
        if (result == null) result = caseAggregate_Type(structure);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.PARAMETER:
      {
        Parameter parameter = (Parameter)theEObject;
        T result = caseParameter(parameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.PARAMETER_LIST:
      {
        ParameterList parameterList = (ParameterList)theEObject;
        T result = caseParameterList(parameterList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.FUNCTION_PARAMETER:
      {
        FunctionParameter functionParameter = (FunctionParameter)theEObject;
        T result = caseFunctionParameter(functionParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.FUNCTION_PARAMETER_LIST:
      {
        FunctionParameterList functionParameterList = (FunctionParameterList)theEObject;
        T result = caseFunctionParameterList(functionParameterList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.FUNCTION_BODY:
      {
        FunctionBody functionBody = (FunctionBody)theEObject;
        T result = caseFunctionBody(functionBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.INSTRUCTION:
      {
        Instruction instruction = (Instruction)theEObject;
        T result = caseInstruction(instruction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.BASIC_BLOCK:
      {
        BasicBlock basicBlock = (BasicBlock)theEObject;
        T result = caseBasicBlock(basicBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.ARITHMETIC_OPERATION:
      {
        ArithmeticOperation arithmeticOperation = (ArithmeticOperation)theEObject;
        T result = caseArithmeticOperation(arithmeticOperation);
        if (result == null) result = caseInstruction(arithmeticOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.ARITHMETIC_OPERATION_ADD:
      {
        ArithmeticOperationAdd arithmeticOperationAdd = (ArithmeticOperationAdd)theEObject;
        T result = caseArithmeticOperationAdd(arithmeticOperationAdd);
        if (result == null) result = caseArithmeticOperation(arithmeticOperationAdd);
        if (result == null) result = caseInstruction(arithmeticOperationAdd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.ARITHMETIC_OPERATION_FADD:
      {
        ArithmeticOperationFadd arithmeticOperationFadd = (ArithmeticOperationFadd)theEObject;
        T result = caseArithmeticOperationFadd(arithmeticOperationFadd);
        if (result == null) result = caseArithmeticOperation(arithmeticOperationFadd);
        if (result == null) result = caseInstruction(arithmeticOperationFadd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.ARITHMETIC_OPERATION_SUB:
      {
        ArithmeticOperationSub arithmeticOperationSub = (ArithmeticOperationSub)theEObject;
        T result = caseArithmeticOperationSub(arithmeticOperationSub);
        if (result == null) result = caseArithmeticOperation(arithmeticOperationSub);
        if (result == null) result = caseInstruction(arithmeticOperationSub);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.ARITHMETIC_OPERATION_FSUB:
      {
        ArithmeticOperationFsub arithmeticOperationFsub = (ArithmeticOperationFsub)theEObject;
        T result = caseArithmeticOperationFsub(arithmeticOperationFsub);
        if (result == null) result = caseArithmeticOperation(arithmeticOperationFsub);
        if (result == null) result = caseInstruction(arithmeticOperationFsub);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.ARITHMETIC_OPERATION_MUL:
      {
        ArithmeticOperationMul arithmeticOperationMul = (ArithmeticOperationMul)theEObject;
        T result = caseArithmeticOperationMul(arithmeticOperationMul);
        if (result == null) result = caseArithmeticOperation(arithmeticOperationMul);
        if (result == null) result = caseInstruction(arithmeticOperationMul);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.ARITHMETIC_OPERATION_FMUL:
      {
        ArithmeticOperationFmul arithmeticOperationFmul = (ArithmeticOperationFmul)theEObject;
        T result = caseArithmeticOperationFmul(arithmeticOperationFmul);
        if (result == null) result = caseArithmeticOperation(arithmeticOperationFmul);
        if (result == null) result = caseInstruction(arithmeticOperationFmul);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.ARITHMETIC_OPERATION_UDIV:
      {
        ArithmeticOperationUdiv arithmeticOperationUdiv = (ArithmeticOperationUdiv)theEObject;
        T result = caseArithmeticOperationUdiv(arithmeticOperationUdiv);
        if (result == null) result = caseArithmeticOperation(arithmeticOperationUdiv);
        if (result == null) result = caseInstruction(arithmeticOperationUdiv);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.ARITHMETIC_OPERATION_SDIV:
      {
        ArithmeticOperationSdiv arithmeticOperationSdiv = (ArithmeticOperationSdiv)theEObject;
        T result = caseArithmeticOperationSdiv(arithmeticOperationSdiv);
        if (result == null) result = caseArithmeticOperation(arithmeticOperationSdiv);
        if (result == null) result = caseInstruction(arithmeticOperationSdiv);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.ARITHMETIC_OPERATION_FDIV:
      {
        ArithmeticOperationFdiv arithmeticOperationFdiv = (ArithmeticOperationFdiv)theEObject;
        T result = caseArithmeticOperationFdiv(arithmeticOperationFdiv);
        if (result == null) result = caseArithmeticOperation(arithmeticOperationFdiv);
        if (result == null) result = caseInstruction(arithmeticOperationFdiv);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.ARITHMETIC_OPERATION_UREM:
      {
        ArithmeticOperationUrem arithmeticOperationUrem = (ArithmeticOperationUrem)theEObject;
        T result = caseArithmeticOperationUrem(arithmeticOperationUrem);
        if (result == null) result = caseArithmeticOperation(arithmeticOperationUrem);
        if (result == null) result = caseInstruction(arithmeticOperationUrem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.ARITHMETIC_OPERATION_SREM:
      {
        ArithmeticOperationSrem arithmeticOperationSrem = (ArithmeticOperationSrem)theEObject;
        T result = caseArithmeticOperationSrem(arithmeticOperationSrem);
        if (result == null) result = caseArithmeticOperation(arithmeticOperationSrem);
        if (result == null) result = caseInstruction(arithmeticOperationSrem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.ARITHMETIC_OPERATION_FREM:
      {
        ArithmeticOperationFrem arithmeticOperationFrem = (ArithmeticOperationFrem)theEObject;
        T result = caseArithmeticOperationFrem(arithmeticOperationFrem);
        if (result == null) result = caseArithmeticOperation(arithmeticOperationFrem);
        if (result == null) result = caseInstruction(arithmeticOperationFrem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.LOGIC_OPERATION:
      {
        LogicOperation logicOperation = (LogicOperation)theEObject;
        T result = caseLogicOperation(logicOperation);
        if (result == null) result = caseInstruction(logicOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.CAST:
      {
        Cast cast = (Cast)theEObject;
        T result = caseCast(cast);
        if (result == null) result = caseInstruction(cast);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.NESTED_CAST:
      {
        NestedCast nestedCast = (NestedCast)theEObject;
        T result = caseNestedCast(nestedCast);
        if (result == null) result = caseValue(nestedCast);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.META_ARG_VALUE:
      {
        MetaArgValue metaArgValue = (MetaArgValue)theEObject;
        T result = caseMetaArgValue(metaArgValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.META:
      {
        Meta meta = (Meta)theEObject;
        T result = caseMeta(meta);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.METADATA_VALUE:
      {
        MetadataValue metadataValue = (MetadataValue)theEObject;
        T result = caseMetadataValue(metadataValue);
        if (result == null) result = caseMainLevelEntity(metadataValue);
        if (result == null) result = caseAbstractElement(metadataValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.GET_ELEMENT_PTR:
      {
        GetElementPtr getElementPtr = (GetElementPtr)theEObject;
        T result = caseGetElementPtr(getElementPtr);
        if (result == null) result = caseInstruction(getElementPtr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.NESTED_GET_ELEMENT_PTR:
      {
        NestedGetElementPtr nestedGetElementPtr = (NestedGetElementPtr)theEObject;
        T result = caseNestedGetElementPtr(nestedGetElementPtr);
        if (result == null) result = caseValue(nestedGetElementPtr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.FENCE:
      {
        Fence fence = (Fence)theEObject;
        T result = caseFence(fence);
        if (result == null) result = caseInstruction(fence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.CMP_XCHG:
      {
        CmpXchg cmpXchg = (CmpXchg)theEObject;
        T result = caseCmpXchg(cmpXchg);
        if (result == null) result = caseInstruction(cmpXchg);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.ATOMIC_RMW:
      {
        AtomicRMW atomicRMW = (AtomicRMW)theEObject;
        T result = caseAtomicRMW(atomicRMW);
        if (result == null) result = caseInstruction(atomicRMW);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.ATOMIC_RMW_XCHG:
      {
        AtomicRmwXchg atomicRmwXchg = (AtomicRmwXchg)theEObject;
        T result = caseAtomicRmwXchg(atomicRmwXchg);
        if (result == null) result = caseAtomicRMW(atomicRmwXchg);
        if (result == null) result = caseInstruction(atomicRmwXchg);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.ATOMIC_RMW_ADD:
      {
        AtomicRmwAdd atomicRmwAdd = (AtomicRmwAdd)theEObject;
        T result = caseAtomicRmwAdd(atomicRmwAdd);
        if (result == null) result = caseAtomicRMW(atomicRmwAdd);
        if (result == null) result = caseInstruction(atomicRmwAdd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.ATOMIC_RMW_SUB:
      {
        AtomicRmwSub atomicRmwSub = (AtomicRmwSub)theEObject;
        T result = caseAtomicRmwSub(atomicRmwSub);
        if (result == null) result = caseAtomicRMW(atomicRmwSub);
        if (result == null) result = caseInstruction(atomicRmwSub);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.ATOMIC_RMW_AND:
      {
        AtomicRmwAnd atomicRmwAnd = (AtomicRmwAnd)theEObject;
        T result = caseAtomicRmwAnd(atomicRmwAnd);
        if (result == null) result = caseAtomicRMW(atomicRmwAnd);
        if (result == null) result = caseInstruction(atomicRmwAnd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.ATOMIC_RMW_NAND:
      {
        AtomicRmwNand atomicRmwNand = (AtomicRmwNand)theEObject;
        T result = caseAtomicRmwNand(atomicRmwNand);
        if (result == null) result = caseAtomicRMW(atomicRmwNand);
        if (result == null) result = caseInstruction(atomicRmwNand);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.ATOMIC_RMW_OR:
      {
        AtomicRmwOr atomicRmwOr = (AtomicRmwOr)theEObject;
        T result = caseAtomicRmwOr(atomicRmwOr);
        if (result == null) result = caseAtomicRMW(atomicRmwOr);
        if (result == null) result = caseInstruction(atomicRmwOr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.ATOMIC_RMW_XOR:
      {
        AtomicRmwXor atomicRmwXor = (AtomicRmwXor)theEObject;
        T result = caseAtomicRmwXor(atomicRmwXor);
        if (result == null) result = caseAtomicRMW(atomicRmwXor);
        if (result == null) result = caseInstruction(atomicRmwXor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.ATOMIC_RMW_MAX:
      {
        AtomicRmwMax atomicRmwMax = (AtomicRmwMax)theEObject;
        T result = caseAtomicRmwMax(atomicRmwMax);
        if (result == null) result = caseAtomicRMW(atomicRmwMax);
        if (result == null) result = caseInstruction(atomicRmwMax);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.ATOMIC_RMW_MIN:
      {
        AtomicRmwMin atomicRmwMin = (AtomicRmwMin)theEObject;
        T result = caseAtomicRmwMin(atomicRmwMin);
        if (result == null) result = caseAtomicRMW(atomicRmwMin);
        if (result == null) result = caseInstruction(atomicRmwMin);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.ATOMIC_RMW_UMAX:
      {
        AtomicRmwUmax atomicRmwUmax = (AtomicRmwUmax)theEObject;
        T result = caseAtomicRmwUmax(atomicRmwUmax);
        if (result == null) result = caseAtomicRMW(atomicRmwUmax);
        if (result == null) result = caseInstruction(atomicRmwUmax);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.ATOMIC_RMW_UMIN:
      {
        AtomicRmwUmin atomicRmwUmin = (AtomicRmwUmin)theEObject;
        T result = caseAtomicRmwUmin(atomicRmwUmin);
        if (result == null) result = caseAtomicRMW(atomicRmwUmin);
        if (result == null) result = caseInstruction(atomicRmwUmin);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.LOAD:
      {
        Load load = (Load)theEObject;
        T result = caseLoad(load);
        if (result == null) result = caseInstruction(load);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.STORE:
      {
        Store store = (Store)theEObject;
        T result = caseStore(store);
        if (result == null) result = caseInstruction(store);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.CALL:
      {
        Call call = (Call)theEObject;
        T result = caseCall(call);
        if (result == null) result = caseInstruction(call);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.ALLOC:
      {
        Alloc alloc = (Alloc)theEObject;
        T result = caseAlloc(alloc);
        if (result == null) result = caseInstruction(alloc);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.PHI_CASE:
      {
        PhiCase phiCase = (PhiCase)theEObject;
        T result = casePhiCase(phiCase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.PHI:
      {
        Phi phi = (Phi)theEObject;
        T result = casePhi(phi);
        if (result == null) result = caseInstruction(phi);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.LANDING_PAD:
      {
        LandingPad landingPad = (LandingPad)theEObject;
        T result = caseLandingPad(landingPad);
        if (result == null) result = caseInstruction(landingPad);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.CLAUSE:
      {
        Clause clause = (Clause)theEObject;
        T result = caseClause(clause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.SELECT:
      {
        Select select = (Select)theEObject;
        T result = caseSelect(select);
        if (result == null) result = caseInstruction(select);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.VARIABLE_ATTRIBUTE_ACCESS:
      {
        VariableAttributeAccess variableAttributeAccess = (VariableAttributeAccess)theEObject;
        T result = caseVariableAttributeAccess(variableAttributeAccess);
        if (result == null) result = caseInstruction(variableAttributeAccess);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.EXTRACT_VALUE:
      {
        ExtractValue extractValue = (ExtractValue)theEObject;
        T result = caseExtractValue(extractValue);
        if (result == null) result = caseInstruction(extractValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.INSERT_VALUE:
      {
        InsertValue insertValue = (InsertValue)theEObject;
        T result = caseInsertValue(insertValue);
        if (result == null) result = caseInstruction(insertValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.EXTRACT_ELEMENT:
      {
        ExtractElement extractElement = (ExtractElement)theEObject;
        T result = caseExtractElement(extractElement);
        if (result == null) result = caseInstruction(extractElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.INSERT_ELEMENT:
      {
        InsertElement insertElement = (InsertElement)theEObject;
        T result = caseInsertElement(insertElement);
        if (result == null) result = caseInstruction(insertElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.SHUFFLE_VECTOR:
      {
        ShuffleVector shuffleVector = (ShuffleVector)theEObject;
        T result = caseShuffleVector(shuffleVector);
        if (result == null) result = caseInstruction(shuffleVector);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.COMPARE:
      {
        Compare compare = (Compare)theEObject;
        T result = caseCompare(compare);
        if (result == null) result = caseInstruction(compare);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.COMPARE_INT:
      {
        CompareInt compareInt = (CompareInt)theEObject;
        T result = caseCompareInt(compareInt);
        if (result == null) result = caseCompare(compareInt);
        if (result == null) result = caseInstruction(compareInt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.COMPARE_FLOAT:
      {
        CompareFloat compareFloat = (CompareFloat)theEObject;
        T result = caseCompareFloat(compareFloat);
        if (result == null) result = caseCompare(compareFloat);
        if (result == null) result = caseInstruction(compareFloat);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.INDIRECT_BRANCH:
      {
        IndirectBranch indirectBranch = (IndirectBranch)theEObject;
        T result = caseIndirectBranch(indirectBranch);
        if (result == null) result = caseInstruction(indirectBranch);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.SWITCH:
      {
        de.upb.llvm_parser.llvm.Switch switch_ = (de.upb.llvm_parser.llvm.Switch)theEObject;
        T result = caseSwitch(switch_);
        if (result == null) result = caseInstruction(switch_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.SWITCH_CASE:
      {
        SwitchCase switchCase = (SwitchCase)theEObject;
        T result = caseSwitchCase(switchCase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.INVOKE:
      {
        Invoke invoke = (Invoke)theEObject;
        T result = caseInvoke(invoke);
        if (result == null) result = caseInstruction(invoke);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.RESUME:
      {
        Resume resume = (Resume)theEObject;
        T result = caseResume(resume);
        if (result == null) result = caseInstruction(resume);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.UNREACHABLE:
      {
        Unreachable unreachable = (Unreachable)theEObject;
        T result = caseUnreachable(unreachable);
        if (result == null) result = caseInstruction(unreachable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.RETURN:
      {
        Return return_ = (Return)theEObject;
        T result = caseReturn(return_);
        if (result == null) result = caseInstruction(return_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LlvmPackage.BRANCH:
      {
        Branch branch = (Branch)theEObject;
        T result = caseBranch(branch);
        if (result == null) result = caseInstruction(branch);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>LLVM</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>LLVM</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLLVM(LLVM object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractElement(AbstractElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Top Level Entity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Top Level Entity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTopLevelEntity(TopLevelEntity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Main Level Entity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Main Level Entity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMainLevelEntity(MainLevelEntity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeDefinition(TypeDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Global Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Global Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGlobalDefinition(GlobalDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionDefinition(FunctionDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Alias Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Alias Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAliasDefinition(AliasDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Use</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Use</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeUse(TypeUse object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Address Use</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Address Use</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAddressUse(AddressUse object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Address</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Address</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAddress(Address object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Predefined</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Predefined</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePredefined(Predefined object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Vector</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Vector</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVector(Vector object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Array</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Array</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArray(Array object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Aggregate Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Aggregate Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAggregate_Type(Aggregate_Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstant(Constant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Decimal Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Decimal Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDecimalConstant(DecimalConstant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntegerConstant(IntegerConstant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Primitive Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Primitive Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrimitiveValue(PrimitiveValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValue(Value object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Value Struct</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Value Struct</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValueStruct(ValueStruct object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Structure</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Structure</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStructure(Structure object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameter(Parameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameterList(ParameterList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionParameter(FunctionParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Parameter List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Parameter List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionParameterList(FunctionParameterList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionBody(FunctionBody object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instruction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instruction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstruction(Instruction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Basic Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Basic Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBasicBlock(BasicBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Arithmetic Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Arithmetic Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArithmeticOperation(ArithmeticOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Arithmetic Operation Add</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Arithmetic Operation Add</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArithmeticOperationAdd(ArithmeticOperationAdd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Arithmetic Operation Fadd</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Arithmetic Operation Fadd</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArithmeticOperationFadd(ArithmeticOperationFadd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Arithmetic Operation Sub</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Arithmetic Operation Sub</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArithmeticOperationSub(ArithmeticOperationSub object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Arithmetic Operation Fsub</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Arithmetic Operation Fsub</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArithmeticOperationFsub(ArithmeticOperationFsub object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Arithmetic Operation Mul</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Arithmetic Operation Mul</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArithmeticOperationMul(ArithmeticOperationMul object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Arithmetic Operation Fmul</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Arithmetic Operation Fmul</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArithmeticOperationFmul(ArithmeticOperationFmul object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Arithmetic Operation Udiv</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Arithmetic Operation Udiv</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArithmeticOperationUdiv(ArithmeticOperationUdiv object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Arithmetic Operation Sdiv</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Arithmetic Operation Sdiv</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArithmeticOperationSdiv(ArithmeticOperationSdiv object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Arithmetic Operation Fdiv</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Arithmetic Operation Fdiv</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArithmeticOperationFdiv(ArithmeticOperationFdiv object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Arithmetic Operation Urem</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Arithmetic Operation Urem</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArithmeticOperationUrem(ArithmeticOperationUrem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Arithmetic Operation Srem</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Arithmetic Operation Srem</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArithmeticOperationSrem(ArithmeticOperationSrem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Arithmetic Operation Frem</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Arithmetic Operation Frem</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArithmeticOperationFrem(ArithmeticOperationFrem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Logic Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Logic Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLogicOperation(LogicOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cast</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cast</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCast(Cast object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Nested Cast</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Nested Cast</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNestedCast(NestedCast object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Meta Arg Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Meta Arg Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMetaArgValue(MetaArgValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Meta</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Meta</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMeta(Meta object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Metadata Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Metadata Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMetadataValue(MetadataValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Get Element Ptr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Get Element Ptr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGetElementPtr(GetElementPtr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Nested Get Element Ptr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Nested Get Element Ptr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNestedGetElementPtr(NestedGetElementPtr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fence</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFence(Fence object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cmp Xchg</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cmp Xchg</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCmpXchg(CmpXchg object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Atomic RMW</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Atomic RMW</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtomicRMW(AtomicRMW object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Atomic Rmw Xchg</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Atomic Rmw Xchg</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtomicRmwXchg(AtomicRmwXchg object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Atomic Rmw Add</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Atomic Rmw Add</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtomicRmwAdd(AtomicRmwAdd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Atomic Rmw Sub</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Atomic Rmw Sub</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtomicRmwSub(AtomicRmwSub object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Atomic Rmw And</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Atomic Rmw And</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtomicRmwAnd(AtomicRmwAnd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Atomic Rmw Nand</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Atomic Rmw Nand</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtomicRmwNand(AtomicRmwNand object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Atomic Rmw Or</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Atomic Rmw Or</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtomicRmwOr(AtomicRmwOr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Atomic Rmw Xor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Atomic Rmw Xor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtomicRmwXor(AtomicRmwXor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Atomic Rmw Max</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Atomic Rmw Max</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtomicRmwMax(AtomicRmwMax object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Atomic Rmw Min</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Atomic Rmw Min</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtomicRmwMin(AtomicRmwMin object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Atomic Rmw Umax</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Atomic Rmw Umax</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtomicRmwUmax(AtomicRmwUmax object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Atomic Rmw Umin</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Atomic Rmw Umin</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtomicRmwUmin(AtomicRmwUmin object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Load</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Load</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLoad(Load object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Store</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Store</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStore(Store object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCall(Call object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Alloc</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Alloc</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAlloc(Alloc object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Phi Case</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Phi Case</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePhiCase(PhiCase object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Phi</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Phi</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePhi(Phi object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Landing Pad</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Landing Pad</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLandingPad(LandingPad object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClause(Clause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Select</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Select</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelect(Select object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable Attribute Access</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable Attribute Access</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariableAttributeAccess(VariableAttributeAccess object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Extract Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Extract Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExtractValue(ExtractValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Insert Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Insert Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInsertValue(InsertValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Extract Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Extract Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExtractElement(ExtractElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Insert Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Insert Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInsertElement(InsertElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Shuffle Vector</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Shuffle Vector</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseShuffleVector(ShuffleVector object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Compare</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Compare</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompare(Compare object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Compare Int</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Compare Int</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompareInt(CompareInt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Compare Float</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Compare Float</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompareFloat(CompareFloat object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Indirect Branch</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Indirect Branch</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIndirectBranch(IndirectBranch object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Switch</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Switch</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSwitch(de.upb.llvm_parser.llvm.Switch object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Switch Case</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Switch Case</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSwitchCase(SwitchCase object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Invoke</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Invoke</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInvoke(Invoke object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Resume</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Resume</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseResume(Resume object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unreachable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unreachable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnreachable(Unreachable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Return</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Return</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReturn(Return object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Branch</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Branch</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBranch(Branch object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //LlvmSwitch
