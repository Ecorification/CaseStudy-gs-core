/**
 */
package ecore.org.graphstream.graph;

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
 * @see ecore.org.graphstream.graph.GraphFactoryOld
 * @model kind="package"
 * @generated
 */
public interface GraphPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "graph";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "CaseStudy-gs-core/ecore.org.graphstream.graph";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "graph";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GraphPackage eINSTANCE = ecore.org.graphstream.graph.impl.GraphPackageImpl.init();

	/**
	 * The meta object id for the '{@link ecore.org.graphstream.graph.Element <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.org.graphstream.graph.Element
	 * @see ecore.org.graphstream.graph.impl.GraphPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___GET_ID = 0;

	/**
	 * The operation id for the '<em>Get Index</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___GET_INDEX = 1;

	/**
	 * The operation id for the '<em>Get Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___GET_ATTRIBUTE__STRING = 2;

	/**
	 * The operation id for the '<em>Get First Attribute Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___GET_FIRST_ATTRIBUTE_OF__STRING = 3;

	/**
	 * The operation id for the '<em>Get Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___GET_ATTRIBUTE__STRING_CLASS = 4;

	/**
	 * The operation id for the '<em>Get First Attribute Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___GET_FIRST_ATTRIBUTE_OF__CLASS_STRING = 5;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___GET_LABEL__STRING = 6;

	/**
	 * The operation id for the '<em>Get Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___GET_NUMBER__STRING = 7;

	/**
	 * The operation id for the '<em>Get Vector</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___GET_VECTOR__STRING = 8;

	/**
	 * The operation id for the '<em>Get Array</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___GET_ARRAY__STRING = 9;

	/**
	 * The operation id for the '<em>Get Hash</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___GET_HASH__STRING = 10;

	/**
	 * The operation id for the '<em>Has Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___HAS_ATTRIBUTE__STRING = 11;

	/**
	 * The operation id for the '<em>Has Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___HAS_ATTRIBUTE__STRING_CLASS = 12;

	/**
	 * The operation id for the '<em>Has Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___HAS_LABEL__STRING = 13;

	/**
	 * The operation id for the '<em>Has Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___HAS_NUMBER__STRING = 14;

	/**
	 * The operation id for the '<em>Has Vector</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___HAS_VECTOR__STRING = 15;

	/**
	 * The operation id for the '<em>Has Array</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___HAS_ARRAY__STRING = 16;

	/**
	 * The operation id for the '<em>Has Hash</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___HAS_HASH__STRING = 17;

	/**
	 * The operation id for the '<em>Get Attribute Key Iterator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___GET_ATTRIBUTE_KEY_ITERATOR = 18;

	/**
	 * The operation id for the '<em>Get Each Attribute Key</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___GET_EACH_ATTRIBUTE_KEY = 19;

	/**
	 * The operation id for the '<em>Get Attribute Key Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___GET_ATTRIBUTE_KEY_SET = 20;

	/**
	 * The operation id for the '<em>Clear Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___CLEAR_ATTRIBUTES = 21;

	/**
	 * The operation id for the '<em>Add Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___ADD_ATTRIBUTE__STRING_OBJECT = 22;

	/**
	 * The operation id for the '<em>Change Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___CHANGE_ATTRIBUTE__STRING_OBJECT = 23;

	/**
	 * The operation id for the '<em>Set Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___SET_ATTRIBUTE__STRING_OBJECT = 24;

	/**
	 * The operation id for the '<em>Add Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___ADD_ATTRIBUTES__MAP = 25;

	/**
	 * The operation id for the '<em>Remove Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___REMOVE_ATTRIBUTE__STRING = 26;

	/**
	 * The operation id for the '<em>Get Attribute Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___GET_ATTRIBUTE_COUNT = 27;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 28;

	/**
	 * The meta object id for the '{@link ecore.org.graphstream.graph.Edge <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.org.graphstream.graph.Edge
	 * @see ecore.org.graphstream.graph.impl.GraphPackageImpl#getEdge()
	 * @generated
	 */
	int EDGE = 0;

	/**
	 * The number of structural features of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___GET_ID = ELEMENT___GET_ID;

	/**
	 * The operation id for the '<em>Get Index</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___GET_INDEX = ELEMENT___GET_INDEX;

	/**
	 * The operation id for the '<em>Get Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___GET_ATTRIBUTE__STRING = ELEMENT___GET_ATTRIBUTE__STRING;

	/**
	 * The operation id for the '<em>Get First Attribute Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___GET_FIRST_ATTRIBUTE_OF__STRING = ELEMENT___GET_FIRST_ATTRIBUTE_OF__STRING;

	/**
	 * The operation id for the '<em>Get Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___GET_ATTRIBUTE__STRING_CLASS = ELEMENT___GET_ATTRIBUTE__STRING_CLASS;

	/**
	 * The operation id for the '<em>Get First Attribute Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___GET_FIRST_ATTRIBUTE_OF__CLASS_STRING = ELEMENT___GET_FIRST_ATTRIBUTE_OF__CLASS_STRING;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___GET_LABEL__STRING = ELEMENT___GET_LABEL__STRING;

	/**
	 * The operation id for the '<em>Get Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___GET_NUMBER__STRING = ELEMENT___GET_NUMBER__STRING;

	/**
	 * The operation id for the '<em>Get Vector</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___GET_VECTOR__STRING = ELEMENT___GET_VECTOR__STRING;

	/**
	 * The operation id for the '<em>Get Array</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___GET_ARRAY__STRING = ELEMENT___GET_ARRAY__STRING;

	/**
	 * The operation id for the '<em>Get Hash</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___GET_HASH__STRING = ELEMENT___GET_HASH__STRING;

	/**
	 * The operation id for the '<em>Has Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___HAS_ATTRIBUTE__STRING = ELEMENT___HAS_ATTRIBUTE__STRING;

	/**
	 * The operation id for the '<em>Has Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___HAS_ATTRIBUTE__STRING_CLASS = ELEMENT___HAS_ATTRIBUTE__STRING_CLASS;

	/**
	 * The operation id for the '<em>Has Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___HAS_LABEL__STRING = ELEMENT___HAS_LABEL__STRING;

	/**
	 * The operation id for the '<em>Has Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___HAS_NUMBER__STRING = ELEMENT___HAS_NUMBER__STRING;

	/**
	 * The operation id for the '<em>Has Vector</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___HAS_VECTOR__STRING = ELEMENT___HAS_VECTOR__STRING;

	/**
	 * The operation id for the '<em>Has Array</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___HAS_ARRAY__STRING = ELEMENT___HAS_ARRAY__STRING;

	/**
	 * The operation id for the '<em>Has Hash</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___HAS_HASH__STRING = ELEMENT___HAS_HASH__STRING;

	/**
	 * The operation id for the '<em>Get Attribute Key Iterator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___GET_ATTRIBUTE_KEY_ITERATOR = ELEMENT___GET_ATTRIBUTE_KEY_ITERATOR;

	/**
	 * The operation id for the '<em>Get Each Attribute Key</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___GET_EACH_ATTRIBUTE_KEY = ELEMENT___GET_EACH_ATTRIBUTE_KEY;

	/**
	 * The operation id for the '<em>Get Attribute Key Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___GET_ATTRIBUTE_KEY_SET = ELEMENT___GET_ATTRIBUTE_KEY_SET;

	/**
	 * The operation id for the '<em>Clear Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___CLEAR_ATTRIBUTES = ELEMENT___CLEAR_ATTRIBUTES;

	/**
	 * The operation id for the '<em>Add Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___ADD_ATTRIBUTE__STRING_OBJECT = ELEMENT___ADD_ATTRIBUTE__STRING_OBJECT;

	/**
	 * The operation id for the '<em>Change Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___CHANGE_ATTRIBUTE__STRING_OBJECT = ELEMENT___CHANGE_ATTRIBUTE__STRING_OBJECT;

	/**
	 * The operation id for the '<em>Set Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___SET_ATTRIBUTE__STRING_OBJECT = ELEMENT___SET_ATTRIBUTE__STRING_OBJECT;

	/**
	 * The operation id for the '<em>Add Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___ADD_ATTRIBUTES__MAP = ELEMENT___ADD_ATTRIBUTES__MAP;

	/**
	 * The operation id for the '<em>Remove Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___REMOVE_ATTRIBUTE__STRING = ELEMENT___REMOVE_ATTRIBUTE__STRING;

	/**
	 * The operation id for the '<em>Get Attribute Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___GET_ATTRIBUTE_COUNT = ELEMENT___GET_ATTRIBUTE_COUNT;

	/**
	 * The operation id for the '<em>Is Directed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___IS_DIRECTED = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Loop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___IS_LOOP = ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Node0</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___GET_NODE0 = ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Node1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___GET_NODE1 = ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Source Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___GET_SOURCE_NODE = ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Target Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___GET_TARGET_NODE = ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___GET_OPPOSITE__NODE = ELEMENT_OPERATION_COUNT + 6;

	/**
	 * The number of operations of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 7;

	/**
	 * The meta object id for the '{@link ecore.org.graphstream.graph.Graph <em>Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.org.graphstream.graph.Graph
	 * @see ecore.org.graphstream.graph.impl.GraphPackageImpl#getGraph()
	 * @generated
	 */
	int GRAPH = 2;

	/**
	 * The number of structural features of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___GET_ID = ELEMENT___GET_ID;

	/**
	 * The operation id for the '<em>Get Index</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___GET_INDEX = ELEMENT___GET_INDEX;

	/**
	 * The operation id for the '<em>Get Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___GET_ATTRIBUTE__STRING = ELEMENT___GET_ATTRIBUTE__STRING;

	/**
	 * The operation id for the '<em>Get First Attribute Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___GET_FIRST_ATTRIBUTE_OF__STRING = ELEMENT___GET_FIRST_ATTRIBUTE_OF__STRING;

	/**
	 * The operation id for the '<em>Get Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___GET_ATTRIBUTE__STRING_CLASS = ELEMENT___GET_ATTRIBUTE__STRING_CLASS;

	/**
	 * The operation id for the '<em>Get First Attribute Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___GET_FIRST_ATTRIBUTE_OF__CLASS_STRING = ELEMENT___GET_FIRST_ATTRIBUTE_OF__CLASS_STRING;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___GET_LABEL__STRING = ELEMENT___GET_LABEL__STRING;

	/**
	 * The operation id for the '<em>Get Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___GET_NUMBER__STRING = ELEMENT___GET_NUMBER__STRING;

	/**
	 * The operation id for the '<em>Get Vector</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___GET_VECTOR__STRING = ELEMENT___GET_VECTOR__STRING;

	/**
	 * The operation id for the '<em>Get Array</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___GET_ARRAY__STRING = ELEMENT___GET_ARRAY__STRING;

	/**
	 * The operation id for the '<em>Get Hash</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___GET_HASH__STRING = ELEMENT___GET_HASH__STRING;

	/**
	 * The operation id for the '<em>Has Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___HAS_ATTRIBUTE__STRING = ELEMENT___HAS_ATTRIBUTE__STRING;

	/**
	 * The operation id for the '<em>Has Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___HAS_ATTRIBUTE__STRING_CLASS = ELEMENT___HAS_ATTRIBUTE__STRING_CLASS;

	/**
	 * The operation id for the '<em>Has Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___HAS_LABEL__STRING = ELEMENT___HAS_LABEL__STRING;

	/**
	 * The operation id for the '<em>Has Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___HAS_NUMBER__STRING = ELEMENT___HAS_NUMBER__STRING;

	/**
	 * The operation id for the '<em>Has Vector</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___HAS_VECTOR__STRING = ELEMENT___HAS_VECTOR__STRING;

	/**
	 * The operation id for the '<em>Has Array</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___HAS_ARRAY__STRING = ELEMENT___HAS_ARRAY__STRING;

	/**
	 * The operation id for the '<em>Has Hash</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___HAS_HASH__STRING = ELEMENT___HAS_HASH__STRING;

	/**
	 * The operation id for the '<em>Get Attribute Key Iterator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___GET_ATTRIBUTE_KEY_ITERATOR = ELEMENT___GET_ATTRIBUTE_KEY_ITERATOR;

	/**
	 * The operation id for the '<em>Get Each Attribute Key</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___GET_EACH_ATTRIBUTE_KEY = ELEMENT___GET_EACH_ATTRIBUTE_KEY;

	/**
	 * The operation id for the '<em>Get Attribute Key Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___GET_ATTRIBUTE_KEY_SET = ELEMENT___GET_ATTRIBUTE_KEY_SET;

	/**
	 * The operation id for the '<em>Clear Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___CLEAR_ATTRIBUTES = ELEMENT___CLEAR_ATTRIBUTES;

	/**
	 * The operation id for the '<em>Add Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___ADD_ATTRIBUTE__STRING_OBJECT = ELEMENT___ADD_ATTRIBUTE__STRING_OBJECT;

	/**
	 * The operation id for the '<em>Change Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___CHANGE_ATTRIBUTE__STRING_OBJECT = ELEMENT___CHANGE_ATTRIBUTE__STRING_OBJECT;

	/**
	 * The operation id for the '<em>Set Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___SET_ATTRIBUTE__STRING_OBJECT = ELEMENT___SET_ATTRIBUTE__STRING_OBJECT;

	/**
	 * The operation id for the '<em>Add Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___ADD_ATTRIBUTES__MAP = ELEMENT___ADD_ATTRIBUTES__MAP;

	/**
	 * The operation id for the '<em>Remove Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___REMOVE_ATTRIBUTE__STRING = ELEMENT___REMOVE_ATTRIBUTE__STRING;

	/**
	 * The operation id for the '<em>Get Attribute Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___GET_ATTRIBUTE_COUNT = ELEMENT___GET_ATTRIBUTE_COUNT;

	/**
	 * The operation id for the '<em>Add Sink</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___ADD_SINK__SINK = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Remove Sink</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___REMOVE_SINK__SINK = ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Attribute Sink</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___ADD_ATTRIBUTE_SINK__ATTRIBUTESINK = ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Remove Attribute Sink</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___REMOVE_ATTRIBUTE_SINK__ATTRIBUTESINK = ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Add Element Sink</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___ADD_ELEMENT_SINK__ELEMENTSINK = ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Remove Element Sink</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___REMOVE_ELEMENT_SINK__ELEMENTSINK = ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Clear Element Sinks</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___CLEAR_ELEMENT_SINKS = ELEMENT_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Clear Attribute Sinks</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___CLEAR_ATTRIBUTE_SINKS = ELEMENT_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Clear Sinks</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___CLEAR_SINKS = ELEMENT_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Graph Attribute Added</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___GRAPH_ATTRIBUTE_ADDED__STRING_LONG_STRING_OBJECT = ELEMENT_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Graph Attribute Changed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___GRAPH_ATTRIBUTE_CHANGED__STRING_LONG_STRING_OBJECT_OBJECT = ELEMENT_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Graph Attribute Removed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___GRAPH_ATTRIBUTE_REMOVED__STRING_LONG_STRING = ELEMENT_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Node Attribute Added</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___NODE_ATTRIBUTE_ADDED__STRING_LONG_STRING_STRING_OBJECT = ELEMENT_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Node Attribute Changed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___NODE_ATTRIBUTE_CHANGED__STRING_LONG_STRING_STRING_OBJECT_OBJECT = ELEMENT_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Node Attribute Removed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___NODE_ATTRIBUTE_REMOVED__STRING_LONG_STRING_STRING = ELEMENT_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Edge Attribute Added</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___EDGE_ATTRIBUTE_ADDED__STRING_LONG_STRING_STRING_OBJECT = ELEMENT_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Edge Attribute Changed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___EDGE_ATTRIBUTE_CHANGED__STRING_LONG_STRING_STRING_OBJECT_OBJECT = ELEMENT_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Edge Attribute Removed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___EDGE_ATTRIBUTE_REMOVED__STRING_LONG_STRING_STRING = ELEMENT_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Node Added</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___NODE_ADDED__STRING_LONG_STRING = ELEMENT_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Node Removed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___NODE_REMOVED__STRING_LONG_STRING = ELEMENT_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Edge Added</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___EDGE_ADDED__STRING_LONG_STRING_STRING_STRING_BOOLEAN = ELEMENT_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Edge Removed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___EDGE_REMOVED__STRING_LONG_STRING = ELEMENT_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Graph Cleared</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___GRAPH_CLEARED__STRING_LONG = ELEMENT_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Step Begins</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___STEP_BEGINS__STRING_LONG_DOUBLE = ELEMENT_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Get Node Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___GET_NODE_COUNT = ELEMENT_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Get Edge Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___GET_EDGE_COUNT = ELEMENT_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Get Node Iterator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___GET_NODE_ITERATOR = ELEMENT_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Get Edge Iterator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___GET_EDGE_ITERATOR = ELEMENT_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Get Each Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___GET_EACH_NODE = ELEMENT_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Get Each Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___GET_EACH_EDGE = ELEMENT_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Get Node Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___GET_NODE_SET = ELEMENT_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Get Edge Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___GET_EDGE_SET = ELEMENT_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Get Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___GET_NODE__STRING = ELEMENT_OPERATION_COUNT + 32;

	/**
	 * The operation id for the '<em>Get Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___GET_EDGE__STRING = ELEMENT_OPERATION_COUNT + 33;

	/**
	 * The operation id for the '<em>Node Factory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___NODE_FACTORY = ELEMENT_OPERATION_COUNT + 34;

	/**
	 * The operation id for the '<em>Edge Factory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___EDGE_FACTORY = ELEMENT_OPERATION_COUNT + 35;

	/**
	 * The operation id for the '<em>Is Strict</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___IS_STRICT = ELEMENT_OPERATION_COUNT + 36;

	/**
	 * The operation id for the '<em>Is Auto Creation Enabled</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___IS_AUTO_CREATION_ENABLED = ELEMENT_OPERATION_COUNT + 37;

	/**
	 * The operation id for the '<em>Null Attributes Are Errors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___NULL_ATTRIBUTES_ARE_ERRORS = ELEMENT_OPERATION_COUNT + 38;

	/**
	 * The operation id for the '<em>Get Step</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___GET_STEP = ELEMENT_OPERATION_COUNT + 39;

	/**
	 * The operation id for the '<em>Set Null Attributes Are Errors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___SET_NULL_ATTRIBUTES_ARE_ERRORS__BOOLEAN = ELEMENT_OPERATION_COUNT + 40;

	/**
	 * The operation id for the '<em>Set Node Factory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___SET_NODE_FACTORY__NODEFACTORY = ELEMENT_OPERATION_COUNT + 41;

	/**
	 * The operation id for the '<em>Set Edge Factory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___SET_EDGE_FACTORY__EDGEFACTORY = ELEMENT_OPERATION_COUNT + 42;

	/**
	 * The operation id for the '<em>Set Strict</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___SET_STRICT__BOOLEAN = ELEMENT_OPERATION_COUNT + 43;

	/**
	 * The operation id for the '<em>Set Auto Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___SET_AUTO_CREATE__BOOLEAN = ELEMENT_OPERATION_COUNT + 44;

	/**
	 * The operation id for the '<em>Clear</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___CLEAR = ELEMENT_OPERATION_COUNT + 45;

	/**
	 * The operation id for the '<em>Add Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___ADD_NODE__STRING = ELEMENT_OPERATION_COUNT + 46;

	/**
	 * The operation id for the '<em>Remove Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___REMOVE_NODE__STRING = ELEMENT_OPERATION_COUNT + 47;

	/**
	 * The operation id for the '<em>Add Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___ADD_EDGE__STRING_STRING_STRING = ELEMENT_OPERATION_COUNT + 48;

	/**
	 * The operation id for the '<em>Add Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___ADD_EDGE__STRING_STRING_STRING_BOOLEAN = ELEMENT_OPERATION_COUNT + 49;

	/**
	 * The operation id for the '<em>Remove Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___REMOVE_EDGE__STRING_STRING = ELEMENT_OPERATION_COUNT + 50;

	/**
	 * The operation id for the '<em>Remove Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___REMOVE_EDGE__STRING = ELEMENT_OPERATION_COUNT + 51;

	/**
	 * The operation id for the '<em>Step Begins</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___STEP_BEGINS__DOUBLE = ELEMENT_OPERATION_COUNT + 52;

	/**
	 * The operation id for the '<em>Attribute Sinks</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___ATTRIBUTE_SINKS = ELEMENT_OPERATION_COUNT + 53;

	/**
	 * The operation id for the '<em>Element Sinks</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___ELEMENT_SINKS = ELEMENT_OPERATION_COUNT + 54;

	/**
	 * The operation id for the '<em>Read</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___READ__STRING = ELEMENT_OPERATION_COUNT + 55;

	/**
	 * The operation id for the '<em>Read</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___READ__FILESOURCE_STRING = ELEMENT_OPERATION_COUNT + 56;

	/**
	 * The operation id for the '<em>Write</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___WRITE__STRING = ELEMENT_OPERATION_COUNT + 57;

	/**
	 * The operation id for the '<em>Write</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___WRITE__FILESINK_STRING = ELEMENT_OPERATION_COUNT + 58;

	/**
	 * The operation id for the '<em>Display</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___DISPLAY = ELEMENT_OPERATION_COUNT + 59;

	/**
	 * The operation id for the '<em>Display</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___DISPLAY__BOOLEAN = ELEMENT_OPERATION_COUNT + 60;

	/**
	 * The operation id for the '<em>Get Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___GET_NODE__INT = ELEMENT_OPERATION_COUNT + 61;

	/**
	 * The operation id for the '<em>Get Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___GET_EDGE__INT = ELEMENT_OPERATION_COUNT + 62;

	/**
	 * The operation id for the '<em>Add Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___ADD_EDGE__STRING_INT_INT = ELEMENT_OPERATION_COUNT + 63;

	/**
	 * The operation id for the '<em>Add Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___ADD_EDGE__STRING_INT_INT_BOOLEAN = ELEMENT_OPERATION_COUNT + 64;

	/**
	 * The operation id for the '<em>Add Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___ADD_EDGE__STRING_NODE_NODE = ELEMENT_OPERATION_COUNT + 65;

	/**
	 * The operation id for the '<em>Add Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___ADD_EDGE__STRING_NODE_NODE_BOOLEAN = ELEMENT_OPERATION_COUNT + 66;

	/**
	 * The operation id for the '<em>Remove Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___REMOVE_EDGE__INT = ELEMENT_OPERATION_COUNT + 67;

	/**
	 * The operation id for the '<em>Remove Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___REMOVE_EDGE__INT_INT = ELEMENT_OPERATION_COUNT + 68;

	/**
	 * The operation id for the '<em>Remove Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___REMOVE_EDGE__NODE_NODE = ELEMENT_OPERATION_COUNT + 69;

	/**
	 * The operation id for the '<em>Remove Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___REMOVE_EDGE__EDGE = ELEMENT_OPERATION_COUNT + 70;

	/**
	 * The operation id for the '<em>Remove Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___REMOVE_NODE__INT = ELEMENT_OPERATION_COUNT + 71;

	/**
	 * The operation id for the '<em>Remove Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___REMOVE_NODE__NODE = ELEMENT_OPERATION_COUNT + 72;

	/**
	 * The number of operations of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 73;

	/**
	 * The meta object id for the '{@link ecore.org.graphstream.graph.Node <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.org.graphstream.graph.Node
	 * @see ecore.org.graphstream.graph.impl.GraphPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 3;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GET_ID = ELEMENT___GET_ID;

	/**
	 * The operation id for the '<em>Get Index</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GET_INDEX = ELEMENT___GET_INDEX;

	/**
	 * The operation id for the '<em>Get Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GET_ATTRIBUTE__STRING = ELEMENT___GET_ATTRIBUTE__STRING;

	/**
	 * The operation id for the '<em>Get First Attribute Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GET_FIRST_ATTRIBUTE_OF__STRING = ELEMENT___GET_FIRST_ATTRIBUTE_OF__STRING;

	/**
	 * The operation id for the '<em>Get Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GET_ATTRIBUTE__STRING_CLASS = ELEMENT___GET_ATTRIBUTE__STRING_CLASS;

	/**
	 * The operation id for the '<em>Get First Attribute Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GET_FIRST_ATTRIBUTE_OF__CLASS_STRING = ELEMENT___GET_FIRST_ATTRIBUTE_OF__CLASS_STRING;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GET_LABEL__STRING = ELEMENT___GET_LABEL__STRING;

	/**
	 * The operation id for the '<em>Get Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GET_NUMBER__STRING = ELEMENT___GET_NUMBER__STRING;

	/**
	 * The operation id for the '<em>Get Vector</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GET_VECTOR__STRING = ELEMENT___GET_VECTOR__STRING;

	/**
	 * The operation id for the '<em>Get Array</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GET_ARRAY__STRING = ELEMENT___GET_ARRAY__STRING;

	/**
	 * The operation id for the '<em>Get Hash</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GET_HASH__STRING = ELEMENT___GET_HASH__STRING;

	/**
	 * The operation id for the '<em>Has Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___HAS_ATTRIBUTE__STRING = ELEMENT___HAS_ATTRIBUTE__STRING;

	/**
	 * The operation id for the '<em>Has Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___HAS_ATTRIBUTE__STRING_CLASS = ELEMENT___HAS_ATTRIBUTE__STRING_CLASS;

	/**
	 * The operation id for the '<em>Has Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___HAS_LABEL__STRING = ELEMENT___HAS_LABEL__STRING;

	/**
	 * The operation id for the '<em>Has Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___HAS_NUMBER__STRING = ELEMENT___HAS_NUMBER__STRING;

	/**
	 * The operation id for the '<em>Has Vector</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___HAS_VECTOR__STRING = ELEMENT___HAS_VECTOR__STRING;

	/**
	 * The operation id for the '<em>Has Array</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___HAS_ARRAY__STRING = ELEMENT___HAS_ARRAY__STRING;

	/**
	 * The operation id for the '<em>Has Hash</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___HAS_HASH__STRING = ELEMENT___HAS_HASH__STRING;

	/**
	 * The operation id for the '<em>Get Attribute Key Iterator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GET_ATTRIBUTE_KEY_ITERATOR = ELEMENT___GET_ATTRIBUTE_KEY_ITERATOR;

	/**
	 * The operation id for the '<em>Get Each Attribute Key</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GET_EACH_ATTRIBUTE_KEY = ELEMENT___GET_EACH_ATTRIBUTE_KEY;

	/**
	 * The operation id for the '<em>Get Attribute Key Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GET_ATTRIBUTE_KEY_SET = ELEMENT___GET_ATTRIBUTE_KEY_SET;

	/**
	 * The operation id for the '<em>Clear Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___CLEAR_ATTRIBUTES = ELEMENT___CLEAR_ATTRIBUTES;

	/**
	 * The operation id for the '<em>Add Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___ADD_ATTRIBUTE__STRING_OBJECT = ELEMENT___ADD_ATTRIBUTE__STRING_OBJECT;

	/**
	 * The operation id for the '<em>Change Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___CHANGE_ATTRIBUTE__STRING_OBJECT = ELEMENT___CHANGE_ATTRIBUTE__STRING_OBJECT;

	/**
	 * The operation id for the '<em>Set Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___SET_ATTRIBUTE__STRING_OBJECT = ELEMENT___SET_ATTRIBUTE__STRING_OBJECT;

	/**
	 * The operation id for the '<em>Add Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___ADD_ATTRIBUTES__MAP = ELEMENT___ADD_ATTRIBUTES__MAP;

	/**
	 * The operation id for the '<em>Remove Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___REMOVE_ATTRIBUTE__STRING = ELEMENT___REMOVE_ATTRIBUTE__STRING;

	/**
	 * The operation id for the '<em>Get Attribute Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GET_ATTRIBUTE_COUNT = ELEMENT___GET_ATTRIBUTE_COUNT;

	/**
	 * The operation id for the '<em>Get Graph</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GET_GRAPH = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Degree</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GET_DEGREE = ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Out Degree</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GET_OUT_DEGREE = ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get In Degree</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GET_IN_DEGREE = ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Has Edge Toward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___HAS_EDGE_TOWARD__STRING = ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Has Edge From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___HAS_EDGE_FROM__STRING = ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Has Edge Between</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___HAS_EDGE_BETWEEN__STRING = ELEMENT_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Edge Toward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GET_EDGE_TOWARD__STRING = ELEMENT_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Edge From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GET_EDGE_FROM__STRING = ELEMENT_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Edge Between</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GET_EDGE_BETWEEN__STRING = ELEMENT_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Edge Iterator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GET_EDGE_ITERATOR = ELEMENT_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Get Entering Edge Iterator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GET_ENTERING_EDGE_ITERATOR = ELEMENT_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Get Leaving Edge Iterator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GET_LEAVING_EDGE_ITERATOR = ELEMENT_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Get Neighbor Node Iterator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GET_NEIGHBOR_NODE_ITERATOR = ELEMENT_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Get Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GET_EDGE__INT = ELEMENT_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Get Entering Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GET_ENTERING_EDGE__INT = ELEMENT_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Get Leaving Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GET_LEAVING_EDGE__INT = ELEMENT_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Get Breadth First Iterator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GET_BREADTH_FIRST_ITERATOR = ELEMENT_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Get Breadth First Iterator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GET_BREADTH_FIRST_ITERATOR__BOOLEAN = ELEMENT_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Get Depth First Iterator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GET_DEPTH_FIRST_ITERATOR = ELEMENT_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Get Depth First Iterator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GET_DEPTH_FIRST_ITERATOR__BOOLEAN = ELEMENT_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Get Each Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GET_EACH_EDGE = ELEMENT_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Get Each Leaving Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GET_EACH_LEAVING_EDGE = ELEMENT_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Get Each Entering Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GET_EACH_ENTERING_EDGE = ELEMENT_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Get Edge Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GET_EDGE_SET = ELEMENT_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Get Leaving Edge Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GET_LEAVING_EDGE_SET = ELEMENT_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Get Entering Edge Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GET_ENTERING_EDGE_SET = ELEMENT_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___TO_STRING = ELEMENT_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Has Edge Toward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___HAS_EDGE_TOWARD__NODE = ELEMENT_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Has Edge Toward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___HAS_EDGE_TOWARD__INT = ELEMENT_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Has Edge From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___HAS_EDGE_FROM__NODE = ELEMENT_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Has Edge From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___HAS_EDGE_FROM__INT = ELEMENT_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Has Edge Between</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___HAS_EDGE_BETWEEN__NODE = ELEMENT_OPERATION_COUNT + 32;

	/**
	 * The operation id for the '<em>Has Edge Between</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___HAS_EDGE_BETWEEN__INT = ELEMENT_OPERATION_COUNT + 33;

	/**
	 * The operation id for the '<em>Get Edge Toward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GET_EDGE_TOWARD__NODE = ELEMENT_OPERATION_COUNT + 34;

	/**
	 * The operation id for the '<em>Get Edge Toward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GET_EDGE_TOWARD__INT = ELEMENT_OPERATION_COUNT + 35;

	/**
	 * The operation id for the '<em>Get Edge From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GET_EDGE_FROM__NODE = ELEMENT_OPERATION_COUNT + 36;

	/**
	 * The operation id for the '<em>Get Edge From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GET_EDGE_FROM__INT = ELEMENT_OPERATION_COUNT + 37;

	/**
	 * The operation id for the '<em>Get Edge Between</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GET_EDGE_BETWEEN__NODE = ELEMENT_OPERATION_COUNT + 38;

	/**
	 * The operation id for the '<em>Get Edge Between</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GET_EDGE_BETWEEN__INT = ELEMENT_OPERATION_COUNT + 39;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 40;

	/**
	 * The meta object id for the '{@link ecore.org.graphstream.graph.Structure <em>Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.org.graphstream.graph.Structure
	 * @see ecore.org.graphstream.graph.impl.GraphPackageImpl#getStructure()
	 * @generated
	 */
	int STRUCTURE = 4;

	/**
	 * The number of structural features of the '<em>Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Node Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE___GET_NODE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Edge Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE___GET_EDGE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Node Iterator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE___GET_NODE_ITERATOR = 2;

	/**
	 * The operation id for the '<em>Get Edge Iterator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE___GET_EDGE_ITERATOR = 3;

	/**
	 * The operation id for the '<em>Get Each Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE___GET_EACH_NODE = 4;

	/**
	 * The operation id for the '<em>Get Each Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE___GET_EACH_EDGE = 5;

	/**
	 * The operation id for the '<em>Get Node Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE___GET_NODE_SET = 6;

	/**
	 * The operation id for the '<em>Get Edge Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE___GET_EDGE_SET = 7;

	/**
	 * The number of operations of the '<em>Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_OPERATION_COUNT = 8;


	/**
	 * Returns the meta object for class '{@link ecore.org.graphstream.graph.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see ecore.org.graphstream.graph.Edge
	 * @generated
	 */
	EClass getEdge();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Edge#isDirected() <em>Is Directed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Directed</em>' operation.
	 * @see ecore.org.graphstream.graph.Edge#isDirected()
	 * @generated
	 */
	EOperation getEdge__IsDirected();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Edge#isLoop() <em>Is Loop</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Loop</em>' operation.
	 * @see ecore.org.graphstream.graph.Edge#isLoop()
	 * @generated
	 */
	EOperation getEdge__IsLoop();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Edge#getNode0() <em>Get Node0</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Node0</em>' operation.
	 * @see ecore.org.graphstream.graph.Edge#getNode0()
	 * @generated
	 */
	EOperation getEdge__GetNode0();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Edge#getNode1() <em>Get Node1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Node1</em>' operation.
	 * @see ecore.org.graphstream.graph.Edge#getNode1()
	 * @generated
	 */
	EOperation getEdge__GetNode1();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Edge#getSourceNode() <em>Get Source Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Source Node</em>' operation.
	 * @see ecore.org.graphstream.graph.Edge#getSourceNode()
	 * @generated
	 */
	EOperation getEdge__GetSourceNode();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Edge#getTargetNode() <em>Get Target Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Target Node</em>' operation.
	 * @see ecore.org.graphstream.graph.Edge#getTargetNode()
	 * @generated
	 */
	EOperation getEdge__GetTargetNode();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Edge#getOpposite(ecore.org.graphstream.graph.Node) <em>Get Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Opposite</em>' operation.
	 * @see ecore.org.graphstream.graph.Edge#getOpposite(ecore.org.graphstream.graph.Node)
	 * @generated
	 */
	EOperation getEdge__GetOpposite__Node();

	/**
	 * Returns the meta object for class '{@link ecore.org.graphstream.graph.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see ecore.org.graphstream.graph.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Element#getId() <em>Get Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Id</em>' operation.
	 * @see ecore.org.graphstream.graph.Element#getId()
	 * @generated
	 */
	EOperation getElement__GetId();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Element#getIndex() <em>Get Index</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Index</em>' operation.
	 * @see ecore.org.graphstream.graph.Element#getIndex()
	 * @generated
	 */
	EOperation getElement__GetIndex();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Element#getAttribute(java.lang.String) <em>Get Attribute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Attribute</em>' operation.
	 * @see ecore.org.graphstream.graph.Element#getAttribute(java.lang.String)
	 * @generated
	 */
	EOperation getElement__GetAttribute__String();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Element#getFirstAttributeOf(java.lang.String[]) <em>Get First Attribute Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get First Attribute Of</em>' operation.
	 * @see ecore.org.graphstream.graph.Element#getFirstAttributeOf(java.lang.String[])
	 * @generated
	 */
	EOperation getElement__GetFirstAttributeOf__String();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Element#getAttribute(java.lang.String, java.lang.Class) <em>Get Attribute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Attribute</em>' operation.
	 * @see ecore.org.graphstream.graph.Element#getAttribute(java.lang.String, java.lang.Class)
	 * @generated
	 */
	EOperation getElement__GetAttribute__String_Class();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Element#getFirstAttributeOf(java.lang.Class, java.lang.String[]) <em>Get First Attribute Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get First Attribute Of</em>' operation.
	 * @see ecore.org.graphstream.graph.Element#getFirstAttributeOf(java.lang.Class, java.lang.String[])
	 * @generated
	 */
	EOperation getElement__GetFirstAttributeOf__Class_String();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Element#getLabel(java.lang.String) <em>Get Label</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Label</em>' operation.
	 * @see ecore.org.graphstream.graph.Element#getLabel(java.lang.String)
	 * @generated
	 */
	EOperation getElement__GetLabel__String();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Element#getNumber(java.lang.String) <em>Get Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Number</em>' operation.
	 * @see ecore.org.graphstream.graph.Element#getNumber(java.lang.String)
	 * @generated
	 */
	EOperation getElement__GetNumber__String();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Element#getVector(java.lang.String) <em>Get Vector</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Vector</em>' operation.
	 * @see ecore.org.graphstream.graph.Element#getVector(java.lang.String)
	 * @generated
	 */
	EOperation getElement__GetVector__String();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Element#getArray(java.lang.String) <em>Get Array</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Array</em>' operation.
	 * @see ecore.org.graphstream.graph.Element#getArray(java.lang.String)
	 * @generated
	 */
	EOperation getElement__GetArray__String();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Element#getHash(java.lang.String) <em>Get Hash</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Hash</em>' operation.
	 * @see ecore.org.graphstream.graph.Element#getHash(java.lang.String)
	 * @generated
	 */
	EOperation getElement__GetHash__String();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Element#hasAttribute(java.lang.String) <em>Has Attribute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Attribute</em>' operation.
	 * @see ecore.org.graphstream.graph.Element#hasAttribute(java.lang.String)
	 * @generated
	 */
	EOperation getElement__HasAttribute__String();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Element#hasAttribute(java.lang.String, java.lang.Class) <em>Has Attribute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Attribute</em>' operation.
	 * @see ecore.org.graphstream.graph.Element#hasAttribute(java.lang.String, java.lang.Class)
	 * @generated
	 */
	EOperation getElement__HasAttribute__String_Class();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Element#hasLabel(java.lang.String) <em>Has Label</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Label</em>' operation.
	 * @see ecore.org.graphstream.graph.Element#hasLabel(java.lang.String)
	 * @generated
	 */
	EOperation getElement__HasLabel__String();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Element#hasNumber(java.lang.String) <em>Has Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Number</em>' operation.
	 * @see ecore.org.graphstream.graph.Element#hasNumber(java.lang.String)
	 * @generated
	 */
	EOperation getElement__HasNumber__String();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Element#hasVector(java.lang.String) <em>Has Vector</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Vector</em>' operation.
	 * @see ecore.org.graphstream.graph.Element#hasVector(java.lang.String)
	 * @generated
	 */
	EOperation getElement__HasVector__String();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Element#hasArray(java.lang.String) <em>Has Array</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Array</em>' operation.
	 * @see ecore.org.graphstream.graph.Element#hasArray(java.lang.String)
	 * @generated
	 */
	EOperation getElement__HasArray__String();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Element#hasHash(java.lang.String) <em>Has Hash</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Hash</em>' operation.
	 * @see ecore.org.graphstream.graph.Element#hasHash(java.lang.String)
	 * @generated
	 */
	EOperation getElement__HasHash__String();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Element#getAttributeKeyIterator() <em>Get Attribute Key Iterator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Attribute Key Iterator</em>' operation.
	 * @see ecore.org.graphstream.graph.Element#getAttributeKeyIterator()
	 * @generated
	 */
	EOperation getElement__GetAttributeKeyIterator();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Element#getEachAttributeKey() <em>Get Each Attribute Key</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Each Attribute Key</em>' operation.
	 * @see ecore.org.graphstream.graph.Element#getEachAttributeKey()
	 * @generated
	 */
	EOperation getElement__GetEachAttributeKey();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Element#getAttributeKeySet() <em>Get Attribute Key Set</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Attribute Key Set</em>' operation.
	 * @see ecore.org.graphstream.graph.Element#getAttributeKeySet()
	 * @generated
	 */
	EOperation getElement__GetAttributeKeySet();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Element#clearAttributes() <em>Clear Attributes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clear Attributes</em>' operation.
	 * @see ecore.org.graphstream.graph.Element#clearAttributes()
	 * @generated
	 */
	EOperation getElement__ClearAttributes();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Element#addAttribute(java.lang.String, java.lang.Object[]) <em>Add Attribute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Attribute</em>' operation.
	 * @see ecore.org.graphstream.graph.Element#addAttribute(java.lang.String, java.lang.Object[])
	 * @generated
	 */
	EOperation getElement__AddAttribute__String_Object();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Element#changeAttribute(java.lang.String, java.lang.Object[]) <em>Change Attribute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Attribute</em>' operation.
	 * @see ecore.org.graphstream.graph.Element#changeAttribute(java.lang.String, java.lang.Object[])
	 * @generated
	 */
	EOperation getElement__ChangeAttribute__String_Object();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Element#setAttribute(java.lang.String, java.lang.Object[]) <em>Set Attribute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Attribute</em>' operation.
	 * @see ecore.org.graphstream.graph.Element#setAttribute(java.lang.String, java.lang.Object[])
	 * @generated
	 */
	EOperation getElement__SetAttribute__String_Object();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Element#addAttributes(java.util.Map) <em>Add Attributes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Attributes</em>' operation.
	 * @see ecore.org.graphstream.graph.Element#addAttributes(java.util.Map)
	 * @generated
	 */
	EOperation getElement__AddAttributes__Map();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Element#removeAttribute(java.lang.String) <em>Remove Attribute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Attribute</em>' operation.
	 * @see ecore.org.graphstream.graph.Element#removeAttribute(java.lang.String)
	 * @generated
	 */
	EOperation getElement__RemoveAttribute__String();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Element#getAttributeCount() <em>Get Attribute Count</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Attribute Count</em>' operation.
	 * @see ecore.org.graphstream.graph.Element#getAttributeCount()
	 * @generated
	 */
	EOperation getElement__GetAttributeCount();

	/**
	 * Returns the meta object for class '{@link ecore.org.graphstream.graph.Graph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph</em>'.
	 * @see ecore.org.graphstream.graph.Graph
	 * @generated
	 */
	EClass getGraph();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Graph#getNode(java.lang.String) <em>Get Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Node</em>' operation.
	 * @see ecore.org.graphstream.graph.Graph#getNode(java.lang.String)
	 * @generated
	 */
	EOperation getGraph__GetNode__String();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Graph#getEdge(java.lang.String) <em>Get Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Edge</em>' operation.
	 * @see ecore.org.graphstream.graph.Graph#getEdge(java.lang.String)
	 * @generated
	 */
	EOperation getGraph__GetEdge__String();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Graph#nodeFactory() <em>Node Factory</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Node Factory</em>' operation.
	 * @see ecore.org.graphstream.graph.Graph#nodeFactory()
	 * @generated
	 */
	EOperation getGraph__NodeFactory();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Graph#edgeFactory() <em>Edge Factory</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edge Factory</em>' operation.
	 * @see ecore.org.graphstream.graph.Graph#edgeFactory()
	 * @generated
	 */
	EOperation getGraph__EdgeFactory();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Graph#isStrict() <em>Is Strict</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Strict</em>' operation.
	 * @see ecore.org.graphstream.graph.Graph#isStrict()
	 * @generated
	 */
	EOperation getGraph__IsStrict();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Graph#isAutoCreationEnabled() <em>Is Auto Creation Enabled</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Auto Creation Enabled</em>' operation.
	 * @see ecore.org.graphstream.graph.Graph#isAutoCreationEnabled()
	 * @generated
	 */
	EOperation getGraph__IsAutoCreationEnabled();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Graph#nullAttributesAreErrors() <em>Null Attributes Are Errors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Null Attributes Are Errors</em>' operation.
	 * @see ecore.org.graphstream.graph.Graph#nullAttributesAreErrors()
	 * @generated
	 */
	EOperation getGraph__NullAttributesAreErrors();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Graph#getStep() <em>Get Step</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Step</em>' operation.
	 * @see ecore.org.graphstream.graph.Graph#getStep()
	 * @generated
	 */
	EOperation getGraph__GetStep();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Graph#setNullAttributesAreErrors(boolean) <em>Set Null Attributes Are Errors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Null Attributes Are Errors</em>' operation.
	 * @see ecore.org.graphstream.graph.Graph#setNullAttributesAreErrors(boolean)
	 * @generated
	 */
	EOperation getGraph__SetNullAttributesAreErrors__boolean();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Graph#setNodeFactory(org.graphstream.graph.NodeFactory) <em>Set Node Factory</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Node Factory</em>' operation.
	 * @see ecore.org.graphstream.graph.Graph#setNodeFactory(org.graphstream.graph.NodeFactory)
	 * @generated
	 */
	EOperation getGraph__SetNodeFactory__NodeFactory();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Graph#setEdgeFactory(org.graphstream.graph.EdgeFactory) <em>Set Edge Factory</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Edge Factory</em>' operation.
	 * @see ecore.org.graphstream.graph.Graph#setEdgeFactory(org.graphstream.graph.EdgeFactory)
	 * @generated
	 */
	EOperation getGraph__SetEdgeFactory__EdgeFactory();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Graph#setStrict(boolean) <em>Set Strict</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Strict</em>' operation.
	 * @see ecore.org.graphstream.graph.Graph#setStrict(boolean)
	 * @generated
	 */
	EOperation getGraph__SetStrict__boolean();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Graph#setAutoCreate(boolean) <em>Set Auto Create</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Auto Create</em>' operation.
	 * @see ecore.org.graphstream.graph.Graph#setAutoCreate(boolean)
	 * @generated
	 */
	EOperation getGraph__SetAutoCreate__boolean();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Graph#clear() <em>Clear</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clear</em>' operation.
	 * @see ecore.org.graphstream.graph.Graph#clear()
	 * @generated
	 */
	EOperation getGraph__Clear();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Graph#addNode(java.lang.String) <em>Add Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Node</em>' operation.
	 * @see ecore.org.graphstream.graph.Graph#addNode(java.lang.String)
	 * @generated
	 */
	EOperation getGraph__AddNode__String();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Graph#removeNode(java.lang.String) <em>Remove Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Node</em>' operation.
	 * @see ecore.org.graphstream.graph.Graph#removeNode(java.lang.String)
	 * @generated
	 */
	EOperation getGraph__RemoveNode__String();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Graph#addEdge(java.lang.String, java.lang.String, java.lang.String) <em>Add Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Edge</em>' operation.
	 * @see ecore.org.graphstream.graph.Graph#addEdge(java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getGraph__AddEdge__String_String_String();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Graph#addEdge(java.lang.String, java.lang.String, java.lang.String, boolean) <em>Add Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Edge</em>' operation.
	 * @see ecore.org.graphstream.graph.Graph#addEdge(java.lang.String, java.lang.String, java.lang.String, boolean)
	 * @generated
	 */
	EOperation getGraph__AddEdge__String_String_String_boolean();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Graph#removeEdge(java.lang.String, java.lang.String) <em>Remove Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Edge</em>' operation.
	 * @see ecore.org.graphstream.graph.Graph#removeEdge(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getGraph__RemoveEdge__String_String();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Graph#removeEdge(java.lang.String) <em>Remove Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Edge</em>' operation.
	 * @see ecore.org.graphstream.graph.Graph#removeEdge(java.lang.String)
	 * @generated
	 */
	EOperation getGraph__RemoveEdge__String();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Graph#stepBegins(double) <em>Step Begins</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Step Begins</em>' operation.
	 * @see ecore.org.graphstream.graph.Graph#stepBegins(double)
	 * @generated
	 */
	EOperation getGraph__StepBegins__double();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Graph#attributeSinks() <em>Attribute Sinks</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Attribute Sinks</em>' operation.
	 * @see ecore.org.graphstream.graph.Graph#attributeSinks()
	 * @generated
	 */
	EOperation getGraph__AttributeSinks();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Graph#elementSinks() <em>Element Sinks</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Element Sinks</em>' operation.
	 * @see ecore.org.graphstream.graph.Graph#elementSinks()
	 * @generated
	 */
	EOperation getGraph__ElementSinks();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Graph#read(java.lang.String) <em>Read</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Read</em>' operation.
	 * @see ecore.org.graphstream.graph.Graph#read(java.lang.String)
	 * @generated
	 */
	EOperation getGraph__Read__String();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Graph#read(org.graphstream.stream.file.FileSource, java.lang.String) <em>Read</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Read</em>' operation.
	 * @see ecore.org.graphstream.graph.Graph#read(org.graphstream.stream.file.FileSource, java.lang.String)
	 * @generated
	 */
	EOperation getGraph__Read__FileSource_String();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Graph#write(java.lang.String) <em>Write</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Write</em>' operation.
	 * @see ecore.org.graphstream.graph.Graph#write(java.lang.String)
	 * @generated
	 */
	EOperation getGraph__Write__String();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Graph#write(org.graphstream.stream.file.FileSink, java.lang.String) <em>Write</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Write</em>' operation.
	 * @see ecore.org.graphstream.graph.Graph#write(org.graphstream.stream.file.FileSink, java.lang.String)
	 * @generated
	 */
	EOperation getGraph__Write__FileSink_String();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Graph#display() <em>Display</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Display</em>' operation.
	 * @see ecore.org.graphstream.graph.Graph#display()
	 * @generated
	 */
	EOperation getGraph__Display();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Graph#display(boolean) <em>Display</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Display</em>' operation.
	 * @see ecore.org.graphstream.graph.Graph#display(boolean)
	 * @generated
	 */
	EOperation getGraph__Display__boolean();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Graph#getNode(int) <em>Get Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Node</em>' operation.
	 * @see ecore.org.graphstream.graph.Graph#getNode(int)
	 * @generated
	 */
	EOperation getGraph__GetNode__int();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Graph#getEdge(int) <em>Get Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Edge</em>' operation.
	 * @see ecore.org.graphstream.graph.Graph#getEdge(int)
	 * @generated
	 */
	EOperation getGraph__GetEdge__int();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Graph#addEdge(java.lang.String, int, int) <em>Add Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Edge</em>' operation.
	 * @see ecore.org.graphstream.graph.Graph#addEdge(java.lang.String, int, int)
	 * @generated
	 */
	EOperation getGraph__AddEdge__String_int_int();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Graph#addEdge(java.lang.String, int, int, boolean) <em>Add Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Edge</em>' operation.
	 * @see ecore.org.graphstream.graph.Graph#addEdge(java.lang.String, int, int, boolean)
	 * @generated
	 */
	EOperation getGraph__AddEdge__String_int_int_boolean();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Graph#addEdge(java.lang.String, ecore.org.graphstream.graph.Node, ecore.org.graphstream.graph.Node) <em>Add Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Edge</em>' operation.
	 * @see ecore.org.graphstream.graph.Graph#addEdge(java.lang.String, ecore.org.graphstream.graph.Node, ecore.org.graphstream.graph.Node)
	 * @generated
	 */
	EOperation getGraph__AddEdge__String_Node_Node();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Graph#addEdge(java.lang.String, ecore.org.graphstream.graph.Node, ecore.org.graphstream.graph.Node, boolean) <em>Add Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Edge</em>' operation.
	 * @see ecore.org.graphstream.graph.Graph#addEdge(java.lang.String, ecore.org.graphstream.graph.Node, ecore.org.graphstream.graph.Node, boolean)
	 * @generated
	 */
	EOperation getGraph__AddEdge__String_Node_Node_boolean();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Graph#removeEdge(int) <em>Remove Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Edge</em>' operation.
	 * @see ecore.org.graphstream.graph.Graph#removeEdge(int)
	 * @generated
	 */
	EOperation getGraph__RemoveEdge__int();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Graph#removeEdge(int, int) <em>Remove Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Edge</em>' operation.
	 * @see ecore.org.graphstream.graph.Graph#removeEdge(int, int)
	 * @generated
	 */
	EOperation getGraph__RemoveEdge__int_int();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Graph#removeEdge(ecore.org.graphstream.graph.Node, ecore.org.graphstream.graph.Node) <em>Remove Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Edge</em>' operation.
	 * @see ecore.org.graphstream.graph.Graph#removeEdge(ecore.org.graphstream.graph.Node, ecore.org.graphstream.graph.Node)
	 * @generated
	 */
	EOperation getGraph__RemoveEdge__Node_Node();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Graph#removeEdge(ecore.org.graphstream.graph.Edge) <em>Remove Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Edge</em>' operation.
	 * @see ecore.org.graphstream.graph.Graph#removeEdge(ecore.org.graphstream.graph.Edge)
	 * @generated
	 */
	EOperation getGraph__RemoveEdge__Edge();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Graph#removeNode(int) <em>Remove Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Node</em>' operation.
	 * @see ecore.org.graphstream.graph.Graph#removeNode(int)
	 * @generated
	 */
	EOperation getGraph__RemoveNode__int();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Graph#removeNode(ecore.org.graphstream.graph.Node) <em>Remove Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Node</em>' operation.
	 * @see ecore.org.graphstream.graph.Graph#removeNode(ecore.org.graphstream.graph.Node)
	 * @generated
	 */
	EOperation getGraph__RemoveNode__Node();

	/**
	 * Returns the meta object for class '{@link ecore.org.graphstream.graph.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see ecore.org.graphstream.graph.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Node#getGraph() <em>Get Graph</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Graph</em>' operation.
	 * @see ecore.org.graphstream.graph.Node#getGraph()
	 * @generated
	 */
	EOperation getNode__GetGraph();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Node#getDegree() <em>Get Degree</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Degree</em>' operation.
	 * @see ecore.org.graphstream.graph.Node#getDegree()
	 * @generated
	 */
	EOperation getNode__GetDegree();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Node#getOutDegree() <em>Get Out Degree</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Out Degree</em>' operation.
	 * @see ecore.org.graphstream.graph.Node#getOutDegree()
	 * @generated
	 */
	EOperation getNode__GetOutDegree();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Node#getInDegree() <em>Get In Degree</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get In Degree</em>' operation.
	 * @see ecore.org.graphstream.graph.Node#getInDegree()
	 * @generated
	 */
	EOperation getNode__GetInDegree();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Node#hasEdgeToward(java.lang.String) <em>Has Edge Toward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Edge Toward</em>' operation.
	 * @see ecore.org.graphstream.graph.Node#hasEdgeToward(java.lang.String)
	 * @generated
	 */
	EOperation getNode__HasEdgeToward__String();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Node#hasEdgeFrom(java.lang.String) <em>Has Edge From</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Edge From</em>' operation.
	 * @see ecore.org.graphstream.graph.Node#hasEdgeFrom(java.lang.String)
	 * @generated
	 */
	EOperation getNode__HasEdgeFrom__String();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Node#hasEdgeBetween(java.lang.String) <em>Has Edge Between</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Edge Between</em>' operation.
	 * @see ecore.org.graphstream.graph.Node#hasEdgeBetween(java.lang.String)
	 * @generated
	 */
	EOperation getNode__HasEdgeBetween__String();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Node#getEdgeToward(java.lang.String) <em>Get Edge Toward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Edge Toward</em>' operation.
	 * @see ecore.org.graphstream.graph.Node#getEdgeToward(java.lang.String)
	 * @generated
	 */
	EOperation getNode__GetEdgeToward__String();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Node#getEdgeFrom(java.lang.String) <em>Get Edge From</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Edge From</em>' operation.
	 * @see ecore.org.graphstream.graph.Node#getEdgeFrom(java.lang.String)
	 * @generated
	 */
	EOperation getNode__GetEdgeFrom__String();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Node#getEdgeBetween(java.lang.String) <em>Get Edge Between</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Edge Between</em>' operation.
	 * @see ecore.org.graphstream.graph.Node#getEdgeBetween(java.lang.String)
	 * @generated
	 */
	EOperation getNode__GetEdgeBetween__String();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Node#getEdgeIterator() <em>Get Edge Iterator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Edge Iterator</em>' operation.
	 * @see ecore.org.graphstream.graph.Node#getEdgeIterator()
	 * @generated
	 */
	EOperation getNode__GetEdgeIterator();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Node#getEnteringEdgeIterator() <em>Get Entering Edge Iterator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Entering Edge Iterator</em>' operation.
	 * @see ecore.org.graphstream.graph.Node#getEnteringEdgeIterator()
	 * @generated
	 */
	EOperation getNode__GetEnteringEdgeIterator();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Node#getLeavingEdgeIterator() <em>Get Leaving Edge Iterator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Leaving Edge Iterator</em>' operation.
	 * @see ecore.org.graphstream.graph.Node#getLeavingEdgeIterator()
	 * @generated
	 */
	EOperation getNode__GetLeavingEdgeIterator();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Node#getNeighborNodeIterator() <em>Get Neighbor Node Iterator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Neighbor Node Iterator</em>' operation.
	 * @see ecore.org.graphstream.graph.Node#getNeighborNodeIterator()
	 * @generated
	 */
	EOperation getNode__GetNeighborNodeIterator();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Node#getEdge(int) <em>Get Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Edge</em>' operation.
	 * @see ecore.org.graphstream.graph.Node#getEdge(int)
	 * @generated
	 */
	EOperation getNode__GetEdge__int();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Node#getEnteringEdge(int) <em>Get Entering Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Entering Edge</em>' operation.
	 * @see ecore.org.graphstream.graph.Node#getEnteringEdge(int)
	 * @generated
	 */
	EOperation getNode__GetEnteringEdge__int();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Node#getLeavingEdge(int) <em>Get Leaving Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Leaving Edge</em>' operation.
	 * @see ecore.org.graphstream.graph.Node#getLeavingEdge(int)
	 * @generated
	 */
	EOperation getNode__GetLeavingEdge__int();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Node#getBreadthFirstIterator() <em>Get Breadth First Iterator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Breadth First Iterator</em>' operation.
	 * @see ecore.org.graphstream.graph.Node#getBreadthFirstIterator()
	 * @generated
	 */
	EOperation getNode__GetBreadthFirstIterator();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Node#getBreadthFirstIterator(boolean) <em>Get Breadth First Iterator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Breadth First Iterator</em>' operation.
	 * @see ecore.org.graphstream.graph.Node#getBreadthFirstIterator(boolean)
	 * @generated
	 */
	EOperation getNode__GetBreadthFirstIterator__boolean();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Node#getDepthFirstIterator() <em>Get Depth First Iterator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Depth First Iterator</em>' operation.
	 * @see ecore.org.graphstream.graph.Node#getDepthFirstIterator()
	 * @generated
	 */
	EOperation getNode__GetDepthFirstIterator();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Node#getDepthFirstIterator(boolean) <em>Get Depth First Iterator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Depth First Iterator</em>' operation.
	 * @see ecore.org.graphstream.graph.Node#getDepthFirstIterator(boolean)
	 * @generated
	 */
	EOperation getNode__GetDepthFirstIterator__boolean();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Node#getEachEdge() <em>Get Each Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Each Edge</em>' operation.
	 * @see ecore.org.graphstream.graph.Node#getEachEdge()
	 * @generated
	 */
	EOperation getNode__GetEachEdge();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Node#getEachLeavingEdge() <em>Get Each Leaving Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Each Leaving Edge</em>' operation.
	 * @see ecore.org.graphstream.graph.Node#getEachLeavingEdge()
	 * @generated
	 */
	EOperation getNode__GetEachLeavingEdge();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Node#getEachEnteringEdge() <em>Get Each Entering Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Each Entering Edge</em>' operation.
	 * @see ecore.org.graphstream.graph.Node#getEachEnteringEdge()
	 * @generated
	 */
	EOperation getNode__GetEachEnteringEdge();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Node#getEdgeSet() <em>Get Edge Set</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Edge Set</em>' operation.
	 * @see ecore.org.graphstream.graph.Node#getEdgeSet()
	 * @generated
	 */
	EOperation getNode__GetEdgeSet();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Node#getLeavingEdgeSet() <em>Get Leaving Edge Set</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Leaving Edge Set</em>' operation.
	 * @see ecore.org.graphstream.graph.Node#getLeavingEdgeSet()
	 * @generated
	 */
	EOperation getNode__GetLeavingEdgeSet();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Node#getEnteringEdgeSet() <em>Get Entering Edge Set</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Entering Edge Set</em>' operation.
	 * @see ecore.org.graphstream.graph.Node#getEnteringEdgeSet()
	 * @generated
	 */
	EOperation getNode__GetEnteringEdgeSet();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Node#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see ecore.org.graphstream.graph.Node#toString()
	 * @generated
	 */
	EOperation getNode__ToString();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Node#hasEdgeToward(ecore.org.graphstream.graph.Node) <em>Has Edge Toward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Edge Toward</em>' operation.
	 * @see ecore.org.graphstream.graph.Node#hasEdgeToward(ecore.org.graphstream.graph.Node)
	 * @generated
	 */
	EOperation getNode__HasEdgeToward__Node();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Node#hasEdgeToward(int) <em>Has Edge Toward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Edge Toward</em>' operation.
	 * @see ecore.org.graphstream.graph.Node#hasEdgeToward(int)
	 * @generated
	 */
	EOperation getNode__HasEdgeToward__int();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Node#hasEdgeFrom(ecore.org.graphstream.graph.Node) <em>Has Edge From</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Edge From</em>' operation.
	 * @see ecore.org.graphstream.graph.Node#hasEdgeFrom(ecore.org.graphstream.graph.Node)
	 * @generated
	 */
	EOperation getNode__HasEdgeFrom__Node();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Node#hasEdgeFrom(int) <em>Has Edge From</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Edge From</em>' operation.
	 * @see ecore.org.graphstream.graph.Node#hasEdgeFrom(int)
	 * @generated
	 */
	EOperation getNode__HasEdgeFrom__int();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Node#hasEdgeBetween(ecore.org.graphstream.graph.Node) <em>Has Edge Between</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Edge Between</em>' operation.
	 * @see ecore.org.graphstream.graph.Node#hasEdgeBetween(ecore.org.graphstream.graph.Node)
	 * @generated
	 */
	EOperation getNode__HasEdgeBetween__Node();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Node#hasEdgeBetween(int) <em>Has Edge Between</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Edge Between</em>' operation.
	 * @see ecore.org.graphstream.graph.Node#hasEdgeBetween(int)
	 * @generated
	 */
	EOperation getNode__HasEdgeBetween__int();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Node#getEdgeToward(ecore.org.graphstream.graph.Node) <em>Get Edge Toward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Edge Toward</em>' operation.
	 * @see ecore.org.graphstream.graph.Node#getEdgeToward(ecore.org.graphstream.graph.Node)
	 * @generated
	 */
	EOperation getNode__GetEdgeToward__Node();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Node#getEdgeToward(int) <em>Get Edge Toward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Edge Toward</em>' operation.
	 * @see ecore.org.graphstream.graph.Node#getEdgeToward(int)
	 * @generated
	 */
	EOperation getNode__GetEdgeToward__int();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Node#getEdgeFrom(ecore.org.graphstream.graph.Node) <em>Get Edge From</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Edge From</em>' operation.
	 * @see ecore.org.graphstream.graph.Node#getEdgeFrom(ecore.org.graphstream.graph.Node)
	 * @generated
	 */
	EOperation getNode__GetEdgeFrom__Node();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Node#getEdgeFrom(int) <em>Get Edge From</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Edge From</em>' operation.
	 * @see ecore.org.graphstream.graph.Node#getEdgeFrom(int)
	 * @generated
	 */
	EOperation getNode__GetEdgeFrom__int();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Node#getEdgeBetween(ecore.org.graphstream.graph.Node) <em>Get Edge Between</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Edge Between</em>' operation.
	 * @see ecore.org.graphstream.graph.Node#getEdgeBetween(ecore.org.graphstream.graph.Node)
	 * @generated
	 */
	EOperation getNode__GetEdgeBetween__Node();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Node#getEdgeBetween(int) <em>Get Edge Between</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Edge Between</em>' operation.
	 * @see ecore.org.graphstream.graph.Node#getEdgeBetween(int)
	 * @generated
	 */
	EOperation getNode__GetEdgeBetween__int();

	/**
	 * Returns the meta object for class '{@link ecore.org.graphstream.graph.Structure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structure</em>'.
	 * @see ecore.org.graphstream.graph.Structure
	 * @generated
	 */
	EClass getStructure();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Structure#getNodeCount() <em>Get Node Count</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Node Count</em>' operation.
	 * @see ecore.org.graphstream.graph.Structure#getNodeCount()
	 * @generated
	 */
	EOperation getStructure__GetNodeCount();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Structure#getEdgeCount() <em>Get Edge Count</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Edge Count</em>' operation.
	 * @see ecore.org.graphstream.graph.Structure#getEdgeCount()
	 * @generated
	 */
	EOperation getStructure__GetEdgeCount();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Structure#getNodeIterator() <em>Get Node Iterator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Node Iterator</em>' operation.
	 * @see ecore.org.graphstream.graph.Structure#getNodeIterator()
	 * @generated
	 */
	EOperation getStructure__GetNodeIterator();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Structure#getEdgeIterator() <em>Get Edge Iterator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Edge Iterator</em>' operation.
	 * @see ecore.org.graphstream.graph.Structure#getEdgeIterator()
	 * @generated
	 */
	EOperation getStructure__GetEdgeIterator();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Structure#getEachNode() <em>Get Each Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Each Node</em>' operation.
	 * @see ecore.org.graphstream.graph.Structure#getEachNode()
	 * @generated
	 */
	EOperation getStructure__GetEachNode();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Structure#getEachEdge() <em>Get Each Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Each Edge</em>' operation.
	 * @see ecore.org.graphstream.graph.Structure#getEachEdge()
	 * @generated
	 */
	EOperation getStructure__GetEachEdge();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Structure#getNodeSet() <em>Get Node Set</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Node Set</em>' operation.
	 * @see ecore.org.graphstream.graph.Structure#getNodeSet()
	 * @generated
	 */
	EOperation getStructure__GetNodeSet();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.Structure#getEdgeSet() <em>Get Edge Set</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Edge Set</em>' operation.
	 * @see ecore.org.graphstream.graph.Structure#getEdgeSet()
	 * @generated
	 */
	EOperation getStructure__GetEdgeSet();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GraphFactoryOld getGraphFactory();

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
		 * The meta object literal for the '{@link ecore.org.graphstream.graph.Edge <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.org.graphstream.graph.Edge
		 * @see ecore.org.graphstream.graph.impl.GraphPackageImpl#getEdge()
		 * @generated
		 */
		EClass EDGE = eINSTANCE.getEdge();

		/**
		 * The meta object literal for the '<em><b>Is Directed</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EDGE___IS_DIRECTED = eINSTANCE.getEdge__IsDirected();

		/**
		 * The meta object literal for the '<em><b>Is Loop</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EDGE___IS_LOOP = eINSTANCE.getEdge__IsLoop();

		/**
		 * The meta object literal for the '<em><b>Get Node0</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EDGE___GET_NODE0 = eINSTANCE.getEdge__GetNode0();

		/**
		 * The meta object literal for the '<em><b>Get Node1</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EDGE___GET_NODE1 = eINSTANCE.getEdge__GetNode1();

		/**
		 * The meta object literal for the '<em><b>Get Source Node</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EDGE___GET_SOURCE_NODE = eINSTANCE.getEdge__GetSourceNode();

		/**
		 * The meta object literal for the '<em><b>Get Target Node</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EDGE___GET_TARGET_NODE = eINSTANCE.getEdge__GetTargetNode();

		/**
		 * The meta object literal for the '<em><b>Get Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EDGE___GET_OPPOSITE__NODE = eINSTANCE.getEdge__GetOpposite__Node();

		/**
		 * The meta object literal for the '{@link ecore.org.graphstream.graph.Element <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.org.graphstream.graph.Element
		 * @see ecore.org.graphstream.graph.impl.GraphPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Get Id</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___GET_ID = eINSTANCE.getElement__GetId();

		/**
		 * The meta object literal for the '<em><b>Get Index</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___GET_INDEX = eINSTANCE.getElement__GetIndex();

		/**
		 * The meta object literal for the '<em><b>Get Attribute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___GET_ATTRIBUTE__STRING = eINSTANCE.getElement__GetAttribute__String();

		/**
		 * The meta object literal for the '<em><b>Get First Attribute Of</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___GET_FIRST_ATTRIBUTE_OF__STRING = eINSTANCE.getElement__GetFirstAttributeOf__String();

		/**
		 * The meta object literal for the '<em><b>Get Attribute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___GET_ATTRIBUTE__STRING_CLASS = eINSTANCE.getElement__GetAttribute__String_Class();

		/**
		 * The meta object literal for the '<em><b>Get First Attribute Of</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___GET_FIRST_ATTRIBUTE_OF__CLASS_STRING = eINSTANCE.getElement__GetFirstAttributeOf__Class_String();

		/**
		 * The meta object literal for the '<em><b>Get Label</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___GET_LABEL__STRING = eINSTANCE.getElement__GetLabel__String();

		/**
		 * The meta object literal for the '<em><b>Get Number</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___GET_NUMBER__STRING = eINSTANCE.getElement__GetNumber__String();

		/**
		 * The meta object literal for the '<em><b>Get Vector</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___GET_VECTOR__STRING = eINSTANCE.getElement__GetVector__String();

		/**
		 * The meta object literal for the '<em><b>Get Array</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___GET_ARRAY__STRING = eINSTANCE.getElement__GetArray__String();

		/**
		 * The meta object literal for the '<em><b>Get Hash</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___GET_HASH__STRING = eINSTANCE.getElement__GetHash__String();

		/**
		 * The meta object literal for the '<em><b>Has Attribute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___HAS_ATTRIBUTE__STRING = eINSTANCE.getElement__HasAttribute__String();

		/**
		 * The meta object literal for the '<em><b>Has Attribute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___HAS_ATTRIBUTE__STRING_CLASS = eINSTANCE.getElement__HasAttribute__String_Class();

		/**
		 * The meta object literal for the '<em><b>Has Label</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___HAS_LABEL__STRING = eINSTANCE.getElement__HasLabel__String();

		/**
		 * The meta object literal for the '<em><b>Has Number</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___HAS_NUMBER__STRING = eINSTANCE.getElement__HasNumber__String();

		/**
		 * The meta object literal for the '<em><b>Has Vector</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___HAS_VECTOR__STRING = eINSTANCE.getElement__HasVector__String();

		/**
		 * The meta object literal for the '<em><b>Has Array</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___HAS_ARRAY__STRING = eINSTANCE.getElement__HasArray__String();

		/**
		 * The meta object literal for the '<em><b>Has Hash</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___HAS_HASH__STRING = eINSTANCE.getElement__HasHash__String();

		/**
		 * The meta object literal for the '<em><b>Get Attribute Key Iterator</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___GET_ATTRIBUTE_KEY_ITERATOR = eINSTANCE.getElement__GetAttributeKeyIterator();

		/**
		 * The meta object literal for the '<em><b>Get Each Attribute Key</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___GET_EACH_ATTRIBUTE_KEY = eINSTANCE.getElement__GetEachAttributeKey();

		/**
		 * The meta object literal for the '<em><b>Get Attribute Key Set</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___GET_ATTRIBUTE_KEY_SET = eINSTANCE.getElement__GetAttributeKeySet();

		/**
		 * The meta object literal for the '<em><b>Clear Attributes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___CLEAR_ATTRIBUTES = eINSTANCE.getElement__ClearAttributes();

		/**
		 * The meta object literal for the '<em><b>Add Attribute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___ADD_ATTRIBUTE__STRING_OBJECT = eINSTANCE.getElement__AddAttribute__String_Object();

		/**
		 * The meta object literal for the '<em><b>Change Attribute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___CHANGE_ATTRIBUTE__STRING_OBJECT = eINSTANCE.getElement__ChangeAttribute__String_Object();

		/**
		 * The meta object literal for the '<em><b>Set Attribute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___SET_ATTRIBUTE__STRING_OBJECT = eINSTANCE.getElement__SetAttribute__String_Object();

		/**
		 * The meta object literal for the '<em><b>Add Attributes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___ADD_ATTRIBUTES__MAP = eINSTANCE.getElement__AddAttributes__Map();

		/**
		 * The meta object literal for the '<em><b>Remove Attribute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___REMOVE_ATTRIBUTE__STRING = eINSTANCE.getElement__RemoveAttribute__String();

		/**
		 * The meta object literal for the '<em><b>Get Attribute Count</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___GET_ATTRIBUTE_COUNT = eINSTANCE.getElement__GetAttributeCount();

		/**
		 * The meta object literal for the '{@link ecore.org.graphstream.graph.Graph <em>Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.org.graphstream.graph.Graph
		 * @see ecore.org.graphstream.graph.impl.GraphPackageImpl#getGraph()
		 * @generated
		 */
		EClass GRAPH = eINSTANCE.getGraph();

		/**
		 * The meta object literal for the '<em><b>Get Node</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___GET_NODE__STRING = eINSTANCE.getGraph__GetNode__String();

		/**
		 * The meta object literal for the '<em><b>Get Edge</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___GET_EDGE__STRING = eINSTANCE.getGraph__GetEdge__String();

		/**
		 * The meta object literal for the '<em><b>Node Factory</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___NODE_FACTORY = eINSTANCE.getGraph__NodeFactory();

		/**
		 * The meta object literal for the '<em><b>Edge Factory</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___EDGE_FACTORY = eINSTANCE.getGraph__EdgeFactory();

		/**
		 * The meta object literal for the '<em><b>Is Strict</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___IS_STRICT = eINSTANCE.getGraph__IsStrict();

		/**
		 * The meta object literal for the '<em><b>Is Auto Creation Enabled</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___IS_AUTO_CREATION_ENABLED = eINSTANCE.getGraph__IsAutoCreationEnabled();

		/**
		 * The meta object literal for the '<em><b>Null Attributes Are Errors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___NULL_ATTRIBUTES_ARE_ERRORS = eINSTANCE.getGraph__NullAttributesAreErrors();

		/**
		 * The meta object literal for the '<em><b>Get Step</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___GET_STEP = eINSTANCE.getGraph__GetStep();

		/**
		 * The meta object literal for the '<em><b>Set Null Attributes Are Errors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___SET_NULL_ATTRIBUTES_ARE_ERRORS__BOOLEAN = eINSTANCE.getGraph__SetNullAttributesAreErrors__boolean();

		/**
		 * The meta object literal for the '<em><b>Set Node Factory</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___SET_NODE_FACTORY__NODEFACTORY = eINSTANCE.getGraph__SetNodeFactory__NodeFactory();

		/**
		 * The meta object literal for the '<em><b>Set Edge Factory</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___SET_EDGE_FACTORY__EDGEFACTORY = eINSTANCE.getGraph__SetEdgeFactory__EdgeFactory();

		/**
		 * The meta object literal for the '<em><b>Set Strict</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___SET_STRICT__BOOLEAN = eINSTANCE.getGraph__SetStrict__boolean();

		/**
		 * The meta object literal for the '<em><b>Set Auto Create</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___SET_AUTO_CREATE__BOOLEAN = eINSTANCE.getGraph__SetAutoCreate__boolean();

		/**
		 * The meta object literal for the '<em><b>Clear</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___CLEAR = eINSTANCE.getGraph__Clear();

		/**
		 * The meta object literal for the '<em><b>Add Node</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___ADD_NODE__STRING = eINSTANCE.getGraph__AddNode__String();

		/**
		 * The meta object literal for the '<em><b>Remove Node</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___REMOVE_NODE__STRING = eINSTANCE.getGraph__RemoveNode__String();

		/**
		 * The meta object literal for the '<em><b>Add Edge</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___ADD_EDGE__STRING_STRING_STRING = eINSTANCE.getGraph__AddEdge__String_String_String();

		/**
		 * The meta object literal for the '<em><b>Add Edge</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___ADD_EDGE__STRING_STRING_STRING_BOOLEAN = eINSTANCE.getGraph__AddEdge__String_String_String_boolean();

		/**
		 * The meta object literal for the '<em><b>Remove Edge</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___REMOVE_EDGE__STRING_STRING = eINSTANCE.getGraph__RemoveEdge__String_String();

		/**
		 * The meta object literal for the '<em><b>Remove Edge</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___REMOVE_EDGE__STRING = eINSTANCE.getGraph__RemoveEdge__String();

		/**
		 * The meta object literal for the '<em><b>Step Begins</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___STEP_BEGINS__DOUBLE = eINSTANCE.getGraph__StepBegins__double();

		/**
		 * The meta object literal for the '<em><b>Attribute Sinks</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___ATTRIBUTE_SINKS = eINSTANCE.getGraph__AttributeSinks();

		/**
		 * The meta object literal for the '<em><b>Element Sinks</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___ELEMENT_SINKS = eINSTANCE.getGraph__ElementSinks();

		/**
		 * The meta object literal for the '<em><b>Read</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___READ__STRING = eINSTANCE.getGraph__Read__String();

		/**
		 * The meta object literal for the '<em><b>Read</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___READ__FILESOURCE_STRING = eINSTANCE.getGraph__Read__FileSource_String();

		/**
		 * The meta object literal for the '<em><b>Write</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___WRITE__STRING = eINSTANCE.getGraph__Write__String();

		/**
		 * The meta object literal for the '<em><b>Write</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___WRITE__FILESINK_STRING = eINSTANCE.getGraph__Write__FileSink_String();

		/**
		 * The meta object literal for the '<em><b>Display</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___DISPLAY = eINSTANCE.getGraph__Display();

		/**
		 * The meta object literal for the '<em><b>Display</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___DISPLAY__BOOLEAN = eINSTANCE.getGraph__Display__boolean();

		/**
		 * The meta object literal for the '<em><b>Get Node</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___GET_NODE__INT = eINSTANCE.getGraph__GetNode__int();

		/**
		 * The meta object literal for the '<em><b>Get Edge</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___GET_EDGE__INT = eINSTANCE.getGraph__GetEdge__int();

		/**
		 * The meta object literal for the '<em><b>Add Edge</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___ADD_EDGE__STRING_INT_INT = eINSTANCE.getGraph__AddEdge__String_int_int();

		/**
		 * The meta object literal for the '<em><b>Add Edge</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___ADD_EDGE__STRING_INT_INT_BOOLEAN = eINSTANCE.getGraph__AddEdge__String_int_int_boolean();

		/**
		 * The meta object literal for the '<em><b>Add Edge</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___ADD_EDGE__STRING_NODE_NODE = eINSTANCE.getGraph__AddEdge__String_Node_Node();

		/**
		 * The meta object literal for the '<em><b>Add Edge</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___ADD_EDGE__STRING_NODE_NODE_BOOLEAN = eINSTANCE.getGraph__AddEdge__String_Node_Node_boolean();

		/**
		 * The meta object literal for the '<em><b>Remove Edge</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___REMOVE_EDGE__INT = eINSTANCE.getGraph__RemoveEdge__int();

		/**
		 * The meta object literal for the '<em><b>Remove Edge</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___REMOVE_EDGE__INT_INT = eINSTANCE.getGraph__RemoveEdge__int_int();

		/**
		 * The meta object literal for the '<em><b>Remove Edge</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___REMOVE_EDGE__NODE_NODE = eINSTANCE.getGraph__RemoveEdge__Node_Node();

		/**
		 * The meta object literal for the '<em><b>Remove Edge</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___REMOVE_EDGE__EDGE = eINSTANCE.getGraph__RemoveEdge__Edge();

		/**
		 * The meta object literal for the '<em><b>Remove Node</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___REMOVE_NODE__INT = eINSTANCE.getGraph__RemoveNode__int();

		/**
		 * The meta object literal for the '<em><b>Remove Node</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___REMOVE_NODE__NODE = eINSTANCE.getGraph__RemoveNode__Node();

		/**
		 * The meta object literal for the '{@link ecore.org.graphstream.graph.Node <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.org.graphstream.graph.Node
		 * @see ecore.org.graphstream.graph.impl.GraphPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Get Graph</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___GET_GRAPH = eINSTANCE.getNode__GetGraph();

		/**
		 * The meta object literal for the '<em><b>Get Degree</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___GET_DEGREE = eINSTANCE.getNode__GetDegree();

		/**
		 * The meta object literal for the '<em><b>Get Out Degree</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___GET_OUT_DEGREE = eINSTANCE.getNode__GetOutDegree();

		/**
		 * The meta object literal for the '<em><b>Get In Degree</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___GET_IN_DEGREE = eINSTANCE.getNode__GetInDegree();

		/**
		 * The meta object literal for the '<em><b>Has Edge Toward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___HAS_EDGE_TOWARD__STRING = eINSTANCE.getNode__HasEdgeToward__String();

		/**
		 * The meta object literal for the '<em><b>Has Edge From</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___HAS_EDGE_FROM__STRING = eINSTANCE.getNode__HasEdgeFrom__String();

		/**
		 * The meta object literal for the '<em><b>Has Edge Between</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___HAS_EDGE_BETWEEN__STRING = eINSTANCE.getNode__HasEdgeBetween__String();

		/**
		 * The meta object literal for the '<em><b>Get Edge Toward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___GET_EDGE_TOWARD__STRING = eINSTANCE.getNode__GetEdgeToward__String();

		/**
		 * The meta object literal for the '<em><b>Get Edge From</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___GET_EDGE_FROM__STRING = eINSTANCE.getNode__GetEdgeFrom__String();

		/**
		 * The meta object literal for the '<em><b>Get Edge Between</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___GET_EDGE_BETWEEN__STRING = eINSTANCE.getNode__GetEdgeBetween__String();

		/**
		 * The meta object literal for the '<em><b>Get Edge Iterator</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___GET_EDGE_ITERATOR = eINSTANCE.getNode__GetEdgeIterator();

		/**
		 * The meta object literal for the '<em><b>Get Entering Edge Iterator</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___GET_ENTERING_EDGE_ITERATOR = eINSTANCE.getNode__GetEnteringEdgeIterator();

		/**
		 * The meta object literal for the '<em><b>Get Leaving Edge Iterator</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___GET_LEAVING_EDGE_ITERATOR = eINSTANCE.getNode__GetLeavingEdgeIterator();

		/**
		 * The meta object literal for the '<em><b>Get Neighbor Node Iterator</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___GET_NEIGHBOR_NODE_ITERATOR = eINSTANCE.getNode__GetNeighborNodeIterator();

		/**
		 * The meta object literal for the '<em><b>Get Edge</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___GET_EDGE__INT = eINSTANCE.getNode__GetEdge__int();

		/**
		 * The meta object literal for the '<em><b>Get Entering Edge</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___GET_ENTERING_EDGE__INT = eINSTANCE.getNode__GetEnteringEdge__int();

		/**
		 * The meta object literal for the '<em><b>Get Leaving Edge</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___GET_LEAVING_EDGE__INT = eINSTANCE.getNode__GetLeavingEdge__int();

		/**
		 * The meta object literal for the '<em><b>Get Breadth First Iterator</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___GET_BREADTH_FIRST_ITERATOR = eINSTANCE.getNode__GetBreadthFirstIterator();

		/**
		 * The meta object literal for the '<em><b>Get Breadth First Iterator</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___GET_BREADTH_FIRST_ITERATOR__BOOLEAN = eINSTANCE.getNode__GetBreadthFirstIterator__boolean();

		/**
		 * The meta object literal for the '<em><b>Get Depth First Iterator</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___GET_DEPTH_FIRST_ITERATOR = eINSTANCE.getNode__GetDepthFirstIterator();

		/**
		 * The meta object literal for the '<em><b>Get Depth First Iterator</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___GET_DEPTH_FIRST_ITERATOR__BOOLEAN = eINSTANCE.getNode__GetDepthFirstIterator__boolean();

		/**
		 * The meta object literal for the '<em><b>Get Each Edge</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___GET_EACH_EDGE = eINSTANCE.getNode__GetEachEdge();

		/**
		 * The meta object literal for the '<em><b>Get Each Leaving Edge</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___GET_EACH_LEAVING_EDGE = eINSTANCE.getNode__GetEachLeavingEdge();

		/**
		 * The meta object literal for the '<em><b>Get Each Entering Edge</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___GET_EACH_ENTERING_EDGE = eINSTANCE.getNode__GetEachEnteringEdge();

		/**
		 * The meta object literal for the '<em><b>Get Edge Set</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___GET_EDGE_SET = eINSTANCE.getNode__GetEdgeSet();

		/**
		 * The meta object literal for the '<em><b>Get Leaving Edge Set</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___GET_LEAVING_EDGE_SET = eINSTANCE.getNode__GetLeavingEdgeSet();

		/**
		 * The meta object literal for the '<em><b>Get Entering Edge Set</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___GET_ENTERING_EDGE_SET = eINSTANCE.getNode__GetEnteringEdgeSet();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___TO_STRING = eINSTANCE.getNode__ToString();

		/**
		 * The meta object literal for the '<em><b>Has Edge Toward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___HAS_EDGE_TOWARD__NODE = eINSTANCE.getNode__HasEdgeToward__Node();

		/**
		 * The meta object literal for the '<em><b>Has Edge Toward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___HAS_EDGE_TOWARD__INT = eINSTANCE.getNode__HasEdgeToward__int();

		/**
		 * The meta object literal for the '<em><b>Has Edge From</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___HAS_EDGE_FROM__NODE = eINSTANCE.getNode__HasEdgeFrom__Node();

		/**
		 * The meta object literal for the '<em><b>Has Edge From</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___HAS_EDGE_FROM__INT = eINSTANCE.getNode__HasEdgeFrom__int();

		/**
		 * The meta object literal for the '<em><b>Has Edge Between</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___HAS_EDGE_BETWEEN__NODE = eINSTANCE.getNode__HasEdgeBetween__Node();

		/**
		 * The meta object literal for the '<em><b>Has Edge Between</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___HAS_EDGE_BETWEEN__INT = eINSTANCE.getNode__HasEdgeBetween__int();

		/**
		 * The meta object literal for the '<em><b>Get Edge Toward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___GET_EDGE_TOWARD__NODE = eINSTANCE.getNode__GetEdgeToward__Node();

		/**
		 * The meta object literal for the '<em><b>Get Edge Toward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___GET_EDGE_TOWARD__INT = eINSTANCE.getNode__GetEdgeToward__int();

		/**
		 * The meta object literal for the '<em><b>Get Edge From</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___GET_EDGE_FROM__NODE = eINSTANCE.getNode__GetEdgeFrom__Node();

		/**
		 * The meta object literal for the '<em><b>Get Edge From</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___GET_EDGE_FROM__INT = eINSTANCE.getNode__GetEdgeFrom__int();

		/**
		 * The meta object literal for the '<em><b>Get Edge Between</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___GET_EDGE_BETWEEN__NODE = eINSTANCE.getNode__GetEdgeBetween__Node();

		/**
		 * The meta object literal for the '<em><b>Get Edge Between</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___GET_EDGE_BETWEEN__INT = eINSTANCE.getNode__GetEdgeBetween__int();

		/**
		 * The meta object literal for the '{@link ecore.org.graphstream.graph.Structure <em>Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.org.graphstream.graph.Structure
		 * @see ecore.org.graphstream.graph.impl.GraphPackageImpl#getStructure()
		 * @generated
		 */
		EClass STRUCTURE = eINSTANCE.getStructure();

		/**
		 * The meta object literal for the '<em><b>Get Node Count</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRUCTURE___GET_NODE_COUNT = eINSTANCE.getStructure__GetNodeCount();

		/**
		 * The meta object literal for the '<em><b>Get Edge Count</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRUCTURE___GET_EDGE_COUNT = eINSTANCE.getStructure__GetEdgeCount();

		/**
		 * The meta object literal for the '<em><b>Get Node Iterator</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRUCTURE___GET_NODE_ITERATOR = eINSTANCE.getStructure__GetNodeIterator();

		/**
		 * The meta object literal for the '<em><b>Get Edge Iterator</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRUCTURE___GET_EDGE_ITERATOR = eINSTANCE.getStructure__GetEdgeIterator();

		/**
		 * The meta object literal for the '<em><b>Get Each Node</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRUCTURE___GET_EACH_NODE = eINSTANCE.getStructure__GetEachNode();

		/**
		 * The meta object literal for the '<em><b>Get Each Edge</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRUCTURE___GET_EACH_EDGE = eINSTANCE.getStructure__GetEachEdge();

		/**
		 * The meta object literal for the '<em><b>Get Node Set</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRUCTURE___GET_NODE_SET = eINSTANCE.getStructure__GetNodeSet();

		/**
		 * The meta object literal for the '<em><b>Get Edge Set</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRUCTURE___GET_EDGE_SET = eINSTANCE.getStructure__GetEdgeSet();

	}

} //GraphPackage
