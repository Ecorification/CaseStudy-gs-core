/**
 */
package ecore.org.graphstream.graph.implementations.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.graphstream.graph.Edge;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.AbstractGraph;
import org.graphstream.graph.implementations.AbstractNode;

import ecore.org.graphstream.graph.GraphPackage;
import ecore.org.graphstream.graph.implementations.ImplementationsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecore.org.graphstream.graph.implementations.impl.AbstractEdgeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link ecore.org.graphstream.graph.implementations.impl.AbstractEdgeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link ecore.org.graphstream.graph.implementations.impl.AbstractEdgeImpl#isDirected <em>Directed</em>}</li>
 *   <li>{@link ecore.org.graphstream.graph.implementations.impl.AbstractEdgeImpl#getGraph <em>Graph</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractEdgeImpl extends AbstractElementImpl implements ecore.org.graphstream.graph.implementations.AbstractEdge {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected AbstractNode source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected AbstractNode target;

	/**
	 * The default value of the '{@link #isDirected() <em>Directed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDirected()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DIRECTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDirected() <em>Directed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDirected()
	 * @generated
	 * @ordered
	 */
	protected boolean directed = DIRECTED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGraph() <em>Graph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraph()
	 * @generated
	 * @ordered
	 */
	protected AbstractGraph graph;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractEdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImplementationsPackage.Literals.ABSTRACT_EDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractNode getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (AbstractNode)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImplementationsPackage.ABSTRACT_EDGE__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractNode basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(AbstractNode newSource) {
		AbstractNode oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationsPackage.ABSTRACT_EDGE__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractNode getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (AbstractNode)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImplementationsPackage.ABSTRACT_EDGE__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractNode basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(AbstractNode newTarget) {
		AbstractNode oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationsPackage.ABSTRACT_EDGE__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDirected() {
		return directed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirected(boolean newDirected) {
		boolean oldDirected = directed;
		directed = newDirected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationsPackage.ABSTRACT_EDGE__DIRECTED, oldDirected, directed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractGraph getGraph() {
		if (graph != null && graph.eIsProxy()) {
			InternalEObject oldGraph = (InternalEObject)graph;
			graph = (AbstractGraph)eResolveProxy(oldGraph);
			if (graph != oldGraph) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImplementationsPackage.ABSTRACT_EDGE__GRAPH, oldGraph, graph));
			}
		}
		return graph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractGraph basicGetGraph() {
		return graph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGraph(AbstractGraph newGraph) {
		AbstractGraph oldGraph = graph;
		graph = newGraph;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationsPackage.ABSTRACT_EDGE__GRAPH, oldGraph, graph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Node> T getNode0() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Node> T getNode1() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Node> T getOpposite(Node node) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Node> T getSourceNode() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Node> T getTargetNode() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLoop() {
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
			case ImplementationsPackage.ABSTRACT_EDGE__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case ImplementationsPackage.ABSTRACT_EDGE__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case ImplementationsPackage.ABSTRACT_EDGE__DIRECTED:
				return isDirected();
			case ImplementationsPackage.ABSTRACT_EDGE__GRAPH:
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
			case ImplementationsPackage.ABSTRACT_EDGE__SOURCE:
				setSource((AbstractNode)newValue);
				return;
			case ImplementationsPackage.ABSTRACT_EDGE__TARGET:
				setTarget((AbstractNode)newValue);
				return;
			case ImplementationsPackage.ABSTRACT_EDGE__DIRECTED:
				setDirected((Boolean)newValue);
				return;
			case ImplementationsPackage.ABSTRACT_EDGE__GRAPH:
				setGraph((AbstractGraph)newValue);
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
			case ImplementationsPackage.ABSTRACT_EDGE__SOURCE:
				setSource((AbstractNode)null);
				return;
			case ImplementationsPackage.ABSTRACT_EDGE__TARGET:
				setTarget((AbstractNode)null);
				return;
			case ImplementationsPackage.ABSTRACT_EDGE__DIRECTED:
				setDirected(DIRECTED_EDEFAULT);
				return;
			case ImplementationsPackage.ABSTRACT_EDGE__GRAPH:
				setGraph((AbstractGraph)null);
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
			case ImplementationsPackage.ABSTRACT_EDGE__SOURCE:
				return source != null;
			case ImplementationsPackage.ABSTRACT_EDGE__TARGET:
				return target != null;
			case ImplementationsPackage.ABSTRACT_EDGE__DIRECTED:
				return directed != DIRECTED_EDEFAULT;
			case ImplementationsPackage.ABSTRACT_EDGE__GRAPH:
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
		if (baseClass == Edge.class) {
			switch (baseOperationID) {
				case GraphPackage.EDGE___IS_DIRECTED: return ImplementationsPackage.ABSTRACT_EDGE___IS_DIRECTED;
				case GraphPackage.EDGE___IS_LOOP: return ImplementationsPackage.ABSTRACT_EDGE___IS_LOOP;
				case GraphPackage.EDGE___GET_NODE0: return ImplementationsPackage.ABSTRACT_EDGE___GET_NODE0;
				case GraphPackage.EDGE___GET_NODE1: return ImplementationsPackage.ABSTRACT_EDGE___GET_NODE1;
				case GraphPackage.EDGE___GET_SOURCE_NODE: return ImplementationsPackage.ABSTRACT_EDGE___GET_SOURCE_NODE;
				case GraphPackage.EDGE___GET_TARGET_NODE: return ImplementationsPackage.ABSTRACT_EDGE___GET_TARGET_NODE;
				case GraphPackage.EDGE___GET_OPPOSITE__NODE: return ImplementationsPackage.ABSTRACT_EDGE___GET_OPPOSITE__NODE;
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
			case ImplementationsPackage.ABSTRACT_EDGE___GET_NODE0:
				return getNode0();
			case ImplementationsPackage.ABSTRACT_EDGE___GET_NODE1:
				return getNode1();
			case ImplementationsPackage.ABSTRACT_EDGE___GET_OPPOSITE__NODE:
				return getOpposite((Node)arguments.get(0));
			case ImplementationsPackage.ABSTRACT_EDGE___GET_SOURCE_NODE:
				return getSourceNode();
			case ImplementationsPackage.ABSTRACT_EDGE___GET_TARGET_NODE:
				return getTargetNode();
			case ImplementationsPackage.ABSTRACT_EDGE___IS_LOOP:
				return isLoop();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (directed: ");
		result.append(directed);
		result.append(')');
		return result.toString();
	}

} //AbstractEdgeImpl
