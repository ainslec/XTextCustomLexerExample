/**
 */
package org.consoli.customlexerexample.attributes;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.consoli.customlexerexample.attributes.AttributesPackage
 * @generated
 */
public interface AttributesFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AttributesFactory eINSTANCE = org.consoli.customlexerexample.attributes.impl.AttributesFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute</em>'.
   * @generated
   */
  Attribute createAttribute();

  /**
   * Returns a new object of class '<em>Simple Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simple Attribute</em>'.
   * @generated
   */
  SimpleAttribute createSimpleAttribute();

  /**
   * Returns a new object of class '<em>Array Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Array Attribute</em>'.
   * @generated
   */
  ArrayAttribute createArrayAttribute();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  AttributesPackage getAttributesPackage();

} //AttributesFactory
