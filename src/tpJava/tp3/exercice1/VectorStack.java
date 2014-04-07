package tpJava.tp3.exercice1;

import java.util.Vector;

/**
 * Implémentation de l'interface Stack en utilisant un vector.
 * @author Antoine
 *
 */
public class VectorStack implements Stack{
	private Vector<Object> tab;
	
	public VectorStack() {
		super();
		tab = new Vector<Object>();
	}

	@Override
	public void push(Object o) throws Exception {
		tab.add(o);
	}

	@Override
	public Object pop() throws Exception {
		int t = tab.size();
		return tab.remove(t-1);
	}

	@Override
	public Object top() throws Exception {
		int t = tab.size();
		return tab.elementAt(t-1);
	}

	@Override
	public boolean isEmpty() {
		return (tab.size()==0);
	}

	@Override
	public String toString() {String tmp="";
		for(Object o : tab){
			tmp = tmp + " " + o;
		}
		return tmp;
	}

	
}
