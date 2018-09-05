/**
 */
package ecore.datatypes.org.graphstream.graph;

import org.eclipse.emf.ecore.EDataType;
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
 * @see ecore.datatypes.org.graphstream.graph.GraphFactoryOld
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
	String eNS_URI = "gs-core/ecore.datatypes.org.graphstream.graph";

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
	GraphPackage eINSTANCE = ecore.datatypes.org.graphstream.graph.impl.GraphPackageImpl.init();

	/**
	 * The meta object id for the '<em>Edge Factory</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.graphstream.graph.EdgeFactory
	 * @see ecore.datatypes.org.graphstream.graph.impl.GraphPackageImpl#getEdgeFactory()
	 * @generated
	 */
	int EDGE_FACTORY = 0;

	/**
	 * The meta object id for the '<em>Edge Rejected Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.graphstream.graph.EdgeRejectedException
	 * @see ecore.datatypes.org.graphstream.graph.impl.GraphPackageImpl#getEdgeRejectedException()
	 * @generated
	 */
	int EDGE_REJECTED_EXCEPTION = 1;

	/**
	 * The meta object id for the '<em>Element Not Found Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.graphstream.graph.ElementNotFoundException
	 * @see ecore.datatypes.org.graphstream.graph.impl.GraphPackageImpl#getElementNotFoundException()
	 * @generated
	 */
	int ELEMENT_NOT_FOUND_EXCEPTION = 2;

	/**
	 * The meta object id for the '<em>Id Already In Use Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.graphstream.graph.IdAlreadyInUseException
	 * @see ecore.datatypes.org.graphstream.graph.impl.GraphPackageImpl#getIdAlreadyInUseException()
	 * @generated
	 */
	int ID_ALREADY_IN_USE_EXCEPTION = 3;

	/**
	 * The meta object id for the '<em>Node Factory</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.graphstream.graph.NodeFactory
	 * @see ecore.datatypes.org.graphstream.graph.impl.GraphPackageImpl#getNodeFactory()
	 * @generated
	 */
	int NODE_FACTORY = 4;


	/**
	 * Returns the meta object for data type '{@link org.graphstream.graph.EdgeFactory <em>Edge Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Edge Factory</em>'.
	 * @see org.graphstream.graph.EdgeFactory
	 * @model instanceClass="org.graphstream.graph.EdgeFactory" typeParameters="T"
	 * @generated
	 */
	EDataType getEdgeFactory();

	/**
	 * Returns the meta object for data type '{@link org.graphstream.graph.EdgeRejectedException <em>Edge Rejected Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Edge Rejected Exception</em>'.
	 * @see org.graphstream.graph.EdgeRejectedException
	 * @model instanceClass="org.graphstream.graph.EdgeRejectedException"
	 * @generated
	 */
	EDataType getEdgeRejectedException();

	/**
	 * Returns the meta object for data type '{@link org.graphstream.graph.ElementNotFoundException <em>Element Not Found Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Element Not Found Exception</em>'.
	 * @see org.graphstream.graph.ElementNotFoundException
	 * @model instanceClass="org.graphstream.graph.ElementNotFoundException"
	 * @generated
	 */
	EDataType getElementNotFoundException();

	/**
	 * Returns the meta object for data type '{@link org.graphstream.graph.IdAlreadyInUseException <em>Id Already In Use Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Id Already In Use Exception</em>'.
	 * @see org.graphstream.graph.IdAlreadyInUseException
	 * @model instanceClass="org.graphstream.graph.IdAlreadyInUseException"
	 * @generated
	 */
	EDataType getIdAlreadyInUseException();

	/**
	 * Returns the meta object for data type '{@link org.graphstream.graph.NodeFactory <em>Node Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Node Factory</em>'.
	 * @see org.graphstream.graph.NodeFactory
	 * @model instanceClass="org.graphstream.graph.NodeFactory" typeParameters="T"
	 * @generated
	 */
	EDataType getNodeFactory();

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
		 * The meta object literal for the '<em>Edge Factory</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.graphstream.graph.EdgeFactory
		 * @see ecore.datatypes.org.graphstream.graph.impl.GraphPackageImpl#getEdgeFactory()
		 * @generated
		 */
		EDataType EDGE_FACTORY = eINSTANCE.getEdgeFactory();

		/**
		 * The meta object literal for the '<em>Edge Rejected Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.graphstream.graph.EdgeRejectedException
		 * @see ecore.datatypes.org.graphstream.graph.impl.GraphPackageImpl#getEdgeRejectedException()
		 * @generated
		 */
		EDataType EDGE_REJECTED_EXCEPTION = eINSTANCE.getEdgeRejectedException();

		/**
		 * The meta object literal for the '<em>Element Not Found Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.graphstream.graph.ElementNotFoundException
		 * @see ecore.datatypes.org.graphstream.graph.impl.GraphPackageImpl#getElementNotFoundException()
		 * @generated
		 */
		EDataType ELEMENT_NOT_FOUND_EXCEPTION = eINSTANCE.getElementNotFoundException();

		/**
		 * The meta object literal for the '<em>Id Already In Use Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.graphstream.graph.IdAlreadyInUseException
		 * @see ecore.datatypes.org.graphstream.graph.impl.GraphPackageImpl#getIdAlreadyInUseException()
		 * @generated
		 */
		EDataType ID_ALREADY_IN_USE_EXCEPTION = eINSTANCE.getIdAlreadyInUseException();

		/**
		 * The meta object literal for the '<em>Node Factory</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.graphstream.graph.NodeFactory
		 * @see ecore.datatypes.org.graphstream.graph.impl.GraphPackageImpl#getNodeFactory()
		 * @generated
		 */
		EDataType NODE_FACTORY = eINSTANCE.getNodeFactory();

	}

} //GraphPackage
