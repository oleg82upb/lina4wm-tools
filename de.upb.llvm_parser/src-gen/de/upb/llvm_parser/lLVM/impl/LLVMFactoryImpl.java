/**
 */
package de.upb.llvm_parser.lLVM.impl;

import de.upb.llvm_parser.lLVM.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LLVMFactoryImpl extends EFactoryImpl implements LLVMFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LLVMFactory init()
  {
    try
    {
      LLVMFactory theLLVMFactory = (LLVMFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.upb.de/llvm_parser/LLVM"); 
      if (theLLVMFactory != null)
      {
        return theLLVMFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new LLVMFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LLVMFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case LLVMPackage.LLVM: return createLLVM();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LLVM createLLVM()
  {
    LLVMImpl llvm = new LLVMImpl();
    return llvm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LLVMPackage getLLVMPackage()
  {
    return (LLVMPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static LLVMPackage getPackage()
  {
    return LLVMPackage.eINSTANCE;
  }

} //LLVMFactoryImpl
