package unification.org.graphstream.graph.implementations

import ecore.org.graphstream.graph.implementations.AbstractElement
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl
import org.eclipse.xtend.lib.annotations.Delegate
import edu.kit.ipd.sdq.activextendannotations.DelegateExcept
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.common.notify.Notifier
import org.eclipse.emf.ecore.InternalEObject
	

/**
 * Unification class for the class AbstractElement
 */
abstract class UnifiedAbstractElement extends MinimalEObjectImpl.Container implements AbstractElement {
	
	@Delegate
	protected var AbstractElement ecoreImplementation
	
	// Methods of InternalEObject must also be delegated to the wrapped class
	@DelegateExcept(Notifier, EObject)
	protected var InternalEObject internalEcoreImplementation

	new() {
		ecoreImplementation = instance
		internalEcoreImplementation = ecoreImplementation as InternalEObject
	}
	
	def protected abstract AbstractElement getInstance()
	
			
			
			
}
