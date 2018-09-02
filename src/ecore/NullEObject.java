package ecore;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

public abstract class NullEObject implements EObject {
	private static String message = "This method is not implemented, since it is called on a null object!";

	@Override
	public EList<Adapter> eAdapters() {
		System.err.println(message);
		return null;
	}

	@Override
	public boolean eDeliver() {
		System.err.println(message);
		return false;
	}

	@Override
	public void eSetDeliver(boolean deliver) {
		System.err.println(message);

	}

	@Override
	public void eNotify(Notification notification) {
		System.err.println(message);

	}

	@Override
	public EClass eClass() {
		System.err.println(message);
		return null;
	}

	@Override
	public Resource eResource() {
		System.err.println(message);
		return null;
	}

	@Override
	public EObject eContainer() {
		System.err.println(message);
		return null;
	}

	@Override
	public EStructuralFeature eContainingFeature() {
		System.err.println(message);
		return null;
	}

	@Override
	public EReference eContainmentFeature() {
		System.err.println(message);
		return null;
	}

	@Override
	public EList<EObject> eContents() {
		System.err.println(message);
		return null;
	}

	@Override
	public TreeIterator<EObject> eAllContents() {
		System.err.println(message);
		return null;
	}

	@Override
	public boolean eIsProxy() {
		System.err.println(message);
		return false;
	}

	@Override
	public EList<EObject> eCrossReferences() {
		System.err.println(message);
		return null;
	}

	@Override
	public Object eGet(EStructuralFeature feature) {
		System.err.println(message);
		return null;
	}

	@Override
	public Object eGet(EStructuralFeature feature, boolean resolve) {
		System.err.println(message);
		return null;
	}

	@Override
	public void eSet(EStructuralFeature feature, Object newValue) {
		System.err.println(message);

	}

	@Override
	public boolean eIsSet(EStructuralFeature feature) {
		System.err.println(message);
		return false;
	}

	@Override
	public void eUnset(EStructuralFeature feature) {
		System.err.println(message);

	}

	@Override
	public Object eInvoke(EOperation operation, EList<?> arguments) throws InvocationTargetException {
		System.err.println(message);
		return null;
	}
}