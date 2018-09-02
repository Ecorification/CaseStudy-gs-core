/**
 */
package ecore.datatypes.org.graphstream.stream.Replayable;

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
 * @see ecore.datatypes.org.graphstream.stream.Replayable.ReplayableFactoryOld
 * @model kind="package"
 * @generated
 */
public interface ReplayablePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Replayable";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "CaseStudy-gs-core/ecore.datatypes.org.graphstream.stream.Replayable";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Replayable";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReplayablePackage eINSTANCE = ecore.datatypes.org.graphstream.stream.Replayable.impl.ReplayablePackageImpl.init();

	/**
	 * The meta object id for the '<em>Controller</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.graphstream.stream.Replayable.Controller
	 * @see ecore.datatypes.org.graphstream.stream.Replayable.impl.ReplayablePackageImpl#getController()
	 * @generated
	 */
	int CONTROLLER = 0;


	/**
	 * Returns the meta object for data type '{@link org.graphstream.stream.Replayable.Controller <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Controller</em>'.
	 * @see org.graphstream.stream.Replayable.Controller
	 * @model instanceClass="org.graphstream.stream.Replayable.Controller"
	 * @generated
	 */
	EDataType getController();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ReplayableFactoryOld getReplayableFactory();

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
		 * The meta object literal for the '<em>Controller</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.graphstream.stream.Replayable.Controller
		 * @see ecore.datatypes.org.graphstream.stream.Replayable.impl.ReplayablePackageImpl#getController()
		 * @generated
		 */
		EDataType CONTROLLER = eINSTANCE.getController();

	}

} //ReplayablePackage
