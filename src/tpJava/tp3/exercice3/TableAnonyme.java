package tpJava.tp3.exercice3;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class TableAnonyme implements Iterable<Object>{
	private Object tab[];
	private int s;
	private int sizeMax;
	
	public TableAnonyme(int sizeMax) {
		super();
		s=0;
		this.sizeMax = sizeMax;
		tab = new Object[sizeMax];
	}
	
	public void add(Object o) throws Exception{
		if(s+1== sizeMax) throw new Exception("La table est pleine");
		tab[s] = o;
		s++;
	}
	
	public int size(){ return s; }

	public int getSizeMax() {
		return sizeMax;
	}

	public Object getElementAt(int i) throws Exception{
		if(i>=s || i<0) throw new Exception("Element non existant");
		return tab[i];
	}
	
	public Iterator<Object> iterator(){
		return new Iterator<Object>(){
			int cur=0;
			
			@Override
			public boolean hasNext() {
				return (cur<s);
			}

			@Override
			public Object next() {
				Object o;
				try {
					o = tab[cur];
					cur++;
					return o;
				} catch (Exception e) {
					return new NoSuchElementException();
				}
			}

			@Override
			public void remove() {throw new UnsupportedOperationException("Operation non supportee");
			}
		};
	}
	
	public static void main(String args[]){
		TableAnonyme t = new TableAnonyme(10);
		//Iterator it = t.iterator();
		
		try{
			t.add("a");
			t.add("b");
			t.add("c");
			t.add("d");
			t.add("e");
			t.add("f");
			t.add("g");
			
			/*while(it.hasNext()){
				System.out.println(it.next());
			}*/
			for(Object o : t){
				System.out.println(o);
			}
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
