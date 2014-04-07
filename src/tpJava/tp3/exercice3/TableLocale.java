package tpJava.tp3.exercice3;

import java.util.Iterator;

/**
 * Implementation de la classe table en utilisant un iterator interne local à la méthode iterator().
 * @author Antoine & Mathieu
 *
 */
public class TableLocale implements Iterable<Object>{
	private Object tab[];
	private int s;
	private int sizeMax;
	
	public TableLocale(int sizeMax) {
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
		class TableIteratorInterne implements Iterator<Object>{
			int cur;
			
			public TableIteratorInterne() {
				super();
				cur=0;
			}

			@Override
			public boolean hasNext() {
				return (cur<s);
			}

			@Override
			public Object next() {
				Object o;
				o = tab[cur];
				cur++;
				return o;

			}

			@Override
			public void remove() {
				throw new UnsupportedOperationException("Operation non supportee");
			}
			
		}
		return new TableIteratorInterne();
	}
	
	public static void main(String args[]){
		TableLocale t = new TableLocale(10);
		//Iterator<Object> it = t.iterator();
		
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
			}
			*/
			
			for(Object o : t){
				System.out.println(o);
			}
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
