package unification.org.graphstream.graph.implementations

import ecore.org.graphstream.graph.implementations.AbstractGraph
import ecore.org.graphstream.graph.implementations.ImplementationsFactoryOld
import edu.kit.ipd.sdq.activextendannotations.DelegateDeclared
import org.graphstream.graph.implementations.AbstractElement
	

/**
 * Unification class for the class AbstractGraph
 */
abstract class UnifiedAbstractGraph extends AbstractElement implements AbstractGraph {
	
	@DelegateDeclared
	protected var AbstractGraph ecoreImplementation
	

	new(String id) {
		super(id)
		ecoreImplementation = instance
	}		
	
	new() {
		super()
		ecoreImplementation = instance
	}
	
	override protected AbstractGraph getInstance() {
		return ImplementationsFactoryOld.eINSTANCE.createAbstractGraph
	}
	
			
			
			
			
			
			
}
