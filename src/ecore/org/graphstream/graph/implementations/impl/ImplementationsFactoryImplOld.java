/**
 */
package ecore.org.graphstream.graph.implementations.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

import ecore.org.graphstream.graph.implementations.AbstractEdge;
import ecore.org.graphstream.graph.implementations.ImplementationsFactoryOld;
import ecore.org.graphstream.graph.implementations.ImplementationsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ImplementationsFactoryImplOld extends EFactoryImpl implements ImplementationsFactoryOld {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ImplementationsFactoryOld init() {
		return new ImplementationsFactoryImplOld();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationsFactoryImplOld() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ImplementationsPackage.ABSTRACT_EDGE: return createAbstractEdge();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractEdge createAbstractEdge() {
		AbstractEdgeImpl abstractEdge = new AbstractEdgeImpl();
		return abstractEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationsPackage getImplementationsPackage() {
		return (ImplementationsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ImplementationsPackage getPackage() {
		return ImplementationsPackage.eINSTANCE;
	}

} //ImplementationsFactoryImpl
