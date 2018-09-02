/**
 */
package ecore.org.graphstream.graph;

import java.util.Collection;
import java.util.Iterator;

import org.graphstream.graph.Edge;
import org.graphstream.graph.Graph;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ecore.org.graphstream.graph.GraphPackage#getNode()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Node extends ecore.org.graphstream.graph.Element {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Graph getGraph();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	int getDegree();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	int getOutDegree();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	int getInDegree();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean hasEdgeToward(String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean hasEdgeFrom(String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean hasEdgeBetween(String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	<T extends Edge> T getEdgeToward(String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	<T extends Edge> T getEdgeFrom(String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	<T extends Edge> T getEdgeBetween(String id);

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
	 * @model kind="operation" dataType="ecore.datatypes.java.util.Iterator&lt;T&gt;"
	 * @generated
	 */
	<T extends Edge> Iterator<T> getEnteringEdgeIterator();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="ecore.datatypes.java.util.Iterator&lt;T&gt;"
	 * @generated
	 */
	<T extends Edge> Iterator<T> getLeavingEdgeIterator();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="ecore.datatypes.java.util.Iterator&lt;T&gt;"
	 * @generated
	 */
	<T extends org.graphstream.graph.Node> Iterator<T> getNeighborNodeIterator();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	<T extends Edge> T getEdge(int i);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	<T extends Edge> T getEnteringEdge(int i);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	<T extends Edge> T getLeavingEdge(int i);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="ecore.datatypes.java.util.Iterator&lt;T&gt;"
	 * @generated
	 */
	<T extends org.graphstream.graph.Node> Iterator<T> getBreadthFirstIterator();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecore.datatypes.java.util.Iterator&lt;T&gt;"
	 * @generated
	 */
	<T extends org.graphstream.graph.Node> Iterator<T> getBreadthFirstIterator(boolean directed);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="ecore.datatypes.java.util.Iterator&lt;T&gt;"
	 * @generated
	 */
	<T extends org.graphstream.graph.Node> Iterator<T> getDepthFirstIterator();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecore.datatypes.java.util.Iterator&lt;T&gt;"
	 * @generated
	 */
	<T extends org.graphstream.graph.Node> Iterator<T> getDepthFirstIterator(boolean directed);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="ecore.datatypes.java.lang.Iterable&lt;T&gt;"
	 * @generated
	 */
	<T extends Edge> Iterable<T> getEachEdge();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="ecore.datatypes.java.lang.Iterable&lt;T&gt;"
	 * @generated
	 */
	<T extends Edge> Iterable<T> getEachLeavingEdge();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="ecore.datatypes.java.lang.Iterable&lt;T&gt;"
	 * @generated
	 */
	<T extends Edge> Iterable<T> getEachEnteringEdge();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="ecore.datatypes.java.util.Collection&lt;T&gt;"
	 * @generated
	 */
	<T extends Edge> Collection<T> getEdgeSet();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="ecore.datatypes.java.util.Collection&lt;T&gt;"
	 * @generated
	 */
	<T extends Edge> Collection<T> getLeavingEdgeSet();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="ecore.datatypes.java.util.Collection&lt;T&gt;"
	 * @generated
	 */
	<T extends Edge> Collection<T> getEnteringEdgeSet();

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
	 * @model
	 * @generated
	 */
	boolean hasEdgeToward(org.graphstream.graph.Node node);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ecore.datatypes.java.lang.IndexOutOfBoundsException"
	 * @generated
	 */
	boolean hasEdgeToward(int index) throws IndexOutOfBoundsException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean hasEdgeFrom(org.graphstream.graph.Node node);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ecore.datatypes.java.lang.IndexOutOfBoundsException"
	 * @generated
	 */
	boolean hasEdgeFrom(int index) throws IndexOutOfBoundsException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean hasEdgeBetween(org.graphstream.graph.Node node);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ecore.datatypes.java.lang.IndexOutOfBoundsException"
	 * @generated
	 */
	boolean hasEdgeBetween(int index) throws IndexOutOfBoundsException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	<T extends Edge> T getEdgeToward(org.graphstream.graph.Node node);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ecore.datatypes.java.lang.IndexOutOfBoundsException"
	 * @generated
	 */
	<T extends Edge> T getEdgeToward(int index) throws IndexOutOfBoundsException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	<T extends Edge> T getEdgeFrom(org.graphstream.graph.Node node);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ecore.datatypes.java.lang.IndexOutOfBoundsException"
	 * @generated
	 */
	<T extends Edge> T getEdgeFrom(int index) throws IndexOutOfBoundsException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	<T extends Edge> T getEdgeBetween(org.graphstream.graph.Node node);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ecore.datatypes.java.lang.IndexOutOfBoundsException"
	 * @generated
	 */
	<T extends Edge> T getEdgeBetween(int index) throws IndexOutOfBoundsException;

} // Node
