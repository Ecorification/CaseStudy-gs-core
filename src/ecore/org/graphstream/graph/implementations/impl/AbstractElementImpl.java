/**
 */
package ecore.org.graphstream.graph.implementations.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ecore.org.graphstream.graph.implementations.ImplementationsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecore.org.graphstream.graph.implementations.impl.AbstractElementImpl#getId <em>Id</em>}</li>
 *   <li>{@link ecore.org.graphstream.graph.implementations.impl.AbstractElementImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link ecore.org.graphstream.graph.implementations.impl.AbstractElementImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link ecore.org.graphstream.graph.implementations.impl.AbstractElementImpl#getAttributesBeingRemoved <em>Attributes Being Removed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractElementImpl extends MinimalEObjectImpl.Container implements ecore.org.graphstream.graph.implementations.AbstractElement {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int INDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected int index = INDEX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected HashMap<String, Object> attributes;

	/**
	 * The cached value of the '{@link #getAttributesBeingRemoved() <em>Attributes Being Removed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributesBeingRemoved()
	 * @generated
	 * @ordered
	 */
	protected ArrayList<String> attributesBeingRemoved;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImplementationsPackage.Literals.ABSTRACT_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationsPackage.ABSTRACT_ELEMENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIndex() {
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndex(int newIndex) {
		int oldIndex = index;
		index = newIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationsPackage.ABSTRACT_ELEMENT__INDEX, oldIndex, index));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HashMap<String, Object> getAttributes() {
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributes(HashMap<String, Object> newAttributes) {
		HashMap<String, Object> oldAttributes = attributes;
		attributes = newAttributes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationsPackage.ABSTRACT_ELEMENT__ATTRIBUTES, oldAttributes, attributes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayList<String> getAttributesBeingRemoved() {
		return attributesBeingRemoved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributesBeingRemoved(ArrayList<String> newAttributesBeingRemoved) {
		ArrayList<String> oldAttributesBeingRemoved = attributesBeingRemoved;
		attributesBeingRemoved = newAttributesBeingRemoved;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationsPackage.ABSTRACT_ELEMENT__ATTRIBUTES_BEING_REMOVED, oldAttributesBeingRemoved, attributesBeingRemoved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T> T getAttribute(String key) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T> T getFirstAttributeOf(String[] keys) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T> T getAttribute(String key, Class<T> clazz) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T> T getFirstAttributeOf(Class<T> clazz, String[] keys) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel(String key) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getNumber(String key) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayList<? extends Number> getVector(String key) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object[] getArray(String key) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HashMap<?, ?> getHash(String key) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasAttribute(String key) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasAttribute(String key, Class<?> clazz) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasLabel(String key) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasNumber(String key) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasVector(String key) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasArray(String key) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasHash(String key) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iterator<String> getAttributeKeyIterator() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iterable<String> getEachAttributeKey() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection<String> getAttributeKeySet() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAttributeCount() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void clearAttributes() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addAttribute(String attribute, Object[] values) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeAttribute(String attribute, Object[] values) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttribute(String attribute, Object[] values) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addAttributes(Map<String, Object> attributes) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeAttribute(String attribute) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImplementationsPackage.ABSTRACT_ELEMENT__ID:
				return getId();
			case ImplementationsPackage.ABSTRACT_ELEMENT__INDEX:
				return getIndex();
			case ImplementationsPackage.ABSTRACT_ELEMENT__ATTRIBUTES:
				return getAttributes();
			case ImplementationsPackage.ABSTRACT_ELEMENT__ATTRIBUTES_BEING_REMOVED:
				return getAttributesBeingRemoved();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ImplementationsPackage.ABSTRACT_ELEMENT__ID:
				setId((String)newValue);
				return;
			case ImplementationsPackage.ABSTRACT_ELEMENT__INDEX:
				setIndex((Integer)newValue);
				return;
			case ImplementationsPackage.ABSTRACT_ELEMENT__ATTRIBUTES:
				setAttributes((HashMap<String, Object>)newValue);
				return;
			case ImplementationsPackage.ABSTRACT_ELEMENT__ATTRIBUTES_BEING_REMOVED:
				setAttributesBeingRemoved((ArrayList<String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ImplementationsPackage.ABSTRACT_ELEMENT__ID:
				setId(ID_EDEFAULT);
				return;
			case ImplementationsPackage.ABSTRACT_ELEMENT__INDEX:
				setIndex(INDEX_EDEFAULT);
				return;
			case ImplementationsPackage.ABSTRACT_ELEMENT__ATTRIBUTES:
				setAttributes((HashMap<String, Object>)null);
				return;
			case ImplementationsPackage.ABSTRACT_ELEMENT__ATTRIBUTES_BEING_REMOVED:
				setAttributesBeingRemoved((ArrayList<String>)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ImplementationsPackage.ABSTRACT_ELEMENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ImplementationsPackage.ABSTRACT_ELEMENT__INDEX:
				return index != INDEX_EDEFAULT;
			case ImplementationsPackage.ABSTRACT_ELEMENT__ATTRIBUTES:
				return attributes != null;
			case ImplementationsPackage.ABSTRACT_ELEMENT__ATTRIBUTES_BEING_REMOVED:
				return attributesBeingRemoved != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings({"rawtypes", "unchecked" })
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ImplementationsPackage.ABSTRACT_ELEMENT___GET_ATTRIBUTE__STRING:
				return getAttribute((String)arguments.get(0));
			case ImplementationsPackage.ABSTRACT_ELEMENT___GET_FIRST_ATTRIBUTE_OF__STRING:
				return getFirstAttributeOf((String[])arguments.get(0));
			case ImplementationsPackage.ABSTRACT_ELEMENT___GET_ATTRIBUTE__STRING_CLASS:
				return getAttribute((String)arguments.get(0), (Class)arguments.get(1));
			case ImplementationsPackage.ABSTRACT_ELEMENT___GET_FIRST_ATTRIBUTE_OF__CLASS_STRING:
				return getFirstAttributeOf((Class)arguments.get(0), (String[])arguments.get(1));
			case ImplementationsPackage.ABSTRACT_ELEMENT___GET_LABEL__STRING:
				return getLabel((String)arguments.get(0));
			case ImplementationsPackage.ABSTRACT_ELEMENT___GET_NUMBER__STRING:
				return getNumber((String)arguments.get(0));
			case ImplementationsPackage.ABSTRACT_ELEMENT___GET_VECTOR__STRING:
				return getVector((String)arguments.get(0));
			case ImplementationsPackage.ABSTRACT_ELEMENT___GET_ARRAY__STRING:
				return getArray((String)arguments.get(0));
			case ImplementationsPackage.ABSTRACT_ELEMENT___GET_HASH__STRING:
				return getHash((String)arguments.get(0));
			case ImplementationsPackage.ABSTRACT_ELEMENT___HAS_ATTRIBUTE__STRING:
				return hasAttribute((String)arguments.get(0));
			case ImplementationsPackage.ABSTRACT_ELEMENT___HAS_ATTRIBUTE__STRING_CLASS:
				return hasAttribute((String)arguments.get(0), (Class<?>)arguments.get(1));
			case ImplementationsPackage.ABSTRACT_ELEMENT___HAS_LABEL__STRING:
				return hasLabel((String)arguments.get(0));
			case ImplementationsPackage.ABSTRACT_ELEMENT___HAS_NUMBER__STRING:
				return hasNumber((String)arguments.get(0));
			case ImplementationsPackage.ABSTRACT_ELEMENT___HAS_VECTOR__STRING:
				return hasVector((String)arguments.get(0));
			case ImplementationsPackage.ABSTRACT_ELEMENT___HAS_ARRAY__STRING:
				return hasArray((String)arguments.get(0));
			case ImplementationsPackage.ABSTRACT_ELEMENT___HAS_HASH__STRING:
				return hasHash((String)arguments.get(0));
			case ImplementationsPackage.ABSTRACT_ELEMENT___GET_ATTRIBUTE_KEY_ITERATOR:
				return getAttributeKeyIterator();
			case ImplementationsPackage.ABSTRACT_ELEMENT___GET_EACH_ATTRIBUTE_KEY:
				return getEachAttributeKey();
			case ImplementationsPackage.ABSTRACT_ELEMENT___GET_ATTRIBUTE_KEY_SET:
				return getAttributeKeySet();
			case ImplementationsPackage.ABSTRACT_ELEMENT___TO_STRING:
				return toString();
			case ImplementationsPackage.ABSTRACT_ELEMENT___GET_ATTRIBUTE_COUNT:
				return getAttributeCount();
			case ImplementationsPackage.ABSTRACT_ELEMENT___CLEAR_ATTRIBUTES:
				clearAttributes();
				return null;
			case ImplementationsPackage.ABSTRACT_ELEMENT___ADD_ATTRIBUTE__STRING_OBJECT:
				addAttribute((String)arguments.get(0), (Object[])arguments.get(1));
				return null;
			case ImplementationsPackage.ABSTRACT_ELEMENT___CHANGE_ATTRIBUTE__STRING_OBJECT:
				changeAttribute((String)arguments.get(0), (Object[])arguments.get(1));
				return null;
			case ImplementationsPackage.ABSTRACT_ELEMENT___SET_ATTRIBUTE__STRING_OBJECT:
				setAttribute((String)arguments.get(0), (Object[])arguments.get(1));
				return null;
			case ImplementationsPackage.ABSTRACT_ELEMENT___ADD_ATTRIBUTES__MAP:
				addAttributes((Map<String, Object>)arguments.get(0));
				return null;
			case ImplementationsPackage.ABSTRACT_ELEMENT___REMOVE_ATTRIBUTE__STRING:
				removeAttribute((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //AbstractElementImpl
