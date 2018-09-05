/**
 */
package ecore.org.graphstream.graph;

import java.io.IOException;

import org.graphstream.graph.Edge;
import org.graphstream.graph.EdgeFactory;
import org.graphstream.graph.EdgeRejectedException;
import org.graphstream.graph.ElementNotFoundException;
import org.graphstream.graph.IdAlreadyInUseException;
import org.graphstream.graph.Node;
import org.graphstream.graph.NodeFactory;
import org.graphstream.stream.AttributeSink;
import org.graphstream.stream.ElementSink;
import org.graphstream.stream.GraphParseException;
import org.graphstream.stream.file.FileSink;
import org.graphstream.stream.file.FileSource;
import org.graphstream.ui.view.Viewer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ecore.org.graphstream.graph.GraphPackage#getGraph()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Graph extends ecore.org.graphstream.graph.Element, ecore.org.graphstream.stream.Pipe, ecore.org.graphstream.graph.Structure {
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
	<T extends Edge> T getEdge(String id);

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
	boolean nullAttributesAreErrors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	double getStep();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setNullAttributesAreErrors(boolean on);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nfDataType="ecore.datatypes.org.graphstream.graph.NodeFactory&lt;? extends ecore.org.graphstream.graph.Node&gt;"
	 * @generated
	 */
	void setNodeFactory(NodeFactory<? extends Node> nf);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model efDataType="ecore.datatypes.org.graphstream.graph.EdgeFactory&lt;? extends ecore.org.graphstream.graph.Edge&gt;"
	 * @generated
	 */
	void setEdgeFactory(EdgeFactory<? extends Edge> ef);

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
	void setAutoCreate(boolean on);

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
	 * @model exceptions="ecore.datatypes.org.graphstream.graph.IdAlreadyInUseException"
	 * @generated
	 */
	<T extends Node> T addNode(String id) throws IdAlreadyInUseException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ecore.datatypes.org.graphstream.graph.ElementNotFoundException"
	 * @generated
	 */
	<T extends Node> T removeNode(String id) throws ElementNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ecore.datatypes.org.graphstream.graph.IdAlreadyInUseException ecore.datatypes.org.graphstream.graph.ElementNotFoundException ecore.datatypes.org.graphstream.graph.EdgeRejectedException"
	 * @generated
	 */
	<T extends Edge> T addEdge(String id, String node1, String node2) throws IdAlreadyInUseException, ElementNotFoundException, EdgeRejectedException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ecore.datatypes.org.graphstream.graph.IdAlreadyInUseException ecore.datatypes.org.graphstream.graph.ElementNotFoundException ecore.datatypes.org.graphstream.graph.EdgeRejectedException"
	 * @generated
	 */
	<T extends Edge> T addEdge(String id, String from, String to, boolean directed) throws IdAlreadyInUseException, ElementNotFoundException, EdgeRejectedException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ecore.datatypes.org.graphstream.graph.ElementNotFoundException"
	 * @generated
	 */
	<T extends Edge> T removeEdge(String from, String to) throws ElementNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ecore.datatypes.org.graphstream.graph.ElementNotFoundException"
	 * @generated
	 */
	<T extends Edge> T removeEdge(String id) throws ElementNotFoundException;

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
	 * @model exceptions="ecore.datatypes.java.io.IOException ecore.datatypes.org.graphstream.stream.GraphParseException ecore.datatypes.org.graphstream.graph.ElementNotFoundException"
	 * @generated
	 */
	void read(String filename) throws IOException, GraphParseException, ElementNotFoundException;

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
	 * @model exceptions="ecore.datatypes.java.io.IOException"
	 * @generated
	 */
	void write(String filename) throws IOException;

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
	 * @model exceptions="ecore.datatypes.java.lang.IndexOutOfBoundsException"
	 * @generated
	 */
	<T extends Node> T getNode(int index) throws IndexOutOfBoundsException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ecore.datatypes.java.lang.IndexOutOfBoundsException"
	 * @generated
	 */
	<T extends Edge> T getEdge(int index) throws IndexOutOfBoundsException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ecore.datatypes.java.lang.IndexOutOfBoundsException ecore.datatypes.org.graphstream.graph.IdAlreadyInUseException ecore.datatypes.org.graphstream.graph.EdgeRejectedException"
	 * @generated
	 */
	<T extends Edge> T addEdge(String id, int index1, int index2) throws IndexOutOfBoundsException, IdAlreadyInUseException, EdgeRejectedException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ecore.datatypes.java.lang.IndexOutOfBoundsException ecore.datatypes.org.graphstream.graph.IdAlreadyInUseException ecore.datatypes.org.graphstream.graph.EdgeRejectedException"
	 * @generated
	 */
	<T extends Edge> T addEdge(String id, int fromIndex, int toIndex, boolean directed) throws IndexOutOfBoundsException, IdAlreadyInUseException, EdgeRejectedException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ecore.datatypes.org.graphstream.graph.IdAlreadyInUseException ecore.datatypes.org.graphstream.graph.EdgeRejectedException"
	 * @generated
	 */
	<T extends Edge> T addEdge(String id, Node node1, Node node2) throws IdAlreadyInUseException, EdgeRejectedException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ecore.datatypes.org.graphstream.graph.IdAlreadyInUseException ecore.datatypes.org.graphstream.graph.EdgeRejectedException"
	 * @generated
	 */
	<T extends Edge> T addEdge(String id, Node from, Node to, boolean directed) throws IdAlreadyInUseException, EdgeRejectedException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ecore.datatypes.java.lang.IndexOutOfBoundsException"
	 * @generated
	 */
	<T extends Edge> T removeEdge(int index) throws IndexOutOfBoundsException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ecore.datatypes.java.lang.IndexOutOfBoundsException ecore.datatypes.org.graphstream.graph.ElementNotFoundException"
	 * @generated
	 */
	<T extends Edge> T removeEdge(int fromIndex, int toIndex) throws IndexOutOfBoundsException, ElementNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ecore.datatypes.org.graphstream.graph.ElementNotFoundException"
	 * @generated
	 */
	<T extends Edge> T removeEdge(Node node1, Node node2) throws ElementNotFoundException;

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
	 * @model exceptions="ecore.datatypes.java.lang.IndexOutOfBoundsException"
	 * @generated
	 */
	<T extends Node> T removeNode(int index) throws IndexOutOfBoundsException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	<T extends Node> T removeNode(Node node);

} // Graph
