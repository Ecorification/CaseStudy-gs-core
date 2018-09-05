/**
 */
package ecore.org.graphstream.graph.implementations;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

import org.graphstream.graph.Edge;
import org.graphstream.graph.EdgeFactory;
import org.graphstream.graph.ElementNotFoundException;
import org.graphstream.graph.Node;
import org.graphstream.graph.NodeFactory;
import org.graphstream.stream.AttributeSink;
import org.graphstream.stream.ElementSink;
import org.graphstream.stream.GraphParseException;
import org.graphstream.stream.Replayable.Controller;
import org.graphstream.stream.Sink;
import org.graphstream.stream.file.FileSink;
import org.graphstream.stream.file.FileSource;
import org.graphstream.ui.view.Viewer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecore.org.graphstream.graph.implementations.AbstractGraph#isStrictChecking <em>Strict Checking</em>}</li>
 *   <li>{@link ecore.org.graphstream.graph.implementations.AbstractGraph#isAutoCreate <em>Auto Create</em>}</li>
 *   <li>{@link ecore.org.graphstream.graph.implementations.AbstractGraph#getNodeFactory <em>Node Factory</em>}</li>
 *   <li>{@link ecore.org.graphstream.graph.implementations.AbstractGraph#getEdgeFactory <em>Edge Factory</em>}</li>
 *   <li>{@link ecore.org.graphstream.graph.implementations.AbstractGraph#getStep <em>Step</em>}</li>
 *   <li>{@link ecore.org.graphstream.graph.implementations.AbstractGraph#isNullAttributesAreErrors <em>Null Attributes Are Errors</em>}</li>
 *   <li>{@link ecore.org.graphstream.graph.implementations.AbstractGraph#getReplayId <em>Replay Id</em>}</li>
 * </ul>
 *
 * @see ecore.org.graphstream.graph.implementations.ImplementationsPackage#getAbstractGraph()
 * @model
 * @generated
 */
public interface AbstractGraph extends ecore.org.graphstream.graph.implementations.AbstractElement, ecore.org.graphstream.graph.Graph, ecore.org.graphstream.stream.Replayable {
	/**
	 * Returns the value of the '<em><b>Strict Checking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strict Checking</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strict Checking</em>' attribute.
	 * @see #setStrictChecking(boolean)
	 * @see ecore.org.graphstream.graph.implementations.ImplementationsPackage#getAbstractGraph_StrictChecking()
	 * @model
	 * @generated
	 */
	boolean isStrictChecking();

	/**
	 * Sets the value of the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#isStrictChecking <em>Strict Checking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strict Checking</em>' attribute.
	 * @see #isStrictChecking()
	 * @generated
	 */
	void setStrictChecking(boolean value);

	/**
	 * Returns the value of the '<em><b>Auto Create</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Create</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Create</em>' attribute.
	 * @see #setAutoCreate(boolean)
	 * @see ecore.org.graphstream.graph.implementations.ImplementationsPackage#getAbstractGraph_AutoCreate()
	 * @model
	 * @generated
	 */
	boolean isAutoCreate();

	/**
	 * Sets the value of the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#isAutoCreate <em>Auto Create</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Create</em>' attribute.
	 * @see #isAutoCreate()
	 * @generated
	 */
	void setAutoCreate(boolean value);

	/**
	 * Returns the value of the '<em><b>Node Factory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Factory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Factory</em>' attribute.
	 * @see #setNodeFactory(NodeFactory)
	 * @see ecore.org.graphstream.graph.implementations.ImplementationsPackage#getAbstractGraph_NodeFactory()
	 * @model dataType="ecore.datatypes.org.graphstream.graph.NodeFactory&lt;? extends ecore.org.graphstream.graph.Node&gt;"
	 * @generated
	 */
	NodeFactory<? extends Node> getNodeFactory();

	/**
	 * Sets the value of the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#getNodeFactory <em>Node Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Factory</em>' attribute.
	 * @see #getNodeFactory()
	 * @generated
	 */
	void setNodeFactory(NodeFactory<? extends Node> value);

	/**
	 * Returns the value of the '<em><b>Edge Factory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edge Factory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge Factory</em>' attribute.
	 * @see #setEdgeFactory(EdgeFactory)
	 * @see ecore.org.graphstream.graph.implementations.ImplementationsPackage#getAbstractGraph_EdgeFactory()
	 * @model dataType="ecore.datatypes.org.graphstream.graph.EdgeFactory&lt;? extends ecore.org.graphstream.graph.Edge&gt;"
	 * @generated
	 */
	EdgeFactory<? extends Edge> getEdgeFactory();

	/**
	 * Sets the value of the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#getEdgeFactory <em>Edge Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edge Factory</em>' attribute.
	 * @see #getEdgeFactory()
	 * @generated
	 */
	void setEdgeFactory(EdgeFactory<? extends Edge> value);

	/**
	 * Returns the value of the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' attribute.
	 * @see #setStep(double)
	 * @see ecore.org.graphstream.graph.implementations.ImplementationsPackage#getAbstractGraph_Step()
	 * @model
	 * @generated
	 */
	double getStep();

	/**
	 * Sets the value of the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#getStep <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step</em>' attribute.
	 * @see #getStep()
	 * @generated
	 */
	void setStep(double value);

	/**
	 * Returns the value of the '<em><b>Null Attributes Are Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Null Attributes Are Errors</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Null Attributes Are Errors</em>' attribute.
	 * @see #setNullAttributesAreErrors(boolean)
	 * @see ecore.org.graphstream.graph.implementations.ImplementationsPackage#getAbstractGraph_NullAttributesAreErrors()
	 * @model
	 * @generated
	 */
	boolean isNullAttributesAreErrors();

	/**
	 * Sets the value of the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#isNullAttributesAreErrors <em>Null Attributes Are Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Null Attributes Are Errors</em>' attribute.
	 * @see #isNullAttributesAreErrors()
	 * @generated
	 */
	void setNullAttributesAreErrors(boolean value);

	/**
	 * Returns the value of the '<em><b>Replay Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Replay Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replay Id</em>' attribute.
	 * @see #setReplayId(long)
	 * @see ecore.org.graphstream.graph.implementations.ImplementationsPackage#getAbstractGraph_ReplayId()
	 * @model
	 * @generated
	 */
	long getReplayId();

	/**
	 * Sets the value of the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#getReplayId <em>Replay Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replay Id</em>' attribute.
	 * @see #getReplayId()
	 * @generated
	 */
	void setReplayId(long value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean nullAttributesAreErrors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	<T extends Node> T getNode(String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	<T extends Node> T getNode(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	<T extends Edge> T getEdge(String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	<T extends Edge> T getEdge(int index);

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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecore.datatypes.java.util.Iterator&lt;ecore.org.graphstream.graph.Node&gt;"
	 * @generated
	 */
	Iterator<Node> iterator();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecore.datatypes.org.graphstream.graph.NodeFactory&lt;? extends ecore.org.graphstream.graph.Node&gt;"
	 * @generated
	 */
	NodeFactory<? extends Node> nodeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecore.datatypes.org.graphstream.graph.EdgeFactory&lt;? extends ecore.org.graphstream.graph.Edge&gt;"
	 * @generated
	 */
	EdgeFactory<? extends Edge> edgeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isStrict();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isAutoCreationEnabled();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setStrict(boolean on);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void stepBegins(double time);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void clear();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	<T extends Node> T addNode(String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	<T extends Edge> T addEdge(String id, String node1, String node2);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	<T extends Edge> T addEdge(String id, String from, String to, boolean directed);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	<T extends Edge> T addEdge(String id, int index1, int index2);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	<T extends Edge> T addEdge(String id, int fromIndex, int toIndex, boolean directed);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	<T extends Edge> T addEdge(String id, Node node1, Node node2);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	<T extends Edge> T addEdge(String id, Node from, Node to, boolean directed);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	<T extends Node> T removeNode(String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	<T extends Node> T removeNode(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	<T extends Node> T removeNode(Node node);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	<T extends Edge> T removeEdge(String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	<T extends Edge> T removeEdge(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	<T extends Edge> T removeEdge(Edge edge);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	<T extends Edge> T removeEdge(String from, String to);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	<T extends Edge> T removeEdge(int fromIndex, int toIndex);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	<T extends Edge> T removeEdge(Node node1, Node node2);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecore.datatypes.java.lang.Iterable&lt;ecore.org.graphstream.stream.AttributeSink&gt;"
	 * @generated
	 */
	Iterable<AttributeSink> attributeSinks();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecore.datatypes.java.lang.Iterable&lt;ecore.org.graphstream.stream.ElementSink&gt;"
	 * @generated
	 */
	Iterable<ElementSink> elementSinks();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addAttributeSink(AttributeSink sink);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addElementSink(ElementSink sink);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addSink(Sink sink);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void clearAttributeSinks();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void clearElementSinks();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void clearSinks();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeAttributeSink(AttributeSink sink);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeElementSink(ElementSink sink);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeSink(Sink sink);

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
	void stepBegins(String sourceId, long timeId, double step);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecore.datatypes.org.graphstream.ui.view.Viewer"
	 * @generated
	 */
	Viewer display();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecore.datatypes.org.graphstream.ui.view.Viewer"
	 * @generated
	 */
	Viewer display(boolean autoLayout);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ecore.datatypes.java.io.IOException ecore.datatypes.org.graphstream.stream.GraphParseException" inputDataType="ecore.datatypes.org.graphstream.stream.file.FileSource"
	 * @generated
	 */
	void read(FileSource input, String filename) throws IOException, GraphParseException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ecore.datatypes.java.io.IOException ecore.datatypes.org.graphstream.stream.GraphParseException ecore.datatypes.org.graphstream.graph.ElementNotFoundException"
	 * @generated
	 */
	void read(String filename) throws IOException, GraphParseException, ElementNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ecore.datatypes.java.io.IOException" outputDataType="ecore.datatypes.org.graphstream.stream.file.FileSink"
	 * @generated
	 */
	void write(FileSink output, String filename) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ecore.datatypes.java.io.IOException"
	 * @generated
	 */
	void write(String filename) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="ecore.datatypes.org.graphstream.stream.Replayable.Controller"
	 * @generated
	 */
	Controller getReplayController();

} // AbstractGraph
