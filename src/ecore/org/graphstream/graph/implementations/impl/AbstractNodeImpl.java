/**
 */
package ecore.org.graphstream.graph.implementations.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.graphstream.graph.Edge;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;

import ecore.org.graphstream.graph.GraphPackage;
import ecore.org.graphstream.graph.implementations.ImplementationsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecore.org.graphstream.graph.implementations.impl.AbstractNodeImpl#getGraph <em>Graph</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractNodeImpl extends AbstractElementImpl implements ecore.org.graphstream.graph.implementations.AbstractNode {
	/**
	 * The cached value of the '{@link #getGraph() <em>Graph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraph()
	 * @generated
	 * @ordered
	 */
	protected Graph graph;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImplementationsPackage.Literals.ABSTRACT_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Graph getGraph() {
		if (graph != null && graph.eIsProxy()) {
			InternalEObject oldGraph = (InternalEObject)graph;
			graph = (Graph)eResolveProxy(oldGraph);
			if (graph != oldGraph) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImplementationsPackage.ABSTRACT_NODE__GRAPH, oldGraph, graph));
			}
		}
		return graph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Graph basicGetGraph() {
		return graph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGraph(Graph newGraph) {
		Graph oldGraph = graph;
		graph = newGraph;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationsPackage.ABSTRACT_NODE__GRAPH, oldGraph, graph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDegree() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInDegree() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOutDegree() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasEdgeToward(Node node) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasEdgeToward(int index) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasEdgeToward(String id) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasEdgeFrom(Node node) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasEdgeFrom(int index) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasEdgeFrom(String id) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasEdgeBetween(Node node) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasEdgeBetween(int index) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasEdgeBetween(String id) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Edge> T getEdgeToward(Node node) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Edge> T getEdgeToward(int index) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Edge> T getEdgeToward(String id) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Edge> T getEdgeFrom(Node node) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Edge> T getEdgeFrom(int index) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Edge> T getEdgeFrom(String id) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Edge> T getEdgeBetween(Node node) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Edge> T getEdgeBetween(int index) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Edge> T getEdgeBetween(String id) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Edge> Iterator<T> getEdgeIterator() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Edge> Iterator<T> getEnteringEdgeIterator() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Edge> Iterator<T> getLeavingEdgeIterator() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Edge> Iterable<T> getEachEdge() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Edge> Iterable<T> getEachEnteringEdge() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Edge> Iterable<T> getEachLeavingEdge() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Edge> Collection<T> getEdgeSet() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Edge> Collection<T> getEnteringEdgeSet() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Edge> Collection<T> getLeavingEdgeSet() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iterator<Edge> iterator() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Edge> T getEdge(int i) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Edge> T getEnteringEdge(int i) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Edge> T getLeavingEdge(int i) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Node> Iterator<T> getNeighborNodeIterator() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Node> Iterator<T> getBreadthFirstIterator() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Node> Iterator<T> getBreadthFirstIterator(boolean directed) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Node> Iterator<T> getDepthFirstIterator() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Node> Iterator<T> getDepthFirstIterator(boolean directed) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnteringEdge(Edge e) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLeavingEdge(Edge e) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIncidentEdge(Edge e) {
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
			case ImplementationsPackage.ABSTRACT_NODE__GRAPH:
				if (resolve) return getGraph();
				return basicGetGraph();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ImplementationsPackage.ABSTRACT_NODE__GRAPH:
				setGraph((Graph)newValue);
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
			case ImplementationsPackage.ABSTRACT_NODE__GRAPH:
				setGraph((Graph)null);
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
			case ImplementationsPackage.ABSTRACT_NODE__GRAPH:
				return graph != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Node.class) {
			switch (baseOperationID) {
				case GraphPackage.NODE___GET_GRAPH: return ImplementationsPackage.ABSTRACT_NODE___GET_GRAPH;
				case GraphPackage.NODE___GET_DEGREE: return ImplementationsPackage.ABSTRACT_NODE___GET_DEGREE;
				case GraphPackage.NODE___GET_OUT_DEGREE: return ImplementationsPackage.ABSTRACT_NODE___GET_OUT_DEGREE;
				case GraphPackage.NODE___GET_IN_DEGREE: return ImplementationsPackage.ABSTRACT_NODE___GET_IN_DEGREE;
				case GraphPackage.NODE___HAS_EDGE_TOWARD__STRING: return ImplementationsPackage.ABSTRACT_NODE___HAS_EDGE_TOWARD__STRING;
				case GraphPackage.NODE___HAS_EDGE_FROM__STRING: return ImplementationsPackage.ABSTRACT_NODE___HAS_EDGE_FROM__STRING;
				case GraphPackage.NODE___HAS_EDGE_BETWEEN__STRING: return ImplementationsPackage.ABSTRACT_NODE___HAS_EDGE_BETWEEN__STRING;
				case GraphPackage.NODE___GET_EDGE_TOWARD__STRING: return ImplementationsPackage.ABSTRACT_NODE___GET_EDGE_TOWARD__STRING;
				case GraphPackage.NODE___GET_EDGE_FROM__STRING: return ImplementationsPackage.ABSTRACT_NODE___GET_EDGE_FROM__STRING;
				case GraphPackage.NODE___GET_EDGE_BETWEEN__STRING: return ImplementationsPackage.ABSTRACT_NODE___GET_EDGE_BETWEEN__STRING;
				case GraphPackage.NODE___GET_EDGE_ITERATOR: return ImplementationsPackage.ABSTRACT_NODE___GET_EDGE_ITERATOR;
				case GraphPackage.NODE___GET_ENTERING_EDGE_ITERATOR: return ImplementationsPackage.ABSTRACT_NODE___GET_ENTERING_EDGE_ITERATOR;
				case GraphPackage.NODE___GET_LEAVING_EDGE_ITERATOR: return ImplementationsPackage.ABSTRACT_NODE___GET_LEAVING_EDGE_ITERATOR;
				case GraphPackage.NODE___GET_NEIGHBOR_NODE_ITERATOR: return ImplementationsPackage.ABSTRACT_NODE___GET_NEIGHBOR_NODE_ITERATOR;
				case GraphPackage.NODE___GET_EDGE__INT: return ImplementationsPackage.ABSTRACT_NODE___GET_EDGE__INT;
				case GraphPackage.NODE___GET_ENTERING_EDGE__INT: return ImplementationsPackage.ABSTRACT_NODE___GET_ENTERING_EDGE__INT;
				case GraphPackage.NODE___GET_LEAVING_EDGE__INT: return ImplementationsPackage.ABSTRACT_NODE___GET_LEAVING_EDGE__INT;
				case GraphPackage.NODE___GET_BREADTH_FIRST_ITERATOR: return ImplementationsPackage.ABSTRACT_NODE___GET_BREADTH_FIRST_ITERATOR;
				case GraphPackage.NODE___GET_BREADTH_FIRST_ITERATOR__BOOLEAN: return ImplementationsPackage.ABSTRACT_NODE___GET_BREADTH_FIRST_ITERATOR__BOOLEAN;
				case GraphPackage.NODE___GET_DEPTH_FIRST_ITERATOR: return ImplementationsPackage.ABSTRACT_NODE___GET_DEPTH_FIRST_ITERATOR;
				case GraphPackage.NODE___GET_DEPTH_FIRST_ITERATOR__BOOLEAN: return ImplementationsPackage.ABSTRACT_NODE___GET_DEPTH_FIRST_ITERATOR__BOOLEAN;
				case GraphPackage.NODE___GET_EACH_EDGE: return ImplementationsPackage.ABSTRACT_NODE___GET_EACH_EDGE;
				case GraphPackage.NODE___GET_EACH_LEAVING_EDGE: return ImplementationsPackage.ABSTRACT_NODE___GET_EACH_LEAVING_EDGE;
				case GraphPackage.NODE___GET_EACH_ENTERING_EDGE: return ImplementationsPackage.ABSTRACT_NODE___GET_EACH_ENTERING_EDGE;
				case GraphPackage.NODE___GET_EDGE_SET: return ImplementationsPackage.ABSTRACT_NODE___GET_EDGE_SET;
				case GraphPackage.NODE___GET_LEAVING_EDGE_SET: return ImplementationsPackage.ABSTRACT_NODE___GET_LEAVING_EDGE_SET;
				case GraphPackage.NODE___GET_ENTERING_EDGE_SET: return ImplementationsPackage.ABSTRACT_NODE___GET_ENTERING_EDGE_SET;
				case GraphPackage.NODE___TO_STRING: return ImplementationsPackage.ABSTRACT_NODE___TO_STRING;
				case GraphPackage.NODE___HAS_EDGE_TOWARD__NODE: return ImplementationsPackage.ABSTRACT_NODE___HAS_EDGE_TOWARD__NODE;
				case GraphPackage.NODE___HAS_EDGE_TOWARD__INT: return ImplementationsPackage.ABSTRACT_NODE___HAS_EDGE_TOWARD__INT;
				case GraphPackage.NODE___HAS_EDGE_FROM__NODE: return ImplementationsPackage.ABSTRACT_NODE___HAS_EDGE_FROM__NODE;
				case GraphPackage.NODE___HAS_EDGE_FROM__INT: return ImplementationsPackage.ABSTRACT_NODE___HAS_EDGE_FROM__INT;
				case GraphPackage.NODE___HAS_EDGE_BETWEEN__NODE: return ImplementationsPackage.ABSTRACT_NODE___HAS_EDGE_BETWEEN__NODE;
				case GraphPackage.NODE___HAS_EDGE_BETWEEN__INT: return ImplementationsPackage.ABSTRACT_NODE___HAS_EDGE_BETWEEN__INT;
				case GraphPackage.NODE___GET_EDGE_TOWARD__NODE: return ImplementationsPackage.ABSTRACT_NODE___GET_EDGE_TOWARD__NODE;
				case GraphPackage.NODE___GET_EDGE_TOWARD__INT: return ImplementationsPackage.ABSTRACT_NODE___GET_EDGE_TOWARD__INT;
				case GraphPackage.NODE___GET_EDGE_FROM__NODE: return ImplementationsPackage.ABSTRACT_NODE___GET_EDGE_FROM__NODE;
				case GraphPackage.NODE___GET_EDGE_FROM__INT: return ImplementationsPackage.ABSTRACT_NODE___GET_EDGE_FROM__INT;
				case GraphPackage.NODE___GET_EDGE_BETWEEN__NODE: return ImplementationsPackage.ABSTRACT_NODE___GET_EDGE_BETWEEN__NODE;
				case GraphPackage.NODE___GET_EDGE_BETWEEN__INT: return ImplementationsPackage.ABSTRACT_NODE___GET_EDGE_BETWEEN__INT;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ImplementationsPackage.ABSTRACT_NODE___GET_DEGREE:
				return getDegree();
			case ImplementationsPackage.ABSTRACT_NODE___GET_IN_DEGREE:
				return getInDegree();
			case ImplementationsPackage.ABSTRACT_NODE___GET_OUT_DEGREE:
				return getOutDegree();
			case ImplementationsPackage.ABSTRACT_NODE___HAS_EDGE_TOWARD__NODE:
				return hasEdgeToward((Node)arguments.get(0));
			case ImplementationsPackage.ABSTRACT_NODE___HAS_EDGE_TOWARD__INT:
				return hasEdgeToward((Integer)arguments.get(0));
			case ImplementationsPackage.ABSTRACT_NODE___HAS_EDGE_TOWARD__STRING:
				return hasEdgeToward((String)arguments.get(0));
			case ImplementationsPackage.ABSTRACT_NODE___HAS_EDGE_FROM__NODE:
				return hasEdgeFrom((Node)arguments.get(0));
			case ImplementationsPackage.ABSTRACT_NODE___HAS_EDGE_FROM__INT:
				return hasEdgeFrom((Integer)arguments.get(0));
			case ImplementationsPackage.ABSTRACT_NODE___HAS_EDGE_FROM__STRING:
				return hasEdgeFrom((String)arguments.get(0));
			case ImplementationsPackage.ABSTRACT_NODE___HAS_EDGE_BETWEEN__NODE:
				return hasEdgeBetween((Node)arguments.get(0));
			case ImplementationsPackage.ABSTRACT_NODE___HAS_EDGE_BETWEEN__INT:
				return hasEdgeBetween((Integer)arguments.get(0));
			case ImplementationsPackage.ABSTRACT_NODE___HAS_EDGE_BETWEEN__STRING:
				return hasEdgeBetween((String)arguments.get(0));
			case ImplementationsPackage.ABSTRACT_NODE___GET_EDGE_TOWARD__NODE:
				return getEdgeToward((Node)arguments.get(0));
			case ImplementationsPackage.ABSTRACT_NODE___GET_EDGE_TOWARD__INT:
				return getEdgeToward((Integer)arguments.get(0));
			case ImplementationsPackage.ABSTRACT_NODE___GET_EDGE_TOWARD__STRING:
				return getEdgeToward((String)arguments.get(0));
			case ImplementationsPackage.ABSTRACT_NODE___GET_EDGE_FROM__NODE:
				return getEdgeFrom((Node)arguments.get(0));
			case ImplementationsPackage.ABSTRACT_NODE___GET_EDGE_FROM__INT:
				return getEdgeFrom((Integer)arguments.get(0));
			case ImplementationsPackage.ABSTRACT_NODE___GET_EDGE_FROM__STRING:
				return getEdgeFrom((String)arguments.get(0));
			case ImplementationsPackage.ABSTRACT_NODE___GET_EDGE_BETWEEN__NODE:
				return getEdgeBetween((Node)arguments.get(0));
			case ImplementationsPackage.ABSTRACT_NODE___GET_EDGE_BETWEEN__INT:
				return getEdgeBetween((Integer)arguments.get(0));
			case ImplementationsPackage.ABSTRACT_NODE___GET_EDGE_BETWEEN__STRING:
				return getEdgeBetween((String)arguments.get(0));
			case ImplementationsPackage.ABSTRACT_NODE___GET_EDGE_ITERATOR:
				return getEdgeIterator();
			case ImplementationsPackage.ABSTRACT_NODE___GET_ENTERING_EDGE_ITERATOR:
				return getEnteringEdgeIterator();
			case ImplementationsPackage.ABSTRACT_NODE___GET_LEAVING_EDGE_ITERATOR:
				return getLeavingEdgeIterator();
			case ImplementationsPackage.ABSTRACT_NODE___GET_EACH_EDGE:
				return getEachEdge();
			case ImplementationsPackage.ABSTRACT_NODE___GET_EACH_ENTERING_EDGE:
				return getEachEnteringEdge();
			case ImplementationsPackage.ABSTRACT_NODE___GET_EACH_LEAVING_EDGE:
				return getEachLeavingEdge();
			case ImplementationsPackage.ABSTRACT_NODE___GET_EDGE_SET:
				return getEdgeSet();
			case ImplementationsPackage.ABSTRACT_NODE___GET_ENTERING_EDGE_SET:
				return getEnteringEdgeSet();
			case ImplementationsPackage.ABSTRACT_NODE___GET_LEAVING_EDGE_SET:
				return getLeavingEdgeSet();
			case ImplementationsPackage.ABSTRACT_NODE___ITERATOR:
				return iterator();
			case ImplementationsPackage.ABSTRACT_NODE___GET_EDGE__INT:
				return getEdge((Integer)arguments.get(0));
			case ImplementationsPackage.ABSTRACT_NODE___GET_ENTERING_EDGE__INT:
				return getEnteringEdge((Integer)arguments.get(0));
			case ImplementationsPackage.ABSTRACT_NODE___GET_LEAVING_EDGE__INT:
				return getLeavingEdge((Integer)arguments.get(0));
			case ImplementationsPackage.ABSTRACT_NODE___GET_NEIGHBOR_NODE_ITERATOR:
				return getNeighborNodeIterator();
			case ImplementationsPackage.ABSTRACT_NODE___GET_BREADTH_FIRST_ITERATOR:
				return getBreadthFirstIterator();
			case ImplementationsPackage.ABSTRACT_NODE___GET_BREADTH_FIRST_ITERATOR__BOOLEAN:
				return getBreadthFirstIterator((Boolean)arguments.get(0));
			case ImplementationsPackage.ABSTRACT_NODE___GET_DEPTH_FIRST_ITERATOR:
				return getDepthFirstIterator();
			case ImplementationsPackage.ABSTRACT_NODE___GET_DEPTH_FIRST_ITERATOR__BOOLEAN:
				return getDepthFirstIterator((Boolean)arguments.get(0));
			case ImplementationsPackage.ABSTRACT_NODE___IS_ENTERING_EDGE__EDGE:
				return isEnteringEdge((Edge)arguments.get(0));
			case ImplementationsPackage.ABSTRACT_NODE___IS_LEAVING_EDGE__EDGE:
				return isLeavingEdge((Edge)arguments.get(0));
			case ImplementationsPackage.ABSTRACT_NODE___IS_INCIDENT_EDGE__EDGE:
				return isIncidentEdge((Edge)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //AbstractNodeImpl
