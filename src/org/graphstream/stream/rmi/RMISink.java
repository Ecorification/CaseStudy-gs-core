/*
 * Copyright 2006 - 2016
 *     Stefan Balev     <stefan.balev@graphstream-project.org>
 *     Julien Baudry    <julien.baudry@graphstream-project.org>
 *     Antoine Dutot    <antoine.dutot@graphstream-project.org>
 *     Yoann Pigné      <yoann.pigne@graphstream-project.org>
 *     Guilhelm Savin   <guilhelm.savin@graphstream-project.org>
 * 
 * This file is part of GraphStream <http://graphstream-project.org>.
 * 
 * GraphStream is a library whose purpose is to handle static or dynamic
 * graph, create them from scratch, file or any source and display them.
 * 
 * This program is free software distributed under the terms of two licenses, the
 * CeCILL-C license that fits European law, and the GNU Lesser General Public
 * License. You can  use, modify and/ or redistribute the software under the terms
 * of the CeCILL-C license as circulated by CEA, CNRS and INRIA at the following
 * URL <http://www.cecill.info> or under the terms of the GNU LGPL as published by
 * the Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * The fact that you are presently reading this means that you have had
 * knowledge of the CeCILL-C and LGPL licenses and that you accept their terms.
 */
package org.graphstream.stream.rmi;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.concurrent.ConcurrentHashMap;

import org.graphstream.stream.Sink;

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
import java.lang.reflect.InvocationTargetException;

public class RMISink extends UnicastRemoteObject implements RMIAdapterOut, Sink {
	private static final long serialVersionUID = 23444722897331612L;

	ConcurrentHashMap<String, RMIAdapterIn> inputs;

	public RMISink() throws RemoteException {
		super();
		inputs = new ConcurrentHashMap<String, RMIAdapterIn>();
	}

	public RMISink(String name) throws RemoteException {
		this();
		bind(name);
	}

	public void bind(String name) {
		try {
			Naming.rebind(String.format("//localhost/%s", name), this);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void register(String url) throws RemoteException {
		try {
			RMIAdapterIn in = (RMIAdapterIn) Naming.lookup(url);

			if (in != null)
				inputs.put(url, in);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void unregister(String url) throws RemoteException {
		if (inputs.containsKey(url))
			inputs.remove(url);
	}

	public void edgeAttributeAdded(String graphId, long timeId, String edgeId,
			String attribute, Object value) {
		for (RMIAdapterIn in : inputs.values()) {
			try {
				in.edgeAttributeAdded(graphId, timeId, edgeId, attribute, value);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void edgeAttributeChanged(String graphId, long timeId,
			String edgeId, String attribute, Object oldValue, Object newValue) {
		for (RMIAdapterIn in : inputs.values()) {
			try {
				in.edgeAttributeChanged(graphId, timeId, edgeId, attribute,
						oldValue, newValue);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void edgeAttributeRemoved(String graphId, long timeId,
			String edgeId, String attribute) {
		for (RMIAdapterIn in : inputs.values()) {
			try {
				in.edgeAttributeRemoved(graphId, timeId, edgeId, attribute);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void graphAttributeAdded(String graphId, long timeId,
			String attribute, Object value) {
		for (RMIAdapterIn in : inputs.values()) {
			try {
				in.graphAttributeAdded(graphId, timeId, attribute, value);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void graphAttributeChanged(String graphId, long timeId,
			String attribute, Object oldValue, Object newValue) {
		for (RMIAdapterIn in : inputs.values()) {
			try {
				in.graphAttributeChanged(graphId, timeId, attribute, oldValue,
						newValue);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void graphAttributeRemoved(String graphId, long timeId,
			String attribute) {
		for (RMIAdapterIn in : inputs.values()) {
			try {
				in.graphAttributeRemoved(graphId, timeId, attribute);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void nodeAttributeAdded(String graphId, long timeId, String nodeId,
			String attribute, Object value) {
		for (RMIAdapterIn in : inputs.values()) {
			try {
				in.nodeAttributeAdded(graphId, timeId, nodeId, attribute, value);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void nodeAttributeChanged(String graphId, long timeId,
			String nodeId, String attribute, Object oldValue, Object newValue) {
		for (RMIAdapterIn in : inputs.values()) {
			try {
				in.nodeAttributeChanged(graphId, timeId, nodeId, attribute,
						oldValue, newValue);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void nodeAttributeRemoved(String graphId, long timeId,
			String nodeId, String attribute) {
		for (RMIAdapterIn in : inputs.values()) {
			try {
				in.nodeAttributeRemoved(graphId, timeId, nodeId, attribute);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void edgeAdded(String graphId, long timeId, String edgeId,
			String fromNodeId, String toNodeId, boolean directed) {
		for (RMIAdapterIn in : inputs.values()) {
			try {
				in.edgeAdded(graphId, timeId, edgeId, fromNodeId, toNodeId,
						directed);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void edgeRemoved(String graphId, long timeId, String edgeId) {
		for (RMIAdapterIn in : inputs.values()) {
			try {
				in.edgeRemoved(graphId, timeId, edgeId);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void graphCleared(String graphId, long timeId) {
		for (RMIAdapterIn in : inputs.values()) {
			try {
				in.graphCleared(graphId, timeId);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void nodeAdded(String graphId, long timeId, String nodeId) {
		for (RMIAdapterIn in : inputs.values()) {
			try {
				in.nodeAdded(graphId, timeId, nodeId);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void nodeRemoved(String graphId, long timeId, String nodeId) {
		for (RMIAdapterIn in : inputs.values()) {
			try {
				in.nodeRemoved(graphId, timeId, nodeId);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void stepBegins(String graphId, long timeId, double step) {
		for (RMIAdapterIn in : inputs.values()) {
			try {
				in.stepBegins(graphId, timeId, step);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	@Override
	public EClass eClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Resource eResource() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EObject eContainer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EStructuralFeature eContainingFeature() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EReference eContainmentFeature() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EList<EObject> eContents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TreeIterator<EObject> eAllContents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eIsProxy() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public EList<EObject> eCrossReferences() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object eGet(EStructuralFeature feature) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object eGet(EStructuralFeature feature, boolean resolve) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eSet(EStructuralFeature feature, Object newValue) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean eIsSet(EStructuralFeature feature) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void eUnset(EStructuralFeature feature) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object eInvoke(EOperation operation, EList<?> arguments) throws InvocationTargetException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EList<Adapter> eAdapters() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eDeliver() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void eSetDeliver(boolean deliver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eNotify(Notification notification) {
		// TODO Auto-generated method stub
		
	}
}