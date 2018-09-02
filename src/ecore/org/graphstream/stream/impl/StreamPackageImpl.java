/**
 */
package ecore.org.graphstream.stream.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
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
import ecore.datatypes.org.graphstream.stream.Replayable.ReplayablePackage;
import ecore.datatypes.org.graphstream.stream.Replayable.impl.ReplayablePackageImpl;
import ecore.datatypes.org.graphstream.stream.file.FilePackage;
import ecore.datatypes.org.graphstream.stream.file.impl.FilePackageImpl;
import ecore.datatypes.org.graphstream.ui.view.ViewPackage;
import ecore.datatypes.org.graphstream.ui.view.impl.ViewPackageImpl;
import ecore.impl.EcorePackageImpl;
import ecore.org.graphstream.graph.implementations.ImplementationsPackage;
import ecore.org.graphstream.graph.implementations.impl.ImplementationsPackageImpl;
import ecore.org.graphstream.stream.AttributeSink;
import ecore.org.graphstream.stream.ElementSink;
import ecore.org.graphstream.stream.Pipe;
import ecore.org.graphstream.stream.Replayable;
import ecore.org.graphstream.stream.Sink;
import ecore.org.graphstream.stream.Source;
import ecore.org.graphstream.stream.StreamFactoryOld;
import ecore.org.graphstream.stream.StreamPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StreamPackageImpl extends EPackageImpl implements StreamPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeSinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementSinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pipeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass replayableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceEClass = null;

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
	 * @see ecore.org.graphstream.stream.StreamPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StreamPackageImpl() {
		super(eNS_URI, StreamFactoryOld.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StreamPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StreamPackage init() {
		if (isInited) return (StreamPackage)EPackage.Registry.INSTANCE.getEPackage(StreamPackage.eNS_URI);

		// Obtain or create and register package
		StreamPackageImpl theStreamPackage = (StreamPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StreamPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StreamPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		EcorePackageImpl theEcorePackage = (EcorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI) instanceof EcorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI) : EcorePackage.eINSTANCE);
		IoPackageImpl theIoPackage = (IoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IoPackage.eNS_URI) instanceof IoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IoPackage.eNS_URI) : IoPackage.eINSTANCE);
		LangPackageImpl theLangPackage = (LangPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LangPackage.eNS_URI) instanceof LangPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LangPackage.eNS_URI) : LangPackage.eINSTANCE);
		UtilPackageImpl theUtilPackage = (UtilPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI) instanceof UtilPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI) : UtilPackage.eINSTANCE);
		GraphPackageImpl theGraphPackage = (GraphPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GraphPackage.eNS_URI) instanceof GraphPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GraphPackage.eNS_URI) : GraphPackage.eINSTANCE);
		ecore.datatypes.org.graphstream.stream.impl.StreamPackageImpl theStreamPackage_1 = (ecore.datatypes.org.graphstream.stream.impl.StreamPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ecore.datatypes.org.graphstream.stream.StreamPackage.eNS_URI) instanceof ecore.datatypes.org.graphstream.stream.impl.StreamPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ecore.datatypes.org.graphstream.stream.StreamPackage.eNS_URI) : ecore.datatypes.org.graphstream.stream.StreamPackage.eINSTANCE);
		FilePackageImpl theFilePackage = (FilePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FilePackage.eNS_URI) instanceof FilePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FilePackage.eNS_URI) : FilePackage.eINSTANCE);
		ReplayablePackageImpl theReplayablePackage = (ReplayablePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ReplayablePackage.eNS_URI) instanceof ReplayablePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ReplayablePackage.eNS_URI) : ReplayablePackage.eINSTANCE);
		ViewPackageImpl theViewPackage = (ViewPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ViewPackage.eNS_URI) instanceof ViewPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ViewPackage.eNS_URI) : ViewPackage.eINSTANCE);
		ecore.org.graphstream.graph.impl.GraphPackageImpl theGraphPackage_1 = (ecore.org.graphstream.graph.impl.GraphPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ecore.org.graphstream.graph.GraphPackage.eNS_URI) instanceof ecore.org.graphstream.graph.impl.GraphPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ecore.org.graphstream.graph.GraphPackage.eNS_URI) : ecore.org.graphstream.graph.GraphPackage.eINSTANCE);
		ImplementationsPackageImpl theImplementationsPackage = (ImplementationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ImplementationsPackage.eNS_URI) instanceof ImplementationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ImplementationsPackage.eNS_URI) : ImplementationsPackage.eINSTANCE);

		// Create package meta-data objects
		theStreamPackage.createPackageContents();
		theEcorePackage.createPackageContents();
		theIoPackage.createPackageContents();
		theLangPackage.createPackageContents();
		theUtilPackage.createPackageContents();
		theGraphPackage.createPackageContents();
		theStreamPackage_1.createPackageContents();
		theFilePackage.createPackageContents();
		theReplayablePackage.createPackageContents();
		theViewPackage.createPackageContents();
		theGraphPackage_1.createPackageContents();
		theImplementationsPackage.createPackageContents();

		// Initialize created meta-data
		theStreamPackage.initializePackageContents();
		theEcorePackage.initializePackageContents();
		theIoPackage.initializePackageContents();
		theLangPackage.initializePackageContents();
		theUtilPackage.initializePackageContents();
		theGraphPackage.initializePackageContents();
		theStreamPackage_1.initializePackageContents();
		theFilePackage.initializePackageContents();
		theReplayablePackage.initializePackageContents();
		theViewPackage.initializePackageContents();
		theGraphPackage_1.initializePackageContents();
		theImplementationsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStreamPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StreamPackage.eNS_URI, theStreamPackage);
		return theStreamPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeSink() {
		return attributeSinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAttributeSink__GraphAttributeAdded__String_long_String_Object() {
		return attributeSinkEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAttributeSink__GraphAttributeChanged__String_long_String_Object_Object() {
		return attributeSinkEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAttributeSink__GraphAttributeRemoved__String_long_String() {
		return attributeSinkEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAttributeSink__NodeAttributeAdded__String_long_String_String_Object() {
		return attributeSinkEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAttributeSink__NodeAttributeChanged__String_long_String_String_Object_Object() {
		return attributeSinkEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAttributeSink__NodeAttributeRemoved__String_long_String_String() {
		return attributeSinkEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAttributeSink__EdgeAttributeAdded__String_long_String_String_Object() {
		return attributeSinkEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAttributeSink__EdgeAttributeChanged__String_long_String_String_Object_Object() {
		return attributeSinkEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAttributeSink__EdgeAttributeRemoved__String_long_String_String() {
		return attributeSinkEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementSink() {
		return elementSinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElementSink__NodeAdded__String_long_String() {
		return elementSinkEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElementSink__NodeRemoved__String_long_String() {
		return elementSinkEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElementSink__EdgeAdded__String_long_String_String_String_boolean() {
		return elementSinkEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElementSink__EdgeRemoved__String_long_String() {
		return elementSinkEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElementSink__GraphCleared__String_long() {
		return elementSinkEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElementSink__StepBegins__String_long_double() {
		return elementSinkEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPipe() {
		return pipeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReplayable() {
		return replayableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReplayable__GetReplayController() {
		return replayableEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSink() {
		return sinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSource() {
		return sourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSource__AddSink__Sink() {
		return sourceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSource__RemoveSink__Sink() {
		return sourceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSource__AddAttributeSink__AttributeSink() {
		return sourceEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSource__RemoveAttributeSink__AttributeSink() {
		return sourceEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSource__AddElementSink__ElementSink() {
		return sourceEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSource__RemoveElementSink__ElementSink() {
		return sourceEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSource__ClearElementSinks() {
		return sourceEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSource__ClearAttributeSinks() {
		return sourceEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSource__ClearSinks() {
		return sourceEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StreamFactoryOld getStreamFactory() {
		return (StreamFactoryOld)getEFactoryInstance();
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
		attributeSinkEClass = createEClass(ATTRIBUTE_SINK);
		createEOperation(attributeSinkEClass, ATTRIBUTE_SINK___GRAPH_ATTRIBUTE_ADDED__STRING_LONG_STRING_OBJECT);
		createEOperation(attributeSinkEClass, ATTRIBUTE_SINK___GRAPH_ATTRIBUTE_CHANGED__STRING_LONG_STRING_OBJECT_OBJECT);
		createEOperation(attributeSinkEClass, ATTRIBUTE_SINK___GRAPH_ATTRIBUTE_REMOVED__STRING_LONG_STRING);
		createEOperation(attributeSinkEClass, ATTRIBUTE_SINK___NODE_ATTRIBUTE_ADDED__STRING_LONG_STRING_STRING_OBJECT);
		createEOperation(attributeSinkEClass, ATTRIBUTE_SINK___NODE_ATTRIBUTE_CHANGED__STRING_LONG_STRING_STRING_OBJECT_OBJECT);
		createEOperation(attributeSinkEClass, ATTRIBUTE_SINK___NODE_ATTRIBUTE_REMOVED__STRING_LONG_STRING_STRING);
		createEOperation(attributeSinkEClass, ATTRIBUTE_SINK___EDGE_ATTRIBUTE_ADDED__STRING_LONG_STRING_STRING_OBJECT);
		createEOperation(attributeSinkEClass, ATTRIBUTE_SINK___EDGE_ATTRIBUTE_CHANGED__STRING_LONG_STRING_STRING_OBJECT_OBJECT);
		createEOperation(attributeSinkEClass, ATTRIBUTE_SINK___EDGE_ATTRIBUTE_REMOVED__STRING_LONG_STRING_STRING);

		elementSinkEClass = createEClass(ELEMENT_SINK);
		createEOperation(elementSinkEClass, ELEMENT_SINK___NODE_ADDED__STRING_LONG_STRING);
		createEOperation(elementSinkEClass, ELEMENT_SINK___NODE_REMOVED__STRING_LONG_STRING);
		createEOperation(elementSinkEClass, ELEMENT_SINK___EDGE_ADDED__STRING_LONG_STRING_STRING_STRING_BOOLEAN);
		createEOperation(elementSinkEClass, ELEMENT_SINK___EDGE_REMOVED__STRING_LONG_STRING);
		createEOperation(elementSinkEClass, ELEMENT_SINK___GRAPH_CLEARED__STRING_LONG);
		createEOperation(elementSinkEClass, ELEMENT_SINK___STEP_BEGINS__STRING_LONG_DOUBLE);

		pipeEClass = createEClass(PIPE);

		replayableEClass = createEClass(REPLAYABLE);
		createEOperation(replayableEClass, REPLAYABLE___GET_REPLAY_CONTROLLER);

		sinkEClass = createEClass(SINK);

		sourceEClass = createEClass(SOURCE);
		createEOperation(sourceEClass, SOURCE___ADD_SINK__SINK);
		createEOperation(sourceEClass, SOURCE___REMOVE_SINK__SINK);
		createEOperation(sourceEClass, SOURCE___ADD_ATTRIBUTE_SINK__ATTRIBUTESINK);
		createEOperation(sourceEClass, SOURCE___REMOVE_ATTRIBUTE_SINK__ATTRIBUTESINK);
		createEOperation(sourceEClass, SOURCE___ADD_ELEMENT_SINK__ELEMENTSINK);
		createEOperation(sourceEClass, SOURCE___REMOVE_ELEMENT_SINK__ELEMENTSINK);
		createEOperation(sourceEClass, SOURCE___CLEAR_ELEMENT_SINKS);
		createEOperation(sourceEClass, SOURCE___CLEAR_ATTRIBUTE_SINKS);
		createEOperation(sourceEClass, SOURCE___CLEAR_SINKS);
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
		ReplayablePackage theReplayablePackage = (ReplayablePackage)EPackage.Registry.INSTANCE.getEPackage(ReplayablePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		pipeEClass.getESuperTypes().add(this.getSource());
		pipeEClass.getESuperTypes().add(this.getSink());
		sinkEClass.getESuperTypes().add(this.getAttributeSink());
		sinkEClass.getESuperTypes().add(this.getElementSink());

		// Initialize classes, features, and operations; add parameters
		initEClass(attributeSinkEClass, AttributeSink.class, "AttributeSink", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getAttributeSink__GraphAttributeAdded__String_long_String_Object(), null, "graphAttributeAdded", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sourceId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "timeId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "attribute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAttributeSink__GraphAttributeChanged__String_long_String_Object_Object(), null, "graphAttributeChanged", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sourceId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "timeId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "attribute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "oldValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "newValue", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAttributeSink__GraphAttributeRemoved__String_long_String(), null, "graphAttributeRemoved", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sourceId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "timeId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "attribute", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAttributeSink__NodeAttributeAdded__String_long_String_String_Object(), null, "nodeAttributeAdded", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sourceId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "timeId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "nodeId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "attribute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAttributeSink__NodeAttributeChanged__String_long_String_String_Object_Object(), null, "nodeAttributeChanged", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sourceId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "timeId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "nodeId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "attribute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "oldValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "newValue", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAttributeSink__NodeAttributeRemoved__String_long_String_String(), null, "nodeAttributeRemoved", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sourceId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "timeId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "nodeId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "attribute", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAttributeSink__EdgeAttributeAdded__String_long_String_String_Object(), null, "edgeAttributeAdded", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sourceId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "timeId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "edgeId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "attribute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAttributeSink__EdgeAttributeChanged__String_long_String_String_Object_Object(), null, "edgeAttributeChanged", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sourceId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "timeId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "edgeId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "attribute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "oldValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "newValue", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAttributeSink__EdgeAttributeRemoved__String_long_String_String(), null, "edgeAttributeRemoved", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sourceId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "timeId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "edgeId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "attribute", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(elementSinkEClass, ElementSink.class, "ElementSink", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getElementSink__NodeAdded__String_long_String(), null, "nodeAdded", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sourceId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "timeId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "nodeId", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getElementSink__NodeRemoved__String_long_String(), null, "nodeRemoved", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sourceId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "timeId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "nodeId", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getElementSink__EdgeAdded__String_long_String_String_String_boolean(), null, "edgeAdded", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sourceId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "timeId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "edgeId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "fromNodeId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "toNodeId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "directed", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getElementSink__EdgeRemoved__String_long_String(), null, "edgeRemoved", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sourceId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "timeId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "edgeId", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getElementSink__GraphCleared__String_long(), null, "graphCleared", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sourceId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "timeId", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getElementSink__StepBegins__String_long_double(), null, "stepBegins", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sourceId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "timeId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "step", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(pipeEClass, Pipe.class, "Pipe", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(replayableEClass, Replayable.class, "Replayable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getReplayable__GetReplayController(), theReplayablePackage.getController(), "getReplayController", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(sinkEClass, Sink.class, "Sink", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sourceEClass, Source.class, "Source", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getSource__AddSink__Sink(), null, "addSink", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSink(), "sink", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSource__RemoveSink__Sink(), null, "removeSink", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSink(), "sink", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSource__AddAttributeSink__AttributeSink(), null, "addAttributeSink", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAttributeSink(), "sink", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSource__RemoveAttributeSink__AttributeSink(), null, "removeAttributeSink", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAttributeSink(), "sink", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSource__AddElementSink__ElementSink(), null, "addElementSink", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getElementSink(), "sink", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSource__RemoveElementSink__ElementSink(), null, "removeElementSink", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getElementSink(), "sink", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getSource__ClearElementSinks(), null, "clearElementSinks", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getSource__ClearAttributeSinks(), null, "clearAttributeSinks", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getSource__ClearSinks(), null, "clearSinks", 0, 1, IS_UNIQUE, IS_ORDERED);
	}

} //StreamPackageImpl
