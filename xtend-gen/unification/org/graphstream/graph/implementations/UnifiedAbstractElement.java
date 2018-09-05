package unification.org.graphstream.graph.implementations;

import ecore.org.graphstream.graph.implementations.AbstractElement;
import ecore.org.graphstream.graph.implementations.ImplementationsFactoryOld;
import edu.kit.ipd.sdq.activextendannotations.DelegateExcept;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend.lib.annotations.Delegate;

/**
 * Unification class for the class AbstractElement
 */
@SuppressWarnings("all")
public class UnifiedAbstractElement extends MinimalEObjectImpl.Container implements AbstractElement {
  @Delegate
  protected AbstractElement ecoreImplementation;
  
  @DelegateExcept({ Notifier.class, EObject.class })
  protected InternalEObject internalEcoreImplementation;
  
  public UnifiedAbstractElement() {
    this.ecoreImplementation = this.getInstance();
    this.internalEcoreImplementation = ((InternalEObject) this.ecoreImplementation);
  }
  
  protected AbstractElement getInstance() {
    return ImplementationsFactoryOld.eINSTANCE.createAbstractElement();
  }
  
  public void addAttribute(final String attribute, final Object[] values) {
    this.ecoreImplementation.addAttribute(attribute, values);
  }
  
  public void addAttributes(final Map<String, Object> attributes) {
    this.ecoreImplementation.addAttributes(attributes);
  }
  
  public void changeAttribute(final String attribute, final Object[] values) {
    this.ecoreImplementation.changeAttribute(attribute, values);
  }
  
  public void clearAttributes() {
    this.ecoreImplementation.clearAttributes();
  }
  
  public Object[] getArray(final String key) {
    return this.ecoreImplementation.getArray(key);
  }
  
  public <T extends Object> T getAttribute(final String key) {
    return this.ecoreImplementation.getAttribute(key);
  }
  
  public <T extends Object> T getAttribute(final String key, final Class<T> clazz) {
    return this.ecoreImplementation.getAttribute(key, clazz);
  }
  
  public int getAttributeCount() {
    return this.ecoreImplementation.getAttributeCount();
  }
  
  public Iterator<String> getAttributeKeyIterator() {
    return this.ecoreImplementation.getAttributeKeyIterator();
  }
  
  public Collection<String> getAttributeKeySet() {
    return this.ecoreImplementation.getAttributeKeySet();
  }
  
  public HashMap<String, Object> getAttributes() {
    return this.ecoreImplementation.getAttributes();
  }
  
  public ArrayList<String> getAttributesBeingRemoved() {
    return this.ecoreImplementation.getAttributesBeingRemoved();
  }
  
  public Iterable<String> getEachAttributeKey() {
    return this.ecoreImplementation.getEachAttributeKey();
  }
  
  public <T extends Object> T getFirstAttributeOf(final String[] keys) {
    return this.ecoreImplementation.getFirstAttributeOf(keys);
  }
  
  public <T extends Object> T getFirstAttributeOf(final Class<T> clazz, final String[] keys) {
    return this.ecoreImplementation.getFirstAttributeOf(clazz, keys);
  }
  
  public HashMap<?, ?> getHash(final String key) {
    return this.ecoreImplementation.getHash(key);
  }
  
  public String getId() {
    return this.ecoreImplementation.getId();
  }
  
  public int getIndex() {
    return this.ecoreImplementation.getIndex();
  }
  
  public String getLabel(final String key) {
    return this.ecoreImplementation.getLabel(key);
  }
  
  public double getNumber(final String key) {
    return this.ecoreImplementation.getNumber(key);
  }
  
  public ArrayList<? extends Number> getVector(final String key) {
    return this.ecoreImplementation.getVector(key);
  }
  
  public boolean hasArray(final String key) {
    return this.ecoreImplementation.hasArray(key);
  }
  
  public boolean hasAttribute(final String key) {
    return this.ecoreImplementation.hasAttribute(key);
  }
  
