/**
 */
package ecore.org.graphstream.graph.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import ecore.EcorePackage;
import ecore.datatypes.java.io.IoPackage;
import ecore.datatypes.java.io.impl.IoPackageImpl;
import ecore.datatypes.java.lang.LangPackage;
import ecore.datatypes.java.lang.impl.LangPackageImpl;
import ecore.datatypes.java.util.UtilPackage;
import ecore.datatypes.java.util.impl.UtilPackageImpl;
import ecore.datatypes.org.graphstream.stream.StreamPackage;
import ecore.datatypes.org.graphstream.stream.Replayable.ReplayablePackage;
import ecore.datatypes.org.graphstream.stream.Replayable.impl.ReplayablePackageImpl;
import ecore.datatypes.org.graphstream.stream.file.FilePackage;
import ecore.datatypes.org.graphstream.stream.file.impl.FilePackageImpl;
import ecore.datatypes.org.graphstream.stream.impl.StreamPackageImpl;
import ecore.datatypes.org.graphstream.ui.view.ViewPackage;
import ecore.datatypes.org.graphstream.ui.view.impl.ViewPackageImpl;
import ecore.impl.EcorePackageImpl;
import ecore.org.graphstream.graph.Edge;
import ecore.org.graphstream.graph.Element;
import ecore.org.graphstream.graph.Graph;
import ecore.org.graphstream.graph.GraphFactoryOld;
import ecore.org.graphstream.graph.GraphPackage;
import ecore.org.graphstream.graph.Node;
import ecore.org.graphstream.graph.Structure;
import ecore.org.graphstream.graph.implementations.ImplementationsPackage;
import ecore.org.graphstream.graph.implementations.impl.ImplementationsPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GraphPackageImpl extends EPackageImpl implements GraphPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureEClass = null;

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
	 * @see ecore.org.graphstream.graph.GraphPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GraphPackageImpl() {
		super(eNS_URI, GraphFactoryOld.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GraphPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GraphPackage init() {
		if (isInited) return (GraphPackage)EPackage.Registry.INSTANCE.getEPackage(GraphPackage.eNS_URI);

		// Obtain or create and register package
		GraphPackageImpl theGraphPackage = (GraphPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GraphPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GraphPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		EcorePackageImpl theEcorePackage = (EcorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI) instanceof EcorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI) : EcorePackage.eINSTANCE);
		IoPackageImpl theIoPackage = (IoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IoPackage.eNS_URI) instanceof IoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IoPackage.eNS_URI) : IoPackage.eINSTANCE);
		LangPackageImpl theLangPackage = (LangPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LangPackage.eNS_URI) instanceof LangPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LangPackage.eNS_URI) : LangPackage.eINSTANCE);
		UtilPackageImpl theUtilPackage = (UtilPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI) instanceof UtilPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI) : UtilPackage.eINSTANCE);
		ecore.datatypes.org.graphstream.graph.impl.GraphPackageImpl theGraphPackage_1 = (ecore.datatypes.org.graphstream.graph.impl.GraphPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ecore.datatypes.org.graphstream.graph.GraphPackage.eNS_URI) instanceof ecore.datatypes.org.graphstream.graph.impl.GraphPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ecore.datatypes.org.graphstream.graph.GraphPackage.eNS_URI) : ecore.datatypes.org.graphstream.graph.GraphPackage.eINSTANCE);
		StreamPackageImpl theStreamPackage = (StreamPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StreamPackage.eNS_URI) instanceof StreamPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StreamPackage.eNS_URI) : StreamPackage.eINSTANCE);
		FilePackageImpl theFilePackage = (FilePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FilePackage.eNS_URI) instanceof FilePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FilePackage.eNS_URI) : FilePackage.eINSTANCE);
		ReplayablePackageImpl theReplayablePackage = (ReplayablePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ReplayablePackage.eNS_URI) instanceof ReplayablePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ReplayablePackage.eNS_URI) : ReplayablePackage.eINSTANCE);
		ViewPackageImpl theViewPackage = (ViewPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ViewPackage.eNS_URI) instanceof ViewPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ViewPackage.eNS_URI) : ViewPackage.eINSTANCE);
		ImplementationsPackageImpl theImplementationsPackage = (ImplementationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ImplementationsPackage.eNS_URI) instanceof ImplementationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ImplementationsPackage.eNS_URI) : ImplementationsPackage.eINSTANCE);
		ecore.org.graphstream.stream.impl.StreamPackageImpl theStreamPackage_1 = (ecore.org.graphstream.stream.impl.StreamPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ecore.org.graphstream.stream.StreamPackage.eNS_URI) instanceof ecore.org.graphstream.stream.impl.StreamPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ecore.org.graphstream.stream.StreamPackage.eNS_URI) : ecore.org.graphstream.stream.StreamPackage.eINSTANCE);

		// Create package meta-data objects
		theGraphPackage.createPackageContents();
		theEcorePackage.createPackageContents();
		theIoPackage.createPackageContents();
		theLangPackage.createPackageContents();
		theUtilPackage.createPackageContents();
		theGraphPackage_1.createPackageContents();
		theStreamPackage.createPackageContents();
		theFilePackage.createPackageContents();
		theReplayablePackage.createPackageContents();
		theViewPackage.createPackageContents();
		theImplementationsPackage.createPackageContents();
		theStreamPackage_1.createPackageContents();

		// Initialize created meta-data
		theGraphPackage.initializePackageContents();
		theEcorePackage.initializePackageContents();
		theIoPackage.initializePackageContents();
		theLangPackage.initializePackageContents();
		theUtilPackage.initializePackageContents();
		theGraphPackage_1.initializePackageContents();
		theStreamPackage.initializePackageContents();
		theFilePackage.initializePackageContents();
		theReplayablePackage.initializePackageContents();
		theViewPackage.initializePackageContents();
		theImplementationsPackage.initializePackageContents();
		theStreamPackage_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGraphPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GraphPackage.eNS_URI, theGraphPackage);
		return theGraphPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEdge() {
		return edgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEdge__IsDirected() {
		return edgeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEdge__IsLoop() {
		return edgeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEdge__GetNode0() {
		return edgeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEdge__GetNode1() {
		return edgeEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEdge__GetSourceNode() {
		return edgeEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEdge__GetTargetNode() {
		return edgeEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEdge__GetOpposite__Node() {
		return edgeEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElement__GetId() {
		return elementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElement__GetIndex() {
		return elementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElement__GetAttribute__String() {
		return elementEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElement__GetFirstAttributeOf__String() {
		return elementEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElement__GetAttribute__String_Class() {
		return elementEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElement__GetFirstAttributeOf__Class_String() {
		return elementEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElement__GetLabel__String() {
		return elementEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElement__GetNumber__String() {
		return elementEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElement__GetVector__String() {
		return elementEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElement__GetArray__String() {
		return elementEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElement__GetHash__String() {
		return elementEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElement__HasAttribute__String() {
		return elementEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElement__HasAttribute__String_Class() {
		return elementEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElement__HasLabel__String() {
		return elementEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElement__HasNumber__String() {
		return elementEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElement__HasVector__String() {
		return elementEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElement__HasArray__String() {
		return elementEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElement__HasHash__String() {
		return elementEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElement__GetAttributeKeyIterator() {
		return elementEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElement__GetEachAttributeKey() {
		return elementEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElement__GetAttributeKeySet() {
		return elementEClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElement__ClearAttributes() {
		return elementEClass.getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElement__AddAttribute__String_Object() {
		return elementEClass.getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElement__ChangeAttribute__String_Object() {
		return elementEClass.getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElement__SetAttribute__String_Object() {
		return elementEClass.getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElement__AddAttributes__Map() {
		return elementEClass.getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElement__RemoveAttribute__String() {
		return elementEClass.getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElement__GetAttributeCount() {
		return elementEClass.getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGraph() {
		return graphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGraph__GetNode__String() {
		return graphEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGraph__GetEdge__String() {
		return graphEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGraph__NodeFactory() {
		return graphEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGraph__EdgeFactory() {
		return graphEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGraph__IsStrict() {
		return graphEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGraph__IsAutoCreationEnabled() {
		return graphEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGraph__NullAttributesAreErrors() {
		return graphEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGraph__GetStep() {
		return graphEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGraph__SetNullAttributesAreErrors__boolean() {
		return graphEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGraph__SetNodeFactory__NodeFactory() {
		return graphEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGraph__SetEdgeFactory__EdgeFactory() {
		return graphEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGraph__SetStrict__boolean() {
		return graphEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGraph__SetAutoCreate__boolean() {
		return graphEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGraph__Clear() {
		return graphEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGraph__AddNode__String() {
		return graphEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGraph__RemoveNode__String() {
		return graphEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGraph__AddEdge__String_String_String() {
		return graphEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGraph__AddEdge__String_String_String_boolean() {
		return graphEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGraph__RemoveEdge__String_String() {
		return graphEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGraph__RemoveEdge__String() {
		return graphEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGraph__StepBegins__double() {
		return graphEClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGraph__AttributeSinks() {
		return graphEClass.getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGraph__ElementSinks() {
		return graphEClass.getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGraph__Read__String() {
		return graphEClass.getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGraph__Read__FileSource_String() {
		return graphEClass.getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGraph__Write__String() {
		return graphEClass.getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGraph__Write__FileSink_String() {
		return graphEClass.getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGraph__Display() {
		return graphEClass.getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGraph__Display__boolean() {
		return graphEClass.getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGraph__GetNode__int() {
		return graphEClass.getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGraph__GetEdge__int() {
		return graphEClass.getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGraph__AddEdge__String_int_int() {
		return graphEClass.getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGraph__AddEdge__String_int_int_boolean() {
		return graphEClass.getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGraph__AddEdge__String_Node_Node() {
		return graphEClass.getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGraph__AddEdge__String_Node_Node_boolean() {
		return graphEClass.getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGraph__RemoveEdge__int() {
		return graphEClass.getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGraph__RemoveEdge__int_int() {
		return graphEClass.getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGraph__RemoveEdge__Node_Node() {
		return graphEClass.getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGraph__RemoveEdge__Edge() {
		return graphEClass.getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGraph__RemoveNode__int() {
		return graphEClass.getEOperations().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGraph__RemoveNode__Node() {
		return graphEClass.getEOperations().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNode__GetGraph() {
		return nodeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNode__GetDegree() {
		return nodeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNode__GetOutDegree() {
		return nodeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNode__GetInDegree() {
		return nodeEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNode__HasEdgeToward__String() {
		return nodeEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNode__HasEdgeFrom__String() {
		return nodeEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNode__HasEdgeBetween__String() {
		return nodeEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNode__GetEdgeToward__String() {
		return nodeEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNode__GetEdgeFrom__String() {
		return nodeEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNode__GetEdgeBetween__String() {
		return nodeEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNode__GetEdgeIterator() {
		return nodeEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNode__GetEnteringEdgeIterator() {
		return nodeEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNode__GetLeavingEdgeIterator() {
		return nodeEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNode__GetNeighborNodeIterator() {
		return nodeEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNode__GetEdge__int() {
		return nodeEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNode__GetEnteringEdge__int() {
		return nodeEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNode__GetLeavingEdge__int() {
		return nodeEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNode__GetBreadthFirstIterator() {
		return nodeEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNode__GetBreadthFirstIterator__boolean() {
		return nodeEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNode__GetDepthFirstIterator() {
		return nodeEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNode__GetDepthFirstIterator__boolean() {
		return nodeEClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNode__GetEachEdge() {
		return nodeEClass.getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNode__GetEachLeavingEdge() {
		return nodeEClass.getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNode__GetEachEnteringEdge() {
		return nodeEClass.getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNode__GetEdgeSet() {
		return nodeEClass.getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNode__GetLeavingEdgeSet() {
		return nodeEClass.getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNode__GetEnteringEdgeSet() {
		return nodeEClass.getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNode__ToString() {
		return nodeEClass.getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNode__HasEdgeToward__Node() {
		return nodeEClass.getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNode__HasEdgeToward__int() {
		return nodeEClass.getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNode__HasEdgeFrom__Node() {
		return nodeEClass.getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNode__HasEdgeFrom__int() {
		return nodeEClass.getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNode__HasEdgeBetween__Node() {
		return nodeEClass.getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNode__HasEdgeBetween__int() {
		return nodeEClass.getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNode__GetEdgeToward__Node() {
		return nodeEClass.getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNode__GetEdgeToward__int() {
		return nodeEClass.getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNode__GetEdgeFrom__Node() {
		return nodeEClass.getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNode__GetEdgeFrom__int() {
		return nodeEClass.getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNode__GetEdgeBetween__Node() {
		return nodeEClass.getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNode__GetEdgeBetween__int() {
		return nodeEClass.getEOperations().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructure() {
		return structureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStructure__GetNodeCount() {
		return structureEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStructure__GetEdgeCount() {
		return structureEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStructure__GetNodeIterator() {
		return structureEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStructure__GetEdgeIterator() {
		return structureEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStructure__GetEachNode() {
		return structureEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStructure__GetEachEdge() {
		return structureEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStructure__GetNodeSet() {
		return structureEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStructure__GetEdgeSet() {
		return structureEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphFactoryOld getGraphFactory() {
		return (GraphFactoryOld)getEFactoryInstance();
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
		edgeEClass = createEClass(EDGE);
		createEOperation(edgeEClass, EDGE___IS_DIRECTED);
		createEOperation(edgeEClass, EDGE___IS_LOOP);
		createEOperation(edgeEClass, EDGE___GET_NODE0);
		createEOperation(edgeEClass, EDGE___GET_NODE1);
		createEOperation(edgeEClass, EDGE___GET_SOURCE_NODE);
		createEOperation(edgeEClass, EDGE___GET_TARGET_NODE);
		createEOperation(edgeEClass, EDGE___GET_OPPOSITE__NODE);

		elementEClass = createEClass(ELEMENT);
		createEOperation(elementEClass, ELEMENT___GET_ID);
		createEOperation(elementEClass, ELEMENT___GET_INDEX);
		createEOperation(elementEClass, ELEMENT___GET_ATTRIBUTE__STRING);
		createEOperation(elementEClass, ELEMENT___GET_FIRST_ATTRIBUTE_OF__STRING);
		createEOperation(elementEClass, ELEMENT___GET_ATTRIBUTE__STRING_CLASS);
		createEOperation(elementEClass, ELEMENT___GET_FIRST_ATTRIBUTE_OF__CLASS_STRING);
		createEOperation(elementEClass, ELEMENT___GET_LABEL__STRING);
		createEOperation(elementEClass, ELEMENT___GET_NUMBER__STRING);
		createEOperation(elementEClass, ELEMENT___GET_VECTOR__STRING);
		createEOperation(elementEClass, ELEMENT___GET_ARRAY__STRING);
		createEOperation(elementEClass, ELEMENT___GET_HASH__STRING);
		createEOperation(elementEClass, ELEMENT___HAS_ATTRIBUTE__STRING);
		createEOperation(elementEClass, ELEMENT___HAS_ATTRIBUTE__STRING_CLASS);
		createEOperation(elementEClass, ELEMENT___HAS_LABEL__STRING);
		createEOperation(elementEClass, ELEMENT___HAS_NUMBER__STRING);
		createEOperation(elementEClass, ELEMENT___HAS_VECTOR__STRING);
		createEOperation(elementEClass, ELEMENT___HAS_ARRAY__STRING);
		createEOperation(elementEClass, ELEMENT___HAS_HASH__STRING);
		createEOperation(elementEClass, ELEMENT___GET_ATTRIBUTE_KEY_ITERATOR);
		createEOperation(elementEClass, ELEMENT___GET_EACH_ATTRIBUTE_KEY);
		createEOperation(elementEClass, ELEMENT___GET_ATTRIBUTE_KEY_SET);
		createEOperation(elementEClass, ELEMENT___CLEAR_ATTRIBUTES);
		createEOperation(elementEClass, ELEMENT___ADD_ATTRIBUTE__STRING_OBJECT);
		createEOperation(elementEClass, ELEMENT___CHANGE_ATTRIBUTE__STRING_OBJECT);
		createEOperation(elementEClass, ELEMENT___SET_ATTRIBUTE__STRING_OBJECT);
		createEOperation(elementEClass, ELEMENT___ADD_ATTRIBUTES__MAP);
		createEOperation(elementEClass, ELEMENT___REMOVE_ATTRIBUTE__STRING);
		createEOperation(elementEClass, ELEMENT___GET_ATTRIBUTE_COUNT);

		graphEClass = createEClass(GRAPH);
		createEOperation(graphEClass, GRAPH___GET_NODE__STRING);
		createEOperation(graphEClass, GRAPH___GET_EDGE__STRING);
		createEOperation(graphEClass, GRAPH___NODE_FACTORY);
		createEOperation(graphEClass, GRAPH___EDGE_FACTORY);
		createEOperation(graphEClass, GRAPH___IS_STRICT);
		createEOperation(graphEClass, GRAPH___IS_AUTO_CREATION_ENABLED);
		createEOperation(graphEClass, GRAPH___NULL_ATTRIBUTES_ARE_ERRORS);
		createEOperation(graphEClass, GRAPH___GET_STEP);
		createEOperation(graphEClass, GRAPH___SET_NULL_ATTRIBUTES_ARE_ERRORS__BOOLEAN);
		createEOperation(graphEClass, GRAPH___SET_NODE_FACTORY__NODEFACTORY);
		createEOperation(graphEClass, GRAPH___SET_EDGE_FACTORY__EDGEFACTORY);
		createEOperation(graphEClass, GRAPH___SET_STRICT__BOOLEAN);
		createEOperation(graphEClass, GRAPH___SET_AUTO_CREATE__BOOLEAN);
		createEOperation(graphEClass, GRAPH___CLEAR);
		createEOperation(graphEClass, GRAPH___ADD_NODE__STRING);
		createEOperation(graphEClass, GRAPH___REMOVE_NODE__STRING);
		createEOperation(graphEClass, GRAPH___ADD_EDGE__STRING_STRING_STRING);
		createEOperation(graphEClass, GRAPH___ADD_EDGE__STRING_STRING_STRING_BOOLEAN);
		createEOperation(graphEClass, GRAPH___REMOVE_EDGE__STRING_STRING);
		createEOperation(graphEClass, GRAPH___REMOVE_EDGE__STRING);
		createEOperation(graphEClass, GRAPH___STEP_BEGINS__DOUBLE);
		createEOperation(graphEClass, GRAPH___ATTRIBUTE_SINKS);
		createEOperation(graphEClass, GRAPH___ELEMENT_SINKS);
		createEOperation(graphEClass, GRAPH___READ__STRING);
		createEOperation(graphEClass, GRAPH___READ__FILESOURCE_STRING);
		createEOperation(graphEClass, GRAPH___WRITE__STRING);
		createEOperation(graphEClass, GRAPH___WRITE__FILESINK_STRING);
		createEOperation(graphEClass, GRAPH___DISPLAY);
		createEOperation(graphEClass, GRAPH___DISPLAY__BOOLEAN);
		createEOperation(graphEClass, GRAPH___GET_NODE__INT);
		createEOperation(graphEClass, GRAPH___GET_EDGE__INT);
		createEOperation(graphEClass, GRAPH___ADD_EDGE__STRING_INT_INT);
		createEOperation(graphEClass, GRAPH___ADD_EDGE__STRING_INT_INT_BOOLEAN);
		createEOperation(graphEClass, GRAPH___ADD_EDGE__STRING_NODE_NODE);
		createEOperation(graphEClass, GRAPH___ADD_EDGE__STRING_NODE_NODE_BOOLEAN);
		createEOperation(graphEClass, GRAPH___REMOVE_EDGE__INT);
		createEOperation(graphEClass, GRAPH___REMOVE_EDGE__INT_INT);
		createEOperation(graphEClass, GRAPH___REMOVE_EDGE__NODE_NODE);
		createEOperation(graphEClass, GRAPH___REMOVE_EDGE__EDGE);
		createEOperation(graphEClass, GRAPH___REMOVE_NODE__INT);
		createEOperation(graphEClass, GRAPH___REMOVE_NODE__NODE);

		nodeEClass = createEClass(NODE);
		createEOperation(nodeEClass, NODE___GET_GRAPH);
		createEOperation(nodeEClass, NODE___GET_DEGREE);
		createEOperation(nodeEClass, NODE___GET_OUT_DEGREE);
		createEOperation(nodeEClass, NODE___GET_IN_DEGREE);
		createEOperation(nodeEClass, NODE___HAS_EDGE_TOWARD__STRING);
		createEOperation(nodeEClass, NODE___HAS_EDGE_FROM__STRING);
		createEOperation(nodeEClass, NODE___HAS_EDGE_BETWEEN__STRING);
		createEOperation(nodeEClass, NODE___GET_EDGE_TOWARD__STRING);
		createEOperation(nodeEClass, NODE___GET_EDGE_FROM__STRING);
		createEOperation(nodeEClass, NODE___GET_EDGE_BETWEEN__STRING);
		createEOperation(nodeEClass, NODE___GET_EDGE_ITERATOR);
		createEOperation(nodeEClass, NODE___GET_ENTERING_EDGE_ITERATOR);
		createEOperation(nodeEClass, NODE___GET_LEAVING_EDGE_ITERATOR);
		createEOperation(nodeEClass, NODE___GET_NEIGHBOR_NODE_ITERATOR);
		createEOperation(nodeEClass, NODE___GET_EDGE__INT);
		createEOperation(nodeEClass, NODE___GET_ENTERING_EDGE__INT);
		createEOperation(nodeEClass, NODE___GET_LEAVING_EDGE__INT);
		createEOperation(nodeEClass, NODE___GET_BREADTH_FIRST_ITERATOR);
		createEOperation(nodeEClass, NODE___GET_BREADTH_FIRST_ITERATOR__BOOLEAN);
		createEOperation(nodeEClass, NODE___GET_DEPTH_FIRST_ITERATOR);
		createEOperation(nodeEClass, NODE___GET_DEPTH_FIRST_ITERATOR__BOOLEAN);
		createEOperation(nodeEClass, NODE___GET_EACH_EDGE);
		createEOperation(nodeEClass, NODE___GET_EACH_LEAVING_EDGE);
		createEOperation(nodeEClass, NODE___GET_EACH_ENTERING_EDGE);
		createEOperation(nodeEClass, NODE___GET_EDGE_SET);
		createEOperation(nodeEClass, NODE___GET_LEAVING_EDGE_SET);
		createEOperation(nodeEClass, NODE___GET_ENTERING_EDGE_SET);
		createEOperation(nodeEClass, NODE___TO_STRING);
		createEOperation(nodeEClass, NODE___HAS_EDGE_TOWARD__NODE);
		createEOperation(nodeEClass, NODE___HAS_EDGE_TOWARD__INT);
		createEOperation(nodeEClass, NODE___HAS_EDGE_FROM__NODE);
		createEOperation(nodeEClass, NODE___HAS_EDGE_FROM__INT);
		createEOperation(nodeEClass, NODE___HAS_EDGE_BETWEEN__NODE);
		createEOperation(nodeEClass, NODE___HAS_EDGE_BETWEEN__INT);
		createEOperation(nodeEClass, NODE___GET_EDGE_TOWARD__NODE);
		createEOperation(nodeEClass, NODE___GET_EDGE_TOWARD__INT);
		createEOperation(nodeEClass, NODE___GET_EDGE_FROM__NODE);
		createEOperation(nodeEClass, NODE___GET_EDGE_FROM__INT);
		createEOperation(nodeEClass, NODE___GET_EDGE_BETWEEN__NODE);
		createEOperation(nodeEClass, NODE___GET_EDGE_BETWEEN__INT);

		structureEClass = createEClass(STRUCTURE);
		createEOperation(structureEClass, STRUCTURE___GET_NODE_COUNT);
		createEOperation(structureEClass, STRUCTURE___GET_EDGE_COUNT);
		createEOperation(structureEClass, STRUCTURE___GET_NODE_ITERATOR);
		createEOperation(structureEClass, STRUCTURE___GET_EDGE_ITERATOR);
		createEOperation(structureEClass, STRUCTURE___GET_EACH_NODE);
		createEOperation(structureEClass, STRUCTURE___GET_EACH_EDGE);
		createEOperation(structureEClass, STRUCTURE___GET_NODE_SET);
		createEOperation(structureEClass, STRUCTURE___GET_EDGE_SET);
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
		ImplementationsPackage theImplementationsPackage = (ImplementationsPackage)EPackage.Registry.INSTANCE.getEPackage(ImplementationsPackage.eNS_URI);
		LangPackage theLangPackage = (LangPackage)EPackage.Registry.INSTANCE.getEPackage(LangPackage.eNS_URI);
		UtilPackage theUtilPackage = (UtilPackage)EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI);
		ecore.org.graphstream.stream.StreamPackage theStreamPackage_1 = (ecore.org.graphstream.stream.StreamPackage)EPackage.Registry.INSTANCE.getEPackage(ecore.org.graphstream.stream.StreamPackage.eNS_URI);
		ecore.datatypes.org.graphstream.graph.GraphPackage theGraphPackage_1 = (ecore.datatypes.org.graphstream.graph.GraphPackage)EPackage.Registry.INSTANCE.getEPackage(ecore.datatypes.org.graphstream.graph.GraphPackage.eNS_URI);
		IoPackage theIoPackage = (IoPackage)EPackage.Registry.INSTANCE.getEPackage(IoPackage.eNS_URI);
		StreamPackage theStreamPackage = (StreamPackage)EPackage.Registry.INSTANCE.getEPackage(StreamPackage.eNS_URI);
		FilePackage theFilePackage = (FilePackage)EPackage.Registry.INSTANCE.getEPackage(FilePackage.eNS_URI);
		ViewPackage theViewPackage = (ViewPackage)EPackage.Registry.INSTANCE.getEPackage(ViewPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theImplementationsPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		edgeEClass.getESuperTypes().add(this.getElement());
		graphEClass.getESuperTypes().add(this.getElement());
		graphEClass.getESuperTypes().add(theStreamPackage_1.getPipe());
		graphEClass.getESuperTypes().add(this.getStructure());
		nodeEClass.getESuperTypes().add(this.getElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(edgeEClass, Edge.class, "Edge", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getEdge__IsDirected(), ecorePackage.getEBoolean(), "isDirected", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getEdge__IsLoop(), ecorePackage.getEBoolean(), "isLoop", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getEdge__GetNode0(), null, "getNode0", 0, 1, IS_UNIQUE, IS_ORDERED);
		ETypeParameter t1 = addETypeParameter(op, "T");
		EGenericType g1 = createEGenericType(this.getNode());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getEdge__GetNode1(), null, "getNode1", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getNode());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getEdge__GetSourceNode(), null, "getSourceNode", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getNode());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getEdge__GetTargetNode(), null, "getTargetNode", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getNode());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getEdge__GetOpposite__Node(), null, "getOpposite", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getNode());
		t1.getEBounds().add(g1);
		addEParameter(op, this.getNode(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getElement__GetId(), ecorePackage.getEString(), "getId", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getElement__GetIndex(), ecorePackage.getEInt(), "getIndex", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getElement__GetAttribute__String(), null, "getAttribute", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getElement__GetFirstAttributeOf__String(), null, "getFirstAttributeOf", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		addEParameter(op, theLangPackage.getStringArray(), "keys", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getElement__GetAttribute__String_Class(), null, "getAttribute", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		EGenericType g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "clazz", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getElement__GetFirstAttributeOf__Class_String(), null, "getFirstAttributeOf", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "clazz", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theLangPackage.getStringArray(), "keys", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getElement__GetLabel__String(), theLangPackage.getCharSequence(), "getLabel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getElement__GetNumber__String(), ecorePackage.getEDouble(), "getNumber", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getElement__GetVector__String(), null, "getVector", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theUtilPackage.getArrayList());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType(theLangPackage.getNumber());
		g2.setEUpperBound(g3);
		initEOperation(op, g1);

		op = initEOperation(getElement__GetArray__String(), theLangPackage.getObjectArray(), "getArray", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getElement__GetHash__String(), null, "getHash", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theUtilPackage.getHashMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getElement__HasAttribute__String(), ecorePackage.getEBoolean(), "hasAttribute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getElement__HasAttribute__String_Class(), ecorePackage.getEBoolean(), "hasAttribute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "clazz", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getElement__HasLabel__String(), ecorePackage.getEBoolean(), "hasLabel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getElement__HasNumber__String(), ecorePackage.getEBoolean(), "hasNumber", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getElement__HasVector__String(), ecorePackage.getEBoolean(), "hasVector", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getElement__HasArray__String(), ecorePackage.getEBoolean(), "hasArray", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getElement__HasHash__String(), ecorePackage.getEBoolean(), "hasHash", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getElement__GetAttributeKeyIterator(), null, "getAttributeKeyIterator", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theUtilPackage.getIterator());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getElement__GetEachAttributeKey(), null, "getEachAttributeKey", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theLangPackage.getIterable());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getElement__GetAttributeKeySet(), null, "getAttributeKeySet", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theUtilPackage.getCollection());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEOperation(getElement__ClearAttributes(), null, "clearAttributes", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getElement__AddAttribute__String_Object(), null, "addAttribute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "attribute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theLangPackage.getObjectArray(), "values", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getElement__ChangeAttribute__String_Object(), null, "changeAttribute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "attribute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theLangPackage.getObjectArray(), "values", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getElement__SetAttribute__String_Object(), null, "setAttribute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "attribute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theLangPackage.getObjectArray(), "values", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getElement__AddAttributes__Map(), null, "addAttributes", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theUtilPackage.getMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "attributes", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getElement__RemoveAttribute__String(), null, "removeAttribute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "attribute", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getElement__GetAttributeCount(), ecorePackage.getEInt(), "getAttributeCount", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(graphEClass, Graph.class, "Graph", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getGraph__GetNode__String(), null, "getNode", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getNode());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEString(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getGraph__GetEdge__String(), null, "getEdge", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getEdge());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEString(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getGraph__NodeFactory(), null, "nodeFactory", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theGraphPackage_1.getNodeFactory());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(this.getNode());
		g2.setEUpperBound(g3);
		initEOperation(op, g1);

		op = initEOperation(getGraph__EdgeFactory(), null, "edgeFactory", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theGraphPackage_1.getEdgeFactory());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(this.getEdge());
		g2.setEUpperBound(g3);
		initEOperation(op, g1);

		initEOperation(getGraph__IsStrict(), ecorePackage.getEBoolean(), "isStrict", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGraph__IsAutoCreationEnabled(), ecorePackage.getEBoolean(), "isAutoCreationEnabled", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGraph__NullAttributesAreErrors(), ecorePackage.getEBoolean(), "nullAttributesAreErrors", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGraph__GetStep(), ecorePackage.getEDouble(), "getStep", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getGraph__SetNullAttributesAreErrors__boolean(), null, "setNullAttributesAreErrors", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "on", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getGraph__SetNodeFactory__NodeFactory(), null, "setNodeFactory", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theGraphPackage_1.getNodeFactory());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(this.getNode());
		g2.setEUpperBound(g3);
		addEParameter(op, g1, "nf", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getGraph__SetEdgeFactory__EdgeFactory(), null, "setEdgeFactory", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theGraphPackage_1.getEdgeFactory());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(this.getEdge());
		g2.setEUpperBound(g3);
		addEParameter(op, g1, "ef", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getGraph__SetStrict__boolean(), null, "setStrict", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "on", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getGraph__SetAutoCreate__boolean(), null, "setAutoCreate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "on", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGraph__Clear(), null, "clear", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getGraph__AddNode__String(), null, "addNode", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getNode());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEString(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theGraphPackage_1.getIdAlreadyInUseException());
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getGraph__RemoveNode__String(), null, "removeNode", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getNode());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEString(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theGraphPackage_1.getElementNotFoundException());
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getGraph__AddEdge__String_String_String(), null, "addEdge", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getEdge());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEString(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "node1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "node2", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theGraphPackage_1.getIdAlreadyInUseException());
		addEException(op, theGraphPackage_1.getElementNotFoundException());
		addEException(op, theGraphPackage_1.getEdgeRejectedException());
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getGraph__AddEdge__String_String_String_boolean(), null, "addEdge", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getEdge());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEString(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "from", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "to", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "directed", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theGraphPackage_1.getIdAlreadyInUseException());
		addEException(op, theGraphPackage_1.getElementNotFoundException());
		addEException(op, theGraphPackage_1.getEdgeRejectedException());
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getGraph__RemoveEdge__String_String(), null, "removeEdge", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getEdge());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEString(), "from", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "to", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theGraphPackage_1.getElementNotFoundException());
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getGraph__RemoveEdge__String(), null, "removeEdge", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getEdge());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEString(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theGraphPackage_1.getElementNotFoundException());
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getGraph__StepBegins__double(), null, "stepBegins", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "time", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getGraph__AttributeSinks(), null, "attributeSinks", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theLangPackage.getIterable());
		g2 = createEGenericType(theStreamPackage_1.getAttributeSink());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getGraph__ElementSinks(), null, "elementSinks", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theLangPackage.getIterable());
		g2 = createEGenericType(theStreamPackage_1.getElementSink());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getGraph__Read__String(), null, "read", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "filename", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theIoPackage.getIOException());
		addEException(op, theStreamPackage.getGraphParseException());
		addEException(op, theGraphPackage_1.getElementNotFoundException());

		op = initEOperation(getGraph__Read__FileSource_String(), null, "read", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFilePackage.getFileSource(), "input", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "filename", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theIoPackage.getIOException());
		addEException(op, theStreamPackage.getGraphParseException());

		op = initEOperation(getGraph__Write__String(), null, "write", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "filename", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theIoPackage.getIOException());

		op = initEOperation(getGraph__Write__FileSink_String(), null, "write", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFilePackage.getFileSink(), "output", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "filename", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theIoPackage.getIOException());

		initEOperation(getGraph__Display(), theViewPackage.getViewer(), "display", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getGraph__Display__boolean(), theViewPackage.getViewer(), "display", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "autoLayout", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getGraph__GetNode__int(), null, "getNode", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getNode());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEInt(), "index", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theLangPackage.getIndexOutOfBoundsException());
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getGraph__GetEdge__int(), null, "getEdge", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getEdge());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEInt(), "index", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theLangPackage.getIndexOutOfBoundsException());
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getGraph__AddEdge__String_int_int(), null, "addEdge", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getEdge());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEString(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "index1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "index2", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theLangPackage.getIndexOutOfBoundsException());
		addEException(op, theGraphPackage_1.getIdAlreadyInUseException());
		addEException(op, theGraphPackage_1.getEdgeRejectedException());
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getGraph__AddEdge__String_int_int_boolean(), null, "addEdge", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getEdge());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEString(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "fromIndex", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "toIndex", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "directed", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theLangPackage.getIndexOutOfBoundsException());
		addEException(op, theGraphPackage_1.getIdAlreadyInUseException());
		addEException(op, theGraphPackage_1.getEdgeRejectedException());
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getGraph__AddEdge__String_Node_Node(), null, "addEdge", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getEdge());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEString(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNode(), "node1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNode(), "node2", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theGraphPackage_1.getIdAlreadyInUseException());
		addEException(op, theGraphPackage_1.getEdgeRejectedException());
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getGraph__AddEdge__String_Node_Node_boolean(), null, "addEdge", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getEdge());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEString(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNode(), "from", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNode(), "to", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "directed", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theGraphPackage_1.getIdAlreadyInUseException());
		addEException(op, theGraphPackage_1.getEdgeRejectedException());
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getGraph__RemoveEdge__int(), null, "removeEdge", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getEdge());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEInt(), "index", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theLangPackage.getIndexOutOfBoundsException());
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getGraph__RemoveEdge__int_int(), null, "removeEdge", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getEdge());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEInt(), "fromIndex", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "toIndex", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theLangPackage.getIndexOutOfBoundsException());
		addEException(op, theGraphPackage_1.getElementNotFoundException());
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getGraph__RemoveEdge__Node_Node(), null, "removeEdge", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getEdge());
		t1.getEBounds().add(g1);
		addEParameter(op, this.getNode(), "node1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNode(), "node2", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theGraphPackage_1.getElementNotFoundException());
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getGraph__RemoveEdge__Edge(), null, "removeEdge", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getEdge());
		t1.getEBounds().add(g1);
		addEParameter(op, this.getEdge(), "edge", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getGraph__RemoveNode__int(), null, "removeNode", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getNode());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEInt(), "index", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theLangPackage.getIndexOutOfBoundsException());
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getGraph__RemoveNode__Node(), null, "removeNode", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getNode());
		t1.getEBounds().add(g1);
		addEParameter(op, this.getNode(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		initEClass(nodeEClass, Node.class, "Node", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getNode__GetGraph(), this.getGraph(), "getGraph", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getNode__GetDegree(), ecorePackage.getEInt(), "getDegree", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getNode__GetOutDegree(), ecorePackage.getEInt(), "getOutDegree", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getNode__GetInDegree(), ecorePackage.getEInt(), "getInDegree", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNode__HasEdgeToward__String(), ecorePackage.getEBoolean(), "hasEdgeToward", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNode__HasEdgeFrom__String(), ecorePackage.getEBoolean(), "hasEdgeFrom", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNode__HasEdgeBetween__String(), ecorePackage.getEBoolean(), "hasEdgeBetween", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNode__GetEdgeToward__String(), null, "getEdgeToward", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getEdge());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEString(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getNode__GetEdgeFrom__String(), null, "getEdgeFrom", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getEdge());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEString(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getNode__GetEdgeBetween__String(), null, "getEdgeBetween", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getEdge());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEString(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getNode__GetEdgeIterator(), null, "getEdgeIterator", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getEdge());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(theUtilPackage.getIterator());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getNode__GetEnteringEdgeIterator(), null, "getEnteringEdgeIterator", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getEdge());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(theUtilPackage.getIterator());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getNode__GetLeavingEdgeIterator(), null, "getLeavingEdgeIterator", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getEdge());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(theUtilPackage.getIterator());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getNode__GetNeighborNodeIterator(), null, "getNeighborNodeIterator", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getNode());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(theUtilPackage.getIterator());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getNode__GetEdge__int(), null, "getEdge", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getEdge());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEInt(), "i", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getNode__GetEnteringEdge__int(), null, "getEnteringEdge", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getEdge());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEInt(), "i", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getNode__GetLeavingEdge__int(), null, "getLeavingEdge", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getEdge());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEInt(), "i", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getNode__GetBreadthFirstIterator(), null, "getBreadthFirstIterator", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getNode());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(theUtilPackage.getIterator());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getNode__GetBreadthFirstIterator__boolean(), null, "getBreadthFirstIterator", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getNode());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEBoolean(), "directed", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theUtilPackage.getIterator());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getNode__GetDepthFirstIterator(), null, "getDepthFirstIterator", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getNode());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(theUtilPackage.getIterator());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getNode__GetDepthFirstIterator__boolean(), null, "getDepthFirstIterator", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getNode());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEBoolean(), "directed", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theUtilPackage.getIterator());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getNode__GetEachEdge(), null, "getEachEdge", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getEdge());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(theLangPackage.getIterable());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getNode__GetEachLeavingEdge(), null, "getEachLeavingEdge", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getEdge());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(theLangPackage.getIterable());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getNode__GetEachEnteringEdge(), null, "getEachEnteringEdge", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getEdge());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(theLangPackage.getIterable());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getNode__GetEdgeSet(), null, "getEdgeSet", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getEdge());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(theUtilPackage.getCollection());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getNode__GetLeavingEdgeSet(), null, "getLeavingEdgeSet", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getEdge());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(theUtilPackage.getCollection());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getNode__GetEnteringEdgeSet(), null, "getEnteringEdgeSet", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getEdge());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(theUtilPackage.getCollection());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEOperation(getNode__ToString(), ecorePackage.getEString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNode__HasEdgeToward__Node(), ecorePackage.getEBoolean(), "hasEdgeToward", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNode(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNode__HasEdgeToward__int(), ecorePackage.getEBoolean(), "hasEdgeToward", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "index", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theLangPackage.getIndexOutOfBoundsException());

		op = initEOperation(getNode__HasEdgeFrom__Node(), ecorePackage.getEBoolean(), "hasEdgeFrom", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNode(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNode__HasEdgeFrom__int(), ecorePackage.getEBoolean(), "hasEdgeFrom", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "index", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theLangPackage.getIndexOutOfBoundsException());

		op = initEOperation(getNode__HasEdgeBetween__Node(), ecorePackage.getEBoolean(), "hasEdgeBetween", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNode(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNode__HasEdgeBetween__int(), ecorePackage.getEBoolean(), "hasEdgeBetween", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "index", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theLangPackage.getIndexOutOfBoundsException());

		op = initEOperation(getNode__GetEdgeToward__Node(), null, "getEdgeToward", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getEdge());
		t1.getEBounds().add(g1);
		addEParameter(op, this.getNode(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getNode__GetEdgeToward__int(), null, "getEdgeToward", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getEdge());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEInt(), "index", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theLangPackage.getIndexOutOfBoundsException());
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getNode__GetEdgeFrom__Node(), null, "getEdgeFrom", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getEdge());
		t1.getEBounds().add(g1);
		addEParameter(op, this.getNode(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getNode__GetEdgeFrom__int(), null, "getEdgeFrom", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getEdge());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEInt(), "index", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theLangPackage.getIndexOutOfBoundsException());
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getNode__GetEdgeBetween__Node(), null, "getEdgeBetween", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getEdge());
		t1.getEBounds().add(g1);
		addEParameter(op, this.getNode(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getNode__GetEdgeBetween__int(), null, "getEdgeBetween", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getEdge());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEInt(), "index", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theLangPackage.getIndexOutOfBoundsException());
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		initEClass(structureEClass, Structure.class, "Structure", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getStructure__GetNodeCount(), ecorePackage.getEInt(), "getNodeCount", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStructure__GetEdgeCount(), ecorePackage.getEInt(), "getEdgeCount", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getStructure__GetNodeIterator(), null, "getNodeIterator", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getNode());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(theUtilPackage.getIterator());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getStructure__GetEdgeIterator(), null, "getEdgeIterator", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getEdge());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(theUtilPackage.getIterator());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getStructure__GetEachNode(), null, "getEachNode", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getNode());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(theLangPackage.getIterable());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(t1);
		g2.setEUpperBound(g3);
		initEOperation(op, g1);

		op = initEOperation(getStructure__GetEachEdge(), null, "getEachEdge", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getEdge());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(theLangPackage.getIterable());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(t1);
		g2.setEUpperBound(g3);
		initEOperation(op, g1);

		op = initEOperation(getStructure__GetNodeSet(), null, "getNodeSet", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getNode());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(theUtilPackage.getCollection());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getStructure__GetEdgeSet(), null, "getEdgeSet", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getEdge());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(theUtilPackage.getCollection());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);
	}

} //GraphPackageImpl
