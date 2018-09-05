/**
 */
package ecore.org.graphstream.stream;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Sink</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ecore.org.graphstream.stream.StreamPackage#getElementSink()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ElementSink extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void nodeAdded(String sourceId, long timeId, String nodeId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void nodeRemoved(String sourceId, long timeId, String nodeId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void edgeAdded(String sourceId, long timeId, String edgeId, String fromNodeId, String toNodeId, boolean directed);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void edgeRemoved(String sourceId, long timeId, String edgeId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void graphCleared(String sourceId, long timeId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void stepBegins(String sourceId, long timeId, double step);

} // ElementSink
