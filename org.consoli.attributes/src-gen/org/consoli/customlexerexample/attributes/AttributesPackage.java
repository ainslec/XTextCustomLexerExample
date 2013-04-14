/**
 */
package org.consoli.customlexerexample.attributes;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.consoli.customlexerexample.attributes.AttributesFactory
 * @model kind="package"
 * @generated
 */
public interface AttributesPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "attributes";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.consoli.org/customlexerexample/Attributes";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "attributes";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AttributesPackage eINSTANCE = org.consoli.customlexerexample.attributes.impl.AttributesPackageImpl.init();

  /**
   * The meta object id for the '{@link org.consoli.customlexerexample.attributes.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.consoli.customlexerexample.attributes.impl.ModelImpl
   * @see org.consoli.customlexerexample.attributes.impl.AttributesPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ATTRIBUTES = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.consoli.customlexerexample.attributes.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.consoli.customlexerexample.attributes.impl.AttributeImpl
   * @see org.consoli.customlexerexample.attributes.impl.AttributesPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = 0;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.consoli.customlexerexample.attributes.impl.SimpleAttributeImpl <em>Simple Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.consoli.customlexerexample.attributes.impl.SimpleAttributeImpl
   * @see org.consoli.customlexerexample.attributes.impl.AttributesPackageImpl#getSimpleAttribute()
   * @generated
   */
  int SIMPLE_ATTRIBUTE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_ATTRIBUTE__NAME = ATTRIBUTE__NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_ATTRIBUTE__VALUE = ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Simple Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.consoli.customlexerexample.attributes.impl.ArrayAttributeImpl <em>Array Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.consoli.customlexerexample.attributes.impl.ArrayAttributeImpl
   * @see org.consoli.customlexerexample.attributes.impl.AttributesPackageImpl#getArrayAttribute()
   * @generated
   */
  int ARRAY_ATTRIBUTE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_ATTRIBUTE__NAME = ATTRIBUTE__NAME;

  /**
   * The feature id for the '<em><b>Items</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_ATTRIBUTE__ITEMS = ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Array Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.consoli.customlexerexample.attributes.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.consoli.customlexerexample.attributes.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.consoli.customlexerexample.attributes.Model#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see org.consoli.customlexerexample.attributes.Model#getAttributes()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Attributes();

  /**
   * Returns the meta object for class '{@link org.consoli.customlexerexample.attributes.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see org.consoli.customlexerexample.attributes.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the attribute '{@link org.consoli.customlexerexample.attributes.Attribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.consoli.customlexerexample.attributes.Attribute#getName()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Name();

  /**
   * Returns the meta object for class '{@link org.consoli.customlexerexample.attributes.SimpleAttribute <em>Simple Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Attribute</em>'.
   * @see org.consoli.customlexerexample.attributes.SimpleAttribute
   * @generated
   */
  EClass getSimpleAttribute();

  /**
   * Returns the meta object for the attribute '{@link org.consoli.customlexerexample.attributes.SimpleAttribute#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.consoli.customlexerexample.attributes.SimpleAttribute#getValue()
   * @see #getSimpleAttribute()
   * @generated
   */
  EAttribute getSimpleAttribute_Value();

  /**
   * Returns the meta object for class '{@link org.consoli.customlexerexample.attributes.ArrayAttribute <em>Array Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Attribute</em>'.
   * @see org.consoli.customlexerexample.attributes.ArrayAttribute
   * @generated
   */
  EClass getArrayAttribute();

  /**
   * Returns the meta object for the attribute list '{@link org.consoli.customlexerexample.attributes.ArrayAttribute#getItems <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Items</em>'.
   * @see org.consoli.customlexerexample.attributes.ArrayAttribute#getItems()
   * @see #getArrayAttribute()
   * @generated
   */
  EAttribute getArrayAttribute_Items();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  AttributesFactory getAttributesFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.consoli.customlexerexample.attributes.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.consoli.customlexerexample.attributes.impl.ModelImpl
     * @see org.consoli.customlexerexample.attributes.impl.AttributesPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ATTRIBUTES = eINSTANCE.getModel_Attributes();

    /**
     * The meta object literal for the '{@link org.consoli.customlexerexample.attributes.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.consoli.customlexerexample.attributes.impl.AttributeImpl
     * @see org.consoli.customlexerexample.attributes.impl.AttributesPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

    /**
     * The meta object literal for the '{@link org.consoli.customlexerexample.attributes.impl.SimpleAttributeImpl <em>Simple Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.consoli.customlexerexample.attributes.impl.SimpleAttributeImpl
     * @see org.consoli.customlexerexample.attributes.impl.AttributesPackageImpl#getSimpleAttribute()
     * @generated
     */
    EClass SIMPLE_ATTRIBUTE = eINSTANCE.getSimpleAttribute();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_ATTRIBUTE__VALUE = eINSTANCE.getSimpleAttribute_Value();

    /**
     * The meta object literal for the '{@link org.consoli.customlexerexample.attributes.impl.ArrayAttributeImpl <em>Array Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.consoli.customlexerexample.attributes.impl.ArrayAttributeImpl
     * @see org.consoli.customlexerexample.attributes.impl.AttributesPackageImpl#getArrayAttribute()
     * @generated
     */
    EClass ARRAY_ATTRIBUTE = eINSTANCE.getArrayAttribute();

    /**
     * The meta object literal for the '<em><b>Items</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARRAY_ATTRIBUTE__ITEMS = eINSTANCE.getArrayAttribute_Items();

  }

} //AttributesPackage
