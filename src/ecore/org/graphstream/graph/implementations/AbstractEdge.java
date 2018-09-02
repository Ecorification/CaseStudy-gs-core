/**
 */
package ecore.org.graphstream.graph.implementations;

import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.AbstractGraph;
import org.graphstream.graph.implementations.AbstractNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecore.org.graphstream.graph.implementations.AbstractEdge#getSource <em>Source</em>}</li>
 *   <li>{@link ecore.org.graphstream.graph.implementations.AbstractEdge#getTarget <em>Target</em>}</li>
 *   <li>{@link ecore.org.graphstream.graph.implementations.AbstractEdge#isDirected <em>Directed</em>}</li>
 *   <li>{@link ecore.org.graphstream.graph.implementations.AbstractEdge#getGraph <em>Graph</em>}</li>
 * </ul>
 *
 * @see ecore.org.graphstream.graph.implementations.ImplementationsPackage#getAbstractEdge()
 * @model
 * @generated
 */
public interface AbstractEdge extends ecore.org.graphstream.graph.implementations.AbstractElement, ecore.org.graphstream.graph.Edge {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(AbstractNode)
	 * @see ecore.org.graphstream.graph.implementations.ImplementationsPackage#getAbstractEdge_Source()
	 * @model
	 * @generated
	 */
	AbstractNode getSource();

	/**
	 * Sets the value of the '{@link ecore.org.graphstream.graph.implementations.AbstractEdge#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(AbstractNode value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(AbstractNode)
	 * @see ecore.org.graphstream.graph.implementations.ImplementationsPackage#getAbstractEdge_Target()
	 * @model
	 * @generated
	 */
	AbstractNode getTarget();

	/**
	 * Sets the value of the '{@link ecore.org.graphstream.graph.implementations.AbstractEdge#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(AbstractNode value);

	/**
	 * Returns the value of the '<em><b>Directed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Directed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directed</em>' attribute.
	 * @see #setDirected(boolean)
	 * @see ecore.org.graphstream.graph.implementations.ImplementationsPackage#getAbstractEdge_Directed()
	 * @model
	 * @generated
	 */
	boolean isDirected();

	/**
	 * Sets the value of the '{@link ecore.org.graphstream.graph.implementations.AbstractEdge#isDirected <em>Directed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Directed</em>' attribute.
	 * @see #isDirected()
	 * @generated
	 */
	void setDirected(boolean value);

	/**
	 * Returns the value of the '<em><b>Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Graph</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph</em>' reference.
	 * @see #setGraph(AbstractGraph)
	 * @see ecore.org.graphstream.graph.implementations.ImplementationsPackage#getAbstractEdge_Graph()
	 * @model
	 * @generated
	 */
	AbstractGraph getGraph();

	/**
	 * Sets the value of the '{@link ecore.org.graphstream.graph.implementations.AbstractEdge#getGraph <em>Graph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graph</em>' reference.
	 * @see #getGraph()
	 * @generated
	 */
	void setGraph(AbstractGraph value);

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
	<T extends Node> T getNode0();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	<T extends Node> T getNode1();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	<T extends Node> T getOpposite(Node node);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	<T extends Node> T getSourceNode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	<T extends Node> T getTargetNode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isLoop();

} // AbstractEdge
