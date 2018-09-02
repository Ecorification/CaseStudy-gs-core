/**
 */
package ecore.datatypes.org.graphstream.stream.file;

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
 * @see ecore.datatypes.org.graphstream.stream.file.FileFactoryOld
 * @model kind="package"
 * @generated
 */
public interface FilePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "file";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "CaseStudy-gs-core/ecore.datatypes.org.graphstream.stream.file";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "file";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FilePackage eINSTANCE = ecore.datatypes.org.graphstream.stream.file.impl.FilePackageImpl.init();

	/**
	 * The meta object id for the '<em>Sink</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.graphstream.stream.file.FileSink
	 * @see ecore.datatypes.org.graphstream.stream.file.impl.FilePackageImpl#getFileSink()
	 * @generated
	 */
	int FILE_SINK = 0;

	/**
	 * The meta object id for the '<em>Source</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.graphstream.stream.file.FileSource
	 * @see ecore.datatypes.org.graphstream.stream.file.impl.FilePackageImpl#getFileSource()
	 * @generated
	 */
	int FILE_SOURCE = 1;


	/**
	 * Returns the meta object for data type '{@link org.graphstream.stream.file.FileSink <em>Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sink</em>'.
	 * @see org.graphstream.stream.file.FileSink
	 * @model instanceClass="org.graphstream.stream.file.FileSink"
	 * @generated
	 */
	EDataType getFileSink();

	/**
	 * Returns the meta object for data type '{@link org.graphstream.stream.file.FileSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Source</em>'.
	 * @see org.graphstream.stream.file.FileSource
	 * @model instanceClass="org.graphstream.stream.file.FileSource"
	 * @generated
	 */
	EDataType getFileSource();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FileFactoryOld getFileFactory();

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
		 * The meta object literal for the '<em>Sink</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.graphstream.stream.file.FileSink
		 * @see ecore.datatypes.org.graphstream.stream.file.impl.FilePackageImpl#getFileSink()
		 * @generated
		 */
		EDataType FILE_SINK = eINSTANCE.getFileSink();

		/**
		 * The meta object literal for the '<em>Source</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.graphstream.stream.file.FileSource
		 * @see ecore.datatypes.org.graphstream.stream.file.impl.FilePackageImpl#getFileSource()
		 * @generated
		 */
		EDataType FILE_SOURCE = eINSTANCE.getFileSource();

	}

} //FilePackage
