package ecore.org.graphstream.graph.implementations.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.graphstream.graph.implementations.AbstractEdge;
import org.graphstream.graph.implementations.AbstractElement;
import org.graphstream.graph.implementations.AbstractGraph;
import org.graphstream.graph.implementations.AbstractNode;

import ecore.org.graphstream.graph.implementations.ImplementationsFactory;
import ecore.org.graphstream.graph.implementations.ImplementationsPackage;

/**
 * An implementation of the model <b>Factory</b>.
 * @generated
 */
public class ImplementationsFactoryImpl extends EFactoryImpl implements ImplementationsFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ImplementationsFactory init() {
        try {
            ImplementationsFactory theImplementationsFactory = (ImplementationsFactory)EPackage.Registry.INSTANCE.getEFactory(ImplementationsPackage.eNS_URI);
            if (theImplementationsFactory != null) {
                return theImplementationsFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ImplementationsFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * @generated
     */
    public ImplementationsFactoryImpl() {
        super();
    }

    /**
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
	 * @generated
	 */
	public AbstractEdge createAbstractEdge() {
		return new AbstractEdge(); // origin code instance
	}			
	
	/**
	 * @generated
	 */
	public ImplementationsPackage getImplementationsPackage() {
	return (ImplementationsPackage)getEPackage();
	}

    /**
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ImplementationsPackage getPackage() {
        return ImplementationsPackage.eINSTANCE;
    }
    
} //ImplementationsFactoryImpl
