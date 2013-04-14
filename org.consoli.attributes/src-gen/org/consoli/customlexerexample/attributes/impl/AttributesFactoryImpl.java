/**
 */
package org.consoli.customlexerexample.attributes.impl;

import org.consoli.customlexerexample.attributes.*;

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
public class AttributesFactoryImpl extends EFactoryImpl implements AttributesFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AttributesFactory init()
  {
    try
    {
      AttributesFactory theAttributesFactory = (AttributesFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.consoli.org/customlexerexample/Attributes"); 
      if (theAttributesFactory != null)
      {
        return theAttributesFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new AttributesFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributesFactoryImpl()
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
      case AttributesPackage.MODEL: return createModel();
      case AttributesPackage.ATTRIBUTE: return createAttribute();
      case AttributesPackage.SIMPLE_ATTRIBUTE: return createSimpleAttribute();
      case AttributesPackage.ARRAY_ATTRIBUTE: return createArrayAttribute();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleAttribute createSimpleAttribute()
  {
    SimpleAttributeImpl simpleAttribute = new SimpleAttributeImpl();
    return simpleAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayAttribute createArrayAttribute()
  {
    ArrayAttributeImpl arrayAttribute = new ArrayAttributeImpl();
    return arrayAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributesPackage getAttributesPackage()
  {
    return (AttributesPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static AttributesPackage getPackage()
  {
    return AttributesPackage.eINSTANCE;
  }

} //AttributesFactoryImpl
