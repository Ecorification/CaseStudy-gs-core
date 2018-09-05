package unification.org.graphstream.graph.implementations;

import ecore.org.graphstream.graph.implementations.AbstractGraph;
import ecore.org.graphstream.graph.implementations.ImplementationsFactoryOld;
import edu.kit.ipd.sdq.activextendannotations.DelegateDeclared;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import org.graphstream.graph.Edge;
import org.graphstream.graph.EdgeFactory;
import org.graphstream.graph.ElementNotFoundException;
import org.graphstream.graph.Node;
import org.graphstream.graph.NodeFactory;
import org.graphstream.graph.implementations.AbstractElement;
import org.graphstream.stream.AttributeSink;
import org.graphstream.stream.ElementSink;
import org.graphstream.stream.GraphParseException;
import org.graphstream.stream.Replayable;
import org.graphstream.stream.Sink;
import org.graphstream.stream.file.FileSink;
import org.graphstream.stream.file.FileSource;
import org.graphstream.ui.view.Viewer;

/**
 * Unification class for the class AbstractGraph
 */
@SuppressWarnings("all")
public abstract class UnifiedAbstractGraph extends AbstractElement implements AbstractGraph {
  @DelegateDeclared
  protected AbstractGraph ecoreImplementation;
  
  public UnifiedAbstractGraph(final String id) {
    super(id);
    this.ecoreImplementation = this.getInstance();
  }
  
  public UnifiedAbstractGraph() {
    super();
    this.ecoreImplementation = this.getInstance();
  }
  
  @Override
  protected AbstractGraph getInstance() {
    return ImplementationsFactoryOld.eINSTANCE.createAbstractGraph();
  }
  
  public void addAttributeSink(final AttributeSink sink) {
    this.ecoreImplementation.addAttributeSink(sink);
  }
  
  public <T extends Edge> T addEdge(final String id, final String node1, final String node2) {
    return this.ecoreImplementation.addEdge(id, node1, node2);
  }
  
  public <T extends Edge> T addEdge(final String id, final String from, final String to, final boolean directed) {
    return this.ecoreImplementation.addEdge(id, from, to, directed);
  }
  
  public <T extends Edge> T addEdge(final String id, final int index1, final int index2) {
    return this.ecoreImplementation.addEdge(id, index1, index2);
  }
  
  public <T extends Edge> T addEdge(final String id, final int fromIndex, final int toIndex, final boolean directed) {
    return this.ecoreImplementation.addEdge(id, fromIndex, toIndex, directed);
  }
  
  public <T extends Edge> T addEdge(final String id, final Node node1, final Node node2) {
    return this.ecoreImplementation.addEdge(id, node1, node2);
  }
  
  public <T extends Edge> T addEdge(final String id, final Node from, final Node to, final boolean directed) {
    return this.ecoreImplementation.addEdge(id, from, to, directed);
  }
  
  public void addElementSink(final ElementSink sink) {
    this.ecoreImplementation.addElementSink(sink);
  }
  
  public <T extends Node> T addNode(final String id) {
    return this.ecoreImplementation.addNode(id);
  }
  
  public void addSink(final Sink sink) {
    this.ecoreImplementation.addSink(sink);
  }
  
  public Iterable<AttributeSink> attributeSinks() {
    return this.ecoreImplementation.attributeSinks();
  }
  
  public void clear() {
    this.ecoreImplementation.clear();
  }
  
  public void clearAttributeSinks() {
    this.ecoreImplementation.clearAttributeSinks();
  }
  
  public void clearElementSinks() {
    this.ecoreImplementation.clearElementSinks();
  }
  
  public void clearSinks() {
    this.ecoreImplementation.clearSinks();
  }
  
  public Viewer display() {
    return this.ecoreImplementation.display();
  }
  
  public Viewer display(final boolean autoLayout) {
    return this.ecoreImplementation.display(autoLayout);
  }
  
  public void edgeAdded(final String sourceId, final long timeId, final String edgeId, final String fromNodeId, final String toNodeId, final boolean directed) {
    this.ecoreImplementation.edgeAdded(sourceId, timeId, edgeId, fromNodeId, toNodeId, directed);
  }
  
  public void edgeAttributeAdded(final String sourceId, final long timeId, final String edgeId, final String attribute, final Object value) {
    this.ecoreImplementation.edgeAttributeAdded(sourceId, timeId, edgeId, attribute, value);
  }
  
