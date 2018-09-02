/**
 */
package ecore.datatypes.org.graphstream.stream;

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
 * @see ecore.datatypes.org.graphstream.stream.StreamFactoryOld
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
	String eNS_URI = "CaseStudy-gs-core/ecore.datatypes.org.graphstream.stream";

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
	StreamPackage eINSTANCE = ecore.datatypes.org.graphstream.stream.impl.StreamPackageImpl.init();

	/**
	 * The meta object id for the '<em>Graph Parse Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.graphstream.stream.GraphParseException
	 * @see ecore.datatypes.org.graphstream.stream.impl.StreamPackageImpl#getGraphParseException()
	 * @generated
	 */
	int GRAPH_PARSE_EXCEPTION = 0;


	/**
	 * Returns the meta object for data type '{@link org.graphstream.stream.GraphParseException <em>Graph Parse Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Graph Parse Exception</em>'.
	 * @see org.graphstream.stream.GraphParseException
	 * @model instanceClass="org.graphstream.stream.GraphParseException"
	 * @generated
	 */
	EDataType getGraphParseException();

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
		 * The meta object literal for the '<em>Graph Parse Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.graphstream.stream.GraphParseException
		 * @see ecore.datatypes.org.graphstream.stream.impl.StreamPackageImpl#getGraphParseException()
		 * @generated
		 */
		EDataType GRAPH_PARSE_EXCEPTION = eINSTANCE.getGraphParseException();

	}

} //StreamPackage
