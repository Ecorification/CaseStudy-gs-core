/**
 */
package ecore.datatypes.java.util.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import ecore.EcorePackage;
import ecore.datatypes.java.io.IoPackage;
import ecore.datatypes.java.io.impl.IoPackageImpl;
import ecore.datatypes.java.lang.LangPackage;
import ecore.datatypes.java.lang.impl.LangPackageImpl;
import ecore.datatypes.java.util.UtilFactoryOld;
import ecore.datatypes.java.util.UtilPackage;
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
import ecore.impl.EcorePackageImpl;
import ecore.org.graphstream.graph.implementations.ImplementationsPackage;
import ecore.org.graphstream.graph.implementations.impl.ImplementationsPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UtilPackageImpl extends EPackageImpl implements UtilPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType arrayListEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType collectionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType hashMapEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iteratorEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mapEDataType = null;

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
	 * @see ecore.datatypes.java.util.UtilPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UtilPackageImpl() {
		super(eNS_URI, UtilFactoryOld.eINSTANCE);
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
	 * <p>This method is used to initialize {@link UtilPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UtilPackage init() {
		if (isInited) return (UtilPackage)EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI);

		// Obtain or create and register package
		UtilPackageImpl theUtilPackage = (UtilPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UtilPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UtilPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		EcorePackageImpl theEcorePackage = (EcorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI) instanceof EcorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI) : EcorePackage.eINSTANCE);
		IoPackageImpl theIoPackage = (IoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IoPackage.eNS_URI) instanceof IoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IoPackage.eNS_URI) : IoPackage.eINSTANCE);
		LangPackageImpl theLangPackage = (LangPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LangPackage.eNS_URI) instanceof LangPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LangPackage.eNS_URI) : LangPackage.eINSTANCE);
		GraphPackageImpl theGraphPackage = (GraphPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GraphPackage.eNS_URI) instanceof GraphPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GraphPackage.eNS_URI) : GraphPackage.eINSTANCE);
		StreamPackageImpl theStreamPackage = (StreamPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StreamPackage.eNS_URI) instanceof StreamPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StreamPackage.eNS_URI) : StreamPackage.eINSTANCE);
		FilePackageImpl theFilePackage = (FilePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FilePackage.eNS_URI) instanceof FilePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FilePackage.eNS_URI) : FilePackage.eINSTANCE);
		ReplayablePackageImpl theReplayablePackage = (ReplayablePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ReplayablePackage.eNS_URI) instanceof ReplayablePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ReplayablePackage.eNS_URI) : ReplayablePackage.eINSTANCE);
		ViewPackageImpl theViewPackage = (ViewPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ViewPackage.eNS_URI) instanceof ViewPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ViewPackage.eNS_URI) : ViewPackage.eINSTANCE);
		ecore.org.graphstream.graph.impl.GraphPackageImpl theGraphPackage_1 = (ecore.org.graphstream.graph.impl.GraphPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ecore.org.graphstream.graph.GraphPackage.eNS_URI) instanceof ecore.org.graphstream.graph.impl.GraphPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ecore.org.graphstream.graph.GraphPackage.eNS_URI) : ecore.org.graphstream.graph.GraphPackage.eINSTANCE);
		ImplementationsPackageImpl theImplementationsPackage = (ImplementationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ImplementationsPackage.eNS_URI) instanceof ImplementationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ImplementationsPackage.eNS_URI) : ImplementationsPackage.eINSTANCE);
		ecore.org.graphstream.stream.impl.StreamPackageImpl theStreamPackage_1 = (ecore.org.graphstream.stream.impl.StreamPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ecore.org.graphstream.stream.StreamPackage.eNS_URI) instanceof ecore.org.graphstream.stream.impl.StreamPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ecore.org.graphstream.stream.StreamPackage.eNS_URI) : ecore.org.graphstream.stream.StreamPackage.eINSTANCE);

		// Create package meta-data objects
		theUtilPackage.createPackageContents();
		theEcorePackage.createPackageContents();
		theIoPackage.createPackageContents();
		theLangPackage.createPackageContents();
		theGraphPackage.createPackageContents();
		theStreamPackage.createPackageContents();
		theFilePackage.createPackageContents();
		theReplayablePackage.createPackageContents();
		theViewPackage.createPackageContents();
		theGraphPackage_1.createPackageContents();
		theImplementationsPackage.createPackageContents();
		theStreamPackage_1.createPackageContents();

		// Initialize created meta-data
		theUtilPackage.initializePackageContents();
		theEcorePackage.initializePackageContents();
		theIoPackage.initializePackageContents();
		theLangPackage.initializePackageContents();
		theGraphPackage.initializePackageContents();
		theStreamPackage.initializePackageContents();
		theFilePackage.initializePackageContents();
		theReplayablePackage.initializePackageContents();
		theViewPackage.initializePackageContents();
		theGraphPackage_1.initializePackageContents();
		theImplementationsPackage.initializePackageContents();
		theStreamPackage_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUtilPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UtilPackage.eNS_URI, theUtilPackage);
		return theUtilPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getArrayList() {
		return arrayListEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCollection() {
		return collectionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getHashMap() {
		return hashMapEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIterator() {
		return iteratorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMap() {
		return mapEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UtilFactoryOld getUtilFactory() {
		return (UtilFactoryOld)getEFactoryInstance();
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

		// Create data types
		arrayListEDataType = createEDataType(ARRAY_LIST);
		collectionEDataType = createEDataType(COLLECTION);
		hashMapEDataType = createEDataType(HASH_MAP);
		iteratorEDataType = createEDataType(ITERATOR);
		mapEDataType = createEDataType(MAP);
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

		// Initialize data types
		initEDataType(arrayListEDataType, ArrayList.class, "ArrayList", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(collectionEDataType, Collection.class, "Collection", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(hashMapEDataType, HashMap.class, "HashMap", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iteratorEDataType, Iterator.class, "Iterator", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(mapEDataType, Map.class, "Map", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
	}

} //UtilPackageImpl