  public void edgeAttributeChanged(final String sourceId, final long timeId, final String edgeId, final String attribute, final Object oldValue, final Object newValue) {
    this.ecoreImplementation.edgeAttributeChanged(sourceId, timeId, edgeId, attribute, oldValue, newValue);
  }
  
  public void edgeAttributeRemoved(final String sourceId, final long timeId, final String edgeId, final String attribute) {
    this.ecoreImplementation.edgeAttributeRemoved(sourceId, timeId, edgeId, attribute);
  }
  
  public EdgeFactory<? extends Edge> edgeFactory() {
    return this.ecoreImplementation.edgeFactory();
  }
  
  public void edgeRemoved(final String sourceId, final long timeId, final String edgeId) {
    this.ecoreImplementation.edgeRemoved(sourceId, timeId, edgeId);
  }
  
  public Iterable<ElementSink> elementSinks() {
    return this.ecoreImplementation.elementSinks();
  }
  
  public <T extends Edge> Iterable<? extends T> getEachEdge() {
    return this.ecoreImplementation.getEachEdge();
  }
  
  public <T extends Node> Iterable<? extends T> getEachNode() {
    return this.ecoreImplementation.getEachNode();
  }
  
  public <T extends Edge> T getEdge(final String id) {
    return this.ecoreImplementation.getEdge(id);
  }
  
  public <T extends Edge> T getEdge(final int index) {
    return this.ecoreImplementation.getEdge(index);
  }
  
  public int getEdgeCount() {
    return this.ecoreImplementation.getEdgeCount();
  }
  
  public EdgeFactory<? extends Edge> getEdgeFactory() {
    return this.ecoreImplementation.getEdgeFactory();
  }
  
  public <T extends Edge> Iterator<T> getEdgeIterator() {
    return this.ecoreImplementation.getEdgeIterator();
  }
  
  public <T extends Edge> Collection<T> getEdgeSet() {
    return this.ecoreImplementation.getEdgeSet();
  }
  
  public <T extends Node> T getNode(final String id) {
    return this.ecoreImplementation.getNode(id);
  }
  
  public <T extends Node> T getNode(final int index) {
    return this.ecoreImplementation.getNode(index);
  }
  
  public int getNodeCount() {
    return this.ecoreImplementation.getNodeCount();
  }
  
  public NodeFactory<? extends Node> getNodeFactory() {
    return this.ecoreImplementation.getNodeFactory();
  }
  
  public <T extends Node> Iterator<T> getNodeIterator() {
    return this.ecoreImplementation.getNodeIterator();
  }
  
  public <T extends Node> Collection<T> getNodeSet() {
    return this.ecoreImplementation.getNodeSet();
  }
  
  public Replayable.Controller getReplayController() {
    return this.ecoreImplementation.getReplayController();
  }
  
  public long getReplayId() {
    return this.ecoreImplementation.getReplayId();
  }
  
  public double getStep() {
    return this.ecoreImplementation.getStep();
  }
  
  public void graphAttributeAdded(final String sourceId, final long timeId, final String attribute, final Object value) {
    this.ecoreImplementation.graphAttributeAdded(sourceId, timeId, attribute, value);
  }
  
  public void graphAttributeChanged(final String sourceId, final long timeId, final String attribute, final Object oldValue, final Object newValue) {
    this.ecoreImplementation.graphAttributeChanged(sourceId, timeId, attribute, oldValue, newValue);
  }
  
  public void graphAttributeRemoved(final String sourceId, final long timeId, final String attribute) {
    this.ecoreImplementation.graphAttributeRemoved(sourceId, timeId, attribute);
  }
  
  public void graphCleared(final String sourceId, final long timeId) {
    this.ecoreImplementation.graphCleared(sourceId, timeId);
  }
  
  public boolean isAutoCreate() {
    return this.ecoreImplementation.isAutoCreate();
  }
  
  public boolean isAutoCreationEnabled() {
    return this.ecoreImplementation.isAutoCreationEnabled();
  }
  
  public boolean isNullAttributesAreErrors() {
    return this.ecoreImplementation.isNullAttributesAreErrors();
  }
  
  public boolean isStrict() {
    return this.ecoreImplementation.isStrict();
  }
  
  public boolean isStrictChecking() {
    return this.ecoreImplementation.isStrictChecking();
  }
  
  public Iterator<Node> iterator() {
    return this.ecoreImplementation.iterator();
  }
  
  public void nodeAdded(final String sourceId, final long timeId, final String nodeId) {
    this.ecoreImplementation.nodeAdded(sourceId, timeId, nodeId);
  }
  
