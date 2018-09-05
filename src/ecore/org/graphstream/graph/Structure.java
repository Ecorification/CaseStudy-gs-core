/**
 */
package ecore.org.graphstream.graph;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.graphstream.graph.Edge;
import org.graphstream.graph.Node;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ecore.org.graphstream.graph.GraphPackage#getStructure()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Structure extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	int getNodeCount();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	int getEdgeCount();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="ecore.datatypes.java.util.Iterator&lt;T&gt;"
	 * @generated
	 */
	<T extends Node> Iterator<T> getNodeIterator();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="ecore.datatypes.java.util.Iterator&lt;T&gt;"
	 * @generated
	 */
	<T extends Edge> Iterator<T> getEdgeIterator();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="ecore.datatypes.java.lang.Iterable&lt;? extends T&gt;"
	 * @generated
	 */
	<T extends Node> Iterable<? extends T> getEachNode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="ecore.datatypes.java.lang.Iterable&lt;? extends T&gt;"
	 * @generated
	 */
	<T extends Edge> Iterable<? extends T> getEachEdge();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="ecore.datatypes.java.util.Collection&lt;T&gt;"
	 * @generated
	 */
	<T extends Node> Collection<T> getNodeSet();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="ecore.datatypes.java.util.Collection&lt;T&gt;"
	 * @generated
	 */
	<T extends Edge> Collection<T> getEdgeSet();

} // Structure
