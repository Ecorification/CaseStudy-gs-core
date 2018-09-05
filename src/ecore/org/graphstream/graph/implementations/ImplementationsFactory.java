package ecore.org.graphstream.graph.implementations;
	
import org.eclipse.emf.ecore.EFactory;
	
/**
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * @see ecore.org.graphstream.graph.implementations.ImplementationsPackage
 * @generated
 */
public interface ImplementationsFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * @generated
     */
    ImplementationsFactory eINSTANCE = ecore.org.graphstream.graph.implementations.impl.ImplementationsFactoryImpl.init();
	
	/**
	 * Returns a new object of class '<em>AbstractEdge</em>'.
	 * @return a new object of class '<em>AbstractEdge</em>'.
	 * @generated
	 */
	AbstractEdge createAbstractEdge();	    		
	
	/**
	 * Returns a new object of class '<em>AbstractElement</em>'.
	 * @return a new object of class '<em>AbstractElement</em>'.
	 * @generated
	 */
	AbstractElement createAbstractElement();	    		
	
	/**
	 * Returns a new object of class '<em>AbstractGraph</em>'.
	 * @return a new object of class '<em>AbstractGraph</em>'.
	 * @generated
	 */
	AbstractGraph createAbstractGraph();	    		
	
	/**
	 * Returns a new object of class '<em>AbstractNode</em>'.
	 * @return a new object of class '<em>AbstractNode</em>'.
	 * @generated
	 */
	AbstractNode createAbstractNode();	    
	
	/**
	 * Returns the package supported by this factory.
	 * @return the package supported by this factory.
	 * @generated
	 */
	ImplementationsPackage getImplementationsPackage();
	
} //ImplementationsFactory