  public boolean hasAttribute(final String key, final Class<?> clazz) {
    return this.ecoreImplementation.hasAttribute(key, clazz);
  }
  
  public boolean hasHash(final String key) {
    return this.ecoreImplementation.hasHash(key);
  }
  
  public boolean hasLabel(final String key) {
    return this.ecoreImplementation.hasLabel(key);
  }
  
  public boolean hasNumber(final String key) {
    return this.ecoreImplementation.hasNumber(key);
  }
  
  public boolean hasVector(final String key) {
    return this.ecoreImplementation.hasVector(key);
  }
  
  public void removeAttribute(final String attribute) {
    this.ecoreImplementation.removeAttribute(attribute);
  }
  
  public void setAttribute(final String attribute, final Object[] values) {
    this.ecoreImplementation.setAttribute(attribute, values);
  }
  
  public void setAttributes(final HashMap<String, Object> value) {
    this.ecoreImplementation.setAttributes(value);
  }
  
  public void setAttributesBeingRemoved(final ArrayList<String> value) {
    this.ecoreImplementation.setAttributesBeingRemoved(value);
  }
  
  public void setId(final String value) {
    this.ecoreImplementation.setId(value);
  }
  
  public void setIndex(final int value) {
    this.ecoreImplementation.setIndex(value);
  }
  
  public TreeIterator<EObject> eAllContents() {
    return this.ecoreImplementation.eAllContents();
  }
  
  public EClass eClass() {
    return this.ecoreImplementation.eClass();
  }
  
  public EObject eContainer() {
    return this.ecoreImplementation.eContainer();
  }
  
  public EStructuralFeature eContainingFeature() {
    return this.ecoreImplementation.eContainingFeature();
  }
  
  public EReference eContainmentFeature() {
    return this.ecoreImplementation.eContainmentFeature();
  }
  
  public EList<EObject> eContents() {
    return this.ecoreImplementation.eContents();
  }
  
  public EList<EObject> eCrossReferences() {
    return this.ecoreImplementation.eCrossReferences();
  }
  
  public Object eGet(final EStructuralFeature feature) {
    return this.ecoreImplementation.eGet(feature);
  }
  
  public Object eGet(final EStructuralFeature feature, final boolean resolve) {
    return this.ecoreImplementation.eGet(feature, resolve);
  }
  
  public Object eInvoke(final EOperation operation, final EList<?> arguments) throws InvocationTargetException {
    return this.ecoreImplementation.eInvoke(operation, arguments);
  }
  
  public boolean eIsProxy() {
    return this.ecoreImplementation.eIsProxy();
  }
  
  public boolean eIsSet(final EStructuralFeature feature) {
    return this.ecoreImplementation.eIsSet(feature);
  }
  
  public Resource eResource() {
    return this.ecoreImplementation.eResource();
  }
  
  public void eSet(final EStructuralFeature feature, final Object newValue) {
    this.ecoreImplementation.eSet(feature, newValue);
  }
  
  public void eUnset(final EStructuralFeature feature) {
    this.ecoreImplementation.eUnset(feature);
  }
  
  public EList<Adapter> eAdapters() {
    return this.ecoreImplementation.eAdapters();
  }
  
  public boolean eDeliver() {
    return this.ecoreImplementation.eDeliver();
  }
  
  public void eNotify(final Notification notification) {
    this.ecoreImplementation.eNotify(notification);
  }
  
  public void eSetDeliver(final boolean deliver) {
    this.ecoreImplementation.eSetDeliver(deliver);
  }
  
  public int eBaseStructuralFeatureID(final int derivedFeatureID, final Class<?> baseClass) {
    return this.internalEcoreImplementation.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }
  
  public NotificationChain eBasicRemoveFromContainer(final NotificationChain notifications) {
    return this.internalEcoreImplementation.eBasicRemoveFromContainer(notifications);
  }
  
