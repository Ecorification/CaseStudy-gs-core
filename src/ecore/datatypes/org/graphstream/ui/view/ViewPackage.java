/**
 */
package ecore.datatypes.org.graphstream.ui.view;

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
 * @see ecore.datatypes.org.graphstream.ui.view.ViewFactoryOld
 * @model kind="package"
 * @generated
 */
public interface ViewPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "view";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "CaseStudy-gs-core/ecore.datatypes.org.graphstream.ui.view";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "view";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ViewPackage eINSTANCE = ecore.datatypes.org.graphstream.ui.view.impl.ViewPackageImpl.init();

	/**
	 * The meta object id for the '<em>Viewer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.graphstream.ui.view.Viewer
	 * @see ecore.datatypes.org.graphstream.ui.view.impl.ViewPackageImpl#getViewer()
	 * @generated
	 */
	int VIEWER = 0;


	/**
	 * Returns the meta object for data type '{@link org.graphstream.ui.view.Viewer <em>Viewer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Viewer</em>'.
	 * @see org.graphstream.ui.view.Viewer
	 * @model instanceClass="org.graphstream.ui.view.Viewer"
	 * @generated
	 */
	EDataType getViewer();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ViewFactoryOld getViewFactory();

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
		 * The meta object literal for the '<em>Viewer</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.graphstream.ui.view.Viewer
		 * @see ecore.datatypes.org.graphstream.ui.view.impl.ViewPackageImpl#getViewer()
		 * @generated
		 */
		EDataType VIEWER = eINSTANCE.getViewer();

	}

} //ViewPackage
