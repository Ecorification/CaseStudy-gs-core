/**
 */
package ecore.org.graphstream.graph.implementations;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import ecore.org.graphstream.graph.GraphPackage;

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
 * @see ecore.org.graphstream.graph.implementations.ImplementationsFactoryOld
 * @model kind="package"
 * @generated
 */
public interface ImplementationsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "implementations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "CaseStudy-gs-core/ecore.org.graphstream.graph.implementations";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "implementations";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ImplementationsPackage eINSTANCE = ecore.org.graphstream.graph.implementations.impl.ImplementationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link ecore.org.graphstream.graph.implementations.impl.AbstractElementImpl <em>Abstract Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.org.graphstream.graph.implementations.impl.AbstractElementImpl
	 * @see ecore.org.graphstream.graph.implementations.impl.ImplementationsPackageImpl#getAbstractElement()
	 * @generated
	 */
	int ABSTRACT_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT__ID = GraphPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT__INDEX = GraphPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT__ATTRIBUTES = GraphPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attributes Being Removed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT__ATTRIBUTES_BEING_REMOVED = GraphPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Abstract Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT_FEATURE_COUNT = GraphPackage.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT___GET_ID = GraphPackage.ELEMENT___GET_ID;

	/**
	 * The operation id for the '<em>Get Index</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT___GET_INDEX = GraphPackage.ELEMENT___GET_INDEX;

	/**
	 * The operation id for the '<em>Get Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT___GET_ATTRIBUTE__STRING = GraphPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get First Attribute Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT___GET_FIRST_ATTRIBUTE_OF__STRING = GraphPackage.ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT___GET_ATTRIBUTE__STRING_CLASS = GraphPackage.ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get First Attribute Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT___GET_FIRST_ATTRIBUTE_OF__CLASS_STRING = GraphPackage.ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT___GET_LABEL__STRING = GraphPackage.ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT___GET_NUMBER__STRING = GraphPackage.ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Vector</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT___GET_VECTOR__STRING = GraphPackage.ELEMENT_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Array</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT___GET_ARRAY__STRING = GraphPackage.ELEMENT_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Hash</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT___GET_HASH__STRING = GraphPackage.ELEMENT_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Has Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT___HAS_ATTRIBUTE__STRING = GraphPackage.ELEMENT_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Has Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT___HAS_ATTRIBUTE__STRING_CLASS = GraphPackage.ELEMENT_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Has Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT___HAS_LABEL__STRING = GraphPackage.ELEMENT_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Has Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT___HAS_NUMBER__STRING = GraphPackage.ELEMENT_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Has Vector</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT___HAS_VECTOR__STRING = GraphPackage.ELEMENT_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Has Array</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT___HAS_ARRAY__STRING = GraphPackage.ELEMENT_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Has Hash</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT___HAS_HASH__STRING = GraphPackage.ELEMENT_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Get Attribute Key Iterator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT___GET_ATTRIBUTE_KEY_ITERATOR = GraphPackage.ELEMENT_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Get Each Attribute Key</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT___GET_EACH_ATTRIBUTE_KEY = GraphPackage.ELEMENT_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Get Attribute Key Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT___GET_ATTRIBUTE_KEY_SET = GraphPackage.ELEMENT_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT___TO_STRING = GraphPackage.ELEMENT_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Get Attribute Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT___GET_ATTRIBUTE_COUNT = GraphPackage.ELEMENT_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Clear Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT___CLEAR_ATTRIBUTES = GraphPackage.ELEMENT_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Add Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT___ADD_ATTRIBUTE__STRING_OBJECT = GraphPackage.ELEMENT_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Change Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT___CHANGE_ATTRIBUTE__STRING_OBJECT = GraphPackage.ELEMENT_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Set Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT___SET_ATTRIBUTE__STRING_OBJECT = GraphPackage.ELEMENT_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Add Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT___ADD_ATTRIBUTES__MAP = GraphPackage.ELEMENT_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Remove Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT___REMOVE_ATTRIBUTE__STRING = GraphPackage.ELEMENT_OPERATION_COUNT + 26;

	/**
	 * The number of operations of the '<em>Abstract Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT_OPERATION_COUNT = GraphPackage.ELEMENT_OPERATION_COUNT + 27;

	/**
	 * The meta object id for the '{@link ecore.org.graphstream.graph.implementations.impl.AbstractEdgeImpl <em>Abstract Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.org.graphstream.graph.implementations.impl.AbstractEdgeImpl
	 * @see ecore.org.graphstream.graph.implementations.impl.ImplementationsPackageImpl#getAbstractEdge()
	 * @generated
	 */
	int ABSTRACT_EDGE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EDGE__ID = ABSTRACT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EDGE__INDEX = ABSTRACT_ELEMENT__INDEX;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EDGE__ATTRIBUTES = ABSTRACT_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Attributes Being Removed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EDGE__ATTRIBUTES_BEING_REMOVED = ABSTRACT_ELEMENT__ATTRIBUTES_BEING_REMOVED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EDGE__SOURCE = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EDGE__TARGET = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Directed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EDGE__DIRECTED = ABSTRACT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EDGE__GRAPH = ABSTRACT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Abstract Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EDGE_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EDGE___GET_ID = ABSTRACT_ELEMENT___GET_ID;

	/**
	 * The operation id for the '<em>Get Index</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EDGE___GET_INDEX = ABSTRACT_ELEMENT___GET_INDEX;

	/**
	 * The operation id for the '<em>Get Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EDGE___GET_ATTRIBUTE__STRING = ABSTRACT_ELEMENT___GET_ATTRIBUTE__STRING;

	/**
	 * The operation id for the '<em>Get First Attribute Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EDGE___GET_FIRST_ATTRIBUTE_OF__STRING = ABSTRACT_ELEMENT___GET_FIRST_ATTRIBUTE_OF__STRING;

	/**
	 * The operation id for the '<em>Get Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EDGE___GET_ATTRIBUTE__STRING_CLASS = ABSTRACT_ELEMENT___GET_ATTRIBUTE__STRING_CLASS;

	/**
	 * The operation id for the '<em>Get First Attribute Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EDGE___GET_FIRST_ATTRIBUTE_OF__CLASS_STRING = ABSTRACT_ELEMENT___GET_FIRST_ATTRIBUTE_OF__CLASS_STRING;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EDGE___GET_LABEL__STRING = ABSTRACT_ELEMENT___GET_LABEL__STRING;

	/**
	 * The operation id for the '<em>Get Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EDGE___GET_NUMBER__STRING = ABSTRACT_ELEMENT___GET_NUMBER__STRING;

	/**
	 * The operation id for the '<em>Get Vector</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EDGE___GET_VECTOR__STRING = ABSTRACT_ELEMENT___GET_VECTOR__STRING;

	/**
	 * The operation id for the '<em>Get Array</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EDGE___GET_ARRAY__STRING = ABSTRACT_ELEMENT___GET_ARRAY__STRING;

	/**
	 * The operation id for the '<em>Get Hash</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EDGE___GET_HASH__STRING = ABSTRACT_ELEMENT___GET_HASH__STRING;

	/**
	 * The operation id for the '<em>Has Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EDGE___HAS_ATTRIBUTE__STRING = ABSTRACT_ELEMENT___HAS_ATTRIBUTE__STRING;

	/**
	 * The operation id for the '<em>Has Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EDGE___HAS_ATTRIBUTE__STRING_CLASS = ABSTRACT_ELEMENT___HAS_ATTRIBUTE__STRING_CLASS;

	/**
	 * The operation id for the '<em>Has Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EDGE___HAS_LABEL__STRING = ABSTRACT_ELEMENT___HAS_LABEL__STRING;

	/**
	 * The operation id for the '<em>Has Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EDGE___HAS_NUMBER__STRING = ABSTRACT_ELEMENT___HAS_NUMBER__STRING;

	/**
	 * The operation id for the '<em>Has Vector</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EDGE___HAS_VECTOR__STRING = ABSTRACT_ELEMENT___HAS_VECTOR__STRING;

	/**
	 * The operation id for the '<em>Has Array</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EDGE___HAS_ARRAY__STRING = ABSTRACT_ELEMENT___HAS_ARRAY__STRING;

	/**
	 * The operation id for the '<em>Has Hash</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EDGE___HAS_HASH__STRING = ABSTRACT_ELEMENT___HAS_HASH__STRING;

	/**
	 * The operation id for the '<em>Get Attribute Key Iterator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EDGE___GET_ATTRIBUTE_KEY_ITERATOR = ABSTRACT_ELEMENT___GET_ATTRIBUTE_KEY_ITERATOR;

	/**
	 * The operation id for the '<em>Get Each Attribute Key</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EDGE___GET_EACH_ATTRIBUTE_KEY = ABSTRACT_ELEMENT___GET_EACH_ATTRIBUTE_KEY;

	/**
	 * The operation id for the '<em>Get Attribute Key Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EDGE___GET_ATTRIBUTE_KEY_SET = ABSTRACT_ELEMENT___GET_ATTRIBUTE_KEY_SET;

	/**
	 * The operation id for the '<em>Get Attribute Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EDGE___GET_ATTRIBUTE_COUNT = ABSTRACT_ELEMENT___GET_ATTRIBUTE_COUNT;

	/**
	 * The operation id for the '<em>Clear Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EDGE___CLEAR_ATTRIBUTES = ABSTRACT_ELEMENT___CLEAR_ATTRIBUTES;

	/**
	 * The operation id for the '<em>Add Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EDGE___ADD_ATTRIBUTE__STRING_OBJECT = ABSTRACT_ELEMENT___ADD_ATTRIBUTE__STRING_OBJECT;

	/**
	 * The operation id for the '<em>Change Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EDGE___CHANGE_ATTRIBUTE__STRING_OBJECT = ABSTRACT_ELEMENT___CHANGE_ATTRIBUTE__STRING_OBJECT;

	/**
	 * The operation id for the '<em>Set Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EDGE___SET_ATTRIBUTE__STRING_OBJECT = ABSTRACT_ELEMENT___SET_ATTRIBUTE__STRING_OBJECT;

	/**
	 * The operation id for the '<em>Add Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EDGE___ADD_ATTRIBUTES__MAP = ABSTRACT_ELEMENT___ADD_ATTRIBUTES__MAP;

	/**
	 * The operation id for the '<em>Remove Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EDGE___REMOVE_ATTRIBUTE__STRING = ABSTRACT_ELEMENT___REMOVE_ATTRIBUTE__STRING;

	/**
	 * The operation id for the '<em>Is Directed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EDGE___IS_DIRECTED = ABSTRACT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EDGE___TO_STRING = ABSTRACT_ELEMENT_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Node0</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EDGE___GET_NODE0 = ABSTRACT_ELEMENT_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Node1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EDGE___GET_NODE1 = ABSTRACT_ELEMENT_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EDGE___GET_OPPOSITE__NODE = ABSTRACT_ELEMENT_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Get Source Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EDGE___GET_SOURCE_NODE = ABSTRACT_ELEMENT_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Get Target Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EDGE___GET_TARGET_NODE = ABSTRACT_ELEMENT_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Is Loop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EDGE___IS_LOOP = ABSTRACT_ELEMENT_OPERATION_COUNT + 13;

	/**
	 * The number of operations of the '<em>Abstract Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EDGE_OPERATION_COUNT = ABSTRACT_ELEMENT_OPERATION_COUNT + 14;

	/**
	 * The meta object id for the '{@link ecore.org.graphstream.graph.implementations.impl.AbstractGraphImpl <em>Abstract Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.org.graphstream.graph.implementations.impl.AbstractGraphImpl
	 * @see ecore.org.graphstream.graph.implementations.impl.ImplementationsPackageImpl#getAbstractGraph()
	 * @generated
	 */
	int ABSTRACT_GRAPH = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH__ID = ABSTRACT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH__INDEX = ABSTRACT_ELEMENT__INDEX;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH__ATTRIBUTES = ABSTRACT_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Attributes Being Removed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH__ATTRIBUTES_BEING_REMOVED = ABSTRACT_ELEMENT__ATTRIBUTES_BEING_REMOVED;

	/**
	 * The feature id for the '<em><b>Strict Checking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH__STRICT_CHECKING = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Auto Create</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH__AUTO_CREATE = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Node Factory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH__NODE_FACTORY = ABSTRACT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Edge Factory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH__EDGE_FACTORY = ABSTRACT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH__STEP = ABSTRACT_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Null Attributes Are Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH__NULL_ATTRIBUTES_ARE_ERRORS = ABSTRACT_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Replay Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH__REPLAY_ID = ABSTRACT_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Abstract Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___GET_ID = ABSTRACT_ELEMENT___GET_ID;

	/**
	 * The operation id for the '<em>Get Index</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___GET_INDEX = ABSTRACT_ELEMENT___GET_INDEX;

	/**
	 * The operation id for the '<em>Get Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___GET_ATTRIBUTE__STRING = ABSTRACT_ELEMENT___GET_ATTRIBUTE__STRING;

	/**
	 * The operation id for the '<em>Get First Attribute Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___GET_FIRST_ATTRIBUTE_OF__STRING = ABSTRACT_ELEMENT___GET_FIRST_ATTRIBUTE_OF__STRING;

	/**
	 * The operation id for the '<em>Get Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___GET_ATTRIBUTE__STRING_CLASS = ABSTRACT_ELEMENT___GET_ATTRIBUTE__STRING_CLASS;

	/**
	 * The operation id for the '<em>Get First Attribute Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___GET_FIRST_ATTRIBUTE_OF__CLASS_STRING = ABSTRACT_ELEMENT___GET_FIRST_ATTRIBUTE_OF__CLASS_STRING;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___GET_LABEL__STRING = ABSTRACT_ELEMENT___GET_LABEL__STRING;

	/**
	 * The operation id for the '<em>Get Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___GET_NUMBER__STRING = ABSTRACT_ELEMENT___GET_NUMBER__STRING;

	/**
	 * The operation id for the '<em>Get Vector</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___GET_VECTOR__STRING = ABSTRACT_ELEMENT___GET_VECTOR__STRING;

	/**
	 * The operation id for the '<em>Get Array</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___GET_ARRAY__STRING = ABSTRACT_ELEMENT___GET_ARRAY__STRING;

	/**
	 * The operation id for the '<em>Get Hash</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___GET_HASH__STRING = ABSTRACT_ELEMENT___GET_HASH__STRING;

	/**
	 * The operation id for the '<em>Has Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___HAS_ATTRIBUTE__STRING = ABSTRACT_ELEMENT___HAS_ATTRIBUTE__STRING;

	/**
	 * The operation id for the '<em>Has Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___HAS_ATTRIBUTE__STRING_CLASS = ABSTRACT_ELEMENT___HAS_ATTRIBUTE__STRING_CLASS;

	/**
	 * The operation id for the '<em>Has Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___HAS_LABEL__STRING = ABSTRACT_ELEMENT___HAS_LABEL__STRING;

	/**
	 * The operation id for the '<em>Has Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___HAS_NUMBER__STRING = ABSTRACT_ELEMENT___HAS_NUMBER__STRING;

	/**
	 * The operation id for the '<em>Has Vector</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___HAS_VECTOR__STRING = ABSTRACT_ELEMENT___HAS_VECTOR__STRING;

	/**
	 * The operation id for the '<em>Has Array</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___HAS_ARRAY__STRING = ABSTRACT_ELEMENT___HAS_ARRAY__STRING;

	/**
	 * The operation id for the '<em>Has Hash</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___HAS_HASH__STRING = ABSTRACT_ELEMENT___HAS_HASH__STRING;

	/**
	 * The operation id for the '<em>Get Attribute Key Iterator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___GET_ATTRIBUTE_KEY_ITERATOR = ABSTRACT_ELEMENT___GET_ATTRIBUTE_KEY_ITERATOR;

	/**
	 * The operation id for the '<em>Get Each Attribute Key</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___GET_EACH_ATTRIBUTE_KEY = ABSTRACT_ELEMENT___GET_EACH_ATTRIBUTE_KEY;

	/**
	 * The operation id for the '<em>Get Attribute Key Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___GET_ATTRIBUTE_KEY_SET = ABSTRACT_ELEMENT___GET_ATTRIBUTE_KEY_SET;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___TO_STRING = ABSTRACT_ELEMENT___TO_STRING;

	/**
	 * The operation id for the '<em>Get Attribute Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___GET_ATTRIBUTE_COUNT = ABSTRACT_ELEMENT___GET_ATTRIBUTE_COUNT;

	/**
	 * The operation id for the '<em>Clear Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___CLEAR_ATTRIBUTES = ABSTRACT_ELEMENT___CLEAR_ATTRIBUTES;

	/**
	 * The operation id for the '<em>Add Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___ADD_ATTRIBUTE__STRING_OBJECT = ABSTRACT_ELEMENT___ADD_ATTRIBUTE__STRING_OBJECT;

	/**
	 * The operation id for the '<em>Change Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___CHANGE_ATTRIBUTE__STRING_OBJECT = ABSTRACT_ELEMENT___CHANGE_ATTRIBUTE__STRING_OBJECT;

	/**
	 * The operation id for the '<em>Set Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___SET_ATTRIBUTE__STRING_OBJECT = ABSTRACT_ELEMENT___SET_ATTRIBUTE__STRING_OBJECT;

	/**
	 * The operation id for the '<em>Add Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___ADD_ATTRIBUTES__MAP = ABSTRACT_ELEMENT___ADD_ATTRIBUTES__MAP;

	/**
	 * The operation id for the '<em>Remove Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___REMOVE_ATTRIBUTE__STRING = ABSTRACT_ELEMENT___REMOVE_ATTRIBUTE__STRING;

	/**
	 * The operation id for the '<em>Get Step</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___GET_STEP = ABSTRACT_ELEMENT_OPERATION_COUNT + 39;

	/**
	 * The operation id for the '<em>Set Null Attributes Are Errors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___SET_NULL_ATTRIBUTES_ARE_ERRORS__BOOLEAN = ABSTRACT_ELEMENT_OPERATION_COUNT + 40;

	/**
	 * The operation id for the '<em>Set Node Factory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___SET_NODE_FACTORY__NODEFACTORY = ABSTRACT_ELEMENT_OPERATION_COUNT + 41;

	/**
	 * The operation id for the '<em>Set Edge Factory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___SET_EDGE_FACTORY__EDGEFACTORY = ABSTRACT_ELEMENT_OPERATION_COUNT + 42;

	/**
	 * The operation id for the '<em>Set Auto Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___SET_AUTO_CREATE__BOOLEAN = ABSTRACT_ELEMENT_OPERATION_COUNT + 44;

	/**
	 * The operation id for the '<em>Null Attributes Are Errors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___NULL_ATTRIBUTES_ARE_ERRORS = ABSTRACT_ELEMENT_OPERATION_COUNT + 74;

	/**
	 * The operation id for the '<em>Get Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___GET_NODE__STRING = ABSTRACT_ELEMENT_OPERATION_COUNT + 75;

	/**
	 * The operation id for the '<em>Get Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___GET_NODE__INT = ABSTRACT_ELEMENT_OPERATION_COUNT + 76;

	/**
	 * The operation id for the '<em>Get Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___GET_EDGE__STRING = ABSTRACT_ELEMENT_OPERATION_COUNT + 77;

	/**
	 * The operation id for the '<em>Get Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___GET_EDGE__INT = ABSTRACT_ELEMENT_OPERATION_COUNT + 78;

	/**
	 * The operation id for the '<em>Get Node Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___GET_NODE_COUNT = ABSTRACT_ELEMENT_OPERATION_COUNT + 79;

	/**
	 * The operation id for the '<em>Get Edge Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___GET_EDGE_COUNT = ABSTRACT_ELEMENT_OPERATION_COUNT + 80;

	/**
	 * The operation id for the '<em>Get Node Iterator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___GET_NODE_ITERATOR = ABSTRACT_ELEMENT_OPERATION_COUNT + 81;

	/**
	 * The operation id for the '<em>Get Edge Iterator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___GET_EDGE_ITERATOR = ABSTRACT_ELEMENT_OPERATION_COUNT + 82;

	/**
	 * The operation id for the '<em>Get Each Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___GET_EACH_NODE = ABSTRACT_ELEMENT_OPERATION_COUNT + 83;

	/**
	 * The operation id for the '<em>Get Each Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___GET_EACH_EDGE = ABSTRACT_ELEMENT_OPERATION_COUNT + 84;

	/**
	 * The operation id for the '<em>Get Node Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___GET_NODE_SET = ABSTRACT_ELEMENT_OPERATION_COUNT + 85;

	/**
	 * The operation id for the '<em>Get Edge Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___GET_EDGE_SET = ABSTRACT_ELEMENT_OPERATION_COUNT + 86;

	/**
	 * The operation id for the '<em>Iterator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___ITERATOR = ABSTRACT_ELEMENT_OPERATION_COUNT + 87;

	/**
	 * The operation id for the '<em>Node Factory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___NODE_FACTORY = ABSTRACT_ELEMENT_OPERATION_COUNT + 88;

	/**
	 * The operation id for the '<em>Edge Factory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___EDGE_FACTORY = ABSTRACT_ELEMENT_OPERATION_COUNT + 89;

	/**
	 * The operation id for the '<em>Is Strict</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___IS_STRICT = ABSTRACT_ELEMENT_OPERATION_COUNT + 90;

	/**
	 * The operation id for the '<em>Is Auto Creation Enabled</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___IS_AUTO_CREATION_ENABLED = ABSTRACT_ELEMENT_OPERATION_COUNT + 91;

	/**
	 * The operation id for the '<em>Set Strict</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___SET_STRICT__BOOLEAN = ABSTRACT_ELEMENT_OPERATION_COUNT + 92;

	/**
	 * The operation id for the '<em>Step Begins</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___STEP_BEGINS__DOUBLE = ABSTRACT_ELEMENT_OPERATION_COUNT + 93;

	/**
	 * The operation id for the '<em>Clear</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___CLEAR = ABSTRACT_ELEMENT_OPERATION_COUNT + 94;

	/**
	 * The operation id for the '<em>Add Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___ADD_NODE__STRING = ABSTRACT_ELEMENT_OPERATION_COUNT + 95;

	/**
	 * The operation id for the '<em>Add Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___ADD_EDGE__STRING_STRING_STRING = ABSTRACT_ELEMENT_OPERATION_COUNT + 96;

	/**
	 * The operation id for the '<em>Add Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___ADD_EDGE__STRING_STRING_STRING_BOOLEAN = ABSTRACT_ELEMENT_OPERATION_COUNT + 97;

	/**
	 * The operation id for the '<em>Add Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___ADD_EDGE__STRING_INT_INT = ABSTRACT_ELEMENT_OPERATION_COUNT + 98;

	/**
	 * The operation id for the '<em>Add Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___ADD_EDGE__STRING_INT_INT_BOOLEAN = ABSTRACT_ELEMENT_OPERATION_COUNT + 99;

	/**
	 * The operation id for the '<em>Add Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___ADD_EDGE__STRING_NODE_NODE = ABSTRACT_ELEMENT_OPERATION_COUNT + 100;

	/**
	 * The operation id for the '<em>Add Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___ADD_EDGE__STRING_NODE_NODE_BOOLEAN = ABSTRACT_ELEMENT_OPERATION_COUNT + 101;

	/**
	 * The operation id for the '<em>Remove Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___REMOVE_NODE__STRING = ABSTRACT_ELEMENT_OPERATION_COUNT + 102;

	/**
	 * The operation id for the '<em>Remove Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___REMOVE_NODE__INT = ABSTRACT_ELEMENT_OPERATION_COUNT + 103;

	/**
	 * The operation id for the '<em>Remove Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___REMOVE_NODE__NODE = ABSTRACT_ELEMENT_OPERATION_COUNT + 104;

	/**
	 * The operation id for the '<em>Remove Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___REMOVE_EDGE__STRING = ABSTRACT_ELEMENT_OPERATION_COUNT + 105;

	/**
	 * The operation id for the '<em>Remove Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___REMOVE_EDGE__INT = ABSTRACT_ELEMENT_OPERATION_COUNT + 106;

	/**
	 * The operation id for the '<em>Remove Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___REMOVE_EDGE__EDGE = ABSTRACT_ELEMENT_OPERATION_COUNT + 107;

	/**
	 * The operation id for the '<em>Remove Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___REMOVE_EDGE__STRING_STRING = ABSTRACT_ELEMENT_OPERATION_COUNT + 108;

	/**
	 * The operation id for the '<em>Remove Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___REMOVE_EDGE__INT_INT = ABSTRACT_ELEMENT_OPERATION_COUNT + 109;

	/**
	 * The operation id for the '<em>Remove Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___REMOVE_EDGE__NODE_NODE = ABSTRACT_ELEMENT_OPERATION_COUNT + 110;

	/**
	 * The operation id for the '<em>Attribute Sinks</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___ATTRIBUTE_SINKS = ABSTRACT_ELEMENT_OPERATION_COUNT + 111;

	/**
	 * The operation id for the '<em>Element Sinks</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___ELEMENT_SINKS = ABSTRACT_ELEMENT_OPERATION_COUNT + 112;

	/**
	 * The operation id for the '<em>Add Attribute Sink</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___ADD_ATTRIBUTE_SINK__ATTRIBUTESINK = ABSTRACT_ELEMENT_OPERATION_COUNT + 113;

	/**
	 * The operation id for the '<em>Add Element Sink</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___ADD_ELEMENT_SINK__ELEMENTSINK = ABSTRACT_ELEMENT_OPERATION_COUNT + 114;

	/**
	 * The operation id for the '<em>Add Sink</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___ADD_SINK__SINK = ABSTRACT_ELEMENT_OPERATION_COUNT + 115;

	/**
	 * The operation id for the '<em>Clear Attribute Sinks</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___CLEAR_ATTRIBUTE_SINKS = ABSTRACT_ELEMENT_OPERATION_COUNT + 116;

	/**
	 * The operation id for the '<em>Clear Element Sinks</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___CLEAR_ELEMENT_SINKS = ABSTRACT_ELEMENT_OPERATION_COUNT + 117;

	/**
	 * The operation id for the '<em>Clear Sinks</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___CLEAR_SINKS = ABSTRACT_ELEMENT_OPERATION_COUNT + 118;

	/**
	 * The operation id for the '<em>Remove Attribute Sink</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___REMOVE_ATTRIBUTE_SINK__ATTRIBUTESINK = ABSTRACT_ELEMENT_OPERATION_COUNT + 119;

	/**
	 * The operation id for the '<em>Remove Element Sink</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___REMOVE_ELEMENT_SINK__ELEMENTSINK = ABSTRACT_ELEMENT_OPERATION_COUNT + 120;

	/**
	 * The operation id for the '<em>Remove Sink</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___REMOVE_SINK__SINK = ABSTRACT_ELEMENT_OPERATION_COUNT + 121;

	/**
	 * The operation id for the '<em>Edge Attribute Added</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___EDGE_ATTRIBUTE_ADDED__STRING_LONG_STRING_STRING_OBJECT = ABSTRACT_ELEMENT_OPERATION_COUNT + 122;

	/**
	 * The operation id for the '<em>Edge Attribute Changed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___EDGE_ATTRIBUTE_CHANGED__STRING_LONG_STRING_STRING_OBJECT_OBJECT = ABSTRACT_ELEMENT_OPERATION_COUNT + 123;

	/**
	 * The operation id for the '<em>Edge Attribute Removed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___EDGE_ATTRIBUTE_REMOVED__STRING_LONG_STRING_STRING = ABSTRACT_ELEMENT_OPERATION_COUNT + 124;

	/**
	 * The operation id for the '<em>Graph Attribute Added</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___GRAPH_ATTRIBUTE_ADDED__STRING_LONG_STRING_OBJECT = ABSTRACT_ELEMENT_OPERATION_COUNT + 125;

	/**
	 * The operation id for the '<em>Graph Attribute Changed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___GRAPH_ATTRIBUTE_CHANGED__STRING_LONG_STRING_OBJECT_OBJECT = ABSTRACT_ELEMENT_OPERATION_COUNT + 126;

	/**
	 * The operation id for the '<em>Graph Attribute Removed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___GRAPH_ATTRIBUTE_REMOVED__STRING_LONG_STRING = ABSTRACT_ELEMENT_OPERATION_COUNT + 127;

	/**
	 * The operation id for the '<em>Node Attribute Added</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___NODE_ATTRIBUTE_ADDED__STRING_LONG_STRING_STRING_OBJECT = ABSTRACT_ELEMENT_OPERATION_COUNT + 128;

	/**
	 * The operation id for the '<em>Node Attribute Changed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___NODE_ATTRIBUTE_CHANGED__STRING_LONG_STRING_STRING_OBJECT_OBJECT = ABSTRACT_ELEMENT_OPERATION_COUNT + 129;

	/**
	 * The operation id for the '<em>Node Attribute Removed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___NODE_ATTRIBUTE_REMOVED__STRING_LONG_STRING_STRING = ABSTRACT_ELEMENT_OPERATION_COUNT + 130;

	/**
	 * The operation id for the '<em>Edge Added</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___EDGE_ADDED__STRING_LONG_STRING_STRING_STRING_BOOLEAN = ABSTRACT_ELEMENT_OPERATION_COUNT + 131;

	/**
	 * The operation id for the '<em>Edge Removed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___EDGE_REMOVED__STRING_LONG_STRING = ABSTRACT_ELEMENT_OPERATION_COUNT + 132;

	/**
	 * The operation id for the '<em>Graph Cleared</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___GRAPH_CLEARED__STRING_LONG = ABSTRACT_ELEMENT_OPERATION_COUNT + 133;

	/**
	 * The operation id for the '<em>Node Added</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___NODE_ADDED__STRING_LONG_STRING = ABSTRACT_ELEMENT_OPERATION_COUNT + 134;

	/**
	 * The operation id for the '<em>Node Removed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___NODE_REMOVED__STRING_LONG_STRING = ABSTRACT_ELEMENT_OPERATION_COUNT + 135;

	/**
	 * The operation id for the '<em>Step Begins</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___STEP_BEGINS__STRING_LONG_DOUBLE = ABSTRACT_ELEMENT_OPERATION_COUNT + 136;

	/**
	 * The operation id for the '<em>Display</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___DISPLAY = ABSTRACT_ELEMENT_OPERATION_COUNT + 137;

	/**
	 * The operation id for the '<em>Display</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___DISPLAY__BOOLEAN = ABSTRACT_ELEMENT_OPERATION_COUNT + 138;

	/**
	 * The operation id for the '<em>Read</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___READ__FILESOURCE_STRING = ABSTRACT_ELEMENT_OPERATION_COUNT + 139;

	/**
	 * The operation id for the '<em>Read</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___READ__STRING = ABSTRACT_ELEMENT_OPERATION_COUNT + 140;

	/**
	 * The operation id for the '<em>Write</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___WRITE__FILESINK_STRING = ABSTRACT_ELEMENT_OPERATION_COUNT + 141;

	/**
	 * The operation id for the '<em>Write</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___WRITE__STRING = ABSTRACT_ELEMENT_OPERATION_COUNT + 142;

	/**
	 * The operation id for the '<em>Get Replay Controller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH___GET_REPLAY_CONTROLLER = ABSTRACT_ELEMENT_OPERATION_COUNT + 143;

	/**
	 * The number of operations of the '<em>Abstract Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GRAPH_OPERATION_COUNT = ABSTRACT_ELEMENT_OPERATION_COUNT + 144;

	/**
	 * The meta object id for the '{@link ecore.org.graphstream.graph.implementations.impl.AbstractNodeImpl <em>Abstract Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.org.graphstream.graph.implementations.impl.AbstractNodeImpl
	 * @see ecore.org.graphstream.graph.implementations.impl.ImplementationsPackageImpl#getAbstractNode()
	 * @generated
	 */
	int ABSTRACT_NODE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE__ID = ABSTRACT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE__INDEX = ABSTRACT_ELEMENT__INDEX;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE__ATTRIBUTES = ABSTRACT_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Attributes Being Removed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE__ATTRIBUTES_BEING_REMOVED = ABSTRACT_ELEMENT__ATTRIBUTES_BEING_REMOVED;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE__GRAPH = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE___GET_ID = ABSTRACT_ELEMENT___GET_ID;

	/**
	 * The operation id for the '<em>Get Index</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE___GET_INDEX = ABSTRACT_ELEMENT___GET_INDEX;

	/**
	 * The operation id for the '<em>Get Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE___GET_ATTRIBUTE__STRING = ABSTRACT_ELEMENT___GET_ATTRIBUTE__STRING;

	/**
	 * The operation id for the '<em>Get First Attribute Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE___GET_FIRST_ATTRIBUTE_OF__STRING = ABSTRACT_ELEMENT___GET_FIRST_ATTRIBUTE_OF__STRING;

	/**
	 * The operation id for the '<em>Get Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE___GET_ATTRIBUTE__STRING_CLASS = ABSTRACT_ELEMENT___GET_ATTRIBUTE__STRING_CLASS;

	/**
	 * The operation id for the '<em>Get First Attribute Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE___GET_FIRST_ATTRIBUTE_OF__CLASS_STRING = ABSTRACT_ELEMENT___GET_FIRST_ATTRIBUTE_OF__CLASS_STRING;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE___GET_LABEL__STRING = ABSTRACT_ELEMENT___GET_LABEL__STRING;

	/**
	 * The operation id for the '<em>Get Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE___GET_NUMBER__STRING = ABSTRACT_ELEMENT___GET_NUMBER__STRING;

	/**
	 * The operation id for the '<em>Get Vector</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE___GET_VECTOR__STRING = ABSTRACT_ELEMENT___GET_VECTOR__STRING;

	/**
	 * The operation id for the '<em>Get Array</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE___GET_ARRAY__STRING = ABSTRACT_ELEMENT___GET_ARRAY__STRING;

	/**
	 * The operation id for the '<em>Get Hash</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE___GET_HASH__STRING = ABSTRACT_ELEMENT___GET_HASH__STRING;

	/**
	 * The operation id for the '<em>Has Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE___HAS_ATTRIBUTE__STRING = ABSTRACT_ELEMENT___HAS_ATTRIBUTE__STRING;

	/**
	 * The operation id for the '<em>Has Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE___HAS_ATTRIBUTE__STRING_CLASS = ABSTRACT_ELEMENT___HAS_ATTRIBUTE__STRING_CLASS;

	/**
	 * The operation id for the '<em>Has Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE___HAS_LABEL__STRING = ABSTRACT_ELEMENT___HAS_LABEL__STRING;

	/**
	 * The operation id for the '<em>Has Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE___HAS_NUMBER__STRING = ABSTRACT_ELEMENT___HAS_NUMBER__STRING;

	/**
	 * The operation id for the '<em>Has Vector</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE___HAS_VECTOR__STRING = ABSTRACT_ELEMENT___HAS_VECTOR__STRING;

	/**
	 * The operation id for the '<em>Has Array</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE___HAS_ARRAY__STRING = ABSTRACT_ELEMENT___HAS_ARRAY__STRING;

	/**
	 * The operation id for the '<em>Has Hash</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE___HAS_HASH__STRING = ABSTRACT_ELEMENT___HAS_HASH__STRING;

	/**
	 * The operation id for the '<em>Get Attribute Key Iterator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE___GET_ATTRIBUTE_KEY_ITERATOR = ABSTRACT_ELEMENT___GET_ATTRIBUTE_KEY_ITERATOR;

	/**
	 * The operation id for the '<em>Get Each Attribute Key</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE___GET_EACH_ATTRIBUTE_KEY = ABSTRACT_ELEMENT___GET_EACH_ATTRIBUTE_KEY;

	/**
	 * The operation id for the '<em>Get Attribute Key Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE___GET_ATTRIBUTE_KEY_SET = ABSTRACT_ELEMENT___GET_ATTRIBUTE_KEY_SET;

	/**
	 * The operation id for the '<em>Get Attribute Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE___GET_ATTRIBUTE_COUNT = ABSTRACT_ELEMENT___GET_ATTRIBUTE_COUNT;

	/**
	 * The operation id for the '<em>Clear Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE___CLEAR_ATTRIBUTES = ABSTRACT_ELEMENT___CLEAR_ATTRIBUTES;

	/**
	 * The operation id for the '<em>Add Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE___ADD_ATTRIBUTE__STRING_OBJECT = ABSTRACT_ELEMENT___ADD_ATTRIBUTE__STRING_OBJECT;

	/**
	 * The operation id for the '<em>Change Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE___CHANGE_ATTRIBUTE__STRING_OBJECT = ABSTRACT_ELEMENT___CHANGE_ATTRIBUTE__STRING_OBJECT;

	/**
	 * The operation id for the '<em>Set Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE___SET_ATTRIBUTE__STRING_OBJECT = ABSTRACT_ELEMENT___SET_ATTRIBUTE__STRING_OBJECT;

	/**
	 * The operation id for the '<em>Add Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE___ADD_ATTRIBUTES__MAP = ABSTRACT_ELEMENT___ADD_ATTRIBUTES__MAP;

	/**
	 * The operation id for the '<em>Remove Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE___REMOVE_ATTRIBUTE__STRING = ABSTRACT_ELEMENT___REMOVE_ATTRIBUTE__STRING;

	/**
	 * The operation id for the '<em>Get Graph</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE___GET_GRAPH = ABSTRACT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE___TO_STRING = ABSTRACT_ELEMENT_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Get Degree</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE___GET_DEGREE = ABSTRACT_ELEMENT_OPERATION_COUNT + 40;

	/**
	 * The operation id for the '<em>Get In Degree</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE___GET_IN_DEGREE = ABSTRACT_ELEMENT_OPERATION_COUNT + 41;

	/**
	 * The operation id for the '<em>Get Out Degree</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE___GET_OUT_DEGREE = ABSTRACT_ELEMENT_OPERATION_COUNT + 42;

	/**
	 * The operation id for the '<em>Has Edge Toward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE___HAS_EDGE_TOWARD__NODE = ABSTRACT_ELEMENT_OPERATION_COUNT + 43;

	/**
	 * The operation id for the '<em>Has Edge Toward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE___HAS_EDGE_TOWARD__INT = ABSTRACT_ELEMENT_OPERATION_COUNT + 44;

	/**
	 * The operation id for the '<em>Has Edge Toward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE___HAS_EDGE_TOWARD__STRING = ABSTRACT_ELEMENT_OPERATION_COUNT + 45;

	/**
	 * The operation id for the '<em>Has Edge From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE___HAS_EDGE_FROM__NODE = ABSTRACT_ELEMENT_OPERATION_COUNT + 46;

	/**
	 * The operation id for the '<em>Has Edge From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE___HAS_EDGE_FROM__INT = ABSTRACT_ELEMENT_OPERATION_COUNT + 47;

	/**
	 * The operation id for the '<em>Has Edge From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE___HAS_EDGE_FROM__STRING = ABSTRACT_ELEMENT_OPERATION_COUNT + 48;

	/**
	 * The operation id for the '<em>Has Edge Between</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE___HAS_EDGE_BETWEEN__NODE = ABSTRACT_ELEMENT_OPERATION_COUNT + 49;

	/**
	 * The operation id for the '<em>Has Edge Between</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE___HAS_EDGE_BETWEEN__INT = ABSTRACT_ELEMENT_OPERATION_COUNT + 50;

	/**
	 * The operation id for the '<em>Has Edge Between</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE___HAS_EDGE_BETWEEN__STRING = ABSTRACT_ELEMENT_OPERATION_COUNT + 51;

	/**
	 * The operation id for the '<em>Get Edge Toward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE___GET_EDGE_TOWARD__NODE = ABSTRACT_ELEMENT_OPERATION_COUNT + 52;

	/**
	 * The operation id for the '<em>Get Edge Toward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE___GET_EDGE_TOWARD__INT = ABSTRACT_ELEMENT_OPERATION_COUNT + 53;

	/**
	 * The operation id for the '<em>Get Edge Toward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE___GET_EDGE_TOWARD__STRING = ABSTRACT_ELEMENT_OPERATION_COUNT + 54;

	/**
	 * The operation id for the '<em>Get Edge From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE___GET_EDGE_FROM__NODE = ABSTRACT_ELEMENT_OPERATION_COUNT + 55;

	/**
	 * The operation id for the '<em>Get Edge From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE___GET_EDGE_FROM__INT = ABSTRACT_ELEMENT_OPERATION_COUNT + 56;

	/**
	 * The operation id for the '<em>Get Edge From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE___GET_EDGE_FROM__STRING = ABSTRACT_ELEMENT_OPERATION_COUNT + 57;

	/**
	 * The operation id for the '<em>Get Edge Between</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE___GET_EDGE_BETWEEN__NODE = ABSTRACT_ELEMENT_OPERATION_COUNT + 58;

	/**
	 * The operation id for the '<em>Get Edge Between</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE___GET_EDGE_BETWEEN__INT = ABSTRACT_ELEMENT_OPERATION_COUNT + 59;

	/**
	 * The operation id for the '<em>Get Edge Between</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE___GET_EDGE_BETWEEN__STRING = ABSTRACT_ELEMENT_OPERATION_COUNT + 60;

	/**
	 * The operation id for the '<em>Get Edge Iterator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE___GET_EDGE_ITERATOR = ABSTRACT_ELEMENT_OPERATION_COUNT + 61;

	/**
	 * The operation id for the '<em>Get Entering Edge Iterator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE___GET_ENTERING_EDGE_ITERATOR = ABSTRACT_ELEMENT_OPERATION_COUNT + 62;

	/**
	 * The operation id for the '<em>Get Leaving Edge Iterator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE___GET_LEAVING_EDGE_ITERATOR = ABSTRACT_ELEMENT_OPERATION_COUNT + 63;

	/**
	 * The operation id for the '<em>Get Each Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE___GET_EACH_EDGE = ABSTRACT_ELEMENT_OPERATION_COUNT + 64;

	/**
	 * The operation id for the '<em>Get Each Entering Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE___GET_EACH_ENTERING_EDGE = ABSTRACT_ELEMENT_OPERATION_COUNT + 65;

	/**
	 * The operation id for the '<em>Get Each Leaving Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE___GET_EACH_LEAVING_EDGE = ABSTRACT_ELEMENT_OPERATION_COUNT + 66;

	/**
	 * The operation id for the '<em>Get Edge Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE___GET_EDGE_SET = ABSTRACT_ELEMENT_OPERATION_COUNT + 67;

	/**
	 * The operation id for the '<em>Get Entering Edge Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE___GET_ENTERING_EDGE_SET = ABSTRACT_ELEMENT_OPERATION_COUNT + 68;

	/**
	 * The operation id for the '<em>Get Leaving Edge Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE___GET_LEAVING_EDGE_SET = ABSTRACT_ELEMENT_OPERATION_COUNT + 69;

	/**
	 * The operation id for the '<em>Iterator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE___ITERATOR = ABSTRACT_ELEMENT_OPERATION_COUNT + 70;

	/**
	 * The operation id for the '<em>Get Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE___GET_EDGE__INT = ABSTRACT_ELEMENT_OPERATION_COUNT + 71;

	/**
	 * The operation id for the '<em>Get Entering Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE___GET_ENTERING_EDGE__INT = ABSTRACT_ELEMENT_OPERATION_COUNT + 72;

	/**
	 * The operation id for the '<em>Get Leaving Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE___GET_LEAVING_EDGE__INT = ABSTRACT_ELEMENT_OPERATION_COUNT + 73;

	/**
	 * The operation id for the '<em>Get Neighbor Node Iterator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE___GET_NEIGHBOR_NODE_ITERATOR = ABSTRACT_ELEMENT_OPERATION_COUNT + 74;

	/**
	 * The operation id for the '<em>Get Breadth First Iterator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE___GET_BREADTH_FIRST_ITERATOR = ABSTRACT_ELEMENT_OPERATION_COUNT + 75;

	/**
	 * The operation id for the '<em>Get Breadth First Iterator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE___GET_BREADTH_FIRST_ITERATOR__BOOLEAN = ABSTRACT_ELEMENT_OPERATION_COUNT + 76;

	/**
	 * The operation id for the '<em>Get Depth First Iterator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE___GET_DEPTH_FIRST_ITERATOR = ABSTRACT_ELEMENT_OPERATION_COUNT + 77;

	/**
	 * The operation id for the '<em>Get Depth First Iterator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE___GET_DEPTH_FIRST_ITERATOR__BOOLEAN = ABSTRACT_ELEMENT_OPERATION_COUNT + 78;

	/**
	 * The operation id for the '<em>Is Entering Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE___IS_ENTERING_EDGE__EDGE = ABSTRACT_ELEMENT_OPERATION_COUNT + 79;

	/**
	 * The operation id for the '<em>Is Leaving Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE___IS_LEAVING_EDGE__EDGE = ABSTRACT_ELEMENT_OPERATION_COUNT + 80;

	/**
	 * The operation id for the '<em>Is Incident Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE___IS_INCIDENT_EDGE__EDGE = ABSTRACT_ELEMENT_OPERATION_COUNT + 81;

	/**
	 * The number of operations of the '<em>Abstract Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE_OPERATION_COUNT = ABSTRACT_ELEMENT_OPERATION_COUNT + 82;


	/**
	 * Returns the meta object for class '{@link ecore.org.graphstream.graph.implementations.AbstractEdge <em>Abstract Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Edge</em>'.
	 * @see ecore.org.graphstream.graph.implementations.AbstractEdge
	 * @generated
	 */
	EClass getAbstractEdge();

	/**
	 * Returns the meta object for the reference '{@link ecore.org.graphstream.graph.implementations.AbstractEdge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ecore.org.graphstream.graph.implementations.AbstractEdge#getSource()
	 * @see #getAbstractEdge()
	 * @generated
	 */
	EReference getAbstractEdge_Source();

	/**
	 * Returns the meta object for the reference '{@link ecore.org.graphstream.graph.implementations.AbstractEdge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ecore.org.graphstream.graph.implementations.AbstractEdge#getTarget()
	 * @see #getAbstractEdge()
	 * @generated
	 */
	EReference getAbstractEdge_Target();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.graphstream.graph.implementations.AbstractEdge#isDirected <em>Directed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Directed</em>'.
	 * @see ecore.org.graphstream.graph.implementations.AbstractEdge#isDirected()
	 * @see #getAbstractEdge()
	 * @generated
	 */
	EAttribute getAbstractEdge_Directed();

	/**
	 * Returns the meta object for the reference '{@link ecore.org.graphstream.graph.implementations.AbstractEdge#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Graph</em>'.
	 * @see ecore.org.graphstream.graph.implementations.AbstractEdge#getGraph()
	 * @see #getAbstractEdge()
	 * @generated
	 */
	EReference getAbstractEdge_Graph();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractEdge#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractEdge#toString()
	 * @generated
	 */
	EOperation getAbstractEdge__ToString();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractEdge#getNode0() <em>Get Node0</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Node0</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractEdge#getNode0()
	 * @generated
	 */
	EOperation getAbstractEdge__GetNode0();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractEdge#getNode1() <em>Get Node1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Node1</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractEdge#getNode1()
	 * @generated
	 */
	EOperation getAbstractEdge__GetNode1();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractEdge#getOpposite(ecore.org.graphstream.graph.Node) <em>Get Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Opposite</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractEdge#getOpposite(ecore.org.graphstream.graph.Node)
	 * @generated
	 */
	EOperation getAbstractEdge__GetOpposite__Node();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractEdge#getSourceNode() <em>Get Source Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Source Node</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractEdge#getSourceNode()
	 * @generated
	 */
	EOperation getAbstractEdge__GetSourceNode();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractEdge#getTargetNode() <em>Get Target Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Target Node</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractEdge#getTargetNode()
	 * @generated
	 */
	EOperation getAbstractEdge__GetTargetNode();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractEdge#isLoop() <em>Is Loop</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Loop</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractEdge#isLoop()
	 * @generated
	 */
	EOperation getAbstractEdge__IsLoop();

	/**
	 * Returns the meta object for class '{@link ecore.org.graphstream.graph.implementations.AbstractElement <em>Abstract Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Element</em>'.
	 * @see ecore.org.graphstream.graph.implementations.AbstractElement
	 * @generated
	 */
	EClass getAbstractElement();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.graphstream.graph.implementations.AbstractElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see ecore.org.graphstream.graph.implementations.AbstractElement#getId()
	 * @see #getAbstractElement()
	 * @generated
	 */
	EAttribute getAbstractElement_Id();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.graphstream.graph.implementations.AbstractElement#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see ecore.org.graphstream.graph.implementations.AbstractElement#getIndex()
	 * @see #getAbstractElement()
	 * @generated
	 */
	EAttribute getAbstractElement_Index();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.graphstream.graph.implementations.AbstractElement#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attributes</em>'.
	 * @see ecore.org.graphstream.graph.implementations.AbstractElement#getAttributes()
	 * @see #getAbstractElement()
	 * @generated
	 */
	EAttribute getAbstractElement_Attributes();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.graphstream.graph.implementations.AbstractElement#getAttributesBeingRemoved <em>Attributes Being Removed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attributes Being Removed</em>'.
	 * @see ecore.org.graphstream.graph.implementations.AbstractElement#getAttributesBeingRemoved()
	 * @see #getAbstractElement()
	 * @generated
	 */
	EAttribute getAbstractElement_AttributesBeingRemoved();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractElement#getAttribute(java.lang.String) <em>Get Attribute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Attribute</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractElement#getAttribute(java.lang.String)
	 * @generated
	 */
	EOperation getAbstractElement__GetAttribute__String();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractElement#getFirstAttributeOf(java.lang.String[]) <em>Get First Attribute Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get First Attribute Of</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractElement#getFirstAttributeOf(java.lang.String[])
	 * @generated
	 */
	EOperation getAbstractElement__GetFirstAttributeOf__String();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractElement#getAttribute(java.lang.String, java.lang.Class) <em>Get Attribute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Attribute</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractElement#getAttribute(java.lang.String, java.lang.Class)
	 * @generated
	 */
	EOperation getAbstractElement__GetAttribute__String_Class();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractElement#getFirstAttributeOf(java.lang.Class, java.lang.String[]) <em>Get First Attribute Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get First Attribute Of</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractElement#getFirstAttributeOf(java.lang.Class, java.lang.String[])
	 * @generated
	 */
	EOperation getAbstractElement__GetFirstAttributeOf__Class_String();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractElement#getLabel(java.lang.String) <em>Get Label</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Label</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractElement#getLabel(java.lang.String)
	 * @generated
	 */
	EOperation getAbstractElement__GetLabel__String();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractElement#getNumber(java.lang.String) <em>Get Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Number</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractElement#getNumber(java.lang.String)
	 * @generated
	 */
	EOperation getAbstractElement__GetNumber__String();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractElement#getVector(java.lang.String) <em>Get Vector</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Vector</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractElement#getVector(java.lang.String)
	 * @generated
	 */
	EOperation getAbstractElement__GetVector__String();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractElement#getArray(java.lang.String) <em>Get Array</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Array</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractElement#getArray(java.lang.String)
	 * @generated
	 */
	EOperation getAbstractElement__GetArray__String();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractElement#getHash(java.lang.String) <em>Get Hash</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Hash</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractElement#getHash(java.lang.String)
	 * @generated
	 */
	EOperation getAbstractElement__GetHash__String();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractElement#hasAttribute(java.lang.String) <em>Has Attribute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Attribute</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractElement#hasAttribute(java.lang.String)
	 * @generated
	 */
	EOperation getAbstractElement__HasAttribute__String();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractElement#hasAttribute(java.lang.String, java.lang.Class) <em>Has Attribute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Attribute</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractElement#hasAttribute(java.lang.String, java.lang.Class)
	 * @generated
	 */
	EOperation getAbstractElement__HasAttribute__String_Class();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractElement#hasLabel(java.lang.String) <em>Has Label</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Label</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractElement#hasLabel(java.lang.String)
	 * @generated
	 */
	EOperation getAbstractElement__HasLabel__String();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractElement#hasNumber(java.lang.String) <em>Has Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Number</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractElement#hasNumber(java.lang.String)
	 * @generated
	 */
	EOperation getAbstractElement__HasNumber__String();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractElement#hasVector(java.lang.String) <em>Has Vector</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Vector</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractElement#hasVector(java.lang.String)
	 * @generated
	 */
	EOperation getAbstractElement__HasVector__String();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractElement#hasArray(java.lang.String) <em>Has Array</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Array</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractElement#hasArray(java.lang.String)
	 * @generated
	 */
	EOperation getAbstractElement__HasArray__String();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractElement#hasHash(java.lang.String) <em>Has Hash</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Hash</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractElement#hasHash(java.lang.String)
	 * @generated
	 */
	EOperation getAbstractElement__HasHash__String();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractElement#getAttributeKeyIterator() <em>Get Attribute Key Iterator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Attribute Key Iterator</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractElement#getAttributeKeyIterator()
	 * @generated
	 */
	EOperation getAbstractElement__GetAttributeKeyIterator();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractElement#getEachAttributeKey() <em>Get Each Attribute Key</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Each Attribute Key</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractElement#getEachAttributeKey()
	 * @generated
	 */
	EOperation getAbstractElement__GetEachAttributeKey();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractElement#getAttributeKeySet() <em>Get Attribute Key Set</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Attribute Key Set</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractElement#getAttributeKeySet()
	 * @generated
	 */
	EOperation getAbstractElement__GetAttributeKeySet();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractElement#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractElement#toString()
	 * @generated
	 */
	EOperation getAbstractElement__ToString();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractElement#getAttributeCount() <em>Get Attribute Count</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Attribute Count</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractElement#getAttributeCount()
	 * @generated
	 */
	EOperation getAbstractElement__GetAttributeCount();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractElement#clearAttributes() <em>Clear Attributes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clear Attributes</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractElement#clearAttributes()
	 * @generated
	 */
	EOperation getAbstractElement__ClearAttributes();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractElement#addAttribute(java.lang.String, java.lang.Object[]) <em>Add Attribute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Attribute</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractElement#addAttribute(java.lang.String, java.lang.Object[])
	 * @generated
	 */
	EOperation getAbstractElement__AddAttribute__String_Object();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractElement#changeAttribute(java.lang.String, java.lang.Object[]) <em>Change Attribute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Attribute</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractElement#changeAttribute(java.lang.String, java.lang.Object[])
	 * @generated
	 */
	EOperation getAbstractElement__ChangeAttribute__String_Object();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractElement#setAttribute(java.lang.String, java.lang.Object[]) <em>Set Attribute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Attribute</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractElement#setAttribute(java.lang.String, java.lang.Object[])
	 * @generated
	 */
	EOperation getAbstractElement__SetAttribute__String_Object();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractElement#addAttributes(java.util.Map) <em>Add Attributes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Attributes</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractElement#addAttributes(java.util.Map)
	 * @generated
	 */
	EOperation getAbstractElement__AddAttributes__Map();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractElement#removeAttribute(java.lang.String) <em>Remove Attribute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Attribute</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractElement#removeAttribute(java.lang.String)
	 * @generated
	 */
	EOperation getAbstractElement__RemoveAttribute__String();

	/**
	 * Returns the meta object for class '{@link ecore.org.graphstream.graph.implementations.AbstractGraph <em>Abstract Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Graph</em>'.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph
	 * @generated
	 */
	EClass getAbstractGraph();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#isStrictChecking <em>Strict Checking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strict Checking</em>'.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#isStrictChecking()
	 * @see #getAbstractGraph()
	 * @generated
	 */
	EAttribute getAbstractGraph_StrictChecking();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#isAutoCreate <em>Auto Create</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Create</em>'.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#isAutoCreate()
	 * @see #getAbstractGraph()
	 * @generated
	 */
	EAttribute getAbstractGraph_AutoCreate();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#getNodeFactory <em>Node Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Factory</em>'.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#getNodeFactory()
	 * @see #getAbstractGraph()
	 * @generated
	 */
	EAttribute getAbstractGraph_NodeFactory();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#getEdgeFactory <em>Edge Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edge Factory</em>'.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#getEdgeFactory()
	 * @see #getAbstractGraph()
	 * @generated
	 */
	EAttribute getAbstractGraph_EdgeFactory();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step</em>'.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#getStep()
	 * @see #getAbstractGraph()
	 * @generated
	 */
	EAttribute getAbstractGraph_Step();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#isNullAttributesAreErrors <em>Null Attributes Are Errors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Attributes Are Errors</em>'.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#isNullAttributesAreErrors()
	 * @see #getAbstractGraph()
	 * @generated
	 */
	EAttribute getAbstractGraph_NullAttributesAreErrors();

	/**
	 * Returns the meta object for the attribute '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#getReplayId <em>Replay Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replay Id</em>'.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#getReplayId()
	 * @see #getAbstractGraph()
	 * @generated
	 */
	EAttribute getAbstractGraph_ReplayId();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#nullAttributesAreErrors() <em>Null Attributes Are Errors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Null Attributes Are Errors</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#nullAttributesAreErrors()
	 * @generated
	 */
	EOperation getAbstractGraph__NullAttributesAreErrors();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#getNode(java.lang.String) <em>Get Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Node</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#getNode(java.lang.String)
	 * @generated
	 */
	EOperation getAbstractGraph__GetNode__String();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#getNode(int) <em>Get Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Node</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#getNode(int)
	 * @generated
	 */
	EOperation getAbstractGraph__GetNode__int();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#getEdge(java.lang.String) <em>Get Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Edge</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#getEdge(java.lang.String)
	 * @generated
	 */
	EOperation getAbstractGraph__GetEdge__String();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#getEdge(int) <em>Get Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Edge</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#getEdge(int)
	 * @generated
	 */
	EOperation getAbstractGraph__GetEdge__int();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#getNodeCount() <em>Get Node Count</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Node Count</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#getNodeCount()
	 * @generated
	 */
	EOperation getAbstractGraph__GetNodeCount();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#getEdgeCount() <em>Get Edge Count</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Edge Count</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#getEdgeCount()
	 * @generated
	 */
	EOperation getAbstractGraph__GetEdgeCount();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#getNodeIterator() <em>Get Node Iterator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Node Iterator</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#getNodeIterator()
	 * @generated
	 */
	EOperation getAbstractGraph__GetNodeIterator();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#getEdgeIterator() <em>Get Edge Iterator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Edge Iterator</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#getEdgeIterator()
	 * @generated
	 */
	EOperation getAbstractGraph__GetEdgeIterator();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#getEachNode() <em>Get Each Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Each Node</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#getEachNode()
	 * @generated
	 */
	EOperation getAbstractGraph__GetEachNode();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#getEachEdge() <em>Get Each Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Each Edge</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#getEachEdge()
	 * @generated
	 */
	EOperation getAbstractGraph__GetEachEdge();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#getNodeSet() <em>Get Node Set</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Node Set</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#getNodeSet()
	 * @generated
	 */
	EOperation getAbstractGraph__GetNodeSet();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#getEdgeSet() <em>Get Edge Set</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Edge Set</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#getEdgeSet()
	 * @generated
	 */
	EOperation getAbstractGraph__GetEdgeSet();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#iterator() <em>Iterator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Iterator</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#iterator()
	 * @generated
	 */
	EOperation getAbstractGraph__Iterator();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#nodeFactory() <em>Node Factory</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Node Factory</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#nodeFactory()
	 * @generated
	 */
	EOperation getAbstractGraph__NodeFactory();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#edgeFactory() <em>Edge Factory</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edge Factory</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#edgeFactory()
	 * @generated
	 */
	EOperation getAbstractGraph__EdgeFactory();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#isStrict() <em>Is Strict</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Strict</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#isStrict()
	 * @generated
	 */
	EOperation getAbstractGraph__IsStrict();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#isAutoCreationEnabled() <em>Is Auto Creation Enabled</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Auto Creation Enabled</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#isAutoCreationEnabled()
	 * @generated
	 */
	EOperation getAbstractGraph__IsAutoCreationEnabled();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#setStrict(boolean) <em>Set Strict</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Strict</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#setStrict(boolean)
	 * @generated
	 */
	EOperation getAbstractGraph__SetStrict__boolean();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#stepBegins(double) <em>Step Begins</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Step Begins</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#stepBegins(double)
	 * @generated
	 */
	EOperation getAbstractGraph__StepBegins__double();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#clear() <em>Clear</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clear</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#clear()
	 * @generated
	 */
	EOperation getAbstractGraph__Clear();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#addNode(java.lang.String) <em>Add Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Node</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#addNode(java.lang.String)
	 * @generated
	 */
	EOperation getAbstractGraph__AddNode__String();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#addEdge(java.lang.String, java.lang.String, java.lang.String) <em>Add Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Edge</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#addEdge(java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getAbstractGraph__AddEdge__String_String_String();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#addEdge(java.lang.String, java.lang.String, java.lang.String, boolean) <em>Add Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Edge</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#addEdge(java.lang.String, java.lang.String, java.lang.String, boolean)
	 * @generated
	 */
	EOperation getAbstractGraph__AddEdge__String_String_String_boolean();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#addEdge(java.lang.String, int, int) <em>Add Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Edge</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#addEdge(java.lang.String, int, int)
	 * @generated
	 */
	EOperation getAbstractGraph__AddEdge__String_int_int();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#addEdge(java.lang.String, int, int, boolean) <em>Add Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Edge</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#addEdge(java.lang.String, int, int, boolean)
	 * @generated
	 */
	EOperation getAbstractGraph__AddEdge__String_int_int_boolean();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#addEdge(java.lang.String, ecore.org.graphstream.graph.Node, ecore.org.graphstream.graph.Node) <em>Add Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Edge</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#addEdge(java.lang.String, ecore.org.graphstream.graph.Node, ecore.org.graphstream.graph.Node)
	 * @generated
	 */
	EOperation getAbstractGraph__AddEdge__String_Node_Node();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#addEdge(java.lang.String, ecore.org.graphstream.graph.Node, ecore.org.graphstream.graph.Node, boolean) <em>Add Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Edge</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#addEdge(java.lang.String, ecore.org.graphstream.graph.Node, ecore.org.graphstream.graph.Node, boolean)
	 * @generated
	 */
	EOperation getAbstractGraph__AddEdge__String_Node_Node_boolean();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#removeNode(java.lang.String) <em>Remove Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Node</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#removeNode(java.lang.String)
	 * @generated
	 */
	EOperation getAbstractGraph__RemoveNode__String();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#removeNode(int) <em>Remove Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Node</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#removeNode(int)
	 * @generated
	 */
	EOperation getAbstractGraph__RemoveNode__int();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#removeNode(ecore.org.graphstream.graph.Node) <em>Remove Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Node</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#removeNode(ecore.org.graphstream.graph.Node)
	 * @generated
	 */
	EOperation getAbstractGraph__RemoveNode__Node();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#removeEdge(java.lang.String) <em>Remove Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Edge</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#removeEdge(java.lang.String)
	 * @generated
	 */
	EOperation getAbstractGraph__RemoveEdge__String();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#removeEdge(int) <em>Remove Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Edge</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#removeEdge(int)
	 * @generated
	 */
	EOperation getAbstractGraph__RemoveEdge__int();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#removeEdge(ecore.org.graphstream.graph.Edge) <em>Remove Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Edge</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#removeEdge(ecore.org.graphstream.graph.Edge)
	 * @generated
	 */
	EOperation getAbstractGraph__RemoveEdge__Edge();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#removeEdge(java.lang.String, java.lang.String) <em>Remove Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Edge</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#removeEdge(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getAbstractGraph__RemoveEdge__String_String();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#removeEdge(int, int) <em>Remove Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Edge</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#removeEdge(int, int)
	 * @generated
	 */
	EOperation getAbstractGraph__RemoveEdge__int_int();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#removeEdge(ecore.org.graphstream.graph.Node, ecore.org.graphstream.graph.Node) <em>Remove Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Edge</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#removeEdge(ecore.org.graphstream.graph.Node, ecore.org.graphstream.graph.Node)
	 * @generated
	 */
	EOperation getAbstractGraph__RemoveEdge__Node_Node();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#attributeSinks() <em>Attribute Sinks</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Attribute Sinks</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#attributeSinks()
	 * @generated
	 */
	EOperation getAbstractGraph__AttributeSinks();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#elementSinks() <em>Element Sinks</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Element Sinks</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#elementSinks()
	 * @generated
	 */
	EOperation getAbstractGraph__ElementSinks();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#addAttributeSink(ecore.org.graphstream.stream.AttributeSink) <em>Add Attribute Sink</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Attribute Sink</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#addAttributeSink(ecore.org.graphstream.stream.AttributeSink)
	 * @generated
	 */
	EOperation getAbstractGraph__AddAttributeSink__AttributeSink();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#addElementSink(ecore.org.graphstream.stream.ElementSink) <em>Add Element Sink</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Element Sink</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#addElementSink(ecore.org.graphstream.stream.ElementSink)
	 * @generated
	 */
	EOperation getAbstractGraph__AddElementSink__ElementSink();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#addSink(ecore.org.graphstream.stream.Sink) <em>Add Sink</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Sink</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#addSink(ecore.org.graphstream.stream.Sink)
	 * @generated
	 */
	EOperation getAbstractGraph__AddSink__Sink();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#clearAttributeSinks() <em>Clear Attribute Sinks</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clear Attribute Sinks</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#clearAttributeSinks()
	 * @generated
	 */
	EOperation getAbstractGraph__ClearAttributeSinks();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#clearElementSinks() <em>Clear Element Sinks</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clear Element Sinks</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#clearElementSinks()
	 * @generated
	 */
	EOperation getAbstractGraph__ClearElementSinks();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#clearSinks() <em>Clear Sinks</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clear Sinks</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#clearSinks()
	 * @generated
	 */
	EOperation getAbstractGraph__ClearSinks();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#removeAttributeSink(ecore.org.graphstream.stream.AttributeSink) <em>Remove Attribute Sink</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Attribute Sink</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#removeAttributeSink(ecore.org.graphstream.stream.AttributeSink)
	 * @generated
	 */
	EOperation getAbstractGraph__RemoveAttributeSink__AttributeSink();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#removeElementSink(ecore.org.graphstream.stream.ElementSink) <em>Remove Element Sink</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Element Sink</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#removeElementSink(ecore.org.graphstream.stream.ElementSink)
	 * @generated
	 */
	EOperation getAbstractGraph__RemoveElementSink__ElementSink();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#removeSink(ecore.org.graphstream.stream.Sink) <em>Remove Sink</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Sink</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#removeSink(ecore.org.graphstream.stream.Sink)
	 * @generated
	 */
	EOperation getAbstractGraph__RemoveSink__Sink();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#edgeAttributeAdded(java.lang.String, long, java.lang.String, java.lang.String, java.lang.Object) <em>Edge Attribute Added</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edge Attribute Added</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#edgeAttributeAdded(java.lang.String, long, java.lang.String, java.lang.String, java.lang.Object)
	 * @generated
	 */
	EOperation getAbstractGraph__EdgeAttributeAdded__String_long_String_String_Object();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#edgeAttributeChanged(java.lang.String, long, java.lang.String, java.lang.String, java.lang.Object, java.lang.Object) <em>Edge Attribute Changed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edge Attribute Changed</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#edgeAttributeChanged(java.lang.String, long, java.lang.String, java.lang.String, java.lang.Object, java.lang.Object)
	 * @generated
	 */
	EOperation getAbstractGraph__EdgeAttributeChanged__String_long_String_String_Object_Object();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#edgeAttributeRemoved(java.lang.String, long, java.lang.String, java.lang.String) <em>Edge Attribute Removed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edge Attribute Removed</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#edgeAttributeRemoved(java.lang.String, long, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getAbstractGraph__EdgeAttributeRemoved__String_long_String_String();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#graphAttributeAdded(java.lang.String, long, java.lang.String, java.lang.Object) <em>Graph Attribute Added</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Graph Attribute Added</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#graphAttributeAdded(java.lang.String, long, java.lang.String, java.lang.Object)
	 * @generated
	 */
	EOperation getAbstractGraph__GraphAttributeAdded__String_long_String_Object();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#graphAttributeChanged(java.lang.String, long, java.lang.String, java.lang.Object, java.lang.Object) <em>Graph Attribute Changed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Graph Attribute Changed</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#graphAttributeChanged(java.lang.String, long, java.lang.String, java.lang.Object, java.lang.Object)
	 * @generated
	 */
	EOperation getAbstractGraph__GraphAttributeChanged__String_long_String_Object_Object();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#graphAttributeRemoved(java.lang.String, long, java.lang.String) <em>Graph Attribute Removed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Graph Attribute Removed</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#graphAttributeRemoved(java.lang.String, long, java.lang.String)
	 * @generated
	 */
	EOperation getAbstractGraph__GraphAttributeRemoved__String_long_String();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#nodeAttributeAdded(java.lang.String, long, java.lang.String, java.lang.String, java.lang.Object) <em>Node Attribute Added</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Node Attribute Added</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#nodeAttributeAdded(java.lang.String, long, java.lang.String, java.lang.String, java.lang.Object)
	 * @generated
	 */
	EOperation getAbstractGraph__NodeAttributeAdded__String_long_String_String_Object();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#nodeAttributeChanged(java.lang.String, long, java.lang.String, java.lang.String, java.lang.Object, java.lang.Object) <em>Node Attribute Changed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Node Attribute Changed</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#nodeAttributeChanged(java.lang.String, long, java.lang.String, java.lang.String, java.lang.Object, java.lang.Object)
	 * @generated
	 */
	EOperation getAbstractGraph__NodeAttributeChanged__String_long_String_String_Object_Object();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#nodeAttributeRemoved(java.lang.String, long, java.lang.String, java.lang.String) <em>Node Attribute Removed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Node Attribute Removed</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#nodeAttributeRemoved(java.lang.String, long, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getAbstractGraph__NodeAttributeRemoved__String_long_String_String();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#edgeAdded(java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, boolean) <em>Edge Added</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edge Added</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#edgeAdded(java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, boolean)
	 * @generated
	 */
	EOperation getAbstractGraph__EdgeAdded__String_long_String_String_String_boolean();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#edgeRemoved(java.lang.String, long, java.lang.String) <em>Edge Removed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edge Removed</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#edgeRemoved(java.lang.String, long, java.lang.String)
	 * @generated
	 */
	EOperation getAbstractGraph__EdgeRemoved__String_long_String();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#graphCleared(java.lang.String, long) <em>Graph Cleared</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Graph Cleared</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#graphCleared(java.lang.String, long)
	 * @generated
	 */
	EOperation getAbstractGraph__GraphCleared__String_long();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#nodeAdded(java.lang.String, long, java.lang.String) <em>Node Added</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Node Added</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#nodeAdded(java.lang.String, long, java.lang.String)
	 * @generated
	 */
	EOperation getAbstractGraph__NodeAdded__String_long_String();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#nodeRemoved(java.lang.String, long, java.lang.String) <em>Node Removed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Node Removed</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#nodeRemoved(java.lang.String, long, java.lang.String)
	 * @generated
	 */
	EOperation getAbstractGraph__NodeRemoved__String_long_String();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#stepBegins(java.lang.String, long, double) <em>Step Begins</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Step Begins</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#stepBegins(java.lang.String, long, double)
	 * @generated
	 */
	EOperation getAbstractGraph__StepBegins__String_long_double();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#display() <em>Display</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Display</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#display()
	 * @generated
	 */
	EOperation getAbstractGraph__Display();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#display(boolean) <em>Display</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Display</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#display(boolean)
	 * @generated
	 */
	EOperation getAbstractGraph__Display__boolean();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#read(org.graphstream.stream.file.FileSource, java.lang.String) <em>Read</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Read</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#read(org.graphstream.stream.file.FileSource, java.lang.String)
	 * @generated
	 */
	EOperation getAbstractGraph__Read__FileSource_String();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#read(java.lang.String) <em>Read</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Read</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#read(java.lang.String)
	 * @generated
	 */
	EOperation getAbstractGraph__Read__String();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#write(org.graphstream.stream.file.FileSink, java.lang.String) <em>Write</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Write</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#write(org.graphstream.stream.file.FileSink, java.lang.String)
	 * @generated
	 */
	EOperation getAbstractGraph__Write__FileSink_String();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#write(java.lang.String) <em>Write</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Write</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#write(java.lang.String)
	 * @generated
	 */
	EOperation getAbstractGraph__Write__String();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractGraph#getReplayController() <em>Get Replay Controller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Replay Controller</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractGraph#getReplayController()
	 * @generated
	 */
	EOperation getAbstractGraph__GetReplayController();

	/**
	 * Returns the meta object for class '{@link ecore.org.graphstream.graph.implementations.AbstractNode <em>Abstract Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Node</em>'.
	 * @see ecore.org.graphstream.graph.implementations.AbstractNode
	 * @generated
	 */
	EClass getAbstractNode();

	/**
	 * Returns the meta object for the reference '{@link ecore.org.graphstream.graph.implementations.AbstractNode#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Graph</em>'.
	 * @see ecore.org.graphstream.graph.implementations.AbstractNode#getGraph()
	 * @see #getAbstractNode()
	 * @generated
	 */
	EReference getAbstractNode_Graph();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractNode#getDegree() <em>Get Degree</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Degree</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractNode#getDegree()
	 * @generated
	 */
	EOperation getAbstractNode__GetDegree();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractNode#getInDegree() <em>Get In Degree</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get In Degree</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractNode#getInDegree()
	 * @generated
	 */
	EOperation getAbstractNode__GetInDegree();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractNode#getOutDegree() <em>Get Out Degree</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Out Degree</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractNode#getOutDegree()
	 * @generated
	 */
	EOperation getAbstractNode__GetOutDegree();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractNode#hasEdgeToward(ecore.org.graphstream.graph.Node) <em>Has Edge Toward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Edge Toward</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractNode#hasEdgeToward(ecore.org.graphstream.graph.Node)
	 * @generated
	 */
	EOperation getAbstractNode__HasEdgeToward__Node();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractNode#hasEdgeToward(int) <em>Has Edge Toward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Edge Toward</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractNode#hasEdgeToward(int)
	 * @generated
	 */
	EOperation getAbstractNode__HasEdgeToward__int();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractNode#hasEdgeToward(java.lang.String) <em>Has Edge Toward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Edge Toward</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractNode#hasEdgeToward(java.lang.String)
	 * @generated
	 */
	EOperation getAbstractNode__HasEdgeToward__String();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractNode#hasEdgeFrom(ecore.org.graphstream.graph.Node) <em>Has Edge From</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Edge From</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractNode#hasEdgeFrom(ecore.org.graphstream.graph.Node)
	 * @generated
	 */
	EOperation getAbstractNode__HasEdgeFrom__Node();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractNode#hasEdgeFrom(int) <em>Has Edge From</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Edge From</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractNode#hasEdgeFrom(int)
	 * @generated
	 */
	EOperation getAbstractNode__HasEdgeFrom__int();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractNode#hasEdgeFrom(java.lang.String) <em>Has Edge From</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Edge From</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractNode#hasEdgeFrom(java.lang.String)
	 * @generated
	 */
	EOperation getAbstractNode__HasEdgeFrom__String();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractNode#hasEdgeBetween(ecore.org.graphstream.graph.Node) <em>Has Edge Between</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Edge Between</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractNode#hasEdgeBetween(ecore.org.graphstream.graph.Node)
	 * @generated
	 */
	EOperation getAbstractNode__HasEdgeBetween__Node();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractNode#hasEdgeBetween(int) <em>Has Edge Between</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Edge Between</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractNode#hasEdgeBetween(int)
	 * @generated
	 */
	EOperation getAbstractNode__HasEdgeBetween__int();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractNode#hasEdgeBetween(java.lang.String) <em>Has Edge Between</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Edge Between</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractNode#hasEdgeBetween(java.lang.String)
	 * @generated
	 */
	EOperation getAbstractNode__HasEdgeBetween__String();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractNode#getEdgeToward(ecore.org.graphstream.graph.Node) <em>Get Edge Toward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Edge Toward</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractNode#getEdgeToward(ecore.org.graphstream.graph.Node)
	 * @generated
	 */
	EOperation getAbstractNode__GetEdgeToward__Node();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractNode#getEdgeToward(int) <em>Get Edge Toward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Edge Toward</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractNode#getEdgeToward(int)
	 * @generated
	 */
	EOperation getAbstractNode__GetEdgeToward__int();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractNode#getEdgeToward(java.lang.String) <em>Get Edge Toward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Edge Toward</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractNode#getEdgeToward(java.lang.String)
	 * @generated
	 */
	EOperation getAbstractNode__GetEdgeToward__String();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractNode#getEdgeFrom(ecore.org.graphstream.graph.Node) <em>Get Edge From</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Edge From</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractNode#getEdgeFrom(ecore.org.graphstream.graph.Node)
	 * @generated
	 */
	EOperation getAbstractNode__GetEdgeFrom__Node();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractNode#getEdgeFrom(int) <em>Get Edge From</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Edge From</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractNode#getEdgeFrom(int)
	 * @generated
	 */
	EOperation getAbstractNode__GetEdgeFrom__int();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractNode#getEdgeFrom(java.lang.String) <em>Get Edge From</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Edge From</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractNode#getEdgeFrom(java.lang.String)
	 * @generated
	 */
	EOperation getAbstractNode__GetEdgeFrom__String();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractNode#getEdgeBetween(ecore.org.graphstream.graph.Node) <em>Get Edge Between</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Edge Between</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractNode#getEdgeBetween(ecore.org.graphstream.graph.Node)
	 * @generated
	 */
	EOperation getAbstractNode__GetEdgeBetween__Node();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractNode#getEdgeBetween(int) <em>Get Edge Between</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Edge Between</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractNode#getEdgeBetween(int)
	 * @generated
	 */
	EOperation getAbstractNode__GetEdgeBetween__int();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractNode#getEdgeBetween(java.lang.String) <em>Get Edge Between</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Edge Between</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractNode#getEdgeBetween(java.lang.String)
	 * @generated
	 */
	EOperation getAbstractNode__GetEdgeBetween__String();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractNode#getEdgeIterator() <em>Get Edge Iterator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Edge Iterator</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractNode#getEdgeIterator()
	 * @generated
	 */
	EOperation getAbstractNode__GetEdgeIterator();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractNode#getEnteringEdgeIterator() <em>Get Entering Edge Iterator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Entering Edge Iterator</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractNode#getEnteringEdgeIterator()
	 * @generated
	 */
	EOperation getAbstractNode__GetEnteringEdgeIterator();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractNode#getLeavingEdgeIterator() <em>Get Leaving Edge Iterator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Leaving Edge Iterator</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractNode#getLeavingEdgeIterator()
	 * @generated
	 */
	EOperation getAbstractNode__GetLeavingEdgeIterator();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractNode#getEachEdge() <em>Get Each Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Each Edge</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractNode#getEachEdge()
	 * @generated
	 */
	EOperation getAbstractNode__GetEachEdge();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractNode#getEachEnteringEdge() <em>Get Each Entering Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Each Entering Edge</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractNode#getEachEnteringEdge()
	 * @generated
	 */
	EOperation getAbstractNode__GetEachEnteringEdge();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractNode#getEachLeavingEdge() <em>Get Each Leaving Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Each Leaving Edge</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractNode#getEachLeavingEdge()
	 * @generated
	 */
	EOperation getAbstractNode__GetEachLeavingEdge();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractNode#getEdgeSet() <em>Get Edge Set</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Edge Set</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractNode#getEdgeSet()
	 * @generated
	 */
	EOperation getAbstractNode__GetEdgeSet();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractNode#getEnteringEdgeSet() <em>Get Entering Edge Set</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Entering Edge Set</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractNode#getEnteringEdgeSet()
	 * @generated
	 */
	EOperation getAbstractNode__GetEnteringEdgeSet();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractNode#getLeavingEdgeSet() <em>Get Leaving Edge Set</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Leaving Edge Set</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractNode#getLeavingEdgeSet()
	 * @generated
	 */
	EOperation getAbstractNode__GetLeavingEdgeSet();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractNode#iterator() <em>Iterator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Iterator</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractNode#iterator()
	 * @generated
	 */
	EOperation getAbstractNode__Iterator();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractNode#getEdge(int) <em>Get Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Edge</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractNode#getEdge(int)
	 * @generated
	 */
	EOperation getAbstractNode__GetEdge__int();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractNode#getEnteringEdge(int) <em>Get Entering Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Entering Edge</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractNode#getEnteringEdge(int)
	 * @generated
	 */
	EOperation getAbstractNode__GetEnteringEdge__int();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractNode#getLeavingEdge(int) <em>Get Leaving Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Leaving Edge</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractNode#getLeavingEdge(int)
	 * @generated
	 */
	EOperation getAbstractNode__GetLeavingEdge__int();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractNode#getNeighborNodeIterator() <em>Get Neighbor Node Iterator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Neighbor Node Iterator</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractNode#getNeighborNodeIterator()
	 * @generated
	 */
	EOperation getAbstractNode__GetNeighborNodeIterator();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractNode#getBreadthFirstIterator() <em>Get Breadth First Iterator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Breadth First Iterator</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractNode#getBreadthFirstIterator()
	 * @generated
	 */
	EOperation getAbstractNode__GetBreadthFirstIterator();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractNode#getBreadthFirstIterator(boolean) <em>Get Breadth First Iterator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Breadth First Iterator</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractNode#getBreadthFirstIterator(boolean)
	 * @generated
	 */
	EOperation getAbstractNode__GetBreadthFirstIterator__boolean();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractNode#getDepthFirstIterator() <em>Get Depth First Iterator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Depth First Iterator</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractNode#getDepthFirstIterator()
	 * @generated
	 */
	EOperation getAbstractNode__GetDepthFirstIterator();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractNode#getDepthFirstIterator(boolean) <em>Get Depth First Iterator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Depth First Iterator</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractNode#getDepthFirstIterator(boolean)
	 * @generated
	 */
	EOperation getAbstractNode__GetDepthFirstIterator__boolean();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractNode#isEnteringEdge(ecore.org.graphstream.graph.Edge) <em>Is Entering Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Entering Edge</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractNode#isEnteringEdge(ecore.org.graphstream.graph.Edge)
	 * @generated
	 */
	EOperation getAbstractNode__IsEnteringEdge__Edge();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractNode#isLeavingEdge(ecore.org.graphstream.graph.Edge) <em>Is Leaving Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Leaving Edge</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractNode#isLeavingEdge(ecore.org.graphstream.graph.Edge)
	 * @generated
	 */
	EOperation getAbstractNode__IsLeavingEdge__Edge();

	/**
	 * Returns the meta object for the '{@link ecore.org.graphstream.graph.implementations.AbstractNode#isIncidentEdge(ecore.org.graphstream.graph.Edge) <em>Is Incident Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Incident Edge</em>' operation.
	 * @see ecore.org.graphstream.graph.implementations.AbstractNode#isIncidentEdge(ecore.org.graphstream.graph.Edge)
	 * @generated
	 */
	EOperation getAbstractNode__IsIncidentEdge__Edge();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ImplementationsFactory getImplementationsFactory();

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
		 * The meta object literal for the '{@link ecore.org.graphstream.graph.implementations.impl.AbstractEdgeImpl <em>Abstract Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.org.graphstream.graph.implementations.impl.AbstractEdgeImpl
		 * @see ecore.org.graphstream.graph.implementations.impl.ImplementationsPackageImpl#getAbstractEdge()
		 * @generated
		 */
		EClass ABSTRACT_EDGE = eINSTANCE.getAbstractEdge();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_EDGE__SOURCE = eINSTANCE.getAbstractEdge_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_EDGE__TARGET = eINSTANCE.getAbstractEdge_Target();

		/**
		 * The meta object literal for the '<em><b>Directed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_EDGE__DIRECTED = eINSTANCE.getAbstractEdge_Directed();

		/**
		 * The meta object literal for the '<em><b>Graph</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_EDGE__GRAPH = eINSTANCE.getAbstractEdge_Graph();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_EDGE___TO_STRING = eINSTANCE.getAbstractEdge__ToString();

		/**
		 * The meta object literal for the '<em><b>Get Node0</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_EDGE___GET_NODE0 = eINSTANCE.getAbstractEdge__GetNode0();

		/**
		 * The meta object literal for the '<em><b>Get Node1</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_EDGE___GET_NODE1 = eINSTANCE.getAbstractEdge__GetNode1();

		/**
		 * The meta object literal for the '<em><b>Get Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_EDGE___GET_OPPOSITE__NODE = eINSTANCE.getAbstractEdge__GetOpposite__Node();

		/**
		 * The meta object literal for the '<em><b>Get Source Node</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_EDGE___GET_SOURCE_NODE = eINSTANCE.getAbstractEdge__GetSourceNode();

		/**
		 * The meta object literal for the '<em><b>Get Target Node</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_EDGE___GET_TARGET_NODE = eINSTANCE.getAbstractEdge__GetTargetNode();

		/**
		 * The meta object literal for the '<em><b>Is Loop</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_EDGE___IS_LOOP = eINSTANCE.getAbstractEdge__IsLoop();

		/**
		 * The meta object literal for the '{@link ecore.org.graphstream.graph.implementations.impl.AbstractElementImpl <em>Abstract Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.org.graphstream.graph.implementations.impl.AbstractElementImpl
		 * @see ecore.org.graphstream.graph.implementations.impl.ImplementationsPackageImpl#getAbstractElement()
		 * @generated
		 */
		EClass ABSTRACT_ELEMENT = eINSTANCE.getAbstractElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_ELEMENT__ID = eINSTANCE.getAbstractElement_Id();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_ELEMENT__INDEX = eINSTANCE.getAbstractElement_Index();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_ELEMENT__ATTRIBUTES = eINSTANCE.getAbstractElement_Attributes();

		/**
		 * The meta object literal for the '<em><b>Attributes Being Removed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_ELEMENT__ATTRIBUTES_BEING_REMOVED = eINSTANCE.getAbstractElement_AttributesBeingRemoved();

		/**
		 * The meta object literal for the '<em><b>Get Attribute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_ELEMENT___GET_ATTRIBUTE__STRING = eINSTANCE.getAbstractElement__GetAttribute__String();

		/**
		 * The meta object literal for the '<em><b>Get First Attribute Of</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_ELEMENT___GET_FIRST_ATTRIBUTE_OF__STRING = eINSTANCE.getAbstractElement__GetFirstAttributeOf__String();

		/**
		 * The meta object literal for the '<em><b>Get Attribute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_ELEMENT___GET_ATTRIBUTE__STRING_CLASS = eINSTANCE.getAbstractElement__GetAttribute__String_Class();

		/**
		 * The meta object literal for the '<em><b>Get First Attribute Of</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_ELEMENT___GET_FIRST_ATTRIBUTE_OF__CLASS_STRING = eINSTANCE.getAbstractElement__GetFirstAttributeOf__Class_String();

		/**
		 * The meta object literal for the '<em><b>Get Label</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_ELEMENT___GET_LABEL__STRING = eINSTANCE.getAbstractElement__GetLabel__String();

		/**
		 * The meta object literal for the '<em><b>Get Number</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_ELEMENT___GET_NUMBER__STRING = eINSTANCE.getAbstractElement__GetNumber__String();

		/**
		 * The meta object literal for the '<em><b>Get Vector</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_ELEMENT___GET_VECTOR__STRING = eINSTANCE.getAbstractElement__GetVector__String();

		/**
		 * The meta object literal for the '<em><b>Get Array</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_ELEMENT___GET_ARRAY__STRING = eINSTANCE.getAbstractElement__GetArray__String();

		/**
		 * The meta object literal for the '<em><b>Get Hash</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_ELEMENT___GET_HASH__STRING = eINSTANCE.getAbstractElement__GetHash__String();

		/**
		 * The meta object literal for the '<em><b>Has Attribute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_ELEMENT___HAS_ATTRIBUTE__STRING = eINSTANCE.getAbstractElement__HasAttribute__String();

		/**
		 * The meta object literal for the '<em><b>Has Attribute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_ELEMENT___HAS_ATTRIBUTE__STRING_CLASS = eINSTANCE.getAbstractElement__HasAttribute__String_Class();

		/**
		 * The meta object literal for the '<em><b>Has Label</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_ELEMENT___HAS_LABEL__STRING = eINSTANCE.getAbstractElement__HasLabel__String();

		/**
		 * The meta object literal for the '<em><b>Has Number</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_ELEMENT___HAS_NUMBER__STRING = eINSTANCE.getAbstractElement__HasNumber__String();

		/**
		 * The meta object literal for the '<em><b>Has Vector</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_ELEMENT___HAS_VECTOR__STRING = eINSTANCE.getAbstractElement__HasVector__String();

		/**
		 * The meta object literal for the '<em><b>Has Array</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_ELEMENT___HAS_ARRAY__STRING = eINSTANCE.getAbstractElement__HasArray__String();

		/**
		 * The meta object literal for the '<em><b>Has Hash</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_ELEMENT___HAS_HASH__STRING = eINSTANCE.getAbstractElement__HasHash__String();

		/**
		 * The meta object literal for the '<em><b>Get Attribute Key Iterator</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_ELEMENT___GET_ATTRIBUTE_KEY_ITERATOR = eINSTANCE.getAbstractElement__GetAttributeKeyIterator();

		/**
		 * The meta object literal for the '<em><b>Get Each Attribute Key</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_ELEMENT___GET_EACH_ATTRIBUTE_KEY = eINSTANCE.getAbstractElement__GetEachAttributeKey();

		/**
		 * The meta object literal for the '<em><b>Get Attribute Key Set</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_ELEMENT___GET_ATTRIBUTE_KEY_SET = eINSTANCE.getAbstractElement__GetAttributeKeySet();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_ELEMENT___TO_STRING = eINSTANCE.getAbstractElement__ToString();

		/**
		 * The meta object literal for the '<em><b>Get Attribute Count</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_ELEMENT___GET_ATTRIBUTE_COUNT = eINSTANCE.getAbstractElement__GetAttributeCount();

		/**
		 * The meta object literal for the '<em><b>Clear Attributes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_ELEMENT___CLEAR_ATTRIBUTES = eINSTANCE.getAbstractElement__ClearAttributes();

		/**
		 * The meta object literal for the '<em><b>Add Attribute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_ELEMENT___ADD_ATTRIBUTE__STRING_OBJECT = eINSTANCE.getAbstractElement__AddAttribute__String_Object();

		/**
		 * The meta object literal for the '<em><b>Change Attribute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_ELEMENT___CHANGE_ATTRIBUTE__STRING_OBJECT = eINSTANCE.getAbstractElement__ChangeAttribute__String_Object();

		/**
		 * The meta object literal for the '<em><b>Set Attribute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_ELEMENT___SET_ATTRIBUTE__STRING_OBJECT = eINSTANCE.getAbstractElement__SetAttribute__String_Object();

		/**
		 * The meta object literal for the '<em><b>Add Attributes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_ELEMENT___ADD_ATTRIBUTES__MAP = eINSTANCE.getAbstractElement__AddAttributes__Map();

		/**
		 * The meta object literal for the '<em><b>Remove Attribute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_ELEMENT___REMOVE_ATTRIBUTE__STRING = eINSTANCE.getAbstractElement__RemoveAttribute__String();

		/**
		 * The meta object literal for the '{@link ecore.org.graphstream.graph.implementations.impl.AbstractGraphImpl <em>Abstract Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.org.graphstream.graph.implementations.impl.AbstractGraphImpl
		 * @see ecore.org.graphstream.graph.implementations.impl.ImplementationsPackageImpl#getAbstractGraph()
		 * @generated
		 */
		EClass ABSTRACT_GRAPH = eINSTANCE.getAbstractGraph();

		/**
		 * The meta object literal for the '<em><b>Strict Checking</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_GRAPH__STRICT_CHECKING = eINSTANCE.getAbstractGraph_StrictChecking();

		/**
		 * The meta object literal for the '<em><b>Auto Create</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_GRAPH__AUTO_CREATE = eINSTANCE.getAbstractGraph_AutoCreate();

		/**
		 * The meta object literal for the '<em><b>Node Factory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_GRAPH__NODE_FACTORY = eINSTANCE.getAbstractGraph_NodeFactory();

		/**
		 * The meta object literal for the '<em><b>Edge Factory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_GRAPH__EDGE_FACTORY = eINSTANCE.getAbstractGraph_EdgeFactory();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_GRAPH__STEP = eINSTANCE.getAbstractGraph_Step();

		/**
		 * The meta object literal for the '<em><b>Null Attributes Are Errors</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_GRAPH__NULL_ATTRIBUTES_ARE_ERRORS = eINSTANCE.getAbstractGraph_NullAttributesAreErrors();

		/**
		 * The meta object literal for the '<em><b>Replay Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_GRAPH__REPLAY_ID = eINSTANCE.getAbstractGraph_ReplayId();

		/**
		 * The meta object literal for the '<em><b>Null Attributes Are Errors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_GRAPH___NULL_ATTRIBUTES_ARE_ERRORS = eINSTANCE.getAbstractGraph__NullAttributesAreErrors();

		/**
		 * The meta object literal for the '<em><b>Get Node</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_GRAPH___GET_NODE__STRING = eINSTANCE.getAbstractGraph__GetNode__String();

		/**
		 * The meta object literal for the '<em><b>Get Node</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_GRAPH___GET_NODE__INT = eINSTANCE.getAbstractGraph__GetNode__int();

		/**
		 * The meta object literal for the '<em><b>Get Edge</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_GRAPH___GET_EDGE__STRING = eINSTANCE.getAbstractGraph__GetEdge__String();

		/**
		 * The meta object literal for the '<em><b>Get Edge</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_GRAPH___GET_EDGE__INT = eINSTANCE.getAbstractGraph__GetEdge__int();

		/**
		 * The meta object literal for the '<em><b>Get Node Count</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_GRAPH___GET_NODE_COUNT = eINSTANCE.getAbstractGraph__GetNodeCount();

		/**
		 * The meta object literal for the '<em><b>Get Edge Count</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_GRAPH___GET_EDGE_COUNT = eINSTANCE.getAbstractGraph__GetEdgeCount();

		/**
		 * The meta object literal for the '<em><b>Get Node Iterator</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_GRAPH___GET_NODE_ITERATOR = eINSTANCE.getAbstractGraph__GetNodeIterator();

		/**
		 * The meta object literal for the '<em><b>Get Edge Iterator</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_GRAPH___GET_EDGE_ITERATOR = eINSTANCE.getAbstractGraph__GetEdgeIterator();

		/**
		 * The meta object literal for the '<em><b>Get Each Node</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_GRAPH___GET_EACH_NODE = eINSTANCE.getAbstractGraph__GetEachNode();

		/**
		 * The meta object literal for the '<em><b>Get Each Edge</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_GRAPH___GET_EACH_EDGE = eINSTANCE.getAbstractGraph__GetEachEdge();

		/**
		 * The meta object literal for the '<em><b>Get Node Set</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_GRAPH___GET_NODE_SET = eINSTANCE.getAbstractGraph__GetNodeSet();

		/**
		 * The meta object literal for the '<em><b>Get Edge Set</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_GRAPH___GET_EDGE_SET = eINSTANCE.getAbstractGraph__GetEdgeSet();

		/**
		 * The meta object literal for the '<em><b>Iterator</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_GRAPH___ITERATOR = eINSTANCE.getAbstractGraph__Iterator();

		/**
		 * The meta object literal for the '<em><b>Node Factory</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_GRAPH___NODE_FACTORY = eINSTANCE.getAbstractGraph__NodeFactory();

		/**
		 * The meta object literal for the '<em><b>Edge Factory</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_GRAPH___EDGE_FACTORY = eINSTANCE.getAbstractGraph__EdgeFactory();

		/**
		 * The meta object literal for the '<em><b>Is Strict</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_GRAPH___IS_STRICT = eINSTANCE.getAbstractGraph__IsStrict();

		/**
		 * The meta object literal for the '<em><b>Is Auto Creation Enabled</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_GRAPH___IS_AUTO_CREATION_ENABLED = eINSTANCE.getAbstractGraph__IsAutoCreationEnabled();

		/**
		 * The meta object literal for the '<em><b>Set Strict</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_GRAPH___SET_STRICT__BOOLEAN = eINSTANCE.getAbstractGraph__SetStrict__boolean();

		/**
		 * The meta object literal for the '<em><b>Step Begins</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_GRAPH___STEP_BEGINS__DOUBLE = eINSTANCE.getAbstractGraph__StepBegins__double();

		/**
		 * The meta object literal for the '<em><b>Clear</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_GRAPH___CLEAR = eINSTANCE.getAbstractGraph__Clear();

		/**
		 * The meta object literal for the '<em><b>Add Node</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_GRAPH___ADD_NODE__STRING = eINSTANCE.getAbstractGraph__AddNode__String();

		/**
		 * The meta object literal for the '<em><b>Add Edge</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_GRAPH___ADD_EDGE__STRING_STRING_STRING = eINSTANCE.getAbstractGraph__AddEdge__String_String_String();

		/**
		 * The meta object literal for the '<em><b>Add Edge</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_GRAPH___ADD_EDGE__STRING_STRING_STRING_BOOLEAN = eINSTANCE.getAbstractGraph__AddEdge__String_String_String_boolean();

		/**
		 * The meta object literal for the '<em><b>Add Edge</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_GRAPH___ADD_EDGE__STRING_INT_INT = eINSTANCE.getAbstractGraph__AddEdge__String_int_int();

		/**
		 * The meta object literal for the '<em><b>Add Edge</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_GRAPH___ADD_EDGE__STRING_INT_INT_BOOLEAN = eINSTANCE.getAbstractGraph__AddEdge__String_int_int_boolean();

		/**
		 * The meta object literal for the '<em><b>Add Edge</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_GRAPH___ADD_EDGE__STRING_NODE_NODE = eINSTANCE.getAbstractGraph__AddEdge__String_Node_Node();

		/**
		 * The meta object literal for the '<em><b>Add Edge</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_GRAPH___ADD_EDGE__STRING_NODE_NODE_BOOLEAN = eINSTANCE.getAbstractGraph__AddEdge__String_Node_Node_boolean();

		/**
		 * The meta object literal for the '<em><b>Remove Node</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_GRAPH___REMOVE_NODE__STRING = eINSTANCE.getAbstractGraph__RemoveNode__String();

		/**
		 * The meta object literal for the '<em><b>Remove Node</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_GRAPH___REMOVE_NODE__INT = eINSTANCE.getAbstractGraph__RemoveNode__int();

		/**
		 * The meta object literal for the '<em><b>Remove Node</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_GRAPH___REMOVE_NODE__NODE = eINSTANCE.getAbstractGraph__RemoveNode__Node();

		/**
		 * The meta object literal for the '<em><b>Remove Edge</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_GRAPH___REMOVE_EDGE__STRING = eINSTANCE.getAbstractGraph__RemoveEdge__String();

		/**
		 * The meta object literal for the '<em><b>Remove Edge</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_GRAPH___REMOVE_EDGE__INT = eINSTANCE.getAbstractGraph__RemoveEdge__int();

		/**
		 * The meta object literal for the '<em><b>Remove Edge</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_GRAPH___REMOVE_EDGE__EDGE = eINSTANCE.getAbstractGraph__RemoveEdge__Edge();

		/**
		 * The meta object literal for the '<em><b>Remove Edge</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_GRAPH___REMOVE_EDGE__STRING_STRING = eINSTANCE.getAbstractGraph__RemoveEdge__String_String();

		/**
		 * The meta object literal for the '<em><b>Remove Edge</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_GRAPH___REMOVE_EDGE__INT_INT = eINSTANCE.getAbstractGraph__RemoveEdge__int_int();

		/**
		 * The meta object literal for the '<em><b>Remove Edge</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_GRAPH___REMOVE_EDGE__NODE_NODE = eINSTANCE.getAbstractGraph__RemoveEdge__Node_Node();

		/**
		 * The meta object literal for the '<em><b>Attribute Sinks</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_GRAPH___ATTRIBUTE_SINKS = eINSTANCE.getAbstractGraph__AttributeSinks();

		/**
		 * The meta object literal for the '<em><b>Element Sinks</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_GRAPH___ELEMENT_SINKS = eINSTANCE.getAbstractGraph__ElementSinks();

		/**
		 * The meta object literal for the '<em><b>Add Attribute Sink</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_GRAPH___ADD_ATTRIBUTE_SINK__ATTRIBUTESINK = eINSTANCE.getAbstractGraph__AddAttributeSink__AttributeSink();

		/**
		 * The meta object literal for the '<em><b>Add Element Sink</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_GRAPH___ADD_ELEMENT_SINK__ELEMENTSINK = eINSTANCE.getAbstractGraph__AddElementSink__ElementSink();

		/**
		 * The meta object literal for the '<em><b>Add Sink</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_GRAPH___ADD_SINK__SINK = eINSTANCE.getAbstractGraph__AddSink__Sink();

		/**
		 * The meta object literal for the '<em><b>Clear Attribute Sinks</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_GRAPH___CLEAR_ATTRIBUTE_SINKS = eINSTANCE.getAbstractGraph__ClearAttributeSinks();

		/**
		 * The meta object literal for the '<em><b>Clear Element Sinks</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_GRAPH___CLEAR_ELEMENT_SINKS = eINSTANCE.getAbstractGraph__ClearElementSinks();

		/**
		 * The meta object literal for the '<em><b>Clear Sinks</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_GRAPH___CLEAR_SINKS = eINSTANCE.getAbstractGraph__ClearSinks();

		/**
		 * The meta object literal for the '<em><b>Remove Attribute Sink</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_GRAPH___REMOVE_ATTRIBUTE_SINK__ATTRIBUTESINK = eINSTANCE.getAbstractGraph__RemoveAttributeSink__AttributeSink();

		/**
		 * The meta object literal for the '<em><b>Remove Element Sink</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_GRAPH___REMOVE_ELEMENT_SINK__ELEMENTSINK = eINSTANCE.getAbstractGraph__RemoveElementSink__ElementSink();

		/**
		 * The meta object literal for the '<em><b>Remove Sink</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_GRAPH___REMOVE_SINK__SINK = eINSTANCE.getAbstractGraph__RemoveSink__Sink();

		/**
		 * The meta object literal for the '<em><b>Edge Attribute Added</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_GRAPH___EDGE_ATTRIBUTE_ADDED__STRING_LONG_STRING_STRING_OBJECT = eINSTANCE.getAbstractGraph__EdgeAttributeAdded__String_long_String_String_Object();

		/**
		 * The meta object literal for the '<em><b>Edge Attribute Changed</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_GRAPH___EDGE_ATTRIBUTE_CHANGED__STRING_LONG_STRING_STRING_OBJECT_OBJECT = eINSTANCE.getAbstractGraph__EdgeAttributeChanged__String_long_String_String_Object_Object();

		/**
		 * The meta object literal for the '<em><b>Edge Attribute Removed</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_GRAPH___EDGE_ATTRIBUTE_REMOVED__STRING_LONG_STRING_STRING = eINSTANCE.getAbstractGraph__EdgeAttributeRemoved__String_long_String_String();

		/**
		 * The meta object literal for the '<em><b>Graph Attribute Added</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_GRAPH___GRAPH_ATTRIBUTE_ADDED__STRING_LONG_STRING_OBJECT = eINSTANCE.getAbstractGraph__GraphAttributeAdded__String_long_String_Object();

		/**
		 * The meta object literal for the '<em><b>Graph Attribute Changed</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_GRAPH___GRAPH_ATTRIBUTE_CHANGED__STRING_LONG_STRING_OBJECT_OBJECT = eINSTANCE.getAbstractGraph__GraphAttributeChanged__String_long_String_Object_Object();

		/**
		 * The meta object literal for the '<em><b>Graph Attribute Removed</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_GRAPH___GRAPH_ATTRIBUTE_REMOVED__STRING_LONG_STRING = eINSTANCE.getAbstractGraph__GraphAttributeRemoved__String_long_String();

		/**
		 * The meta object literal for the '<em><b>Node Attribute Added</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_GRAPH___NODE_ATTRIBUTE_ADDED__STRING_LONG_STRING_STRING_OBJECT = eINSTANCE.getAbstractGraph__NodeAttributeAdded__String_long_String_String_Object();

		/**
		 * The meta object literal for the '<em><b>Node Attribute Changed</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_GRAPH___NODE_ATTRIBUTE_CHANGED__STRING_LONG_STRING_STRING_OBJECT_OBJECT = eINSTANCE.getAbstractGraph__NodeAttributeChanged__String_long_String_String_Object_Object();

		/**
		 * The meta object literal for the '<em><b>Node Attribute Removed</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_GRAPH___NODE_ATTRIBUTE_REMOVED__STRING_LONG_STRING_STRING = eINSTANCE.getAbstractGraph__NodeAttributeRemoved__String_long_String_String();

		/**
		 * The meta object literal for the '<em><b>Edge Added</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_GRAPH___EDGE_ADDED__STRING_LONG_STRING_STRING_STRING_BOOLEAN = eINSTANCE.getAbstractGraph__EdgeAdded__String_long_String_String_String_boolean();

		/**
		 * The meta object literal for the '<em><b>Edge Removed</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_GRAPH___EDGE_REMOVED__STRING_LONG_STRING = eINSTANCE.getAbstractGraph__EdgeRemoved__String_long_String();

		/**
		 * The meta object literal for the '<em><b>Graph Cleared</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_GRAPH___GRAPH_CLEARED__STRING_LONG = eINSTANCE.getAbstractGraph__GraphCleared__String_long();

		/**
		 * The meta object literal for the '<em><b>Node Added</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_GRAPH___NODE_ADDED__STRING_LONG_STRING = eINSTANCE.getAbstractGraph__NodeAdded__String_long_String();

		/**
		 * The meta object literal for the '<em><b>Node Removed</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_GRAPH___NODE_REMOVED__STRING_LONG_STRING = eINSTANCE.getAbstractGraph__NodeRemoved__String_long_String();

		/**
		 * The meta object literal for the '<em><b>Step Begins</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_GRAPH___STEP_BEGINS__STRING_LONG_DOUBLE = eINSTANCE.getAbstractGraph__StepBegins__String_long_double();

		/**
		 * The meta object literal for the '<em><b>Display</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_GRAPH___DISPLAY = eINSTANCE.getAbstractGraph__Display();

		/**
		 * The meta object literal for the '<em><b>Display</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_GRAPH___DISPLAY__BOOLEAN = eINSTANCE.getAbstractGraph__Display__boolean();

		/**
		 * The meta object literal for the '<em><b>Read</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_GRAPH___READ__FILESOURCE_STRING = eINSTANCE.getAbstractGraph__Read__FileSource_String();

		/**
		 * The meta object literal for the '<em><b>Read</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_GRAPH___READ__STRING = eINSTANCE.getAbstractGraph__Read__String();

		/**
		 * The meta object literal for the '<em><b>Write</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_GRAPH___WRITE__FILESINK_STRING = eINSTANCE.getAbstractGraph__Write__FileSink_String();

		/**
		 * The meta object literal for the '<em><b>Write</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_GRAPH___WRITE__STRING = eINSTANCE.getAbstractGraph__Write__String();

		/**
		 * The meta object literal for the '<em><b>Get Replay Controller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_GRAPH___GET_REPLAY_CONTROLLER = eINSTANCE.getAbstractGraph__GetReplayController();

		/**
		 * The meta object literal for the '{@link ecore.org.graphstream.graph.implementations.impl.AbstractNodeImpl <em>Abstract Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.org.graphstream.graph.implementations.impl.AbstractNodeImpl
		 * @see ecore.org.graphstream.graph.implementations.impl.ImplementationsPackageImpl#getAbstractNode()
		 * @generated
		 */
		EClass ABSTRACT_NODE = eINSTANCE.getAbstractNode();

		/**
		 * The meta object literal for the '<em><b>Graph</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_NODE__GRAPH = eINSTANCE.getAbstractNode_Graph();

		/**
		 * The meta object literal for the '<em><b>Get Degree</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_NODE___GET_DEGREE = eINSTANCE.getAbstractNode__GetDegree();

		/**
		 * The meta object literal for the '<em><b>Get In Degree</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_NODE___GET_IN_DEGREE = eINSTANCE.getAbstractNode__GetInDegree();

		/**
		 * The meta object literal for the '<em><b>Get Out Degree</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_NODE___GET_OUT_DEGREE = eINSTANCE.getAbstractNode__GetOutDegree();

		/**
		 * The meta object literal for the '<em><b>Has Edge Toward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_NODE___HAS_EDGE_TOWARD__NODE = eINSTANCE.getAbstractNode__HasEdgeToward__Node();

		/**
		 * The meta object literal for the '<em><b>Has Edge Toward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_NODE___HAS_EDGE_TOWARD__INT = eINSTANCE.getAbstractNode__HasEdgeToward__int();

		/**
		 * The meta object literal for the '<em><b>Has Edge Toward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_NODE___HAS_EDGE_TOWARD__STRING = eINSTANCE.getAbstractNode__HasEdgeToward__String();

		/**
		 * The meta object literal for the '<em><b>Has Edge From</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_NODE___HAS_EDGE_FROM__NODE = eINSTANCE.getAbstractNode__HasEdgeFrom__Node();

		/**
		 * The meta object literal for the '<em><b>Has Edge From</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_NODE___HAS_EDGE_FROM__INT = eINSTANCE.getAbstractNode__HasEdgeFrom__int();

		/**
		 * The meta object literal for the '<em><b>Has Edge From</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_NODE___HAS_EDGE_FROM__STRING = eINSTANCE.getAbstractNode__HasEdgeFrom__String();

		/**
		 * The meta object literal for the '<em><b>Has Edge Between</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_NODE___HAS_EDGE_BETWEEN__NODE = eINSTANCE.getAbstractNode__HasEdgeBetween__Node();

		/**
		 * The meta object literal for the '<em><b>Has Edge Between</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_NODE___HAS_EDGE_BETWEEN__INT = eINSTANCE.getAbstractNode__HasEdgeBetween__int();

		/**
		 * The meta object literal for the '<em><b>Has Edge Between</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_NODE___HAS_EDGE_BETWEEN__STRING = eINSTANCE.getAbstractNode__HasEdgeBetween__String();

		/**
		 * The meta object literal for the '<em><b>Get Edge Toward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_NODE___GET_EDGE_TOWARD__NODE = eINSTANCE.getAbstractNode__GetEdgeToward__Node();

		/**
		 * The meta object literal for the '<em><b>Get Edge Toward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_NODE___GET_EDGE_TOWARD__INT = eINSTANCE.getAbstractNode__GetEdgeToward__int();

		/**
		 * The meta object literal for the '<em><b>Get Edge Toward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_NODE___GET_EDGE_TOWARD__STRING = eINSTANCE.getAbstractNode__GetEdgeToward__String();

		/**
		 * The meta object literal for the '<em><b>Get Edge From</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_NODE___GET_EDGE_FROM__NODE = eINSTANCE.getAbstractNode__GetEdgeFrom__Node();

		/**
		 * The meta object literal for the '<em><b>Get Edge From</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_NODE___GET_EDGE_FROM__INT = eINSTANCE.getAbstractNode__GetEdgeFrom__int();

		/**
		 * The meta object literal for the '<em><b>Get Edge From</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_NODE___GET_EDGE_FROM__STRING = eINSTANCE.getAbstractNode__GetEdgeFrom__String();

		/**
		 * The meta object literal for the '<em><b>Get Edge Between</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_NODE___GET_EDGE_BETWEEN__NODE = eINSTANCE.getAbstractNode__GetEdgeBetween__Node();

		/**
		 * The meta object literal for the '<em><b>Get Edge Between</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_NODE___GET_EDGE_BETWEEN__INT = eINSTANCE.getAbstractNode__GetEdgeBetween__int();

		/**
		 * The meta object literal for the '<em><b>Get Edge Between</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_NODE___GET_EDGE_BETWEEN__STRING = eINSTANCE.getAbstractNode__GetEdgeBetween__String();

		/**
		 * The meta object literal for the '<em><b>Get Edge Iterator</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_NODE___GET_EDGE_ITERATOR = eINSTANCE.getAbstractNode__GetEdgeIterator();

		/**
		 * The meta object literal for the '<em><b>Get Entering Edge Iterator</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_NODE___GET_ENTERING_EDGE_ITERATOR = eINSTANCE.getAbstractNode__GetEnteringEdgeIterator();

		/**
		 * The meta object literal for the '<em><b>Get Leaving Edge Iterator</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_NODE___GET_LEAVING_EDGE_ITERATOR = eINSTANCE.getAbstractNode__GetLeavingEdgeIterator();

		/**
		 * The meta object literal for the '<em><b>Get Each Edge</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_NODE___GET_EACH_EDGE = eINSTANCE.getAbstractNode__GetEachEdge();

		/**
		 * The meta object literal for the '<em><b>Get Each Entering Edge</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_NODE___GET_EACH_ENTERING_EDGE = eINSTANCE.getAbstractNode__GetEachEnteringEdge();

		/**
		 * The meta object literal for the '<em><b>Get Each Leaving Edge</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_NODE___GET_EACH_LEAVING_EDGE = eINSTANCE.getAbstractNode__GetEachLeavingEdge();

		/**
		 * The meta object literal for the '<em><b>Get Edge Set</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_NODE___GET_EDGE_SET = eINSTANCE.getAbstractNode__GetEdgeSet();

		/**
		 * The meta object literal for the '<em><b>Get Entering Edge Set</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_NODE___GET_ENTERING_EDGE_SET = eINSTANCE.getAbstractNode__GetEnteringEdgeSet();

		/**
		 * The meta object literal for the '<em><b>Get Leaving Edge Set</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_NODE___GET_LEAVING_EDGE_SET = eINSTANCE.getAbstractNode__GetLeavingEdgeSet();

		/**
		 * The meta object literal for the '<em><b>Iterator</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_NODE___ITERATOR = eINSTANCE.getAbstractNode__Iterator();

		/**
		 * The meta object literal for the '<em><b>Get Edge</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_NODE___GET_EDGE__INT = eINSTANCE.getAbstractNode__GetEdge__int();

		/**
		 * The meta object literal for the '<em><b>Get Entering Edge</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_NODE___GET_ENTERING_EDGE__INT = eINSTANCE.getAbstractNode__GetEnteringEdge__int();

		/**
		 * The meta object literal for the '<em><b>Get Leaving Edge</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_NODE___GET_LEAVING_EDGE__INT = eINSTANCE.getAbstractNode__GetLeavingEdge__int();

		/**
		 * The meta object literal for the '<em><b>Get Neighbor Node Iterator</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_NODE___GET_NEIGHBOR_NODE_ITERATOR = eINSTANCE.getAbstractNode__GetNeighborNodeIterator();

		/**
		 * The meta object literal for the '<em><b>Get Breadth First Iterator</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_NODE___GET_BREADTH_FIRST_ITERATOR = eINSTANCE.getAbstractNode__GetBreadthFirstIterator();

		/**
		 * The meta object literal for the '<em><b>Get Breadth First Iterator</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_NODE___GET_BREADTH_FIRST_ITERATOR__BOOLEAN = eINSTANCE.getAbstractNode__GetBreadthFirstIterator__boolean();

		/**
		 * The meta object literal for the '<em><b>Get Depth First Iterator</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_NODE___GET_DEPTH_FIRST_ITERATOR = eINSTANCE.getAbstractNode__GetDepthFirstIterator();

		/**
		 * The meta object literal for the '<em><b>Get Depth First Iterator</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_NODE___GET_DEPTH_FIRST_ITERATOR__BOOLEAN = eINSTANCE.getAbstractNode__GetDepthFirstIterator__boolean();

		/**
		 * The meta object literal for the '<em><b>Is Entering Edge</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_NODE___IS_ENTERING_EDGE__EDGE = eINSTANCE.getAbstractNode__IsEnteringEdge__Edge();

		/**
		 * The meta object literal for the '<em><b>Is Leaving Edge</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_NODE___IS_LEAVING_EDGE__EDGE = eINSTANCE.getAbstractNode__IsLeavingEdge__Edge();

		/**
		 * The meta object literal for the '<em><b>Is Incident Edge</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_NODE___IS_INCIDENT_EDGE__EDGE = eINSTANCE.getAbstractNode__IsIncidentEdge__Edge();

	}

} //ImplementationsPackage
