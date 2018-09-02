/**
 */
package ecore.org.graphstream.graph.implementations;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ecore.org.graphstream.graph.implementations.ImplementationsPackage
 * @generated
 */
public interface ImplementationsFactoryOld extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ImplementationsFactoryOld eINSTANCE = ecore.org.graphstream.graph.implementations.impl.ImplementationsFactoryImplOld.init();

	/**
	 * Returns a new object of class '<em>Abstract Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Edge</em>'.
	 * @generated
	 */
	AbstractEdge createAbstractEdge();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ImplementationsPackage getImplementationsPackage();

} //ImplementationsFactory
