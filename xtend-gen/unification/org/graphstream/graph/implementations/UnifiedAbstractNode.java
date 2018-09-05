package unification.org.graphstream.graph.implementations;

import ecore.org.graphstream.graph.implementations.AbstractNode;
import ecore.org.graphstream.graph.implementations.ImplementationsFactoryOld;
import edu.kit.ipd.sdq.activextendannotations.DelegateDeclared;
import java.util.Collection;
import java.util.Iterator;
import org.graphstream.graph.Edge;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.AbstractElement;

/**
 * Unification class for the class AbstractNode
 */
@SuppressWarnings("all")
public class UnifiedAbstractNode extends AbstractElement implements AbstractNode {
  @DelegateDeclared
  protected AbstractNode ecoreImplementation;
  
  public UnifiedAbstractNode(final String id) {
    super(id);
    this.ecoreImplementation = this.getInstance();
  }
  
  public UnifiedAbstractNode() {
    super();
    this.ecoreImplementation = this.getInstance();
  }
  
  @Override
  protected AbstractNode getInstance() {
    return ImplementationsFactoryOld.eINSTANCE.createAbstractNode();
  }
  
  public <T extends Node> Iterator<T> getBreadthFirstIterator() {
    return this.ecoreImplementation.getBreadthFirstIterator();
  }
  
  public <T extends Node> Iterator<T> getBreadthFirstIterator(final boolean directed) {
    return this.ecoreImplementation.getBreadthFirstIterator(directed);
  }
  
  public int getDegree() {
    return this.ecoreImplementation.getDegree();
  }
  
  public <T extends Node> Iterator<T> getDepthFirstIterator() {
    return this.ecoreImplementation.getDepthFirstIterator();
  }
  
  public <T extends Node> Iterator<T> getDepthFirstIterator(final boolean directed) {
    return this.ecoreImplementation.getDepthFirstIterator(directed);
  }
  
  public <T extends Edge> Iterable<T> getEachEdge() {
    return this.ecoreImplementation.getEachEdge();
  }
  
  public <T extends Edge> Iterable<T> getEachEnteringEdge() {
    return this.ecoreImplementation.getEachEnteringEdge();
  }
  
  public <T extends Edge> Iterable<T> getEachLeavingEdge() {
    return this.ecoreImplementation.getEachLeavingEdge();
  }
  
  public <T extends Edge> T getEdge(final int i) {
    return this.ecoreImplementation.getEdge(i);
  }
  
  public <T extends Edge> T getEdgeBetween(final Node node) {
    return this.ecoreImplementation.getEdgeBetween(node);
  }
  
  public <T extends Edge> T getEdgeBetween(final int index) {
    return this.ecoreImplementation.getEdgeBetween(index);
  }
  
  public <T extends Edge> T getEdgeBetween(final String id) {
    return this.ecoreImplementation.getEdgeBetween(id);
  }
  
  public <T extends Edge> T getEdgeFrom(final Node node) {
    return this.ecoreImplementation.getEdgeFrom(node);
  }
  
  public <T extends Edge> T getEdgeFrom(final int index) {
    return this.ecoreImplementation.getEdgeFrom(index);
  }
  
  public <T extends Edge> T getEdgeFrom(final String id) {
    return this.ecoreImplementation.getEdgeFrom(id);
  }
  
  public <T extends Edge> Iterator<T> getEdgeIterator() {
    return this.ecoreImplementation.getEdgeIterator();
  }
  
  public <T extends Edge> Collection<T> getEdgeSet() {
    return this.ecoreImplementation.getEdgeSet();
  }
  
  public <T extends Edge> T getEdgeToward(final Node node) {
    return this.ecoreImplementation.getEdgeToward(node);
  }
  
  public <T extends Edge> T getEdgeToward(final int index) {
    return this.ecoreImplementation.getEdgeToward(index);
  }
  
  public <T extends Edge> T getEdgeToward(final String id) {
    return this.ecoreImplementation.getEdgeToward(id);
  }
  
  public <T extends Edge> T getEnteringEdge(final int i) {
    return this.ecoreImplementation.getEnteringEdge(i);
  }
  
  public <T extends Edge> Iterator<T> getEnteringEdgeIterator() {
    return this.ecoreImplementation.getEnteringEdgeIterator();
  }
  
  public <T extends Edge> Collection<T> getEnteringEdgeSet() {
    return this.ecoreImplementation.getEnteringEdgeSet();
  }
  
  public Graph getGraph() {
    return this.ecoreImplementation.getGraph();
  }
  
  public int getInDegree() {
    return this.ecoreImplementation.getInDegree();
  }
  
  public <T extends Edge> T getLeavingEdge(final int i) {
    return this.ecoreImplementation.getLeavingEdge(i);
  }
  
  public <T extends Edge> Iterator<T> getLeavingEdgeIterator() {
    return this.ecoreImplementation.getLeavingEdgeIterator();
  }
  
  public <T extends Edge> Collection<T> getLeavingEdgeSet() {
    return this.ecoreImplementation.getLeavingEdgeSet();
  }
  
  public <T extends Node> Iterator<T> getNeighborNodeIterator() {
    return this.ecoreImplementation.getNeighborNodeIterator();
  }
  
  public int getOutDegree() {
    return this.ecoreImplementation.getOutDegree();
  }
  
  public boolean hasEdgeBetween(final Node node) {
    return this.ecoreImplementation.hasEdgeBetween(node);
  }
  
  public boolean hasEdgeBetween(final int index) {
    return this.ecoreImplementation.hasEdgeBetween(index);
  }
  
  public boolean hasEdgeBetween(final String id) {
    return this.ecoreImplementation.hasEdgeBetween(id);
  }
  
  public boolean hasEdgeFrom(final Node node) {
    return this.ecoreImplementation.hasEdgeFrom(node);
  }
  
  public boolean hasEdgeFrom(final int index) {
    return this.ecoreImplementation.hasEdgeFrom(index);
  }
  
  public boolean hasEdgeFrom(final String id) {
    return this.ecoreImplementation.hasEdgeFrom(id);
  }
  
  public boolean hasEdgeToward(final Node node) {
    return this.ecoreImplementation.hasEdgeToward(node);
  }
  
  public boolean hasEdgeToward(final int index) {
    return this.ecoreImplementation.hasEdgeToward(index);
  }
  
  public boolean hasEdgeToward(final String id) {
    return this.ecoreImplementation.hasEdgeToward(id);
  }
  
  public boolean isEnteringEdge(final Edge e) {
    return this.ecoreImplementation.isEnteringEdge(e);
  }
  
  public boolean isIncidentEdge(final Edge e) {
    return this.ecoreImplementation.isIncidentEdge(e);
  }
  
  public boolean isLeavingEdge(final Edge e) {
    return this.ecoreImplementation.isLeavingEdge(e);
  }
  
  public Iterator<Edge> iterator() {
    return this.ecoreImplementation.iterator();
  }
  
  public void setGraph(final Graph value) {
    this.ecoreImplementation.setGraph(value);
  }
}
