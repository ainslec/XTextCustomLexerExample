/**
 */
package org.consoli.customlexerexample.attributes;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.consoli.customlexerexample.attributes.ArrayAttribute#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.consoli.customlexerexample.attributes.AttributesPackage#getArrayAttribute()
 * @model
 * @generated
 */
public interface ArrayAttribute extends Attribute
{
  /**
   * Returns the value of the '<em><b>Items</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Items</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Items</em>' attribute list.
   * @see org.consoli.customlexerexample.attributes.AttributesPackage#getArrayAttribute_Items()
   * @model unique="false"
   * @generated
   */
  EList<String> getItems();

} // ArrayAttribute
