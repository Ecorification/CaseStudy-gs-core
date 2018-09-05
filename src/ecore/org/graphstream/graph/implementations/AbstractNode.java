/**
 */
package ecore.org.graphstream.graph.implementations;

import java.util.Collection;
import java.util.Iterator;

import org.graphstream.graph.Edge;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecore.org.graphstream.graph.implementations.AbstractNode#getGraph <em>Graph</em>}</li>
 * </ul>
 *
 * @see ecore.org.graphstream.graph.implementations.ImplementationsPackage#getAbstractNode()
 * @model
 * @generated
 */
public interface AbstractNode extends ecore.org.graphstream.graph.implementations.AbstractElement, ecore.org.graphstream.graph.Node {
	/**
	 * Returns the value of the '<em><b>Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Graph</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph</em>' reference.
	 * @see #setGraph(Graph)
	 * @see ecore.org.graphstream.graph.implementations.ImplementationsPackage#getAbstractNode_Graph()
	 * @model
	 * @generated
	 */
	Graph getGraph();

	/**
	 * Sets the value of the '{@link ecore.org.graphstream.graph.implementations.AbstractNode#getGraph <em>Graph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graph</em>' reference.
	 * @see #getGraph()
	 * @generated
	 */
	void setGraph(Graph value);

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
	int getInDegree();

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
	 * @model
	 * @generated
	 */
	boolean hasEdgeToward(Node node);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean hasEdgeToward(int index);

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
	boolean hasEdgeFrom(Node node);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean hasEdgeFrom(int index);

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
	boolean hasEdgeBetween(Node node);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean hasEdgeBetween(int index);

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
	<T extends Edge> T getEdgeToward(Node node);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	<T extends Edge> T getEdgeToward(int index);

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
	<T extends Edge> T getEdgeFrom(Node node);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	<T extends Edge> T getEdgeFrom(int index);

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
	<T extends Edge> T getEdgeBetween(Node node);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	<T extends Edge> T getEdgeBetween(int index);

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
	<T extends Edge> Iterable<T> getEachEnteringEdge();

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
	<T extends Edge> Collection<T> getEnteringEdgeSet();

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
	 * @model dataType="ecore.datatypes.java.util.Iterator&lt;ecore.org.graphstream.graph.Edge&gt;"
	 * @generated
	 */
	Iterator<Edge> iterator();

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
	<T extends Node> Iterator<T> getNeighborNodeIterator();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="ecore.datatypes.java.util.Iterator&lt;T&gt;"
	 * @generated
	 */
	<T extends Node> Iterator<T> getBreadthFirstIterator();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecore.datatypes.java.util.Iterator&lt;T&gt;"
	 * @generated
	 */
	<T extends Node> Iterator<T> getBreadthFirstIterator(boolean directed);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="ecore.datatypes.java.util.Iterator&lt;T&gt;"
	 * @generated
	 */
	<T extends Node> Iterator<T> getDepthFirstIterator();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecore.datatypes.java.util.Iterator&lt;T&gt;"
	 * @generated
	 */
	<T extends Node> Iterator<T> getDepthFirstIterator(boolean directed);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isEnteringEdge(Edge e);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isLeavingEdge(Edge e);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isIncidentEdge(Edge e);

} // AbstractNode