  public void nodeAttributeAdded(final String sourceId, final long timeId, final String nodeId, final String attribute, final Object value) {
    this.ecoreImplementation.nodeAttributeAdded(sourceId, timeId, nodeId, attribute, value);
  }
  
  public void nodeAttributeChanged(final String sourceId, final long timeId, final String nodeId, final String attribute, final Object oldValue, final Object newValue) {
    this.ecoreImplementation.nodeAttributeChanged(sourceId, timeId, nodeId, attribute, oldValue, newValue);
  }
  
  public void nodeAttributeRemoved(final String sourceId, final long timeId, final String nodeId, final String attribute) {
    this.ecoreImplementation.nodeAttributeRemoved(sourceId, timeId, nodeId, attribute);
  }
  
  public NodeFactory<? extends Node> nodeFactory() {
    return this.ecoreImplementation.nodeFactory();
  }
  
  public void nodeRemoved(final String sourceId, final long timeId, final String nodeId) {
    this.ecoreImplementation.nodeRemoved(sourceId, timeId, nodeId);
  }
  
  public boolean nullAttributesAreErrors() {
    return this.ecoreImplementation.nullAttributesAreErrors();
  }
  
  public void read(final FileSource input, final String filename) throws IOException, GraphParseException {
    this.ecoreImplementation.read(input, filename);
  }
  
  public void read(final String filename) throws IOException, GraphParseException, ElementNotFoundException {
    this.ecoreImplementation.read(filename);
  }
  
  public void removeAttributeSink(final AttributeSink sink) {
    this.ecoreImplementation.removeAttributeSink(sink);
  }
  
  public <T extends Edge> T removeEdge(final String id) {
    return this.ecoreImplementation.removeEdge(id);
  }
  
  public <T extends Edge> T removeEdge(final int index) {
    return this.ecoreImplementation.removeEdge(index);
  }
  
  public <T extends Edge> T removeEdge(final Edge edge) {
    return this.ecoreImplementation.removeEdge(edge);
  }
  
  public <T extends Edge> T removeEdge(final String from, final String to) {
    return this.ecoreImplementation.removeEdge(from, to);
  }
  
  public <T extends Edge> T removeEdge(final int fromIndex, final int toIndex) {
    return this.ecoreImplementation.removeEdge(fromIndex, toIndex);
  }
  
  public <T extends Edge> T removeEdge(final Node node1, final Node node2) {
    return this.ecoreImplementation.removeEdge(node1, node2);
  }
  
  public void removeElementSink(final ElementSink sink) {
    this.ecoreImplementation.removeElementSink(sink);
  }
  
  public <T extends Node> T removeNode(final String id) {
    return this.ecoreImplementation.removeNode(id);
  }
  
  public <T extends Node> T removeNode(final int index) {
    return this.ecoreImplementation.removeNode(index);
  }
  
  public <T extends Node> T removeNode(final Node node) {
    return this.ecoreImplementation.removeNode(node);
  }
  
  public void removeSink(final Sink sink) {
    this.ecoreImplementation.removeSink(sink);
  }
  
  public void setAutoCreate(final boolean value) {
    this.ecoreImplementation.setAutoCreate(value);
  }
  
  public void setEdgeFactory(final EdgeFactory<? extends Edge> value) {
    this.ecoreImplementation.setEdgeFactory(value);
  }
  
  public void setNodeFactory(final NodeFactory<? extends Node> value) {
    this.ecoreImplementation.setNodeFactory(value);
  }
  
  public void setNullAttributesAreErrors(final boolean value) {
    this.ecoreImplementation.setNullAttributesAreErrors(value);
  }
  
  public void setReplayId(final long value) {
    this.ecoreImplementation.setReplayId(value);
  }
  
  public void setStep(final double value) {
    this.ecoreImplementation.setStep(value);
  }
  
  public void setStrict(final boolean on) {
    this.ecoreImplementation.setStrict(on);
  }
  
  public void setStrictChecking(final boolean value) {
    this.ecoreImplementation.setStrictChecking(value);
  }
  
  public void stepBegins(final double time) {
    this.ecoreImplementation.stepBegins(time);
  }
  
  public void stepBegins(final String sourceId, final long timeId, final double step) {
    this.ecoreImplementation.stepBegins(sourceId, timeId, step);
  }
  
  public void write(final FileSink output, final String filename) throws IOException {
    this.ecoreImplementation.write(output, filename);
  }
  
  public void write(final String filename) throws IOException {
    this.ecoreImplementation.write(filename);
  }
}
