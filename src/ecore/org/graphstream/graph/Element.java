/**
 */
package ecore.org.graphstream.graph;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ecore.org.graphstream.graph.GraphPackage#getElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Element extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	int getIndex();

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
	 * @model dataType="ecore.datatypes.java.lang.CharSequence"
	 * @generated
	 */
	CharSequence getLabel(String key);

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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	int getAttributeCount();

} // Element
