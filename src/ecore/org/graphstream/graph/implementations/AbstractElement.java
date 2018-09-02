/**
 */
package ecore.org.graphstream.graph.implementations;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecore.org.graphstream.graph.implementations.AbstractElement#getId <em>Id</em>}</li>
 *   <li>{@link ecore.org.graphstream.graph.implementations.AbstractElement#getIndex <em>Index</em>}</li>
 *   <li>{@link ecore.org.graphstream.graph.implementations.AbstractElement#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link ecore.org.graphstream.graph.implementations.AbstractElement#getAttributesBeingRemoved <em>Attributes Being Removed</em>}</li>
 * </ul>
 *
 * @see ecore.org.graphstream.graph.implementations.ImplementationsPackage#getAbstractElement()
 * @model abstract="true"
 * @generated
 */
public interface AbstractElement extends ecore.org.graphstream.graph.Element {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see ecore.org.graphstream.graph.implementations.ImplementationsPackage#getAbstractElement_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link ecore.org.graphstream.graph.implementations.AbstractElement#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(int)
	 * @see ecore.org.graphstream.graph.implementations.ImplementationsPackage#getAbstractElement_Index()
	 * @model
	 * @generated
	 */
	int getIndex();

	/**
	 * Sets the value of the '{@link ecore.org.graphstream.graph.implementations.AbstractElement#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(int value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' attribute.
	 * @see #setAttributes(HashMap)
	 * @see ecore.org.graphstream.graph.implementations.ImplementationsPackage#getAbstractElement_Attributes()
	 * @model dataType="ecore.datatypes.java.util.HashMap&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EJavaObject&gt;"
	 * @generated
	 */
	HashMap<String, Object> getAttributes();

	/**
	 * Sets the value of the '{@link ecore.org.graphstream.graph.implementations.AbstractElement#getAttributes <em>Attributes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attributes</em>' attribute.
	 * @see #getAttributes()
	 * @generated
	 */
	void setAttributes(HashMap<String, Object> value);

	/**
	 * Returns the value of the '<em><b>Attributes Being Removed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes Being Removed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes Being Removed</em>' attribute.
	 * @see #setAttributesBeingRemoved(ArrayList)
	 * @see ecore.org.graphstream.graph.implementations.ImplementationsPackage#getAbstractElement_AttributesBeingRemoved()
	 * @model dataType="ecore.datatypes.java.util.ArrayList&lt;org.eclipse.emf.ecore.EString&gt;"
	 * @generated
	 */
	ArrayList<String> getAttributesBeingRemoved();

	/**
	 * Sets the value of the '{@link ecore.org.graphstream.graph.implementations.AbstractElement#getAttributesBeingRemoved <em>Attributes Being Removed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attributes Being Removed</em>' attribute.
	 * @see #getAttributesBeingRemoved()
	 * @generated
	 */
	void setAttributesBeingRemoved(ArrayList<String> value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	<T> T getAttribute(String key);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keysDataType="ecore.datatypes.java.lang.StringArray"
	 * @generated
	 */
	<T> T getFirstAttributeOf(String[] keys);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	<T> T getAttribute(String key, Class<T> clazz);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keysDataType="ecore.datatypes.java.lang.StringArray"
	 * @generated
	 */
	<T> T getFirstAttributeOf(Class<T> clazz, String[] keys);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String getLabel(String key);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	double getNumber(String key);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecore.datatypes.java.util.ArrayList&lt;? extends ecore.datatypes.java.lang.Number&gt;"
	 * @generated
	 */
	ArrayList<? extends Number> getVector(String key);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecore.datatypes.java.lang.ObjectArray"
	 * @generated
	 */
	Object[] getArray(String key);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecore.datatypes.java.util.HashMap&lt;?, ?&gt;"
	 * @generated
	 */
	HashMap<?, ?> getHash(String key);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean hasAttribute(String key);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean hasAttribute(String key, Class<?> clazz);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean hasLabel(String key);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean hasNumber(String key);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean hasVector(String key);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean hasArray(String key);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean hasHash(String key);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="ecore.datatypes.java.util.Iterator&lt;org.eclipse.emf.ecore.EString&gt;"
	 * @generated
	 */
	Iterator<String> getAttributeKeyIterator();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="ecore.datatypes.java.lang.Iterable&lt;org.eclipse.emf.ecore.EString&gt;"
	 * @generated
	 */
	Iterable<String> getEachAttributeKey();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="ecore.datatypes.java.util.Collection&lt;org.eclipse.emf.ecore.EString&gt;"
	 * @generated
	 */
	Collection<String> getAttributeKeySet();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String toString();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	int getAttributeCount();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void clearAttributes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valuesDataType="ecore.datatypes.java.lang.ObjectArray"
	 * @generated
	 */
	void addAttribute(String attribute, Object[] values);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valuesDataType="ecore.datatypes.java.lang.ObjectArray"
	 * @generated
	 */
	void changeAttribute(String attribute, Object[] values);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valuesDataType="ecore.datatypes.java.lang.ObjectArray"
	 * @generated
	 */
	void setAttribute(String attribute, Object[] values);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model attributesDataType="ecore.datatypes.java.util.Map&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EJavaObject&gt;"
	 * @generated
	 */
	void addAttributes(Map<String, Object> attributes);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeAttribute(String attribute);

} // AbstractElement
