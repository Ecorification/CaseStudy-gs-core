/**
 */
package ecore.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import ecore.EcoreFactory;
import ecore.EcorePackage;
import ecore.RootContainer;
import ecore.datatypes.java.io.IoPackage;
import ecore.datatypes.java.io.impl.IoPackageImpl;
import ecore.datatypes.java.lang.LangPackage;
import ecore.datatypes.java.lang.impl.LangPackageImpl;
import ecore.datatypes.java.util.UtilPackage;
import ecore.datatypes.java.util.impl.UtilPackageImpl;
import ecore.datatypes.org.graphstream.graph.GraphPackage;
import ecore.datatypes.org.graphstream.graph.impl.GraphPackageImpl;
import ecore.datatypes.org.graphstream.stream.StreamPackage;
import ecore.datatypes.org.graphstream.stream.Replayable.ReplayablePackage;
import ecore.datatypes.org.graphstream.stream.Replayable.impl.ReplayablePackageImpl;
import ecore.datatypes.org.graphstream.stream.file.FilePackage;
import ecore.datatypes.org.graphstream.stream.file.impl.FilePackageImpl;
import ecore.datatypes.org.graphstream.stream.impl.StreamPackageImpl;
import ecore.datatypes.org.graphstream.ui.view.ViewPackage;
import ecore.datatypes.org.graphstream.ui.view.impl.ViewPackageImpl;
import ecore.org.graphstream.graph.implementations.ImplementationsPackage;
import ecore.org.graphstream.graph.implementations.impl.ImplementationsPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EcorePackageImpl extends EPackageImpl implements EcorePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootContainerEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ecore.EcorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EcorePackageImpl() {
		super(eNS_URI, EcoreFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link EcorePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EcorePackage init() {
		if (isInited) return (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Obtain or create and register package
		EcorePackageImpl theEcorePackage = (EcorePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EcorePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EcorePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		IoPackageImpl theIoPackage = (IoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IoPackage.eNS_URI) instanceof IoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IoPackage.eNS_URI) : IoPackage.eINSTANCE);
		LangPackageImpl theLangPackage = (LangPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LangPackage.eNS_URI) instanceof LangPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LangPackage.eNS_URI) : LangPackage.eINSTANCE);
		UtilPackageImpl theUtilPackage = (UtilPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI) instanceof UtilPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI) : UtilPackage.eINSTANCE);
		GraphPackageImpl theGraphPackage = (GraphPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GraphPackage.eNS_URI) instanceof GraphPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GraphPackage.eNS_URI) : GraphPackage.eINSTANCE);
		StreamPackageImpl theStreamPackage = (StreamPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StreamPackage.eNS_URI) instanceof StreamPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StreamPackage.eNS_URI) : StreamPackage.eINSTANCE);
		FilePackageImpl theFilePackage = (FilePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FilePackage.eNS_URI) instanceof FilePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FilePackage.eNS_URI) : FilePackage.eINSTANCE);
		ReplayablePackageImpl theReplayablePackage = (ReplayablePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ReplayablePackage.eNS_URI) instanceof ReplayablePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ReplayablePackage.eNS_URI) : ReplayablePackage.eINSTANCE);
		ViewPackageImpl theViewPackage = (ViewPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ViewPackage.eNS_URI) instanceof ViewPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ViewPackage.eNS_URI) : ViewPackage.eINSTANCE);
		ecore.org.graphstream.graph.impl.GraphPackageImpl theGraphPackage_1 = (ecore.org.graphstream.graph.impl.GraphPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ecore.org.graphstream.graph.GraphPackage.eNS_URI) instanceof ecore.org.graphstream.graph.impl.GraphPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ecore.org.graphstream.graph.GraphPackage.eNS_URI) : ecore.org.graphstream.graph.GraphPackage.eINSTANCE);
		ImplementationsPackageImpl theImplementationsPackage = (ImplementationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ImplementationsPackage.eNS_URI) instanceof ImplementationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ImplementationsPackage.eNS_URI) : ImplementationsPackage.eINSTANCE);
		ecore.org.graphstream.stream.impl.StreamPackageImpl theStreamPackage_1 = (ecore.org.graphstream.stream.impl.StreamPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ecore.org.graphstream.stream.StreamPackage.eNS_URI) instanceof ecore.org.graphstream.stream.impl.StreamPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ecore.org.graphstream.stream.StreamPackage.eNS_URI) : ecore.org.graphstream.stream.StreamPackage.eINSTANCE);

		// Create package meta-data objects
		theEcorePackage.createPackageContents();
		theIoPackage.createPackageContents();
		theLangPackage.createPackageContents();
		theUtilPackage.createPackageContents();
		theGraphPackage.createPackageContents();
		theStreamPackage.createPackageContents();
		theFilePackage.createPackageContents();
		theReplayablePackage.createPackageContents();
		theViewPackage.createPackageContents();
		theGraphPackage_1.createPackageContents();
		theImplementationsPackage.createPackageContents();
		theStreamPackage_1.createPackageContents();

		// Initialize created meta-data
		theEcorePackage.initializePackageContents();
		theIoPackage.initializePackageContents();
		theLangPackage.initializePackageContents();
		theUtilPackage.initializePackageContents();
		theGraphPackage.initializePackageContents();
		theStreamPackage.initializePackageContents();
		theFilePackage.initializePackageContents();
		theReplayablePackage.initializePackageContents();
		theViewPackage.initializePackageContents();
		theGraphPackage_1.initializePackageContents();
		theImplementationsPackage.initializePackageContents();
		theStreamPackage_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEcorePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EcorePackage.eNS_URI, theEcorePackage);
		return theEcorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRootContainer() {
		return rootContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRootContainer_ContainedElements() {
		return (EReference)rootContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreFactory getEcoreFactory() {
		return (EcoreFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		rootContainerEClass = createEClass(ROOT_CONTAINER);
		createEReference(rootContainerEClass, ROOT_CONTAINER__CONTAINED_ELEMENTS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		IoPackage theIoPackage = (IoPackage)EPackage.Registry.INSTANCE.getEPackage(IoPackage.eNS_URI);
		LangPackage theLangPackage = (LangPackage)EPackage.Registry.INSTANCE.getEPackage(LangPackage.eNS_URI);
		UtilPackage theUtilPackage = (UtilPackage)EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI);
		GraphPackage theGraphPackage = (GraphPackage)EPackage.Registry.INSTANCE.getEPackage(GraphPackage.eNS_URI);
		StreamPackage theStreamPackage = (StreamPackage)EPackage.Registry.INSTANCE.getEPackage(StreamPackage.eNS_URI);
		ViewPackage theViewPackage = (ViewPackage)EPackage.Registry.INSTANCE.getEPackage(ViewPackage.eNS_URI);
		ecore.org.graphstream.graph.GraphPackage theGraphPackage_1 = (ecore.org.graphstream.graph.GraphPackage)EPackage.Registry.INSTANCE.getEPackage(ecore.org.graphstream.graph.GraphPackage.eNS_URI);
		ecore.org.graphstream.stream.StreamPackage theStreamPackage_1 = (ecore.org.graphstream.stream.StreamPackage)EPackage.Registry.INSTANCE.getEPackage(ecore.org.graphstream.stream.StreamPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theIoPackage);
		getESubpackages().add(theLangPackage);
		getESubpackages().add(theUtilPackage);
		getESubpackages().add(theGraphPackage);
		getESubpackages().add(theStreamPackage);
		getESubpackages().add(theViewPackage);
		getESubpackages().add(theGraphPackage_1);
		getESubpackages().add(theStreamPackage_1);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(rootContainerEClass, RootContainer.class, "RootContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRootContainer_ContainedElements(), ecorePackage.getEObject(), null, "containedElements", null, 0, -1, RootContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //EcorePackageImpl
