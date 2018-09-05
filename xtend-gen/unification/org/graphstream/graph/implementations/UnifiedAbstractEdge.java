package unification.org.graphstream.graph.implementations;

import ecore.org.graphstream.graph.implementations.AbstractEdge;
import ecore.org.graphstream.graph.implementations.ImplementationsFactoryOld;
import edu.kit.ipd.sdq.activextendannotations.DelegateDeclared;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.AbstractElement;
import org.graphstream.graph.implementations.AbstractGraph;
import org.graphstream.graph.implementations.AbstractNode;

/**
 * Unification class for the class AbstractEdge
 */
@SuppressWarnings("all")
public abstract class UnifiedAbstractEdge extends AbstractElement implements AbstractEdge {
  @DelegateDeclared
  protected AbstractEdge ecoreImplementation;
  
  public UnifiedAbstractEdge(final String id) {
    super(id);
    this.ecoreImplementation = this.getInstance();
  }
  
  public UnifiedAbstractEdge() {
    super();
    this.ecoreImplementation = this.getInstance();
  }
  
  @Override
  protected AbstractEdge getInstance() {
    return ImplementationsFactoryOld.eINSTANCE.createAbstractEdge();
  }
  
  public AbstractGraph getGraph() {
    return this.ecoreImplementation.getGraph();
  }
  
  public <T extends Node> T getNode0() {
    return this.ecoreImplementation.getNode0();
  }
  
  public <T extends Node> T getNode1() {
    return this.ecoreImplementation.getNode1();
  }
  
  public <T extends Node> T getOpposite(final Node node) {
    return this.ecoreImplementation.getOpposite(node);
  }
  
  public AbstractNode getSource() {
    return this.ecoreImplementation.getSource();
  }
  
  public <T extends Node> T getSourceNode() {
    return this.ecoreImplementation.getSourceNode();
  }
  
  public AbstractNode getTarget() {
    return this.ecoreImplementation.getTarget();
  }
  
  public <T extends Node> T getTargetNode() {
    return this.ecoreImplementation.getTargetNode();
  }
  
  public boolean isDirected() {
    return this.ecoreImplementation.isDirected();
  }
  
  public boolean isLoop() {
    return this.ecoreImplementation.isLoop();
  }
  
  public void setDirected(final boolean value) {
    this.ecoreImplementation.setDirected(value);
  }
  
  public void setGraph(final AbstractGraph value) {
    this.ecoreImplementation.setGraph(value);
  }
  
  public void setSource(final AbstractNode value) {
    this.ecoreImplementation.setSource(value);
  }
  
  public void setTarget(final AbstractNode value) {
    this.ecoreImplementation.setTarget(value);
  }
}
