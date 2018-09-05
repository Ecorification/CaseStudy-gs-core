package unification.org.graphstream.graph.implementations

import ecore.org.graphstream.graph.implementations.AbstractNode
import ecore.org.graphstream.graph.implementations.ImplementationsFactoryOld
import edu.kit.ipd.sdq.activextendannotations.DelegateDeclared
import org.graphstream.graph.implementations.AbstractElement
	

/**
 * Unification class for the class AbstractNode
 */
abstract class UnifiedAbstractNode extends AbstractElement implements AbstractNode {
	
	@DelegateDeclared
	protected var AbstractNode ecoreImplementation
	

	new(String id) {
		super(id)
		ecoreImplementation = instance
	}		
	
	new() {
		super()
		ecoreImplementation = instance
	}
	
	override protected AbstractNode getInstance() {
		return ImplementationsFactoryOld.eINSTANCE.createAbstractNode
	}
	
}
