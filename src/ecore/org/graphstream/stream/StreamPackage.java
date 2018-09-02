/**
 */
package ecore.org.graphstream.stream;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ecore.org.graphstream.stream.StreamFactoryOld
 * @model kind="package"
 * @generated
 */
public interface StreamPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "stream";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "CaseStudy-gs-core/ecore.org.graphstream.stream";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "stream";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StreamPackage eINSTANCE = ecore.org.graphstream.stream.impl.StreamPackageImpl.init();

	/**
	 * The meta object id for the '{@link ecore.org.graphstream.stream.AttributeSink <em>Attribute Sink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.org.graphstream.stream.AttributeSink
	 * @see ecore.org.graphstream.stream.impl.StreamPackageImpl#getAttributeSink()
	 * @generated
	 */
	int ATTRIBUTE_SINK = 0;

	/**
	 * The number of structural features of the '<em>Attribute Sink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_SINK_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Graph Attribute Added</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_SINK___GRAPH_ATTRIBUTE_ADDED__STRING_LONG_STRING_OBJECT = 0;

	/**
	 * The operation id for the '<em>Graph Attribute Changed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_SINK___GRAPH_ATTRIBUTE_CHANGED__STRING_LONG_STRING_OBJECT_OBJECT = 1;

	/**
	 * The operation id for the '<em>Graph Attribute Removed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_SINK___GRAPH_ATTRIBUTE_REMOVED__STRING_LONG_STRING = 2;

	/**
	 * The operation id for the '<em>Node Attribute Added</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_SINK___NODE_ATTRIBUTE_ADDED__STRING_LONG_STRING_STRING_OBJECT = 3;

	/**
	 * The operation id for the '<em>Node Attribute Changed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_SINK___NODE_ATTRIBUTE_CHANGED__STRING_LONG_STRING_STRING_OBJECT_OBJECT = 4;

	/**
	 * The operation id for the '<em>Node Attribute Removed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_SINK___NODE_ATTRIBUTE_REMOVED__STRING_LONG_STRING_STRING = 5;

	/**
	 * The operation id for the '<em>Edge Attribute Added</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_SINK___EDGE_ATTRIBUTE_ADDED__STRING_LONG_STRING_STRING_OBJECT = 6;

	/**
	 * The operation id for the '<em>Edge Attribute Changed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_SINK___EDGE_ATTRIBUTE_CHANGED__STRING_LONG_STRING_STRING_OBJECT_OBJECT = 7;

	/**
	 * The operation id for the '<em>Edge Attribute Removed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_SINK___EDGE_ATTRIBUTE_REMOVED__STRING_LONG_STRING_STRING = 8;

	/**
	 * The number of operations of the '<em>Attribute Sink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_SINK_OPERATION_COUNT = 9;

	/**
	 * The meta object id for the '{@link ecore.org.graphstream.stream.ElementSink <em>Element Sink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.org.graphstream.stream.ElementSink
	 * @see ecore.org.graphstream.stream.impl.StreamPackageImpl#getElementSink()
	 * @generated
	 */
	int ELEMENT_SINK = 1;

	/**
	 * The number of structural features of the '<em>Element Sink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_SINK_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Node Added</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_SINK___NODE_ADDED__STRING_LONG_STRING = 0;

	/**
	 * The operation id for the '<em>Node Removed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_SINK___NODE_REMOVED__STRING_LONG_STRING = 1;

	/**
	 * The operation id for the '<em>Edge Added</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_SINK___EDGE_ADDED__STRING_LONG_STRING_STRING_STRING_BOOLEAN = 2;

	/**
	 * The operation id for the '<em>Edge Removed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_SINK___EDGE_REMOVED__STRING_LONG_STRING = 3;

	/**
	 * The operation id for the '<em>Graph Cleared</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_SINK___GRAPH_CLEARED__STRING_LONG = 4;

	/**
	 * The operation id for the '<em>Step Begins</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_SINK___STEP_BEGINS__STRING_LONG_DOUBLE = 5;

	/**
	 * The number of operations of the '<em>Element Sink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_SINK_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link ecore.org.graphstream.stream.Source <em>Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.org.graphstream.stream.Source
	 * @see ecore.org.graphstream.stream.impl.StreamPackageImpl#getSource()
	 * @generated
	 */
	int SOURCE = 5;

	/**
	 * The number of structural features of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Add Sink</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE___ADD_SINK__SINK = 0;

	/**
	 * The operation id for the '<em>Remove Sink</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE___REMOVE_SINK__SINK = 1;

	/**
	 * The operation id for the '<em>Add Attribute Sink</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE___ADD_ATTRIBUTE_SINK__ATTRIBUTESINK = 2;

	/**
	 * The operation id for the '<em>Remove Attribute Sink</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE___REMOVE_ATTRIBUTE_SINK__ATTRIBUTESINK = 3;

	/**
	 * The operation id for the '<em>Add Element Sink</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE___ADD_ELEMENT_SINK__ELEMENTSINK = 4;

	/**
	 * The operation id for the '<em>Remove Element Sink</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE___REMOVE_ELEMENT_SINK__ELEMENTSINK = 5;

	/**
	 * The operation id for the '<em>Clear Element Sinks</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE___CLEAR_ELEMENT_SINKS = 6;

	/**
	 * The operation id for the '<em>Clear Attribute Sinks</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE___CLEAR_ATTRIBUTE_SINKS = 7;

	/**
	 * The operation id for the '<em>Clear Sinks</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE___CLEAR_SINKS = 8;

	/**
	 * The number of operations of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_OPERATION_COUNT = 9;

	/**
	 * The meta object id for the '{@link ecore.org.graphstream.stream.Pipe <em>Pipe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.org.graphstream.stream.Pipe
	 * @see ecore.org.graphstream.stream.impl.StreamPackageImpl#getPipe()
	 * @generated
	 */
	int PIPE = 2;

	/**
	 * The number of structural features of the '<em>Pipe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE_FEATURE_COUNT = SOURCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Sink</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE___ADD_SINK__SINK = SOURCE___ADD_SINK__SINK;

	/**
	 * The operation id for the '<em>Remove Sink</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE___REMOVE_SINK__SINK = SOURCE___REMOVE_SINK__SINK;

	/**
	 * The operation id for the '<em>Add Attribute Sink</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE___ADD_ATTRIBUTE_SINK__ATTRIBUTESINK = SOURCE___ADD_ATTRIBUTE_SINK__ATTRIBUTESINK;

	/**
	 * The operation id for the '<em>Remove Attribute Sink</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE___REMOVE_ATTRIBUTE_SINK__ATTRIBUTESINK = SOURCE___REMOVE_ATTRIBUTE_SINK__ATTRIBUTESINK;

	/**
	 * The operation id for the '<em>Add Element Sink</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE___ADD_ELEMENT_SINK__ELEMENTSINK = SOURCE___ADD_ELEMENT_SINK__ELEMENTSINK;

	/**
	 * The operation id for the '<em>Remove Element Sink</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE___REMOVE_ELEMENT_SINK__ELEMENTSINK = SOURCE___REMOVE_ELEMENT_SINK__ELEMENTSINK;

	/**
	 * The operation id for the '<em>Clear Element Sinks</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE___CLEAR_ELEMENT_SINKS = SOURCE___CLEAR_ELEMENT_SINKS;

	/**
	 * The operation id for the '<em>Clear Attribute Sinks</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE___CLEAR_ATTRIBUTE_SINKS = SOURCE___CLEAR_ATTRIBUTE_SINKS;

	/**
	 * The operation id for the '<em>Clear Sinks</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE___CLEAR_SINKS = SOURCE___CLEAR_SINKS;

	/**
	 * The operation id for the '<em>Graph Attribute Added</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE___GRAPH_ATTRIBUTE_ADDED__STRING_LONG_STRING_OBJECT = SOURCE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Graph Attribute Changed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE___GRAPH_ATTRIBUTE_CHANGED__STRING_LONG_STRING_OBJECT_OBJECT = SOURCE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Graph Attribute Removed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE___GRAPH_ATTRIBUTE_REMOVED__STRING_LONG_STRING = SOURCE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Node Attribute Added</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE___NODE_ATTRIBUTE_ADDED__STRING_LONG_STRING_STRING_OBJECT = SOURCE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Node Attribute Changed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE___NODE_ATTRIBUTE_CHANGED__STRING_LONG_STRING_STRING_OBJECT_OBJECT = SOURCE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Node Attribute Removed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE___NODE_ATTRIBUTE_REMOVED__STRING_LONG_STRING_STRING = SOURCE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Edge Attribute Added</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE___EDGE_ATTRIBUTE_ADDED__STRING_LONG_STRING_STRING_OBJECT = SOURCE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Edge Attribute Changed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE___EDGE_ATTRIBUTE_CHANGED__STRING_LONG_STRING_STRING_OBJECT_OBJECT = SOURCE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Edge Attribute Removed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE___EDGE_ATTRIBUTE_REMOVED__STRING_LONG_STRING_STRING = SOURCE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Node Added</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE___NODE_ADDED__STRING_LONG_STRING = SOURCE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Node Removed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE___NODE_REMOVED__STRING_LONG_STRING = SOURCE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Edge Added</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE___EDGE_ADDED__STRING_LONG_STRING_STRING_STRING_BOOLEAN = SOURCE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Edge Removed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE___EDGE_REMOVED__STRING_LONG_STRING = SOURCE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Graph Cleared</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE___GRAPH_CLEARED__STRING_LONG = SOURCE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Step Begins</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE___STEP_BEGINS__STRING_LONG_DOUBLE = SOURCE_OPERATION_COUNT + 14;

	/**
	 * The number of operations of the '<em>Pipe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE_OPERATION_COUNT = SOURCE_OPERATION_COUNT + 15;

	/**
	 * The meta object id for the '{@link ecore.org.graphstream.stream.Replayable <em>Replayable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.org.graphstream.stream.Replayable
	 * @see ecore.org.graphstream.stream.impl.StreamPackageImpl#getReplayable()
	 * @generated
	 */
	int REPLAYABLE = 3;

	/**
	 * The number of structural features of the '<em>Replayable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLAYABLE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Replay Controller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLAYABLE___GET_REPLAY_CONTROLLER = 0;

	/**
	 * The number of operations of the '<em>Replayable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLAYABLE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ecore.org.graphstream.stream.Sink <em>Sink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.org.graphstream.stream.Sink
	 * @see ecore.org.graphstream.stream.impl.StreamPackageImpl#getSink()
	 * @generated
	 */
	int SINK = 4;

	/**
	 * The number of structural features of the '<em>Sink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_FEATURE_COUNT = ATTRIBUTE_SINK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Graph Attribute Added</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK___GRAPH_ATTRIBUTE_ADDED__STRING_LONG_STRING_OBJECT = ATTRIBUTE_SINK___GRAPH_ATTRIBUTE_ADDED__STRING_LONG_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Graph Attribute Changed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK___GRAPH_ATTRIBUTE_CHANGED__STRING_LONG_STRING_OBJECT_OBJECT = ATTRIBUTE_SINK___GRAPH_ATTRIBUTE_CHANGED__STRING_LONG_STRING_OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Graph Attribute Removed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK___GRAPH_ATTRIBUTE_REMOVED__STRING_LONG_STRING = ATTRIBUTE_SINK___GRAPH_ATTRIBUTE_REMOVED__STRING_LONG_STRING;

	/**
	 * The operation id for the '<em>Node Attribute Added</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK___NODE_ATTRIBUTE_ADDED__STRING_LONG_STRING_STRING_OBJECT = ATTRIBUTE_SINK___NODE_ATTRIBUTE_ADDED__STRING_LONG_STRING_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Node Attribute Changed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK___NODE_ATTRIBUTE_CHANGED__STRING_LONG_STRING_STRING_OBJECT_OBJECT = ATTRIBUTE_SINK___NODE_ATTRIBUTE_CHANGED__STRING_LONG_STRING_STRING_OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Node Attribute Removed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK___NODE_ATTRIBUTE_REMOVED__STRING_LONG_STRING_STRING = ATTRIBUTE_SINK___NODE_ATTRIBUTE_REMOVED__STRING_LONG_STRING_STRING;

	/**
	 * The operation id for the '<em>Edge Attribute Added</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK___EDGE_ATTRIBUTE_ADDED__STRING_LONG_STRING_STRING_OBJECT = ATTRIBUTE_SINK___EDGE_ATTRIBUTE_ADDED__STRING_LONG_STRING_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Edge Attribute Changed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK___EDGE_ATTRIBUTE_CHANGED__STRING_LONG_STRING_STRING_OBJECT_OBJECT = ATTRIBUTE_SINK___EDGE_ATTRIBUTE_CHANGED__STRING_LONG_STRING_STRING_OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Edge Attribute Removed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK___EDGE_ATTRIBUTE_REMOVED__STRING_LONG_STRING_STRING = ATTRIBUTE_SINK___EDGE_ATTRIBUTE_REMOVED__STRING_LONG_STRING_STRING;

	/**
	 * The operation id for the '<em>Node Added</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK___NODE_ADDED__STRING_LONG_STRING = ATTRIBUTE_SINK_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Node Removed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK___NODE_REMOVED__STRING_LONG_STRING = ATTRIBUTE_SINK_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Edge Added</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK___EDGE_ADDED__STRING_LONG_STRING_STRING_STRING_BOOLEAN = ATTRIBUTE_SINK_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Edge Removed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK___EDGE_REMOVED__STRING_LONG_STRING = ATTRIBUTE_SINK_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Graph Cleared</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK___GRAPH_CLEARED__STRING_LONG = ATTRIBUTE_SINK_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Step Begins</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK___STEP_BEGINS__STRING_LONG_DOUBLE = ATTRIBUTE_SINK_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Sink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_OPERATION_COUNT = ATTRIBUTE_SINK_OPERATION_COUNT + 6;


	/**
	 * Returns the meta object for class '{@link ecore.org.graphstream.stream.AttributeSink <em>Attribute Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Sink</em>'.
	 * @see ecore.org.graphstream.stream.AttributeSink
	 * @generated
	 */
	EClass getAttributeSink();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.stream.AttributeSink#graphAttributeAdded(java.lang.String, long, java.lang.String, java.lang.Object) <em>Graph Attribute Added</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Graph Attribute Added</em>' operation.
	 * @see ecore.org.graphstream.stream.AttributeSink#graphAttributeAdded(java.lang.String, long, java.lang.String, java.lang.Object)
	 * @generated
	 */
	EOperation getAttributeSink__GraphAttributeAdded__String_long_String_Object();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.stream.AttributeSink#graphAttributeChanged(java.lang.String, long, java.lang.String, java.lang.Object, java.lang.Object) <em>Graph Attribute Changed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Graph Attribute Changed</em>' operation.
	 * @see ecore.org.graphstream.stream.AttributeSink#graphAttributeChanged(java.lang.String, long, java.lang.String, java.lang.Object, java.lang.Object)
	 * @generated
	 */
	EOperation getAttributeSink__GraphAttributeChanged__String_long_String_Object_Object();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.stream.AttributeSink#graphAttributeRemoved(java.lang.String, long, java.lang.String) <em>Graph Attribute Removed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Graph Attribute Removed</em>' operation.
	 * @see ecore.org.graphstream.stream.AttributeSink#graphAttributeRemoved(java.lang.String, long, java.lang.String)
	 * @generated
	 */
	EOperation getAttributeSink__GraphAttributeRemoved__String_long_String();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.stream.AttributeSink#nodeAttributeAdded(java.lang.String, long, java.lang.String, java.lang.String, java.lang.Object) <em>Node Attribute Added</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Node Attribute Added</em>' operation.
	 * @see ecore.org.graphstream.stream.AttributeSink#nodeAttributeAdded(java.lang.String, long, java.lang.String, java.lang.String, java.lang.Object)
	 * @generated
	 */
	EOperation getAttributeSink__NodeAttributeAdded__String_long_String_String_Object();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.stream.AttributeSink#nodeAttributeChanged(java.lang.String, long, java.lang.String, java.lang.String, java.lang.Object, java.lang.Object) <em>Node Attribute Changed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Node Attribute Changed</em>' operation.
	 * @see ecore.org.graphstream.stream.AttributeSink#nodeAttributeChanged(java.lang.String, long, java.lang.String, java.lang.String, java.lang.Object, java.lang.Object)
	 * @generated
	 */
	EOperation getAttributeSink__NodeAttributeChanged__String_long_String_String_Object_Object();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.stream.AttributeSink#nodeAttributeRemoved(java.lang.String, long, java.lang.String, java.lang.String) <em>Node Attribute Removed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Node Attribute Removed</em>' operation.
	 * @see ecore.org.graphstream.stream.AttributeSink#nodeAttributeRemoved(java.lang.String, long, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getAttributeSink__NodeAttributeRemoved__String_long_String_String();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.stream.AttributeSink#edgeAttributeAdded(java.lang.String, long, java.lang.String, java.lang.String, java.lang.Object) <em>Edge Attribute Added</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edge Attribute Added</em>' operation.
	 * @see ecore.org.graphstream.stream.AttributeSink#edgeAttributeAdded(java.lang.String, long, java.lang.String, java.lang.String, java.lang.Object)
	 * @generated
	 */
	EOperation getAttributeSink__EdgeAttributeAdded__String_long_String_String_Object();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.stream.AttributeSink#edgeAttributeChanged(java.lang.String, long, java.lang.String, java.lang.String, java.lang.Object, java.lang.Object) <em>Edge Attribute Changed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edge Attribute Changed</em>' operation.
	 * @see ecore.org.graphstream.stream.AttributeSink#edgeAttributeChanged(java.lang.String, long, java.lang.String, java.lang.String, java.lang.Object, java.lang.Object)
	 * @generated
	 */
	EOperation getAttributeSink__EdgeAttributeChanged__String_long_String_String_Object_Object();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.stream.AttributeSink#edgeAttributeRemoved(java.lang.String, long, java.lang.String, java.lang.String) <em>Edge Attribute Removed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edge Attribute Removed</em>' operation.
	 * @see ecore.org.graphstream.stream.AttributeSink#edgeAttributeRemoved(java.lang.String, long, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getAttributeSink__EdgeAttributeRemoved__String_long_String_String();

	/**
	 * Returns the meta object for class '{@link ecore.org.graphstream.stream.ElementSink <em>Element Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Sink</em>'.
	 * @see ecore.org.graphstream.stream.ElementSink
	 * @generated
	 */
	EClass getElementSink();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.stream.ElementSink#nodeAdded(java.lang.String, long, java.lang.String) <em>Node Added</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Node Added</em>' operation.
	 * @see ecore.org.graphstream.stream.ElementSink#nodeAdded(java.lang.String, long, java.lang.String)
	 * @generated
	 */
	EOperation getElementSink__NodeAdded__String_long_String();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.stream.ElementSink#nodeRemoved(java.lang.String, long, java.lang.String) <em>Node Removed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Node Removed</em>' operation.
	 * @see ecore.org.graphstream.stream.ElementSink#nodeRemoved(java.lang.String, long, java.lang.String)
	 * @generated
	 */
	EOperation getElementSink__NodeRemoved__String_long_String();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.stream.ElementSink#edgeAdded(java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, boolean) <em>Edge Added</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edge Added</em>' operation.
	 * @see ecore.org.graphstream.stream.ElementSink#edgeAdded(java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, boolean)
	 * @generated
	 */
	EOperation getElementSink__EdgeAdded__String_long_String_String_String_boolean();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.stream.ElementSink#edgeRemoved(java.lang.String, long, java.lang.String) <em>Edge Removed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edge Removed</em>' operation.
	 * @see ecore.org.graphstream.stream.ElementSink#edgeRemoved(java.lang.String, long, java.lang.String)
	 * @generated
	 */
	EOperation getElementSink__EdgeRemoved__String_long_String();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.stream.ElementSink#graphCleared(java.lang.String, long) <em>Graph Cleared</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Graph Cleared</em>' operation.
	 * @see ecore.org.graphstream.stream.ElementSink#graphCleared(java.lang.String, long)
	 * @generated
	 */
	EOperation getElementSink__GraphCleared__String_long();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.stream.ElementSink#stepBegins(java.lang.String, long, double) <em>Step Begins</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Step Begins</em>' operation.
	 * @see ecore.org.graphstream.stream.ElementSink#stepBegins(java.lang.String, long, double)
	 * @generated
	 */
	EOperation getElementSink__StepBegins__String_long_double();

	/**
	 * Returns the meta object for class '{@link ecore.org.graphstream.stream.Pipe <em>Pipe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pipe</em>'.
	 * @see ecore.org.graphstream.stream.Pipe
	 * @generated
	 */
	EClass getPipe();

	/**
	 * Returns the meta object for class '{@link ecore.org.graphstream.stream.Replayable <em>Replayable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Replayable</em>'.
	 * @see ecore.org.graphstream.stream.Replayable
	 * @generated
	 */
	EClass getReplayable();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.stream.Replayable#getReplayController() <em>Get Replay Controller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Replay Controller</em>' operation.
	 * @see ecore.org.graphstream.stream.Replayable#getReplayController()
	 * @generated
	 */
	EOperation getReplayable__GetReplayController();

	/**
	 * Returns the meta object for class '{@link ecore.org.graphstream.stream.Sink <em>Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sink</em>'.
	 * @see ecore.org.graphstream.stream.Sink
	 * @generated
	 */
	EClass getSink();

	/**
	 * Returns the meta object for class '{@link ecore.org.graphstream.stream.Source <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source</em>'.
	 * @see ecore.org.graphstream.stream.Source
	 * @generated
	 */
	EClass getSource();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.stream.Source#addSink(ecore.org.graphstream.stream.Sink) <em>Add Sink</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Sink</em>' operation.
	 * @see ecore.org.graphstream.stream.Source#addSink(ecore.org.graphstream.stream.Sink)
	 * @generated
	 */
	EOperation getSource__AddSink__Sink();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.stream.Source#removeSink(ecore.org.graphstream.stream.Sink) <em>Remove Sink</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Sink</em>' operation.
	 * @see ecore.org.graphstream.stream.Source#removeSink(ecore.org.graphstream.stream.Sink)
	 * @generated
	 */
	EOperation getSource__RemoveSink__Sink();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.stream.Source#addAttributeSink(ecore.org.graphstream.stream.AttributeSink) <em>Add Attribute Sink</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Attribute Sink</em>' operation.
	 * @see ecore.org.graphstream.stream.Source#addAttributeSink(ecore.org.graphstream.stream.AttributeSink)
	 * @generated
	 */
	EOperation getSource__AddAttributeSink__AttributeSink();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.stream.Source#removeAttributeSink(ecore.org.graphstream.stream.AttributeSink) <em>Remove Attribute Sink</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Attribute Sink</em>' operation.
	 * @see ecore.org.graphstream.stream.Source#removeAttributeSink(ecore.org.graphstream.stream.AttributeSink)
	 * @generated
	 */
	EOperation getSource__RemoveAttributeSink__AttributeSink();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.stream.Source#addElementSink(ecore.org.graphstream.stream.ElementSink) <em>Add Element Sink</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Element Sink</em>' operation.
	 * @see ecore.org.graphstream.stream.Source#addElementSink(ecore.org.graphstream.stream.ElementSink)
	 * @generated
	 */
	EOperation getSource__AddElementSink__ElementSink();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.stream.Source#removeElementSink(ecore.org.graphstream.stream.ElementSink) <em>Remove Element Sink</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Element Sink</em>' operation.
	 * @see ecore.org.graphstream.stream.Source#removeElementSink(ecore.org.graphstream.stream.ElementSink)
	 * @generated
	 */
	EOperation getSource__RemoveElementSink__ElementSink();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.stream.Source#clearElementSinks() <em>Clear Element Sinks</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clear Element Sinks</em>' operation.
	 * @see ecore.org.graphstream.stream.Source#clearElementSinks()
	 * @generated
	 */
	EOperation getSource__ClearElementSinks();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.stream.Source#clearAttributeSinks() <em>Clear Attribute Sinks</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clear Attribute Sinks</em>' operation.
	 * @see ecore.org.graphstream.stream.Source#clearAttributeSinks()
	 * @generated
	 */
	EOperation getSource__ClearAttributeSinks();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.stream.Source#clearSinks() <em>Clear Sinks</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clear Sinks</em>' operation.
	 * @see ecore.org.graphstream.stream.Source#clearSinks()
	 * @generated
	 */
	EOperation getSource__ClearSinks();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StreamFactoryOld getStreamFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ecore.org.graphstream.stream.AttributeSink <em>Attribute Sink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.org.graphstream.stream.AttributeSink
		 * @see ecore.org.graphstream.stream.impl.StreamPackageImpl#getAttributeSink()
		 * @generated
		 */
		EClass ATTRIBUTE_SINK = eINSTANCE.getAttributeSink();

		/**
		 * The meta object literal for the '<em><b>Graph Attribute Added</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATTRIBUTE_SINK___GRAPH_ATTRIBUTE_ADDED__STRING_LONG_STRING_OBJECT = eINSTANCE.getAttributeSink__GraphAttributeAdded__String_long_String_Object();

		/**
		 * The meta object literal for the '<em><b>Graph Attribute Changed</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATTRIBUTE_SINK___GRAPH_ATTRIBUTE_CHANGED__STRING_LONG_STRING_OBJECT_OBJECT = eINSTANCE.getAttributeSink__GraphAttributeChanged__String_long_String_Object_Object();

		/**
		 * The meta object literal for the '<em><b>Graph Attribute Removed</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATTRIBUTE_SINK___GRAPH_ATTRIBUTE_REMOVED__STRING_LONG_STRING = eINSTANCE.getAttributeSink__GraphAttributeRemoved__String_long_String();

		/**
		 * The meta object literal for the '<em><b>Node Attribute Added</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATTRIBUTE_SINK___NODE_ATTRIBUTE_ADDED__STRING_LONG_STRING_STRING_OBJECT = eINSTANCE.getAttributeSink__NodeAttributeAdded__String_long_String_String_Object();

		/**
		 * The meta object literal for the '<em><b>Node Attribute Changed</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATTRIBUTE_SINK___NODE_ATTRIBUTE_CHANGED__STRING_LONG_STRING_STRING_OBJECT_OBJECT = eINSTANCE.getAttributeSink__NodeAttributeChanged__String_long_String_String_Object_Object();

		/**
		 * The meta object literal for the '<em><b>Node Attribute Removed</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATTRIBUTE_SINK___NODE_ATTRIBUTE_REMOVED__STRING_LONG_STRING_STRING = eINSTANCE.getAttributeSink__NodeAttributeRemoved__String_long_String_String();

		/**
		 * The meta object literal for the '<em><b>Edge Attribute Added</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATTRIBUTE_SINK___EDGE_ATTRIBUTE_ADDED__STRING_LONG_STRING_STRING_OBJECT = eINSTANCE.getAttributeSink__EdgeAttributeAdded__String_long_String_String_Object();

		/**
		 * The meta object literal for the '<em><b>Edge Attribute Changed</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATTRIBUTE_SINK___EDGE_ATTRIBUTE_CHANGED__STRING_LONG_STRING_STRING_OBJECT_OBJECT = eINSTANCE.getAttributeSink__EdgeAttributeChanged__String_long_String_String_Object_Object();

		/**
		 * The meta object literal for the '<em><b>Edge Attribute Removed</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATTRIBUTE_SINK___EDGE_ATTRIBUTE_REMOVED__STRING_LONG_STRING_STRING = eINSTANCE.getAttributeSink__EdgeAttributeRemoved__String_long_String_String();

		/**
		 * The meta object literal for the '{@link ecore.org.graphstream.stream.ElementSink <em>Element Sink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.org.graphstream.stream.ElementSink
		 * @see ecore.org.graphstream.stream.impl.StreamPackageImpl#getElementSink()
		 * @generated
		 */
		EClass ELEMENT_SINK = eINSTANCE.getElementSink();

		/**
		 * The meta object literal for the '<em><b>Node Added</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT_SINK___NODE_ADDED__STRING_LONG_STRING = eINSTANCE.getElementSink__NodeAdded__String_long_String();

		/**
		 * The meta object literal for the '<em><b>Node Removed</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT_SINK___NODE_REMOVED__STRING_LONG_STRING = eINSTANCE.getElementSink__NodeRemoved__String_long_String();

		/**
		 * The meta object literal for the '<em><b>Edge Added</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT_SINK___EDGE_ADDED__STRING_LONG_STRING_STRING_STRING_BOOLEAN = eINSTANCE.getElementSink__EdgeAdded__String_long_String_String_String_boolean();

		/**
		 * The meta object literal for the '<em><b>Edge Removed</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT_SINK___EDGE_REMOVED__STRING_LONG_STRING = eINSTANCE.getElementSink__EdgeRemoved__String_long_String();

		/**
		 * The meta object literal for the '<em><b>Graph Cleared</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT_SINK___GRAPH_CLEARED__STRING_LONG = eINSTANCE.getElementSink__GraphCleared__String_long();

		/**
		 * The meta object literal for the '<em><b>Step Begins</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT_SINK___STEP_BEGINS__STRING_LONG_DOUBLE = eINSTANCE.getElementSink__StepBegins__String_long_double();

		/**
		 * The meta object literal for the '{@link ecore.org.graphstream.stream.Pipe <em>Pipe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.org.graphstream.stream.Pipe
		 * @see ecore.org.graphstream.stream.impl.StreamPackageImpl#getPipe()
		 * @generated
		 */
		EClass PIPE = eINSTANCE.getPipe();

		/**
		 * The meta object literal for the '{@link ecore.org.graphstream.stream.Replayable <em>Replayable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.org.graphstream.stream.Replayable
		 * @see ecore.org.graphstream.stream.impl.StreamPackageImpl#getReplayable()
		 * @generated
		 */
		EClass REPLAYABLE = eINSTANCE.getReplayable();

		/**
		 * The meta object literal for the '<em><b>Get Replay Controller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REPLAYABLE___GET_REPLAY_CONTROLLER = eINSTANCE.getReplayable__GetReplayController();

		/**
		 * The meta object literal for the '{@link ecore.org.graphstream.stream.Sink <em>Sink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.org.graphstream.stream.Sink
		 * @see ecore.org.graphstream.stream.impl.StreamPackageImpl#getSink()
		 * @generated
		 */
		EClass SINK = eINSTANCE.getSink();

		/**
		 * The meta object literal for the '{@link ecore.org.graphstream.stream.Source <em>Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.org.graphstream.stream.Source
		 * @see ecore.org.graphstream.stream.impl.StreamPackageImpl#getSource()
		 * @generated
		 */
		EClass SOURCE = eINSTANCE.getSource();

		/**
		 * The meta object literal for the '<em><b>Add Sink</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOURCE___ADD_SINK__SINK = eINSTANCE.getSource__AddSink__Sink();

		/**
		 * The meta object literal for the '<em><b>Remove Sink</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOURCE___REMOVE_SINK__SINK = eINSTANCE.getSource__RemoveSink__Sink();

		/**
		 * The meta object literal for the '<em><b>Add Attribute Sink</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOURCE___ADD_ATTRIBUTE_SINK__ATTRIBUTESINK = eINSTANCE.getSource__AddAttributeSink__AttributeSink();

		/**
		 * The meta object literal for the '<em><b>Remove Attribute Sink</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOURCE___REMOVE_ATTRIBUTE_SINK__ATTRIBUTESINK = eINSTANCE.getSource__RemoveAttributeSink__AttributeSink();

		/**
		 * The meta object literal for the '<em><b>Add Element Sink</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOURCE___ADD_ELEMENT_SINK__ELEMENTSINK = eINSTANCE.getSource__AddElementSink__ElementSink();

		/**
		 * The meta object literal for the '<em><b>Remove Element Sink</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOURCE___REMOVE_ELEMENT_SINK__ELEMENTSINK = eINSTANCE.getSource__RemoveElementSink__ElementSink();

		/**
		 * The meta object literal for the '<em><b>Clear Element Sinks</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOURCE___CLEAR_ELEMENT_SINKS = eINSTANCE.getSource__ClearElementSinks();

		/**
		 * The meta object literal for the '<em><b>Clear Attribute Sinks</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOURCE___CLEAR_ATTRIBUTE_SINKS = eINSTANCE.getSource__ClearAttributeSinks();

		/**
		 * The meta object literal for the '<em><b>Clear Sinks</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOURCE___CLEAR_SINKS = eINSTANCE.getSource__ClearSinks();

	}

} //StreamPackage
