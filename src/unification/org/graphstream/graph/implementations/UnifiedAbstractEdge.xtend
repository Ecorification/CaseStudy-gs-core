package unification.org.graphstream.graph.implementations

import ecore.org.graphstream.graph.implementations.AbstractEdge
import ecore.org.graphstream.graph.implementations.ImplementationsFactoryOld
import edu.kit.ipd.sdq.activextendannotations.DelegateDeclared
import org.graphstream.graph.implementations.AbstractElement
	

/**
 * Unification class for the class AbstractEdge
 */
class UnifiedAbstractEdge extends AbstractElement implements AbstractEdge {
	
	@DelegateDeclared
	protected var AbstractEdge ecoreImplementation
	

	new(String id) {
		super(id)
		ecoreImplementation = instance
	}		
	
	new() {
		super()
		ecoreImplementation = instance
	}
	
	override protected AbstractEdge getInstance() {
		return ImplementationsFactoryOld.eINSTANCE.createAbstractEdge
	}
	
			
			
			
}
