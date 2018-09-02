/**
 */
package ecore.org.graphstream.graph.implementations.impl;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.graphstream.graph.Edge;
import org.graphstream.graph.EdgeFactory;
import org.graphstream.graph.ElementNotFoundException;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.NodeFactory;
import org.graphstream.graph.Structure;
import org.graphstream.stream.AttributeSink;
import org.graphstream.stream.ElementSink;
import org.graphstream.stream.GraphParseException;
import org.graphstream.stream.Pipe;
import org.graphstream.stream.Replayable;
import org.graphstream.stream.Replayable.Controller;
import org.graphstream.stream.Sink;
import org.graphstream.stream.Source;
import org.graphstream.stream.file.FileSink;
import org.graphstream.stream.file.FileSource;
import org.graphstream.ui.view.Viewer;

import ecore.org.graphstream.graph.GraphPackage;
import ecore.org.graphstream.graph.implementations.ImplementationsPackage;
import ecore.org.graphstream.stream.StreamPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecore.org.graphstream.graph.implementations.impl.AbstractGraphImpl#isStrictChecking <em>Strict Checking</em>}</li>
 *   <li>{@link ecore.org.graphstream.graph.implementations.impl.AbstractGraphImpl#isAutoCreate <em>Auto Create</em>}</li>
 *   <li>{@link ecore.org.graphstream.graph.implementations.impl.AbstractGraphImpl#getNodeFactory <em>Node Factory</em>}</li>
 *   <li>{@link ecore.org.graphstream.graph.implementations.impl.AbstractGraphImpl#getEdgeFactory <em>Edge Factory</em>}</li>
 *   <li>{@link ecore.org.graphstream.graph.implementations.impl.AbstractGraphImpl#getStep <em>Step</em>}</li>
 *   <li>{@link ecore.org.graphstream.graph.implementations.impl.AbstractGraphImpl#isNullAttributesAreErrors <em>Null Attributes Are Errors</em>}</li>
 *   <li>{@link ecore.org.graphstream.graph.implementations.impl.AbstractGraphImpl#getReplayId <em>Replay Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractGraphImpl extends AbstractElementImpl implements ecore.org.graphstream.graph.implementations.AbstractGraph {
	/**
	 * The default value of the '{@link #isStrictChecking() <em>Strict Checking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStrictChecking()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STRICT_CHECKING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStrictChecking() <em>Strict Checking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStrictChecking()
	 * @generated
	 * @ordered
	 */
	protected boolean strictChecking = STRICT_CHECKING_EDEFAULT;

	/**
	 * The default value of the '{@link #isAutoCreate() <em>Auto Create</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoCreate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTO_CREATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAutoCreate() <em>Auto Create</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoCreate()
	 * @generated
	 * @ordered
	 */
	protected boolean autoCreate = AUTO_CREATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNodeFactory() <em>Node Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeFactory()
	 * @generated
	 * @ordered
	 */
	protected NodeFactory<? extends Node> nodeFactory;

	/**
	 * The cached value of the '{@link #getEdgeFactory() <em>Edge Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdgeFactory()
	 * @generated
	 * @ordered
	 */
	protected EdgeFactory<? extends Edge> edgeFactory;

	/**
	 * The default value of the '{@link #getStep() <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected static final double STEP_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getStep() <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected double step = STEP_EDEFAULT;

	/**
	 * The default value of the '{@link #isNullAttributesAreErrors() <em>Null Attributes Are Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNullAttributesAreErrors()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NULL_ATTRIBUTES_ARE_ERRORS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNullAttributesAreErrors() <em>Null Attributes Are Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNullAttributesAreErrors()
	 * @generated
	 * @ordered
	 */
	protected boolean nullAttributesAreErrors = NULL_ATTRIBUTES_ARE_ERRORS_EDEFAULT;

	/**
	 * The default value of the '{@link #getReplayId() <em>Replay Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplayId()
	 * @generated
	 * @ordered
	 */
	protected static final long REPLAY_ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getReplayId() <em>Replay Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplayId()
	 * @generated
	 * @ordered
	 */
	protected long replayId = REPLAY_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractGraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImplementationsPackage.Literals.ABSTRACT_GRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStrictChecking() {
		return strictChecking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrictChecking(boolean newStrictChecking) {
		boolean oldStrictChecking = strictChecking;
		strictChecking = newStrictChecking;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationsPackage.ABSTRACT_GRAPH__STRICT_CHECKING, oldStrictChecking, strictChecking));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAutoCreate() {
		return autoCreate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoCreate(boolean newAutoCreate) {
		boolean oldAutoCreate = autoCreate;
		autoCreate = newAutoCreate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationsPackage.ABSTRACT_GRAPH__AUTO_CREATE, oldAutoCreate, autoCreate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeFactory<? extends Node> getNodeFactory() {
		return nodeFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeFactory(NodeFactory<? extends Node> newNodeFactory) {
		NodeFactory<? extends Node> oldNodeFactory = nodeFactory;
		nodeFactory = newNodeFactory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationsPackage.ABSTRACT_GRAPH__NODE_FACTORY, oldNodeFactory, nodeFactory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeFactory<? extends Edge> getEdgeFactory() {
		return edgeFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdgeFactory(EdgeFactory<? extends Edge> newEdgeFactory) {
		EdgeFactory<? extends Edge> oldEdgeFactory = edgeFactory;
		edgeFactory = newEdgeFactory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationsPackage.ABSTRACT_GRAPH__EDGE_FACTORY, oldEdgeFactory, edgeFactory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getStep() {
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStep(double newStep) {
		double oldStep = step;
		step = newStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationsPackage.ABSTRACT_GRAPH__STEP, oldStep, step));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNullAttributesAreErrors() {
		return nullAttributesAreErrors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNullAttributesAreErrors(boolean newNullAttributesAreErrors) {
		boolean oldNullAttributesAreErrors = nullAttributesAreErrors;
		nullAttributesAreErrors = newNullAttributesAreErrors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationsPackage.ABSTRACT_GRAPH__NULL_ATTRIBUTES_ARE_ERRORS, oldNullAttributesAreErrors, nullAttributesAreErrors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getReplayId() {
		return replayId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplayId(long newReplayId) {
		long oldReplayId = replayId;
		replayId = newReplayId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationsPackage.ABSTRACT_GRAPH__REPLAY_ID, oldReplayId, replayId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean nullAttributesAreErrors() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Node> T getNode(String id) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Node> T getNode(int index) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Edge> T getEdge(String id) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Edge> T getEdge(int index) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNodeCount() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEdgeCount() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Node> Iterator<T> getNodeIterator() {
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
	public <T extends Node> Iterable<? extends T> getEachNode() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Edge> Iterable<? extends T> getEachEdge() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Node> Collection<T> getNodeSet() {
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
	public Iterator<Node> iterator() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeFactory<? extends Node> nodeFactory() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeFactory<? extends Edge> edgeFactory() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStrict() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAutoCreationEnabled() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrict(boolean on) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void stepBegins(double time) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void clear() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Node> T addNode(String id) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Edge> T addEdge(String id, String node1, String node2) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Edge> T addEdge(String id, String from, String to, boolean directed) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Edge> T addEdge(String id, int index1, int index2) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Edge> T addEdge(String id, int fromIndex, int toIndex, boolean directed) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Edge> T addEdge(String id, Node node1, Node node2) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Edge> T addEdge(String id, Node from, Node to, boolean directed) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Node> T removeNode(String id) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Node> T removeNode(int index) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Node> T removeNode(Node node) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Edge> T removeEdge(String id) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Edge> T removeEdge(int index) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Edge> T removeEdge(Edge edge) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Edge> T removeEdge(String from, String to) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Edge> T removeEdge(int fromIndex, int toIndex) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Edge> T removeEdge(Node node1, Node node2) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iterable<AttributeSink> attributeSinks() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iterable<ElementSink> elementSinks() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addAttributeSink(AttributeSink sink) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addElementSink(ElementSink sink) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addSink(Sink sink) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void clearAttributeSinks() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void clearElementSinks() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void clearSinks() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeAttributeSink(AttributeSink sink) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeElementSink(ElementSink sink) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeSink(Sink sink) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void edgeAttributeAdded(String sourceId, long timeId, String edgeId, String attribute, Object value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void edgeAttributeChanged(String sourceId, long timeId, String edgeId, String attribute, Object oldValue, Object newValue) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void edgeAttributeRemoved(String sourceId, long timeId, String edgeId, String attribute) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void graphAttributeAdded(String sourceId, long timeId, String attribute, Object value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void graphAttributeChanged(String sourceId, long timeId, String attribute, Object oldValue, Object newValue) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void graphAttributeRemoved(String sourceId, long timeId, String attribute) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void nodeAttributeAdded(String sourceId, long timeId, String nodeId, String attribute, Object value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void nodeAttributeChanged(String sourceId, long timeId, String nodeId, String attribute, Object oldValue, Object newValue) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void nodeAttributeRemoved(String sourceId, long timeId, String nodeId, String attribute) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void edgeAdded(String sourceId, long timeId, String edgeId, String fromNodeId, String toNodeId, boolean directed) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void edgeRemoved(String sourceId, long timeId, String edgeId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void graphCleared(String sourceId, long timeId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void nodeAdded(String sourceId, long timeId, String nodeId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void nodeRemoved(String sourceId, long timeId, String nodeId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void stepBegins(String sourceId, long timeId, double step) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Viewer display() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Viewer display(boolean autoLayout) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void read(FileSource input, String filename) throws IOException, GraphParseException {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void read(String filename) throws IOException, GraphParseException, ElementNotFoundException {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void write(FileSink output, String filename) throws IOException {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void write(String filename) throws IOException {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Controller getReplayController() {
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
			case ImplementationsPackage.ABSTRACT_GRAPH__STRICT_CHECKING:
				return isStrictChecking();
			case ImplementationsPackage.ABSTRACT_GRAPH__AUTO_CREATE:
				return isAutoCreate();
			case ImplementationsPackage.ABSTRACT_GRAPH__NODE_FACTORY:
				return getNodeFactory();
			case ImplementationsPackage.ABSTRACT_GRAPH__EDGE_FACTORY:
				return getEdgeFactory();
			case ImplementationsPackage.ABSTRACT_GRAPH__STEP:
				return getStep();
			case ImplementationsPackage.ABSTRACT_GRAPH__NULL_ATTRIBUTES_ARE_ERRORS:
				return isNullAttributesAreErrors();
			case ImplementationsPackage.ABSTRACT_GRAPH__REPLAY_ID:
				return getReplayId();
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
			case ImplementationsPackage.ABSTRACT_GRAPH__STRICT_CHECKING:
				setStrictChecking((Boolean)newValue);
				return;
			case ImplementationsPackage.ABSTRACT_GRAPH__AUTO_CREATE:
				setAutoCreate((Boolean)newValue);
				return;
			case ImplementationsPackage.ABSTRACT_GRAPH__NODE_FACTORY:
				setNodeFactory((NodeFactory<? extends Node>)newValue);
				return;
			case ImplementationsPackage.ABSTRACT_GRAPH__EDGE_FACTORY:
				setEdgeFactory((EdgeFactory<? extends Edge>)newValue);
				return;
			case ImplementationsPackage.ABSTRACT_GRAPH__STEP:
				setStep((Double)newValue);
				return;
			case ImplementationsPackage.ABSTRACT_GRAPH__NULL_ATTRIBUTES_ARE_ERRORS:
				setNullAttributesAreErrors((Boolean)newValue);
				return;
			case ImplementationsPackage.ABSTRACT_GRAPH__REPLAY_ID:
				setReplayId((Long)newValue);
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
			case ImplementationsPackage.ABSTRACT_GRAPH__STRICT_CHECKING:
				setStrictChecking(STRICT_CHECKING_EDEFAULT);
				return;
			case ImplementationsPackage.ABSTRACT_GRAPH__AUTO_CREATE:
				setAutoCreate(AUTO_CREATE_EDEFAULT);
				return;
			case ImplementationsPackage.ABSTRACT_GRAPH__NODE_FACTORY:
				setNodeFactory((NodeFactory<? extends Node>)null);
				return;
			case ImplementationsPackage.ABSTRACT_GRAPH__EDGE_FACTORY:
				setEdgeFactory((EdgeFactory<? extends Edge>)null);
				return;
			case ImplementationsPackage.ABSTRACT_GRAPH__STEP:
				setStep(STEP_EDEFAULT);
				return;
			case ImplementationsPackage.ABSTRACT_GRAPH__NULL_ATTRIBUTES_ARE_ERRORS:
				setNullAttributesAreErrors(NULL_ATTRIBUTES_ARE_ERRORS_EDEFAULT);
				return;
			case ImplementationsPackage.ABSTRACT_GRAPH__REPLAY_ID:
				setReplayId(REPLAY_ID_EDEFAULT);
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
			case ImplementationsPackage.ABSTRACT_GRAPH__STRICT_CHECKING:
				return strictChecking != STRICT_CHECKING_EDEFAULT;
			case ImplementationsPackage.ABSTRACT_GRAPH__AUTO_CREATE:
				return autoCreate != AUTO_CREATE_EDEFAULT;
			case ImplementationsPackage.ABSTRACT_GRAPH__NODE_FACTORY:
				return nodeFactory != null;
			case ImplementationsPackage.ABSTRACT_GRAPH__EDGE_FACTORY:
				return edgeFactory != null;
			case ImplementationsPackage.ABSTRACT_GRAPH__STEP:
				return step != STEP_EDEFAULT;
			case ImplementationsPackage.ABSTRACT_GRAPH__NULL_ATTRIBUTES_ARE_ERRORS:
				return nullAttributesAreErrors != NULL_ATTRIBUTES_ARE_ERRORS_EDEFAULT;
			case ImplementationsPackage.ABSTRACT_GRAPH__REPLAY_ID:
				return replayId != REPLAY_ID_EDEFAULT;
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
		if (baseClass == Source.class) {
			switch (baseOperationID) {
				case StreamPackage.SOURCE___ADD_SINK__SINK: return ImplementationsPackage.ABSTRACT_GRAPH___ADD_SINK__SINK;
				case StreamPackage.SOURCE___REMOVE_SINK__SINK: return ImplementationsPackage.ABSTRACT_GRAPH___REMOVE_SINK__SINK;
				case StreamPackage.SOURCE___ADD_ATTRIBUTE_SINK__ATTRIBUTESINK: return ImplementationsPackage.ABSTRACT_GRAPH___ADD_ATTRIBUTE_SINK__ATTRIBUTESINK;
				case StreamPackage.SOURCE___REMOVE_ATTRIBUTE_SINK__ATTRIBUTESINK: return ImplementationsPackage.ABSTRACT_GRAPH___REMOVE_ATTRIBUTE_SINK__ATTRIBUTESINK;
				case StreamPackage.SOURCE___ADD_ELEMENT_SINK__ELEMENTSINK: return ImplementationsPackage.ABSTRACT_GRAPH___ADD_ELEMENT_SINK__ELEMENTSINK;
				case StreamPackage.SOURCE___REMOVE_ELEMENT_SINK__ELEMENTSINK: return ImplementationsPackage.ABSTRACT_GRAPH___REMOVE_ELEMENT_SINK__ELEMENTSINK;
				case StreamPackage.SOURCE___CLEAR_ELEMENT_SINKS: return ImplementationsPackage.ABSTRACT_GRAPH___CLEAR_ELEMENT_SINKS;
				case StreamPackage.SOURCE___CLEAR_ATTRIBUTE_SINKS: return ImplementationsPackage.ABSTRACT_GRAPH___CLEAR_ATTRIBUTE_SINKS;
				case StreamPackage.SOURCE___CLEAR_SINKS: return ImplementationsPackage.ABSTRACT_GRAPH___CLEAR_SINKS;
				default: return -1;
			}
		}
		if (baseClass == AttributeSink.class) {
			switch (baseOperationID) {
				case StreamPackage.ATTRIBUTE_SINK___GRAPH_ATTRIBUTE_ADDED__STRING_LONG_STRING_OBJECT: return ImplementationsPackage.ABSTRACT_GRAPH___GRAPH_ATTRIBUTE_ADDED__STRING_LONG_STRING_OBJECT;
				case StreamPackage.ATTRIBUTE_SINK___GRAPH_ATTRIBUTE_CHANGED__STRING_LONG_STRING_OBJECT_OBJECT: return ImplementationsPackage.ABSTRACT_GRAPH___GRAPH_ATTRIBUTE_CHANGED__STRING_LONG_STRING_OBJECT_OBJECT;
				case StreamPackage.ATTRIBUTE_SINK___GRAPH_ATTRIBUTE_REMOVED__STRING_LONG_STRING: return ImplementationsPackage.ABSTRACT_GRAPH___GRAPH_ATTRIBUTE_REMOVED__STRING_LONG_STRING;
				case StreamPackage.ATTRIBUTE_SINK___NODE_ATTRIBUTE_ADDED__STRING_LONG_STRING_STRING_OBJECT: return ImplementationsPackage.ABSTRACT_GRAPH___NODE_ATTRIBUTE_ADDED__STRING_LONG_STRING_STRING_OBJECT;
				case StreamPackage.ATTRIBUTE_SINK___NODE_ATTRIBUTE_CHANGED__STRING_LONG_STRING_STRING_OBJECT_OBJECT: return ImplementationsPackage.ABSTRACT_GRAPH___NODE_ATTRIBUTE_CHANGED__STRING_LONG_STRING_STRING_OBJECT_OBJECT;
				case StreamPackage.ATTRIBUTE_SINK___NODE_ATTRIBUTE_REMOVED__STRING_LONG_STRING_STRING: return ImplementationsPackage.ABSTRACT_GRAPH___NODE_ATTRIBUTE_REMOVED__STRING_LONG_STRING_STRING;
				case StreamPackage.ATTRIBUTE_SINK___EDGE_ATTRIBUTE_ADDED__STRING_LONG_STRING_STRING_OBJECT: return ImplementationsPackage.ABSTRACT_GRAPH___EDGE_ATTRIBUTE_ADDED__STRING_LONG_STRING_STRING_OBJECT;
				case StreamPackage.ATTRIBUTE_SINK___EDGE_ATTRIBUTE_CHANGED__STRING_LONG_STRING_STRING_OBJECT_OBJECT: return ImplementationsPackage.ABSTRACT_GRAPH___EDGE_ATTRIBUTE_CHANGED__STRING_LONG_STRING_STRING_OBJECT_OBJECT;
				case StreamPackage.ATTRIBUTE_SINK___EDGE_ATTRIBUTE_REMOVED__STRING_LONG_STRING_STRING: return ImplementationsPackage.ABSTRACT_GRAPH___EDGE_ATTRIBUTE_REMOVED__STRING_LONG_STRING_STRING;
				default: return -1;
			}
		}
		if (baseClass == ElementSink.class) {
			switch (baseOperationID) {
				case StreamPackage.ELEMENT_SINK___NODE_ADDED__STRING_LONG_STRING: return ImplementationsPackage.ABSTRACT_GRAPH___NODE_ADDED__STRING_LONG_STRING;
				case StreamPackage.ELEMENT_SINK___NODE_REMOVED__STRING_LONG_STRING: return ImplementationsPackage.ABSTRACT_GRAPH___NODE_REMOVED__STRING_LONG_STRING;
				case StreamPackage.ELEMENT_SINK___EDGE_ADDED__STRING_LONG_STRING_STRING_STRING_BOOLEAN: return ImplementationsPackage.ABSTRACT_GRAPH___EDGE_ADDED__STRING_LONG_STRING_STRING_STRING_BOOLEAN;
				case StreamPackage.ELEMENT_SINK___EDGE_REMOVED__STRING_LONG_STRING: return ImplementationsPackage.ABSTRACT_GRAPH___EDGE_REMOVED__STRING_LONG_STRING;
				case StreamPackage.ELEMENT_SINK___GRAPH_CLEARED__STRING_LONG: return ImplementationsPackage.ABSTRACT_GRAPH___GRAPH_CLEARED__STRING_LONG;
				case StreamPackage.ELEMENT_SINK___STEP_BEGINS__STRING_LONG_DOUBLE: return ImplementationsPackage.ABSTRACT_GRAPH___STEP_BEGINS__STRING_LONG_DOUBLE;
				default: return -1;
			}
		}
		if (baseClass == Sink.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == Pipe.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == Structure.class) {
			switch (baseOperationID) {
				case GraphPackage.STRUCTURE___GET_NODE_COUNT: return ImplementationsPackage.ABSTRACT_GRAPH___GET_NODE_COUNT;
				case GraphPackage.STRUCTURE___GET_EDGE_COUNT: return ImplementationsPackage.ABSTRACT_GRAPH___GET_EDGE_COUNT;
				case GraphPackage.STRUCTURE___GET_NODE_ITERATOR: return ImplementationsPackage.ABSTRACT_GRAPH___GET_NODE_ITERATOR;
				case GraphPackage.STRUCTURE___GET_EDGE_ITERATOR: return ImplementationsPackage.ABSTRACT_GRAPH___GET_EDGE_ITERATOR;
				case GraphPackage.STRUCTURE___GET_EACH_NODE: return ImplementationsPackage.ABSTRACT_GRAPH___GET_EACH_NODE;
				case GraphPackage.STRUCTURE___GET_EACH_EDGE: return ImplementationsPackage.ABSTRACT_GRAPH___GET_EACH_EDGE;
				case GraphPackage.STRUCTURE___GET_NODE_SET: return ImplementationsPackage.ABSTRACT_GRAPH___GET_NODE_SET;
				case GraphPackage.STRUCTURE___GET_EDGE_SET: return ImplementationsPackage.ABSTRACT_GRAPH___GET_EDGE_SET;
				default: return -1;
			}
		}
		if (baseClass == Graph.class) {
			switch (baseOperationID) {
				case GraphPackage.GRAPH___GET_NODE__STRING: return ImplementationsPackage.ABSTRACT_GRAPH___GET_NODE__STRING;
				case GraphPackage.GRAPH___GET_EDGE__STRING: return ImplementationsPackage.ABSTRACT_GRAPH___GET_EDGE__STRING;
				case GraphPackage.GRAPH___NODE_FACTORY: return ImplementationsPackage.ABSTRACT_GRAPH___NODE_FACTORY;
				case GraphPackage.GRAPH___EDGE_FACTORY: return ImplementationsPackage.ABSTRACT_GRAPH___EDGE_FACTORY;
				case GraphPackage.GRAPH___IS_STRICT: return ImplementationsPackage.ABSTRACT_GRAPH___IS_STRICT;
				case GraphPackage.GRAPH___IS_AUTO_CREATION_ENABLED: return ImplementationsPackage.ABSTRACT_GRAPH___IS_AUTO_CREATION_ENABLED;
				case GraphPackage.GRAPH___NULL_ATTRIBUTES_ARE_ERRORS: return ImplementationsPackage.ABSTRACT_GRAPH___NULL_ATTRIBUTES_ARE_ERRORS;
				case GraphPackage.GRAPH___GET_STEP: return ImplementationsPackage.ABSTRACT_GRAPH___GET_STEP;
				case GraphPackage.GRAPH___SET_NULL_ATTRIBUTES_ARE_ERRORS__BOOLEAN: return ImplementationsPackage.ABSTRACT_GRAPH___SET_NULL_ATTRIBUTES_ARE_ERRORS__BOOLEAN;
				case GraphPackage.GRAPH___SET_NODE_FACTORY__NODEFACTORY: return ImplementationsPackage.ABSTRACT_GRAPH___SET_NODE_FACTORY__NODEFACTORY;
				case GraphPackage.GRAPH___SET_EDGE_FACTORY__EDGEFACTORY: return ImplementationsPackage.ABSTRACT_GRAPH___SET_EDGE_FACTORY__EDGEFACTORY;
				case GraphPackage.GRAPH___SET_STRICT__BOOLEAN: return ImplementationsPackage.ABSTRACT_GRAPH___SET_STRICT__BOOLEAN;
				case GraphPackage.GRAPH___SET_AUTO_CREATE__BOOLEAN: return ImplementationsPackage.ABSTRACT_GRAPH___SET_AUTO_CREATE__BOOLEAN;
				case GraphPackage.GRAPH___CLEAR: return ImplementationsPackage.ABSTRACT_GRAPH___CLEAR;
				case GraphPackage.GRAPH___ADD_NODE__STRING: return ImplementationsPackage.ABSTRACT_GRAPH___ADD_NODE__STRING;
				case GraphPackage.GRAPH___REMOVE_NODE__STRING: return ImplementationsPackage.ABSTRACT_GRAPH___REMOVE_NODE__STRING;
				case GraphPackage.GRAPH___ADD_EDGE__STRING_STRING_STRING: return ImplementationsPackage.ABSTRACT_GRAPH___ADD_EDGE__STRING_STRING_STRING;
				case GraphPackage.GRAPH___ADD_EDGE__STRING_STRING_STRING_BOOLEAN: return ImplementationsPackage.ABSTRACT_GRAPH___ADD_EDGE__STRING_STRING_STRING_BOOLEAN;
				case GraphPackage.GRAPH___REMOVE_EDGE__STRING_STRING: return ImplementationsPackage.ABSTRACT_GRAPH___REMOVE_EDGE__STRING_STRING;
				case GraphPackage.GRAPH___REMOVE_EDGE__STRING: return ImplementationsPackage.ABSTRACT_GRAPH___REMOVE_EDGE__STRING;
				case GraphPackage.GRAPH___STEP_BEGINS__DOUBLE: return ImplementationsPackage.ABSTRACT_GRAPH___STEP_BEGINS__DOUBLE;
				case GraphPackage.GRAPH___ATTRIBUTE_SINKS: return ImplementationsPackage.ABSTRACT_GRAPH___ATTRIBUTE_SINKS;
				case GraphPackage.GRAPH___ELEMENT_SINKS: return ImplementationsPackage.ABSTRACT_GRAPH___ELEMENT_SINKS;
				case GraphPackage.GRAPH___READ__STRING: return ImplementationsPackage.ABSTRACT_GRAPH___READ__STRING;
				case GraphPackage.GRAPH___READ__FILESOURCE_STRING: return ImplementationsPackage.ABSTRACT_GRAPH___READ__FILESOURCE_STRING;
				case GraphPackage.GRAPH___WRITE__STRING: return ImplementationsPackage.ABSTRACT_GRAPH___WRITE__STRING;
				case GraphPackage.GRAPH___WRITE__FILESINK_STRING: return ImplementationsPackage.ABSTRACT_GRAPH___WRITE__FILESINK_STRING;
				case GraphPackage.GRAPH___DISPLAY: return ImplementationsPackage.ABSTRACT_GRAPH___DISPLAY;
				case GraphPackage.GRAPH___DISPLAY__BOOLEAN: return ImplementationsPackage.ABSTRACT_GRAPH___DISPLAY__BOOLEAN;
				case GraphPackage.GRAPH___GET_NODE__INT: return ImplementationsPackage.ABSTRACT_GRAPH___GET_NODE__INT;
				case GraphPackage.GRAPH___GET_EDGE__INT: return ImplementationsPackage.ABSTRACT_GRAPH___GET_EDGE__INT;
				case GraphPackage.GRAPH___ADD_EDGE__STRING_INT_INT: return ImplementationsPackage.ABSTRACT_GRAPH___ADD_EDGE__STRING_INT_INT;
				case GraphPackage.GRAPH___ADD_EDGE__STRING_INT_INT_BOOLEAN: return ImplementationsPackage.ABSTRACT_GRAPH___ADD_EDGE__STRING_INT_INT_BOOLEAN;
				case GraphPackage.GRAPH___ADD_EDGE__STRING_NODE_NODE: return ImplementationsPackage.ABSTRACT_GRAPH___ADD_EDGE__STRING_NODE_NODE;
				case GraphPackage.GRAPH___ADD_EDGE__STRING_NODE_NODE_BOOLEAN: return ImplementationsPackage.ABSTRACT_GRAPH___ADD_EDGE__STRING_NODE_NODE_BOOLEAN;
				case GraphPackage.GRAPH___REMOVE_EDGE__INT: return ImplementationsPackage.ABSTRACT_GRAPH___REMOVE_EDGE__INT;
				case GraphPackage.GRAPH___REMOVE_EDGE__INT_INT: return ImplementationsPackage.ABSTRACT_GRAPH___REMOVE_EDGE__INT_INT;
				case GraphPackage.GRAPH___REMOVE_EDGE__NODE_NODE: return ImplementationsPackage.ABSTRACT_GRAPH___REMOVE_EDGE__NODE_NODE;
				case GraphPackage.GRAPH___REMOVE_EDGE__EDGE: return ImplementationsPackage.ABSTRACT_GRAPH___REMOVE_EDGE__EDGE;
				case GraphPackage.GRAPH___REMOVE_NODE__INT: return ImplementationsPackage.ABSTRACT_GRAPH___REMOVE_NODE__INT;
				case GraphPackage.GRAPH___REMOVE_NODE__NODE: return ImplementationsPackage.ABSTRACT_GRAPH___REMOVE_NODE__NODE;
				default: return -1;
			}
		}
		if (baseClass == Replayable.class) {
			switch (baseOperationID) {
				case StreamPackage.REPLAYABLE___GET_REPLAY_CONTROLLER: return ImplementationsPackage.ABSTRACT_GRAPH___GET_REPLAY_CONTROLLER;
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
			case ImplementationsPackage.ABSTRACT_GRAPH___NULL_ATTRIBUTES_ARE_ERRORS:
				return nullAttributesAreErrors();
			case ImplementationsPackage.ABSTRACT_GRAPH___GET_NODE__STRING:
				return getNode((String)arguments.get(0));
			case ImplementationsPackage.ABSTRACT_GRAPH___GET_NODE__INT:
				return getNode((Integer)arguments.get(0));
			case ImplementationsPackage.ABSTRACT_GRAPH___GET_EDGE__STRING:
				return getEdge((String)arguments.get(0));
			case ImplementationsPackage.ABSTRACT_GRAPH___GET_EDGE__INT:
				return getEdge((Integer)arguments.get(0));
			case ImplementationsPackage.ABSTRACT_GRAPH___GET_NODE_COUNT:
				return getNodeCount();
			case ImplementationsPackage.ABSTRACT_GRAPH___GET_EDGE_COUNT:
				return getEdgeCount();
			case ImplementationsPackage.ABSTRACT_GRAPH___GET_NODE_ITERATOR:
				return getNodeIterator();
			case ImplementationsPackage.ABSTRACT_GRAPH___GET_EDGE_ITERATOR:
				return getEdgeIterator();
			case ImplementationsPackage.ABSTRACT_GRAPH___GET_EACH_NODE:
				return getEachNode();
			case ImplementationsPackage.ABSTRACT_GRAPH___GET_EACH_EDGE:
				return getEachEdge();
			case ImplementationsPackage.ABSTRACT_GRAPH___GET_NODE_SET:
				return getNodeSet();
			case ImplementationsPackage.ABSTRACT_GRAPH___GET_EDGE_SET:
				return getEdgeSet();
			case ImplementationsPackage.ABSTRACT_GRAPH___ITERATOR:
				return iterator();
			case ImplementationsPackage.ABSTRACT_GRAPH___NODE_FACTORY:
				return nodeFactory();
			case ImplementationsPackage.ABSTRACT_GRAPH___EDGE_FACTORY:
				return edgeFactory();
			case ImplementationsPackage.ABSTRACT_GRAPH___IS_STRICT:
				return isStrict();
			case ImplementationsPackage.ABSTRACT_GRAPH___IS_AUTO_CREATION_ENABLED:
				return isAutoCreationEnabled();
			case ImplementationsPackage.ABSTRACT_GRAPH___SET_STRICT__BOOLEAN:
				setStrict((Boolean)arguments.get(0));
				return null;
			case ImplementationsPackage.ABSTRACT_GRAPH___STEP_BEGINS__DOUBLE:
				stepBegins((Double)arguments.get(0));
				return null;
			case ImplementationsPackage.ABSTRACT_GRAPH___CLEAR:
				clear();
				return null;
			case ImplementationsPackage.ABSTRACT_GRAPH___ADD_NODE__STRING:
				return addNode((String)arguments.get(0));
			case ImplementationsPackage.ABSTRACT_GRAPH___ADD_EDGE__STRING_STRING_STRING:
				return addEdge((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
			case ImplementationsPackage.ABSTRACT_GRAPH___ADD_EDGE__STRING_STRING_STRING_BOOLEAN:
				return addEdge((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (Boolean)arguments.get(3));
			case ImplementationsPackage.ABSTRACT_GRAPH___ADD_EDGE__STRING_INT_INT:
				return addEdge((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ImplementationsPackage.ABSTRACT_GRAPH___ADD_EDGE__STRING_INT_INT_BOOLEAN:
				return addEdge((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Boolean)arguments.get(3));
			case ImplementationsPackage.ABSTRACT_GRAPH___ADD_EDGE__STRING_NODE_NODE:
				return addEdge((String)arguments.get(0), (Node)arguments.get(1), (Node)arguments.get(2));
			case ImplementationsPackage.ABSTRACT_GRAPH___ADD_EDGE__STRING_NODE_NODE_BOOLEAN:
				return addEdge((String)arguments.get(0), (Node)arguments.get(1), (Node)arguments.get(2), (Boolean)arguments.get(3));
			case ImplementationsPackage.ABSTRACT_GRAPH___REMOVE_NODE__STRING:
				return removeNode((String)arguments.get(0));
			case ImplementationsPackage.ABSTRACT_GRAPH___REMOVE_NODE__INT:
				return removeNode((Integer)arguments.get(0));
			case ImplementationsPackage.ABSTRACT_GRAPH___REMOVE_NODE__NODE:
				return removeNode((Node)arguments.get(0));
			case ImplementationsPackage.ABSTRACT_GRAPH___REMOVE_EDGE__STRING:
				return removeEdge((String)arguments.get(0));
			case ImplementationsPackage.ABSTRACT_GRAPH___REMOVE_EDGE__INT:
				return removeEdge((Integer)arguments.get(0));
			case ImplementationsPackage.ABSTRACT_GRAPH___REMOVE_EDGE__EDGE:
				return removeEdge((Edge)arguments.get(0));
			case ImplementationsPackage.ABSTRACT_GRAPH___REMOVE_EDGE__STRING_STRING:
				return removeEdge((String)arguments.get(0), (String)arguments.get(1));
			case ImplementationsPackage.ABSTRACT_GRAPH___REMOVE_EDGE__INT_INT:
				return removeEdge((Integer)arguments.get(0), (Integer)arguments.get(1));
			case ImplementationsPackage.ABSTRACT_GRAPH___REMOVE_EDGE__NODE_NODE:
				return removeEdge((Node)arguments.get(0), (Node)arguments.get(1));
			case ImplementationsPackage.ABSTRACT_GRAPH___ATTRIBUTE_SINKS:
				return attributeSinks();
			case ImplementationsPackage.ABSTRACT_GRAPH___ELEMENT_SINKS:
				return elementSinks();
			case ImplementationsPackage.ABSTRACT_GRAPH___ADD_ATTRIBUTE_SINK__ATTRIBUTESINK:
				addAttributeSink((AttributeSink)arguments.get(0));
				return null;
			case ImplementationsPackage.ABSTRACT_GRAPH___ADD_ELEMENT_SINK__ELEMENTSINK:
				addElementSink((ElementSink)arguments.get(0));
				return null;
			case ImplementationsPackage.ABSTRACT_GRAPH___ADD_SINK__SINK:
				addSink((Sink)arguments.get(0));
				return null;
			case ImplementationsPackage.ABSTRACT_GRAPH___CLEAR_ATTRIBUTE_SINKS:
				clearAttributeSinks();
				return null;
			case ImplementationsPackage.ABSTRACT_GRAPH___CLEAR_ELEMENT_SINKS:
				clearElementSinks();
				return null;
			case ImplementationsPackage.ABSTRACT_GRAPH___CLEAR_SINKS:
				clearSinks();
				return null;
			case ImplementationsPackage.ABSTRACT_GRAPH___REMOVE_ATTRIBUTE_SINK__ATTRIBUTESINK:
				removeAttributeSink((AttributeSink)arguments.get(0));
				return null;
			case ImplementationsPackage.ABSTRACT_GRAPH___REMOVE_ELEMENT_SINK__ELEMENTSINK:
				removeElementSink((ElementSink)arguments.get(0));
				return null;
			case ImplementationsPackage.ABSTRACT_GRAPH___REMOVE_SINK__SINK:
				removeSink((Sink)arguments.get(0));
				return null;
			case ImplementationsPackage.ABSTRACT_GRAPH___EDGE_ATTRIBUTE_ADDED__STRING_LONG_STRING_STRING_OBJECT:
				edgeAttributeAdded((String)arguments.get(0), (Long)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), arguments.get(4));
				return null;
			case ImplementationsPackage.ABSTRACT_GRAPH___EDGE_ATTRIBUTE_CHANGED__STRING_LONG_STRING_STRING_OBJECT_OBJECT:
				edgeAttributeChanged((String)arguments.get(0), (Long)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), arguments.get(4), arguments.get(5));
				return null;
			case ImplementationsPackage.ABSTRACT_GRAPH___EDGE_ATTRIBUTE_REMOVED__STRING_LONG_STRING_STRING:
				edgeAttributeRemoved((String)arguments.get(0), (Long)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3));
				return null;
			case ImplementationsPackage.ABSTRACT_GRAPH___GRAPH_ATTRIBUTE_ADDED__STRING_LONG_STRING_OBJECT:
				graphAttributeAdded((String)arguments.get(0), (Long)arguments.get(1), (String)arguments.get(2), arguments.get(3));
				return null;
			case ImplementationsPackage.ABSTRACT_GRAPH___GRAPH_ATTRIBUTE_CHANGED__STRING_LONG_STRING_OBJECT_OBJECT:
				graphAttributeChanged((String)arguments.get(0), (Long)arguments.get(1), (String)arguments.get(2), arguments.get(3), arguments.get(4));
				return null;
			case ImplementationsPackage.ABSTRACT_GRAPH___GRAPH_ATTRIBUTE_REMOVED__STRING_LONG_STRING:
				graphAttributeRemoved((String)arguments.get(0), (Long)arguments.get(1), (String)arguments.get(2));
				return null;
			case ImplementationsPackage.ABSTRACT_GRAPH___NODE_ATTRIBUTE_ADDED__STRING_LONG_STRING_STRING_OBJECT:
				nodeAttributeAdded((String)arguments.get(0), (Long)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), arguments.get(4));
				return null;
			case ImplementationsPackage.ABSTRACT_GRAPH___NODE_ATTRIBUTE_CHANGED__STRING_LONG_STRING_STRING_OBJECT_OBJECT:
				nodeAttributeChanged((String)arguments.get(0), (Long)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), arguments.get(4), arguments.get(5));
				return null;
			case ImplementationsPackage.ABSTRACT_GRAPH___NODE_ATTRIBUTE_REMOVED__STRING_LONG_STRING_STRING:
				nodeAttributeRemoved((String)arguments.get(0), (Long)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3));
				return null;
			case ImplementationsPackage.ABSTRACT_GRAPH___EDGE_ADDED__STRING_LONG_STRING_STRING_STRING_BOOLEAN:
				edgeAdded((String)arguments.get(0), (Long)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4), (Boolean)arguments.get(5));
				return null;
			case ImplementationsPackage.ABSTRACT_GRAPH___EDGE_REMOVED__STRING_LONG_STRING:
				edgeRemoved((String)arguments.get(0), (Long)arguments.get(1), (String)arguments.get(2));
				return null;
			case ImplementationsPackage.ABSTRACT_GRAPH___GRAPH_CLEARED__STRING_LONG:
				graphCleared((String)arguments.get(0), (Long)arguments.get(1));
				return null;
			case ImplementationsPackage.ABSTRACT_GRAPH___NODE_ADDED__STRING_LONG_STRING:
				nodeAdded((String)arguments.get(0), (Long)arguments.get(1), (String)arguments.get(2));
				return null;
			case ImplementationsPackage.ABSTRACT_GRAPH___NODE_REMOVED__STRING_LONG_STRING:
				nodeRemoved((String)arguments.get(0), (Long)arguments.get(1), (String)arguments.get(2));
				return null;
			case ImplementationsPackage.ABSTRACT_GRAPH___STEP_BEGINS__STRING_LONG_DOUBLE:
				stepBegins((String)arguments.get(0), (Long)arguments.get(1), (Double)arguments.get(2));
				return null;
			case ImplementationsPackage.ABSTRACT_GRAPH___DISPLAY:
				return display();
			case ImplementationsPackage.ABSTRACT_GRAPH___DISPLAY__BOOLEAN:
				return display((Boolean)arguments.get(0));
			case ImplementationsPackage.ABSTRACT_GRAPH___READ__FILESOURCE_STRING:
				try {
					read((FileSource)arguments.get(0), (String)arguments.get(1));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ImplementationsPackage.ABSTRACT_GRAPH___READ__STRING:
				try {
					read((String)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ImplementationsPackage.ABSTRACT_GRAPH___WRITE__FILESINK_STRING:
				try {
					write((FileSink)arguments.get(0), (String)arguments.get(1));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ImplementationsPackage.ABSTRACT_GRAPH___WRITE__STRING:
				try {
					write((String)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ImplementationsPackage.ABSTRACT_GRAPH___GET_REPLAY_CONTROLLER:
				return getReplayController();
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
		result.append(" (strictChecking: ");
		result.append(strictChecking);
		result.append(", autoCreate: ");
		result.append(autoCreate);
		result.append(", nodeFactory: ");
		result.append(nodeFactory);
		result.append(", edgeFactory: ");
		result.append(edgeFactory);
		result.append(", step: ");
		result.append(step);
		result.append(", nullAttributesAreErrors: ");
		result.append(nullAttributesAreErrors);
		result.append(", replayId: ");
		result.append(replayId);
		result.append(')');
		return result.toString();
	}

} //AbstractGraphImpl
