/**
 */
package ecore.org.graphstream.graph.implementations.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import ecore.EcorePackage;
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
import ecore.impl.EcorePackageImpl;
import ecore.org.graphstream.graph.implementations.AbstractEdge;
import ecore.org.graphstream.graph.implementations.AbstractElement;
import ecore.org.graphstream.graph.implementations.AbstractGraph;
import ecore.org.graphstream.graph.implementations.AbstractNode;
import ecore.org.graphstream.graph.implementations.ImplementationsFactory;
import ecore.org.graphstream.graph.implementations.ImplementationsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ImplementationsPackageImpl extends EPackageImpl implements ImplementationsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractGraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractNodeEClass = null;

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
	 * @see ecore.org.graphstream.graph.implementations.ImplementationsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ImplementationsPackageImpl() {
		super(eNS_URI, ImplementationsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ImplementationsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ImplementationsPackage init() {
		if (isInited) return (ImplementationsPackage)EPackage.Registry.INSTANCE.getEPackage(ImplementationsPackage.eNS_URI);

		// Obtain or create and register package
		ImplementationsPackageImpl theImplementationsPackage = (ImplementationsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ImplementationsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ImplementationsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		EcorePackageImpl theEcorePackage = (EcorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI) instanceof EcorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI) : EcorePackage.eINSTANCE);
		IoPackageImpl theIoPackage = (IoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IoPackage.eNS_URI) instanceof IoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IoPackage.eNS_URI) : IoPackage.eINSTANCE);
		LangPackageImpl theLangPackage = (LangPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LangPackage.eNS_URI) instanceof LangPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LangPackage.eNS_URI) : LangPackage.eINSTANCE);
		UtilPackageImpl theUtilPackage = (UtilPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI) instanceof UtilPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI) : UtilPackage.eINSTANCE);
		GraphPackageImpl theGraphPackage = (GraphPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GraphPackage.eNS_URI) instanceof GraphPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GraphPackage.eNS_URI) : GraphPackage.eINSTANCE);
		StreamPackageImpl theStreamPackage = (StreamPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StreamPackage.eNS_URI) instanceof StreamPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StreamPackage.eNS_URI) : StreamPackage.eINSTANCE);
		FilePackageImpl theFilePackage = (FilePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FilePackage.eNS_URI) instanceof FilePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FilePackage.eNS_URI) : FilePackage.eINSTANCE);
		ReplayablePackageImpl theReplayablePackage = (ReplayablePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ReplayablePackage.eNS_URI) instanceof ReplayablePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ReplayablePackage.eNS_URI) : ReplayablePackage.eINSTANCE);
		ViewPackageImpl theViewPackage = (ViewPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ViewPackage.eNS_URI) instanceof ViewPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ViewPackage.eNS_URI) : ViewPackage.eINSTANCE);
		ecore.org.graphstream.graph.impl.GraphPackageImpl theGraphPackage_1 = (ecore.org.graphstream.graph.impl.GraphPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ecore.org.graphstream.graph.GraphPackage.eNS_URI) instanceof ecore.org.graphstream.graph.impl.GraphPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ecore.org.graphstream.graph.GraphPackage.eNS_URI) : ecore.org.graphstream.graph.GraphPackage.eINSTANCE);
		ecore.org.graphstream.stream.impl.StreamPackageImpl theStreamPackage_1 = (ecore.org.graphstream.stream.impl.StreamPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ecore.org.graphstream.stream.StreamPackage.eNS_URI) instanceof ecore.org.graphstream.stream.impl.StreamPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ecore.org.graphstream.stream.StreamPackage.eNS_URI) : ecore.org.graphstream.stream.StreamPackage.eINSTANCE);

		// Create package meta-data objects
		theImplementationsPackage.createPackageContents();
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
		theStreamPackage_1.createPackageContents();

		// Initialize created meta-data
		theImplementationsPackage.initializePackageContents();
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
		theStreamPackage_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theImplementationsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ImplementationsPackage.eNS_URI, theImplementationsPackage);
		return theImplementationsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractEdge() {
		return abstractEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractEdge_Source() {
		return (EReference)abstractEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractEdge_Target() {
		return (EReference)abstractEdgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractEdge_Directed() {
		return (EAttribute)abstractEdgeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractEdge_Graph() {
		return (EReference)abstractEdgeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractEdge__ToString() {
		return abstractEdgeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractEdge__GetNode0() {
		return abstractEdgeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractEdge__GetNode1() {
		return abstractEdgeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractEdge__GetOpposite__Node() {
		return abstractEdgeEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractEdge__GetSourceNode() {
		return abstractEdgeEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractEdge__GetTargetNode() {
		return abstractEdgeEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractEdge__IsLoop() {
		return abstractEdgeEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractElement() {
		return abstractElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractElement_Id() {
		return (EAttribute)abstractElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractElement_Index() {
		return (EAttribute)abstractElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractElement_Attributes() {
		return (EAttribute)abstractElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractElement_AttributesBeingRemoved() {
		return (EAttribute)abstractElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractElement__GetAttribute__String() {
		return abstractElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractElement__GetFirstAttributeOf__String() {
		return abstractElementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractElement__GetAttribute__String_Class() {
		return abstractElementEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractElement__GetFirstAttributeOf__Class_String() {
		return abstractElementEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractElement__GetLabel__String() {
		return abstractElementEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractElement__GetNumber__String() {
		return abstractElementEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractElement__GetVector__String() {
		return abstractElementEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractElement__GetArray__String() {
		return abstractElementEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractElement__GetHash__String() {
		return abstractElementEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractElement__HasAttribute__String() {
		return abstractElementEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractElement__HasAttribute__String_Class() {
		return abstractElementEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractElement__HasLabel__String() {
		return abstractElementEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractElement__HasNumber__String() {
		return abstractElementEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractElement__HasVector__String() {
		return abstractElementEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractElement__HasArray__String() {
		return abstractElementEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractElement__HasHash__String() {
		return abstractElementEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractElement__GetAttributeKeyIterator() {
		return abstractElementEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractElement__GetEachAttributeKey() {
		return abstractElementEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractElement__GetAttributeKeySet() {
		return abstractElementEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractElement__ToString() {
		return abstractElementEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractElement__GetAttributeCount() {
		return abstractElementEClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractElement__ClearAttributes() {
		return abstractElementEClass.getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractElement__AddAttribute__String_Object() {
		return abstractElementEClass.getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractElement__ChangeAttribute__String_Object() {
		return abstractElementEClass.getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractElement__SetAttribute__String_Object() {
		return abstractElementEClass.getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractElement__AddAttributes__Map() {
		return abstractElementEClass.getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractElement__RemoveAttribute__String() {
		return abstractElementEClass.getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractGraph() {
		return abstractGraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractGraph_StrictChecking() {
		return (EAttribute)abstractGraphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractGraph_AutoCreate() {
		return (EAttribute)abstractGraphEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractGraph_NodeFactory() {
		return (EAttribute)abstractGraphEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractGraph_EdgeFactory() {
		return (EAttribute)abstractGraphEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractGraph_Step() {
		return (EAttribute)abstractGraphEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractGraph_NullAttributesAreErrors() {
		return (EAttribute)abstractGraphEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractGraph_ReplayId() {
		return (EAttribute)abstractGraphEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractGraph__NullAttributesAreErrors() {
		return abstractGraphEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractGraph__GetNode__String() {
		return abstractGraphEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractGraph__GetNode__int() {
		return abstractGraphEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractGraph__GetEdge__String() {
		return abstractGraphEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractGraph__GetEdge__int() {
		return abstractGraphEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractGraph__GetNodeCount() {
		return abstractGraphEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractGraph__GetEdgeCount() {
		return abstractGraphEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractGraph__GetNodeIterator() {
		return abstractGraphEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractGraph__GetEdgeIterator() {
		return abstractGraphEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractGraph__GetEachNode() {
		return abstractGraphEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractGraph__GetEachEdge() {
		return abstractGraphEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractGraph__GetNodeSet() {
		return abstractGraphEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractGraph__GetEdgeSet() {
		return abstractGraphEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractGraph__Iterator() {
		return abstractGraphEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractGraph__NodeFactory() {
		return abstractGraphEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractGraph__EdgeFactory() {
		return abstractGraphEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractGraph__IsStrict() {
		return abstractGraphEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractGraph__IsAutoCreationEnabled() {
		return abstractGraphEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractGraph__SetStrict__boolean() {
		return abstractGraphEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractGraph__StepBegins__double() {
		return abstractGraphEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractGraph__Clear() {
		return abstractGraphEClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractGraph__AddNode__String() {
		return abstractGraphEClass.getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractGraph__AddEdge__String_String_String() {
		return abstractGraphEClass.getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractGraph__AddEdge__String_String_String_boolean() {
		return abstractGraphEClass.getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractGraph__AddEdge__String_int_int() {
		return abstractGraphEClass.getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractGraph__AddEdge__String_int_int_boolean() {
		return abstractGraphEClass.getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractGraph__AddEdge__String_Node_Node() {
		return abstractGraphEClass.getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractGraph__AddEdge__String_Node_Node_boolean() {
		return abstractGraphEClass.getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractGraph__RemoveNode__String() {
		return abstractGraphEClass.getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractGraph__RemoveNode__int() {
		return abstractGraphEClass.getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractGraph__RemoveNode__Node() {
		return abstractGraphEClass.getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractGraph__RemoveEdge__String() {
		return abstractGraphEClass.getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractGraph__RemoveEdge__int() {
		return abstractGraphEClass.getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractGraph__RemoveEdge__Edge() {
		return abstractGraphEClass.getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractGraph__RemoveEdge__String_String() {
		return abstractGraphEClass.getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractGraph__RemoveEdge__int_int() {
		return abstractGraphEClass.getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractGraph__RemoveEdge__Node_Node() {
		return abstractGraphEClass.getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractGraph__AttributeSinks() {
		return abstractGraphEClass.getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractGraph__ElementSinks() {
		return abstractGraphEClass.getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractGraph__AddAttributeSink__AttributeSink() {
		return abstractGraphEClass.getEOperations().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractGraph__AddElementSink__ElementSink() {
		return abstractGraphEClass.getEOperations().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractGraph__AddSink__Sink() {
		return abstractGraphEClass.getEOperations().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractGraph__ClearAttributeSinks() {
		return abstractGraphEClass.getEOperations().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractGraph__ClearElementSinks() {
		return abstractGraphEClass.getEOperations().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractGraph__ClearSinks() {
		return abstractGraphEClass.getEOperations().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractGraph__RemoveAttributeSink__AttributeSink() {
		return abstractGraphEClass.getEOperations().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractGraph__RemoveElementSink__ElementSink() {
		return abstractGraphEClass.getEOperations().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractGraph__RemoveSink__Sink() {
		return abstractGraphEClass.getEOperations().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractGraph__EdgeAttributeAdded__String_long_String_String_Object() {
		return abstractGraphEClass.getEOperations().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractGraph__EdgeAttributeChanged__String_long_String_String_Object_Object() {
		return abstractGraphEClass.getEOperations().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractGraph__EdgeAttributeRemoved__String_long_String_String() {
		return abstractGraphEClass.getEOperations().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractGraph__GraphAttributeAdded__String_long_String_Object() {
		return abstractGraphEClass.getEOperations().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractGraph__GraphAttributeChanged__String_long_String_Object_Object() {
		return abstractGraphEClass.getEOperations().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractGraph__GraphAttributeRemoved__String_long_String() {
		return abstractGraphEClass.getEOperations().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractGraph__NodeAttributeAdded__String_long_String_String_Object() {
		return abstractGraphEClass.getEOperations().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractGraph__NodeAttributeChanged__String_long_String_String_Object_Object() {
		return abstractGraphEClass.getEOperations().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractGraph__NodeAttributeRemoved__String_long_String_String() {
		return abstractGraphEClass.getEOperations().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractGraph__EdgeAdded__String_long_String_String_String_boolean() {
		return abstractGraphEClass.getEOperations().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractGraph__EdgeRemoved__String_long_String() {
		return abstractGraphEClass.getEOperations().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractGraph__GraphCleared__String_long() {
		return abstractGraphEClass.getEOperations().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractGraph__NodeAdded__String_long_String() {
		return abstractGraphEClass.getEOperations().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractGraph__NodeRemoved__String_long_String() {
		return abstractGraphEClass.getEOperations().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractGraph__StepBegins__String_long_double() {
		return abstractGraphEClass.getEOperations().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractGraph__Display() {
		return abstractGraphEClass.getEOperations().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractGraph__Display__boolean() {
		return abstractGraphEClass.getEOperations().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractGraph__Read__FileSource_String() {
		return abstractGraphEClass.getEOperations().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractGraph__Read__String() {
		return abstractGraphEClass.getEOperations().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractGraph__Write__FileSink_String() {
		return abstractGraphEClass.getEOperations().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractGraph__Write__String() {
		return abstractGraphEClass.getEOperations().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractGraph__GetReplayController() {
		return abstractGraphEClass.getEOperations().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractNode() {
		return abstractNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractNode_Graph() {
		return (EReference)abstractNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractNode__GetDegree() {
		return abstractNodeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractNode__GetInDegree() {
		return abstractNodeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractNode__GetOutDegree() {
		return abstractNodeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractNode__HasEdgeToward__Node() {
		return abstractNodeEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractNode__HasEdgeToward__int() {
		return abstractNodeEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractNode__HasEdgeToward__String() {
		return abstractNodeEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractNode__HasEdgeFrom__Node() {
		return abstractNodeEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractNode__HasEdgeFrom__int() {
		return abstractNodeEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractNode__HasEdgeFrom__String() {
		return abstractNodeEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractNode__HasEdgeBetween__Node() {
		return abstractNodeEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractNode__HasEdgeBetween__int() {
		return abstractNodeEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractNode__HasEdgeBetween__String() {
		return abstractNodeEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractNode__GetEdgeToward__Node() {
		return abstractNodeEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractNode__GetEdgeToward__int() {
		return abstractNodeEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractNode__GetEdgeToward__String() {
		return abstractNodeEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractNode__GetEdgeFrom__Node() {
		return abstractNodeEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractNode__GetEdgeFrom__int() {
		return abstractNodeEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractNode__GetEdgeFrom__String() {
		return abstractNodeEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractNode__GetEdgeBetween__Node() {
		return abstractNodeEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractNode__GetEdgeBetween__int() {
		return abstractNodeEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractNode__GetEdgeBetween__String() {
		return abstractNodeEClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractNode__GetEdgeIterator() {
		return abstractNodeEClass.getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractNode__GetEnteringEdgeIterator() {
		return abstractNodeEClass.getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractNode__GetLeavingEdgeIterator() {
		return abstractNodeEClass.getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractNode__GetEachEdge() {
		return abstractNodeEClass.getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractNode__GetEachEnteringEdge() {
		return abstractNodeEClass.getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractNode__GetEachLeavingEdge() {
		return abstractNodeEClass.getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractNode__GetEdgeSet() {
		return abstractNodeEClass.getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractNode__GetEnteringEdgeSet() {
		return abstractNodeEClass.getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractNode__GetLeavingEdgeSet() {
		return abstractNodeEClass.getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractNode__Iterator() {
		return abstractNodeEClass.getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractNode__GetEdge__int() {
		return abstractNodeEClass.getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractNode__GetEnteringEdge__int() {
		return abstractNodeEClass.getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractNode__GetLeavingEdge__int() {
		return abstractNodeEClass.getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractNode__GetNeighborNodeIterator() {
		return abstractNodeEClass.getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractNode__GetBreadthFirstIterator() {
		return abstractNodeEClass.getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractNode__GetBreadthFirstIterator__boolean() {
		return abstractNodeEClass.getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractNode__GetDepthFirstIterator() {
		return abstractNodeEClass.getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractNode__GetDepthFirstIterator__boolean() {
		return abstractNodeEClass.getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractNode__IsEnteringEdge__Edge() {
		return abstractNodeEClass.getEOperations().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractNode__IsLeavingEdge__Edge() {
		return abstractNodeEClass.getEOperations().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractNode__IsIncidentEdge__Edge() {
		return abstractNodeEClass.getEOperations().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationsFactory getImplementationsFactory() {
		return (ImplementationsFactory)getEFactoryInstance();
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
		abstractEdgeEClass = createEClass(ABSTRACT_EDGE);
		createEReference(abstractEdgeEClass, ABSTRACT_EDGE__SOURCE);
		createEReference(abstractEdgeEClass, ABSTRACT_EDGE__TARGET);
		createEAttribute(abstractEdgeEClass, ABSTRACT_EDGE__DIRECTED);
		createEReference(abstractEdgeEClass, ABSTRACT_EDGE__GRAPH);
		createEOperation(abstractEdgeEClass, ABSTRACT_EDGE___TO_STRING);
		createEOperation(abstractEdgeEClass, ABSTRACT_EDGE___GET_NODE0);
		createEOperation(abstractEdgeEClass, ABSTRACT_EDGE___GET_NODE1);
		createEOperation(abstractEdgeEClass, ABSTRACT_EDGE___GET_OPPOSITE__NODE);
		createEOperation(abstractEdgeEClass, ABSTRACT_EDGE___GET_SOURCE_NODE);
		createEOperation(abstractEdgeEClass, ABSTRACT_EDGE___GET_TARGET_NODE);
		createEOperation(abstractEdgeEClass, ABSTRACT_EDGE___IS_LOOP);

		abstractElementEClass = createEClass(ABSTRACT_ELEMENT);
		createEAttribute(abstractElementEClass, ABSTRACT_ELEMENT__ID);
		createEAttribute(abstractElementEClass, ABSTRACT_ELEMENT__INDEX);
		createEAttribute(abstractElementEClass, ABSTRACT_ELEMENT__ATTRIBUTES);
		createEAttribute(abstractElementEClass, ABSTRACT_ELEMENT__ATTRIBUTES_BEING_REMOVED);
		createEOperation(abstractElementEClass, ABSTRACT_ELEMENT___GET_ATTRIBUTE__STRING);
		createEOperation(abstractElementEClass, ABSTRACT_ELEMENT___GET_FIRST_ATTRIBUTE_OF__STRING);
		createEOperation(abstractElementEClass, ABSTRACT_ELEMENT___GET_ATTRIBUTE__STRING_CLASS);
		createEOperation(abstractElementEClass, ABSTRACT_ELEMENT___GET_FIRST_ATTRIBUTE_OF__CLASS_STRING);
		createEOperation(abstractElementEClass, ABSTRACT_ELEMENT___GET_LABEL__STRING);
		createEOperation(abstractElementEClass, ABSTRACT_ELEMENT___GET_NUMBER__STRING);
		createEOperation(abstractElementEClass, ABSTRACT_ELEMENT___GET_VECTOR__STRING);
		createEOperation(abstractElementEClass, ABSTRACT_ELEMENT___GET_ARRAY__STRING);
		createEOperation(abstractElementEClass, ABSTRACT_ELEMENT___GET_HASH__STRING);
		createEOperation(abstractElementEClass, ABSTRACT_ELEMENT___HAS_ATTRIBUTE__STRING);
		createEOperation(abstractElementEClass, ABSTRACT_ELEMENT___HAS_ATTRIBUTE__STRING_CLASS);
		createEOperation(abstractElementEClass, ABSTRACT_ELEMENT___HAS_LABEL__STRING);
		createEOperation(abstractElementEClass, ABSTRACT_ELEMENT___HAS_NUMBER__STRING);
		createEOperation(abstractElementEClass, ABSTRACT_ELEMENT___HAS_VECTOR__STRING);
		createEOperation(abstractElementEClass, ABSTRACT_ELEMENT___HAS_ARRAY__STRING);
		createEOperation(abstractElementEClass, ABSTRACT_ELEMENT___HAS_HASH__STRING);
		createEOperation(abstractElementEClass, ABSTRACT_ELEMENT___GET_ATTRIBUTE_KEY_ITERATOR);
		createEOperation(abstractElementEClass, ABSTRACT_ELEMENT___GET_EACH_ATTRIBUTE_KEY);
		createEOperation(abstractElementEClass, ABSTRACT_ELEMENT___GET_ATTRIBUTE_KEY_SET);
		createEOperation(abstractElementEClass, ABSTRACT_ELEMENT___TO_STRING);
		createEOperation(abstractElementEClass, ABSTRACT_ELEMENT___GET_ATTRIBUTE_COUNT);
		createEOperation(abstractElementEClass, ABSTRACT_ELEMENT___CLEAR_ATTRIBUTES);
		createEOperation(abstractElementEClass, ABSTRACT_ELEMENT___ADD_ATTRIBUTE__STRING_OBJECT);
		createEOperation(abstractElementEClass, ABSTRACT_ELEMENT___CHANGE_ATTRIBUTE__STRING_OBJECT);
		createEOperation(abstractElementEClass, ABSTRACT_ELEMENT___SET_ATTRIBUTE__STRING_OBJECT);
		createEOperation(abstractElementEClass, ABSTRACT_ELEMENT___ADD_ATTRIBUTES__MAP);
		createEOperation(abstractElementEClass, ABSTRACT_ELEMENT___REMOVE_ATTRIBUTE__STRING);

		abstractGraphEClass = createEClass(ABSTRACT_GRAPH);
		createEAttribute(abstractGraphEClass, ABSTRACT_GRAPH__STRICT_CHECKING);
		createEAttribute(abstractGraphEClass, ABSTRACT_GRAPH__AUTO_CREATE);
		createEAttribute(abstractGraphEClass, ABSTRACT_GRAPH__NODE_FACTORY);
		createEAttribute(abstractGraphEClass, ABSTRACT_GRAPH__EDGE_FACTORY);
		createEAttribute(abstractGraphEClass, ABSTRACT_GRAPH__STEP);
		createEAttribute(abstractGraphEClass, ABSTRACT_GRAPH__NULL_ATTRIBUTES_ARE_ERRORS);
		createEAttribute(abstractGraphEClass, ABSTRACT_GRAPH__REPLAY_ID);
		createEOperation(abstractGraphEClass, ABSTRACT_GRAPH___NULL_ATTRIBUTES_ARE_ERRORS);
		createEOperation(abstractGraphEClass, ABSTRACT_GRAPH___GET_NODE__STRING);
		createEOperation(abstractGraphEClass, ABSTRACT_GRAPH___GET_NODE__INT);
		createEOperation(abstractGraphEClass, ABSTRACT_GRAPH___GET_EDGE__STRING);
		createEOperation(abstractGraphEClass, ABSTRACT_GRAPH___GET_EDGE__INT);
		createEOperation(abstractGraphEClass, ABSTRACT_GRAPH___GET_NODE_COUNT);
		createEOperation(abstractGraphEClass, ABSTRACT_GRAPH___GET_EDGE_COUNT);
		createEOperation(abstractGraphEClass, ABSTRACT_GRAPH___GET_NODE_ITERATOR);
		createEOperation(abstractGraphEClass, ABSTRACT_GRAPH___GET_EDGE_ITERATOR);
		createEOperation(abstractGraphEClass, ABSTRACT_GRAPH___GET_EACH_NODE);
		createEOperation(abstractGraphEClass, ABSTRACT_GRAPH___GET_EACH_EDGE);
		createEOperation(abstractGraphEClass, ABSTRACT_GRAPH___GET_NODE_SET);
		createEOperation(abstractGraphEClass, ABSTRACT_GRAPH___GET_EDGE_SET);
		createEOperation(abstractGraphEClass, ABSTRACT_GRAPH___ITERATOR);
		createEOperation(abstractGraphEClass, ABSTRACT_GRAPH___NODE_FACTORY);
		createEOperation(abstractGraphEClass, ABSTRACT_GRAPH___EDGE_FACTORY);
		createEOperation(abstractGraphEClass, ABSTRACT_GRAPH___IS_STRICT);
		createEOperation(abstractGraphEClass, ABSTRACT_GRAPH___IS_AUTO_CREATION_ENABLED);
		createEOperation(abstractGraphEClass, ABSTRACT_GRAPH___SET_STRICT__BOOLEAN);
		createEOperation(abstractGraphEClass, ABSTRACT_GRAPH___STEP_BEGINS__DOUBLE);
		createEOperation(abstractGraphEClass, ABSTRACT_GRAPH___CLEAR);
		createEOperation(abstractGraphEClass, ABSTRACT_GRAPH___ADD_NODE__STRING);
		createEOperation(abstractGraphEClass, ABSTRACT_GRAPH___ADD_EDGE__STRING_STRING_STRING);
		createEOperation(abstractGraphEClass, ABSTRACT_GRAPH___ADD_EDGE__STRING_STRING_STRING_BOOLEAN);
		createEOperation(abstractGraphEClass, ABSTRACT_GRAPH___ADD_EDGE__STRING_INT_INT);
		createEOperation(abstractGraphEClass, ABSTRACT_GRAPH___ADD_EDGE__STRING_INT_INT_BOOLEAN);
		createEOperation(abstractGraphEClass, ABSTRACT_GRAPH___ADD_EDGE__STRING_NODE_NODE);
		createEOperation(abstractGraphEClass, ABSTRACT_GRAPH___ADD_EDGE__STRING_NODE_NODE_BOOLEAN);
		createEOperation(abstractGraphEClass, ABSTRACT_GRAPH___REMOVE_NODE__STRING);
		createEOperation(abstractGraphEClass, ABSTRACT_GRAPH___REMOVE_NODE__INT);
		createEOperation(abstractGraphEClass, ABSTRACT_GRAPH___REMOVE_NODE__NODE);
		createEOperation(abstractGraphEClass, ABSTRACT_GRAPH___REMOVE_EDGE__STRING);
		createEOperation(abstractGraphEClass, ABSTRACT_GRAPH___REMOVE_EDGE__INT);
		createEOperation(abstractGraphEClass, ABSTRACT_GRAPH___REMOVE_EDGE__EDGE);
		createEOperation(abstractGraphEClass, ABSTRACT_GRAPH___REMOVE_EDGE__STRING_STRING);
		createEOperation(abstractGraphEClass, ABSTRACT_GRAPH___REMOVE_EDGE__INT_INT);
		createEOperation(abstractGraphEClass, ABSTRACT_GRAPH___REMOVE_EDGE__NODE_NODE);
		createEOperation(abstractGraphEClass, ABSTRACT_GRAPH___ATTRIBUTE_SINKS);
		createEOperation(abstractGraphEClass, ABSTRACT_GRAPH___ELEMENT_SINKS);
		createEOperation(abstractGraphEClass, ABSTRACT_GRAPH___ADD_ATTRIBUTE_SINK__ATTRIBUTESINK);
		createEOperation(abstractGraphEClass, ABSTRACT_GRAPH___ADD_ELEMENT_SINK__ELEMENTSINK);
		createEOperation(abstractGraphEClass, ABSTRACT_GRAPH___ADD_SINK__SINK);
		createEOperation(abstractGraphEClass, ABSTRACT_GRAPH___CLEAR_ATTRIBUTE_SINKS);
		createEOperation(abstractGraphEClass, ABSTRACT_GRAPH___CLEAR_ELEMENT_SINKS);
		createEOperation(abstractGraphEClass, ABSTRACT_GRAPH___CLEAR_SINKS);
		createEOperation(abstractGraphEClass, ABSTRACT_GRAPH___REMOVE_ATTRIBUTE_SINK__ATTRIBUTESINK);
		createEOperation(abstractGraphEClass, ABSTRACT_GRAPH___REMOVE_ELEMENT_SINK__ELEMENTSINK);
		createEOperation(abstractGraphEClass, ABSTRACT_GRAPH___REMOVE_SINK__SINK);
		createEOperation(abstractGraphEClass, ABSTRACT_GRAPH___EDGE_ATTRIBUTE_ADDED__STRING_LONG_STRING_STRING_OBJECT);
		createEOperation(abstractGraphEClass, ABSTRACT_GRAPH___EDGE_ATTRIBUTE_CHANGED__STRING_LONG_STRING_STRING_OBJECT_OBJECT);
		createEOperation(abstractGraphEClass, ABSTRACT_GRAPH___EDGE_ATTRIBUTE_REMOVED__STRING_LONG_STRING_STRING);
		createEOperation(abstractGraphEClass, ABSTRACT_GRAPH___GRAPH_ATTRIBUTE_ADDED__STRING_LONG_STRING_OBJECT);
		createEOperation(abstractGraphEClass, ABSTRACT_GRAPH___GRAPH_ATTRIBUTE_CHANGED__STRING_LONG_STRING_OBJECT_OBJECT);
		createEOperation(abstractGraphEClass, ABSTRACT_GRAPH___GRAPH_ATTRIBUTE_REMOVED__STRING_LONG_STRING);
		createEOperation(abstractGraphEClass, ABSTRACT_GRAPH___NODE_ATTRIBUTE_ADDED__STRING_LONG_STRING_STRING_OBJECT);
		createEOperation(abstractGraphEClass, ABSTRACT_GRAPH___NODE_ATTRIBUTE_CHANGED__STRING_LONG_STRING_STRING_OBJECT_OBJECT);
		createEOperation(abstractGraphEClass, ABSTRACT_GRAPH___NODE_ATTRIBUTE_REMOVED__STRING_LONG_STRING_STRING);
		createEOperation(abstractGraphEClass, ABSTRACT_GRAPH___EDGE_ADDED__STRING_LONG_STRING_STRING_STRING_BOOLEAN);
		createEOperation(abstractGraphEClass, ABSTRACT_GRAPH___EDGE_REMOVED__STRING_LONG_STRING);
		createEOperation(abstractGraphEClass, ABSTRACT_GRAPH___GRAPH_CLEARED__STRING_LONG);
		createEOperation(abstractGraphEClass, ABSTRACT_GRAPH___NODE_ADDED__STRING_LONG_STRING);
		createEOperation(abstractGraphEClass, ABSTRACT_GRAPH___NODE_REMOVED__STRING_LONG_STRING);
		createEOperation(abstractGraphEClass, ABSTRACT_GRAPH___STEP_BEGINS__STRING_LONG_DOUBLE);
		createEOperation(abstractGraphEClass, ABSTRACT_GRAPH___DISPLAY);
		createEOperation(abstractGraphEClass, ABSTRACT_GRAPH___DISPLAY__BOOLEAN);
		createEOperation(abstractGraphEClass, ABSTRACT_GRAPH___READ__FILESOURCE_STRING);
		createEOperation(abstractGraphEClass, ABSTRACT_GRAPH___READ__STRING);
		createEOperation(abstractGraphEClass, ABSTRACT_GRAPH___WRITE__FILESINK_STRING);
		createEOperation(abstractGraphEClass, ABSTRACT_GRAPH___WRITE__STRING);
		createEOperation(abstractGraphEClass, ABSTRACT_GRAPH___GET_REPLAY_CONTROLLER);

		abstractNodeEClass = createEClass(ABSTRACT_NODE);
		createEReference(abstractNodeEClass, ABSTRACT_NODE__GRAPH);
		createEOperation(abstractNodeEClass, ABSTRACT_NODE___GET_DEGREE);
		createEOperation(abstractNodeEClass, ABSTRACT_NODE___GET_IN_DEGREE);
		createEOperation(abstractNodeEClass, ABSTRACT_NODE___GET_OUT_DEGREE);
		createEOperation(abstractNodeEClass, ABSTRACT_NODE___HAS_EDGE_TOWARD__NODE);
		createEOperation(abstractNodeEClass, ABSTRACT_NODE___HAS_EDGE_TOWARD__INT);
		createEOperation(abstractNodeEClass, ABSTRACT_NODE___HAS_EDGE_TOWARD__STRING);
		createEOperation(abstractNodeEClass, ABSTRACT_NODE___HAS_EDGE_FROM__NODE);
		createEOperation(abstractNodeEClass, ABSTRACT_NODE___HAS_EDGE_FROM__INT);
		createEOperation(abstractNodeEClass, ABSTRACT_NODE___HAS_EDGE_FROM__STRING);
		createEOperation(abstractNodeEClass, ABSTRACT_NODE___HAS_EDGE_BETWEEN__NODE);
		createEOperation(abstractNodeEClass, ABSTRACT_NODE___HAS_EDGE_BETWEEN__INT);
		createEOperation(abstractNodeEClass, ABSTRACT_NODE___HAS_EDGE_BETWEEN__STRING);
		createEOperation(abstractNodeEClass, ABSTRACT_NODE___GET_EDGE_TOWARD__NODE);
		createEOperation(abstractNodeEClass, ABSTRACT_NODE___GET_EDGE_TOWARD__INT);
		createEOperation(abstractNodeEClass, ABSTRACT_NODE___GET_EDGE_TOWARD__STRING);
		createEOperation(abstractNodeEClass, ABSTRACT_NODE___GET_EDGE_FROM__NODE);
		createEOperation(abstractNodeEClass, ABSTRACT_NODE___GET_EDGE_FROM__INT);
		createEOperation(abstractNodeEClass, ABSTRACT_NODE___GET_EDGE_FROM__STRING);
		createEOperation(abstractNodeEClass, ABSTRACT_NODE___GET_EDGE_BETWEEN__NODE);
		createEOperation(abstractNodeEClass, ABSTRACT_NODE___GET_EDGE_BETWEEN__INT);
		createEOperation(abstractNodeEClass, ABSTRACT_NODE___GET_EDGE_BETWEEN__STRING);
		createEOperation(abstractNodeEClass, ABSTRACT_NODE___GET_EDGE_ITERATOR);
		createEOperation(abstractNodeEClass, ABSTRACT_NODE___GET_ENTERING_EDGE_ITERATOR);
		createEOperation(abstractNodeEClass, ABSTRACT_NODE___GET_LEAVING_EDGE_ITERATOR);
		createEOperation(abstractNodeEClass, ABSTRACT_NODE___GET_EACH_EDGE);
		createEOperation(abstractNodeEClass, ABSTRACT_NODE___GET_EACH_ENTERING_EDGE);
		createEOperation(abstractNodeEClass, ABSTRACT_NODE___GET_EACH_LEAVING_EDGE);
		createEOperation(abstractNodeEClass, ABSTRACT_NODE___GET_EDGE_SET);
		createEOperation(abstractNodeEClass, ABSTRACT_NODE___GET_ENTERING_EDGE_SET);
		createEOperation(abstractNodeEClass, ABSTRACT_NODE___GET_LEAVING_EDGE_SET);
		createEOperation(abstractNodeEClass, ABSTRACT_NODE___ITERATOR);
		createEOperation(abstractNodeEClass, ABSTRACT_NODE___GET_EDGE__INT);
		createEOperation(abstractNodeEClass, ABSTRACT_NODE___GET_ENTERING_EDGE__INT);
		createEOperation(abstractNodeEClass, ABSTRACT_NODE___GET_LEAVING_EDGE__INT);
		createEOperation(abstractNodeEClass, ABSTRACT_NODE___GET_NEIGHBOR_NODE_ITERATOR);
		createEOperation(abstractNodeEClass, ABSTRACT_NODE___GET_BREADTH_FIRST_ITERATOR);
		createEOperation(abstractNodeEClass, ABSTRACT_NODE___GET_BREADTH_FIRST_ITERATOR__BOOLEAN);
		createEOperation(abstractNodeEClass, ABSTRACT_NODE___GET_DEPTH_FIRST_ITERATOR);
		createEOperation(abstractNodeEClass, ABSTRACT_NODE___GET_DEPTH_FIRST_ITERATOR__BOOLEAN);
		createEOperation(abstractNodeEClass, ABSTRACT_NODE___IS_ENTERING_EDGE__EDGE);
		createEOperation(abstractNodeEClass, ABSTRACT_NODE___IS_LEAVING_EDGE__EDGE);
		createEOperation(abstractNodeEClass, ABSTRACT_NODE___IS_INCIDENT_EDGE__EDGE);
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
		ecore.org.graphstream.graph.GraphPackage theGraphPackage_1 = (ecore.org.graphstream.graph.GraphPackage)EPackage.Registry.INSTANCE.getEPackage(ecore.org.graphstream.graph.GraphPackage.eNS_URI);
		UtilPackage theUtilPackage = (UtilPackage)EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI);
		LangPackage theLangPackage = (LangPackage)EPackage.Registry.INSTANCE.getEPackage(LangPackage.eNS_URI);
		ecore.org.graphstream.stream.StreamPackage theStreamPackage_1 = (ecore.org.graphstream.stream.StreamPackage)EPackage.Registry.INSTANCE.getEPackage(ecore.org.graphstream.stream.StreamPackage.eNS_URI);
		GraphPackage theGraphPackage = (GraphPackage)EPackage.Registry.INSTANCE.getEPackage(GraphPackage.eNS_URI);
		ViewPackage theViewPackage = (ViewPackage)EPackage.Registry.INSTANCE.getEPackage(ViewPackage.eNS_URI);
		FilePackage theFilePackage = (FilePackage)EPackage.Registry.INSTANCE.getEPackage(FilePackage.eNS_URI);
		IoPackage theIoPackage = (IoPackage)EPackage.Registry.INSTANCE.getEPackage(IoPackage.eNS_URI);
		StreamPackage theStreamPackage = (StreamPackage)EPackage.Registry.INSTANCE.getEPackage(StreamPackage.eNS_URI);
		ReplayablePackage theReplayablePackage = (ReplayablePackage)EPackage.Registry.INSTANCE.getEPackage(ReplayablePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		abstractEdgeEClass.getESuperTypes().add(this.getAbstractElement());
		abstractEdgeEClass.getESuperTypes().add(theGraphPackage_1.getEdge());
		abstractElementEClass.getESuperTypes().add(theGraphPackage_1.getElement());
		abstractGraphEClass.getESuperTypes().add(this.getAbstractElement());
		abstractGraphEClass.getESuperTypes().add(theGraphPackage_1.getGraph());
		abstractGraphEClass.getESuperTypes().add(theStreamPackage_1.getReplayable());
		abstractNodeEClass.getESuperTypes().add(this.getAbstractElement());
		abstractNodeEClass.getESuperTypes().add(theGraphPackage_1.getNode());

		// Initialize classes, features, and operations; add parameters
		initEClass(abstractEdgeEClass, AbstractEdge.class, "AbstractEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractEdge_Source(), this.getAbstractNode(), null, "source", null, 0, 1, AbstractEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractEdge_Target(), this.getAbstractNode(), null, "target", null, 0, 1, AbstractEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractEdge_Directed(), ecorePackage.getEBoolean(), "directed", null, 0, 1, AbstractEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractEdge_Graph(), this.getAbstractGraph(), null, "graph", null, 0, 1, AbstractEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAbstractEdge__ToString(), ecorePackage.getEString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getAbstractEdge__GetNode0(), null, "getNode0", 0, 1, IS_UNIQUE, IS_ORDERED);
		ETypeParameter t1 = addETypeParameter(op, "T");
		EGenericType g1 = createEGenericType(theGraphPackage_1.getNode());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getAbstractEdge__GetNode1(), null, "getNode1", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(theGraphPackage_1.getNode());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getAbstractEdge__GetOpposite__Node(), null, "getOpposite", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(theGraphPackage_1.getNode());
		t1.getEBounds().add(g1);
		addEParameter(op, theGraphPackage_1.getNode(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getAbstractEdge__GetSourceNode(), null, "getSourceNode", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(theGraphPackage_1.getNode());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getAbstractEdge__GetTargetNode(), null, "getTargetNode", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(theGraphPackage_1.getNode());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		initEOperation(getAbstractEdge__IsLoop(), ecorePackage.getEBoolean(), "isLoop", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(abstractElementEClass, AbstractElement.class, "AbstractElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractElement_Id(), ecorePackage.getEString(), "id", null, 0, 1, AbstractElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractElement_Index(), ecorePackage.getEInt(), "index", null, 0, 1, AbstractElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(theUtilPackage.getHashMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		initEAttribute(getAbstractElement_Attributes(), g1, "attributes", null, 0, 1, AbstractElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(theUtilPackage.getArrayList());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		initEAttribute(getAbstractElement_AttributesBeingRemoved(), g1, "attributesBeingRemoved", null, 0, 1, AbstractElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getAbstractElement__GetAttribute__String(), null, "getAttribute", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getAbstractElement__GetFirstAttributeOf__String(), null, "getFirstAttributeOf", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		addEParameter(op, theLangPackage.getStringArray(), "keys", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getAbstractElement__GetAttribute__String_Class(), null, "getAttribute", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "clazz", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getAbstractElement__GetFirstAttributeOf__Class_String(), null, "getFirstAttributeOf", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "clazz", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theLangPackage.getStringArray(), "keys", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getAbstractElement__GetLabel__String(), ecorePackage.getEString(), "getLabel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractElement__GetNumber__String(), ecorePackage.getEDouble(), "getNumber", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractElement__GetVector__String(), null, "getVector", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theUtilPackage.getArrayList());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType(theLangPackage.getNumber());
		g2.setEUpperBound(g3);
		initEOperation(op, g1);

		op = initEOperation(getAbstractElement__GetArray__String(), theLangPackage.getObjectArray(), "getArray", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractElement__GetHash__String(), null, "getHash", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theUtilPackage.getHashMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getAbstractElement__HasAttribute__String(), ecorePackage.getEBoolean(), "hasAttribute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractElement__HasAttribute__String_Class(), ecorePackage.getEBoolean(), "hasAttribute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "clazz", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractElement__HasLabel__String(), ecorePackage.getEBoolean(), "hasLabel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractElement__HasNumber__String(), ecorePackage.getEBoolean(), "hasNumber", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractElement__HasVector__String(), ecorePackage.getEBoolean(), "hasVector", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractElement__HasArray__String(), ecorePackage.getEBoolean(), "hasArray", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractElement__HasHash__String(), ecorePackage.getEBoolean(), "hasHash", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractElement__GetAttributeKeyIterator(), null, "getAttributeKeyIterator", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theUtilPackage.getIterator());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getAbstractElement__GetEachAttributeKey(), null, "getEachAttributeKey", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theLangPackage.getIterable());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getAbstractElement__GetAttributeKeySet(), null, "getAttributeKeySet", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theUtilPackage.getCollection());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEOperation(getAbstractElement__ToString(), ecorePackage.getEString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAbstractElement__GetAttributeCount(), ecorePackage.getEInt(), "getAttributeCount", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAbstractElement__ClearAttributes(), null, "clearAttributes", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractElement__AddAttribute__String_Object(), null, "addAttribute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "attribute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theLangPackage.getObjectArray(), "values", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractElement__ChangeAttribute__String_Object(), null, "changeAttribute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "attribute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theLangPackage.getObjectArray(), "values", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractElement__SetAttribute__String_Object(), null, "setAttribute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "attribute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theLangPackage.getObjectArray(), "values", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractElement__AddAttributes__Map(), null, "addAttributes", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theUtilPackage.getMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "attributes", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractElement__RemoveAttribute__String(), null, "removeAttribute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "attribute", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(abstractGraphEClass, AbstractGraph.class, "AbstractGraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractGraph_StrictChecking(), ecorePackage.getEBoolean(), "strictChecking", null, 0, 1, AbstractGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractGraph_AutoCreate(), ecorePackage.getEBoolean(), "autoCreate", null, 0, 1, AbstractGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(theGraphPackage.getNodeFactory());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(theGraphPackage_1.getNode());
		g2.setEUpperBound(g3);
		initEAttribute(getAbstractGraph_NodeFactory(), g1, "nodeFactory", null, 0, 1, AbstractGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(theGraphPackage.getEdgeFactory());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(theGraphPackage_1.getEdge());
		g2.setEUpperBound(g3);
		initEAttribute(getAbstractGraph_EdgeFactory(), g1, "edgeFactory", null, 0, 1, AbstractGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractGraph_Step(), ecorePackage.getEDouble(), "step", null, 0, 1, AbstractGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractGraph_NullAttributesAreErrors(), ecorePackage.getEBoolean(), "nullAttributesAreErrors", null, 0, 1, AbstractGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractGraph_ReplayId(), ecorePackage.getELong(), "replayId", null, 0, 1, AbstractGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAbstractGraph__NullAttributesAreErrors(), ecorePackage.getEBoolean(), "nullAttributesAreErrors", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractGraph__GetNode__String(), null, "getNode", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(theGraphPackage_1.getNode());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEString(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getAbstractGraph__GetNode__int(), null, "getNode", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(theGraphPackage_1.getNode());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEInt(), "index", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getAbstractGraph__GetEdge__String(), null, "getEdge", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(theGraphPackage_1.getEdge());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEString(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getAbstractGraph__GetEdge__int(), null, "getEdge", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(theGraphPackage_1.getEdge());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEInt(), "index", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		initEOperation(getAbstractGraph__GetNodeCount(), ecorePackage.getEInt(), "getNodeCount", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAbstractGraph__GetEdgeCount(), ecorePackage.getEInt(), "getEdgeCount", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractGraph__GetNodeIterator(), null, "getNodeIterator", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(theGraphPackage_1.getNode());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(theUtilPackage.getIterator());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getAbstractGraph__GetEdgeIterator(), null, "getEdgeIterator", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(theGraphPackage_1.getEdge());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(theUtilPackage.getIterator());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getAbstractGraph__GetEachNode(), null, "getEachNode", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(theGraphPackage_1.getNode());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(theLangPackage.getIterable());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(t1);
		g2.setEUpperBound(g3);
		initEOperation(op, g1);

		op = initEOperation(getAbstractGraph__GetEachEdge(), null, "getEachEdge", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(theGraphPackage_1.getEdge());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(theLangPackage.getIterable());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(t1);
		g2.setEUpperBound(g3);
		initEOperation(op, g1);

		op = initEOperation(getAbstractGraph__GetNodeSet(), null, "getNodeSet", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(theGraphPackage_1.getNode());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(theUtilPackage.getCollection());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getAbstractGraph__GetEdgeSet(), null, "getEdgeSet", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(theGraphPackage_1.getEdge());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(theUtilPackage.getCollection());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getAbstractGraph__Iterator(), null, "iterator", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theUtilPackage.getIterator());
		g2 = createEGenericType(theGraphPackage_1.getNode());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getAbstractGraph__NodeFactory(), null, "nodeFactory", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theGraphPackage.getNodeFactory());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(theGraphPackage_1.getNode());
		g2.setEUpperBound(g3);
		initEOperation(op, g1);

		op = initEOperation(getAbstractGraph__EdgeFactory(), null, "edgeFactory", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theGraphPackage.getEdgeFactory());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(theGraphPackage_1.getEdge());
		g2.setEUpperBound(g3);
		initEOperation(op, g1);

		initEOperation(getAbstractGraph__IsStrict(), ecorePackage.getEBoolean(), "isStrict", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAbstractGraph__IsAutoCreationEnabled(), ecorePackage.getEBoolean(), "isAutoCreationEnabled", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractGraph__SetStrict__boolean(), null, "setStrict", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "on", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractGraph__StepBegins__double(), null, "stepBegins", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "time", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAbstractGraph__Clear(), null, "clear", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractGraph__AddNode__String(), null, "addNode", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(theGraphPackage_1.getNode());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEString(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getAbstractGraph__AddEdge__String_String_String(), null, "addEdge", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(theGraphPackage_1.getEdge());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEString(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "node1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "node2", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getAbstractGraph__AddEdge__String_String_String_boolean(), null, "addEdge", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(theGraphPackage_1.getEdge());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEString(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "from", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "to", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "directed", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getAbstractGraph__AddEdge__String_int_int(), null, "addEdge", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(theGraphPackage_1.getEdge());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEString(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "index1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "index2", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getAbstractGraph__AddEdge__String_int_int_boolean(), null, "addEdge", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(theGraphPackage_1.getEdge());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEString(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "fromIndex", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "toIndex", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "directed", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getAbstractGraph__AddEdge__String_Node_Node(), null, "addEdge", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(theGraphPackage_1.getEdge());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEString(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theGraphPackage_1.getNode(), "node1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theGraphPackage_1.getNode(), "node2", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getAbstractGraph__AddEdge__String_Node_Node_boolean(), null, "addEdge", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(theGraphPackage_1.getEdge());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEString(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theGraphPackage_1.getNode(), "from", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theGraphPackage_1.getNode(), "to", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "directed", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getAbstractGraph__RemoveNode__String(), null, "removeNode", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(theGraphPackage_1.getNode());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEString(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getAbstractGraph__RemoveNode__int(), null, "removeNode", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(theGraphPackage_1.getNode());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEInt(), "index", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getAbstractGraph__RemoveNode__Node(), null, "removeNode", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(theGraphPackage_1.getNode());
		t1.getEBounds().add(g1);
		addEParameter(op, theGraphPackage_1.getNode(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getAbstractGraph__RemoveEdge__String(), null, "removeEdge", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(theGraphPackage_1.getEdge());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEString(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getAbstractGraph__RemoveEdge__int(), null, "removeEdge", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(theGraphPackage_1.getEdge());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEInt(), "index", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getAbstractGraph__RemoveEdge__Edge(), null, "removeEdge", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(theGraphPackage_1.getEdge());
		t1.getEBounds().add(g1);
		addEParameter(op, theGraphPackage_1.getEdge(), "edge", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getAbstractGraph__RemoveEdge__String_String(), null, "removeEdge", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(theGraphPackage_1.getEdge());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEString(), "from", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "to", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getAbstractGraph__RemoveEdge__int_int(), null, "removeEdge", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(theGraphPackage_1.getEdge());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEInt(), "fromIndex", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "toIndex", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getAbstractGraph__RemoveEdge__Node_Node(), null, "removeEdge", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(theGraphPackage_1.getEdge());
		t1.getEBounds().add(g1);
		addEParameter(op, theGraphPackage_1.getNode(), "node1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theGraphPackage_1.getNode(), "node2", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getAbstractGraph__AttributeSinks(), null, "attributeSinks", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theLangPackage.getIterable());
		g2 = createEGenericType(theStreamPackage_1.getAttributeSink());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getAbstractGraph__ElementSinks(), null, "elementSinks", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theLangPackage.getIterable());
		g2 = createEGenericType(theStreamPackage_1.getElementSink());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getAbstractGraph__AddAttributeSink__AttributeSink(), null, "addAttributeSink", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStreamPackage_1.getAttributeSink(), "sink", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractGraph__AddElementSink__ElementSink(), null, "addElementSink", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStreamPackage_1.getElementSink(), "sink", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractGraph__AddSink__Sink(), null, "addSink", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStreamPackage_1.getSink(), "sink", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAbstractGraph__ClearAttributeSinks(), null, "clearAttributeSinks", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAbstractGraph__ClearElementSinks(), null, "clearElementSinks", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAbstractGraph__ClearSinks(), null, "clearSinks", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractGraph__RemoveAttributeSink__AttributeSink(), null, "removeAttributeSink", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStreamPackage_1.getAttributeSink(), "sink", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractGraph__RemoveElementSink__ElementSink(), null, "removeElementSink", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStreamPackage_1.getElementSink(), "sink", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractGraph__RemoveSink__Sink(), null, "removeSink", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStreamPackage_1.getSink(), "sink", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractGraph__EdgeAttributeAdded__String_long_String_String_Object(), null, "edgeAttributeAdded", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sourceId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "timeId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "edgeId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "attribute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractGraph__EdgeAttributeChanged__String_long_String_String_Object_Object(), null, "edgeAttributeChanged", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sourceId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "timeId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "edgeId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "attribute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "oldValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "newValue", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractGraph__EdgeAttributeRemoved__String_long_String_String(), null, "edgeAttributeRemoved", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sourceId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "timeId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "edgeId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "attribute", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractGraph__GraphAttributeAdded__String_long_String_Object(), null, "graphAttributeAdded", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sourceId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "timeId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "attribute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractGraph__GraphAttributeChanged__String_long_String_Object_Object(), null, "graphAttributeChanged", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sourceId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "timeId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "attribute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "oldValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "newValue", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractGraph__GraphAttributeRemoved__String_long_String(), null, "graphAttributeRemoved", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sourceId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "timeId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "attribute", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractGraph__NodeAttributeAdded__String_long_String_String_Object(), null, "nodeAttributeAdded", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sourceId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "timeId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "nodeId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "attribute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractGraph__NodeAttributeChanged__String_long_String_String_Object_Object(), null, "nodeAttributeChanged", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sourceId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "timeId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "nodeId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "attribute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "oldValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "newValue", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractGraph__NodeAttributeRemoved__String_long_String_String(), null, "nodeAttributeRemoved", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sourceId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "timeId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "nodeId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "attribute", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractGraph__EdgeAdded__String_long_String_String_String_boolean(), null, "edgeAdded", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sourceId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "timeId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "edgeId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "fromNodeId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "toNodeId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "directed", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractGraph__EdgeRemoved__String_long_String(), null, "edgeRemoved", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sourceId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "timeId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "edgeId", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractGraph__GraphCleared__String_long(), null, "graphCleared", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sourceId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "timeId", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractGraph__NodeAdded__String_long_String(), null, "nodeAdded", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sourceId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "timeId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "nodeId", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractGraph__NodeRemoved__String_long_String(), null, "nodeRemoved", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sourceId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "timeId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "nodeId", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractGraph__StepBegins__String_long_double(), null, "stepBegins", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sourceId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "timeId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "step", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAbstractGraph__Display(), theViewPackage.getViewer(), "display", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractGraph__Display__boolean(), theViewPackage.getViewer(), "display", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "autoLayout", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractGraph__Read__FileSource_String(), null, "read", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFilePackage.getFileSource(), "input", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "filename", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theIoPackage.getIOException());
		addEException(op, theStreamPackage.getGraphParseException());

		op = initEOperation(getAbstractGraph__Read__String(), null, "read", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "filename", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theIoPackage.getIOException());
		addEException(op, theStreamPackage.getGraphParseException());
		addEException(op, theGraphPackage.getElementNotFoundException());

		op = initEOperation(getAbstractGraph__Write__FileSink_String(), null, "write", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFilePackage.getFileSink(), "output", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "filename", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theIoPackage.getIOException());

		op = initEOperation(getAbstractGraph__Write__String(), null, "write", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "filename", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theIoPackage.getIOException());

		initEOperation(getAbstractGraph__GetReplayController(), theReplayablePackage.getController(), "getReplayController", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(abstractNodeEClass, AbstractNode.class, "AbstractNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractNode_Graph(), theGraphPackage_1.getGraph(), null, "graph", null, 0, 1, AbstractNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAbstractNode__GetDegree(), ecorePackage.getEInt(), "getDegree", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAbstractNode__GetInDegree(), ecorePackage.getEInt(), "getInDegree", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAbstractNode__GetOutDegree(), ecorePackage.getEInt(), "getOutDegree", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractNode__HasEdgeToward__Node(), ecorePackage.getEBoolean(), "hasEdgeToward", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theGraphPackage_1.getNode(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractNode__HasEdgeToward__int(), ecorePackage.getEBoolean(), "hasEdgeToward", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "index", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractNode__HasEdgeToward__String(), ecorePackage.getEBoolean(), "hasEdgeToward", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractNode__HasEdgeFrom__Node(), ecorePackage.getEBoolean(), "hasEdgeFrom", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theGraphPackage_1.getNode(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractNode__HasEdgeFrom__int(), ecorePackage.getEBoolean(), "hasEdgeFrom", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "index", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractNode__HasEdgeFrom__String(), ecorePackage.getEBoolean(), "hasEdgeFrom", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractNode__HasEdgeBetween__Node(), ecorePackage.getEBoolean(), "hasEdgeBetween", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theGraphPackage_1.getNode(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractNode__HasEdgeBetween__int(), ecorePackage.getEBoolean(), "hasEdgeBetween", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "index", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractNode__HasEdgeBetween__String(), ecorePackage.getEBoolean(), "hasEdgeBetween", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractNode__GetEdgeToward__Node(), null, "getEdgeToward", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(theGraphPackage_1.getEdge());
		t1.getEBounds().add(g1);
		addEParameter(op, theGraphPackage_1.getNode(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getAbstractNode__GetEdgeToward__int(), null, "getEdgeToward", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(theGraphPackage_1.getEdge());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEInt(), "index", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getAbstractNode__GetEdgeToward__String(), null, "getEdgeToward", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(theGraphPackage_1.getEdge());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEString(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getAbstractNode__GetEdgeFrom__Node(), null, "getEdgeFrom", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(theGraphPackage_1.getEdge());
		t1.getEBounds().add(g1);
		addEParameter(op, theGraphPackage_1.getNode(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getAbstractNode__GetEdgeFrom__int(), null, "getEdgeFrom", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(theGraphPackage_1.getEdge());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEInt(), "index", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getAbstractNode__GetEdgeFrom__String(), null, "getEdgeFrom", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(theGraphPackage_1.getEdge());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEString(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getAbstractNode__GetEdgeBetween__Node(), null, "getEdgeBetween", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(theGraphPackage_1.getEdge());
		t1.getEBounds().add(g1);
		addEParameter(op, theGraphPackage_1.getNode(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getAbstractNode__GetEdgeBetween__int(), null, "getEdgeBetween", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(theGraphPackage_1.getEdge());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEInt(), "index", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getAbstractNode__GetEdgeBetween__String(), null, "getEdgeBetween", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(theGraphPackage_1.getEdge());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEString(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getAbstractNode__GetEdgeIterator(), null, "getEdgeIterator", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(theGraphPackage_1.getEdge());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(theUtilPackage.getIterator());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getAbstractNode__GetEnteringEdgeIterator(), null, "getEnteringEdgeIterator", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(theGraphPackage_1.getEdge());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(theUtilPackage.getIterator());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getAbstractNode__GetLeavingEdgeIterator(), null, "getLeavingEdgeIterator", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(theGraphPackage_1.getEdge());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(theUtilPackage.getIterator());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getAbstractNode__GetEachEdge(), null, "getEachEdge", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(theGraphPackage_1.getEdge());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(theLangPackage.getIterable());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getAbstractNode__GetEachEnteringEdge(), null, "getEachEnteringEdge", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(theGraphPackage_1.getEdge());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(theLangPackage.getIterable());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getAbstractNode__GetEachLeavingEdge(), null, "getEachLeavingEdge", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(theGraphPackage_1.getEdge());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(theLangPackage.getIterable());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getAbstractNode__GetEdgeSet(), null, "getEdgeSet", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(theGraphPackage_1.getEdge());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(theUtilPackage.getCollection());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getAbstractNode__GetEnteringEdgeSet(), null, "getEnteringEdgeSet", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(theGraphPackage_1.getEdge());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(theUtilPackage.getCollection());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getAbstractNode__GetLeavingEdgeSet(), null, "getLeavingEdgeSet", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(theGraphPackage_1.getEdge());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(theUtilPackage.getCollection());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getAbstractNode__Iterator(), null, "iterator", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theUtilPackage.getIterator());
		g2 = createEGenericType(theGraphPackage_1.getEdge());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getAbstractNode__GetEdge__int(), null, "getEdge", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(theGraphPackage_1.getEdge());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEInt(), "i", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getAbstractNode__GetEnteringEdge__int(), null, "getEnteringEdge", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(theGraphPackage_1.getEdge());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEInt(), "i", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getAbstractNode__GetLeavingEdge__int(), null, "getLeavingEdge", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(theGraphPackage_1.getEdge());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEInt(), "i", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getAbstractNode__GetNeighborNodeIterator(), null, "getNeighborNodeIterator", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(theGraphPackage_1.getNode());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(theUtilPackage.getIterator());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getAbstractNode__GetBreadthFirstIterator(), null, "getBreadthFirstIterator", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(theGraphPackage_1.getNode());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(theUtilPackage.getIterator());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getAbstractNode__GetBreadthFirstIterator__boolean(), null, "getBreadthFirstIterator", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(theGraphPackage_1.getNode());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEBoolean(), "directed", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theUtilPackage.getIterator());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getAbstractNode__GetDepthFirstIterator(), null, "getDepthFirstIterator", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(theGraphPackage_1.getNode());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(theUtilPackage.getIterator());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getAbstractNode__GetDepthFirstIterator__boolean(), null, "getDepthFirstIterator", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(theGraphPackage_1.getNode());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEBoolean(), "directed", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theUtilPackage.getIterator());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getAbstractNode__IsEnteringEdge__Edge(), ecorePackage.getEBoolean(), "isEnteringEdge", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theGraphPackage_1.getEdge(), "e", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractNode__IsLeavingEdge__Edge(), ecorePackage.getEBoolean(), "isLeavingEdge", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theGraphPackage_1.getEdge(), "e", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractNode__IsIncidentEdge__Edge(), ecorePackage.getEBoolean(), "isIncidentEdge", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theGraphPackage_1.getEdge(), "e", 0, 1, IS_UNIQUE, IS_ORDERED);
	}

} //ImplementationsPackageImpl
