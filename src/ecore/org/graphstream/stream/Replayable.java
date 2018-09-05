/**
 */
package ecore.org.graphstream.stream;

import org.eclipse.emf.ecore.EObject;
import org.graphstream.stream.Replayable.Controller;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Replayable</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ecore.org.graphstream.stream.StreamPackage#getReplayable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Replayable extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="ecore.datatypes.org.graphstream.stream.Replayable.Controller"
	 * @generated
	 */
	Controller getReplayController();

} // Replayable