  public NotificationChain eBasicSetContainer(final InternalEObject newContainer, final int newContainerFeatureID, final NotificationChain notifications) {
    return this.internalEcoreImplementation.eBasicSetContainer(newContainer, newContainerFeatureID, notifications);
  }
  
  public int eContainerFeatureID() {
    return this.internalEcoreImplementation.eContainerFeatureID();
  }
  
  public int eDerivedOperationID(final int baseOperationID, final Class<?> baseClass) {
    return this.internalEcoreImplementation.eDerivedOperationID(baseOperationID, baseClass);
  }
  
  public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class<?> baseClass) {
    return this.internalEcoreImplementation.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }
  
  public Resource.Internal eDirectResource() {
    return this.internalEcoreImplementation.eDirectResource();
  }
  
  public Object eGet(final EStructuralFeature eFeature, final boolean resolve, final boolean coreType) {
    return this.internalEcoreImplementation.eGet(eFeature, resolve, coreType);
  }
  
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    return this.internalEcoreImplementation.eGet(featureID, resolve, coreType);
  }
  
  public InternalEObject eInternalContainer() {
    return this.internalEcoreImplementation.eInternalContainer();
  }
  
  public Resource.Internal eInternalResource() {
    return this.internalEcoreImplementation.eInternalResource();
  }
  
  public NotificationChain eInverseAdd(final InternalEObject otherEnd, final int featureID, final Class<?> baseClass, final NotificationChain notifications) {
    return this.internalEcoreImplementation.eInverseAdd(otherEnd, featureID, baseClass, notifications);
  }
  
  public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final Class<?> baseClass, final NotificationChain notifications) {
    return this.internalEcoreImplementation.eInverseRemove(otherEnd, featureID, baseClass, notifications);
  }
  
  public Object eInvoke(final int operationID, final EList<?> arguments) throws InvocationTargetException {
    return this.internalEcoreImplementation.eInvoke(operationID, arguments);
  }
  
  public boolean eIsSet(final int featureID) {
    return this.internalEcoreImplementation.eIsSet(featureID);
  }
  
  public boolean eNotificationRequired() {
    return this.internalEcoreImplementation.eNotificationRequired();
  }
  
  public EObject eObjectForURIFragmentSegment(final String uriFragmentSegment) {
    return this.internalEcoreImplementation.eObjectForURIFragmentSegment(uriFragmentSegment);
  }
  
  public URI eProxyURI() {
    return this.internalEcoreImplementation.eProxyURI();
  }
  
  public EObject eResolveProxy(final InternalEObject proxy) {
    return this.internalEcoreImplementation.eResolveProxy(proxy);
  }
  
  public void eSet(final int featureID, final Object newValue) {
    this.internalEcoreImplementation.eSet(featureID, newValue);
  }
  
  public void eSetClass(final EClass eClass) {
    this.internalEcoreImplementation.eSetClass(eClass);
  }
  
  public void eSetProxyURI(final URI uri) {
    this.internalEcoreImplementation.eSetProxyURI(uri);
  }
  
  public NotificationChain eSetResource(final Resource.Internal resource, final NotificationChain notifications) {
    return this.internalEcoreImplementation.eSetResource(resource, notifications);
  }
  
  public void eSetStore(final InternalEObject.EStore store) {
    this.internalEcoreImplementation.eSetStore(store);
  }
  
  public EStructuralFeature.Setting eSetting(final EStructuralFeature feature) {
    return this.internalEcoreImplementation.eSetting(feature);
  }
  
  public InternalEObject.EStore eStore() {
    return this.internalEcoreImplementation.eStore();
  }
  
  public String eURIFragmentSegment(final EStructuralFeature eFeature, final EObject eObject) {
    return this.internalEcoreImplementation.eURIFragmentSegment(eFeature, eObject);
  }
  
  public void eUnset(final int featureID) {
    this.internalEcoreImplementation.eUnset(featureID);
  }
}
