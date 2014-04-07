package tpJava.tp3.exercice3;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Implémentation de l'iterator défini en classe externe.
 * @author Antoine & Mathieu
 *
 */
public class TableIterator implements Iterator<Object>{
	private Table tab;
	private int cur;
	
	public TableIterator(Table tab) {
		super();
		this.tab = tab;
		cur=0;
	}

	@Override
	public boolean hasNext() {
		return (cur<tab.size());
	}

	@Override
	public Object next() {
		Object o;
		try {
			o = tab.getElementAt(cur);
			cur++;
			return o;
		} catch (Exception e) {
			return new NoSuchElementException();
		}
		
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException("Operation non supportee");
	}

}
