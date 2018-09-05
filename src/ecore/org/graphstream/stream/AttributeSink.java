/**
 */
package ecore.org.graphstream.stream;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Sink</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ecore.org.graphstream.stream.StreamPackage#getAttributeSink()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface AttributeSink extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void graphAttributeAdded(String sourceId, long timeId, String attribute, Object value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void graphAttributeChanged(String sourceId, long timeId, String attribute, Object oldValue, Object newValue);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void graphAttributeRemoved(String sourceId, long timeId, String attribute);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void nodeAttributeAdded(String sourceId, long timeId, String nodeId, String attribute, Object value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void nodeAttributeChanged(String sourceId, long timeId, String nodeId, String attribute, Object oldValue, Object newValue);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void nodeAttributeRemoved(String sourceId, long timeId, String nodeId, String attribute);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void edgeAttributeAdded(String sourceId, long timeId, String edgeId, String attribute, Object value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void edgeAttributeChanged(String sourceId, long timeId, String edgeId, String attribute, Object oldValue, Object newValue);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void edgeAttributeRemoved(String sourceId, long timeId, String edgeId, String attribute);

} // AttributeSink
