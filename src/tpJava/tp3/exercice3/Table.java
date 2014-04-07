package tpJava.tp3.exercice3;

import java.util.Iterator;

/**
 * Classe table. Utilisation d'un iterator défini dans une classe externe.
 * Implements Iterable pour utiliser la syntaxe for(type var : liste){}
 * @author Antoine & Mathieu
 *
 */
public class Table implements Iterable<Object>{
	private Object tab[];
	private int s;
	private int sizeMax;
	
	public Table(int sizeMax) {
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
		return new TableIterator(this);
	}
	
	
	public static void main(String args[]){
		Table t = new Table(10);
		Iterator<Object> it = t.iterator();
		
		try{
			t.add("a");
			t.add("b");
			t.add("c");
			t.add("d");
			t.add("e");
			t.add("f");
			t.add("g");
			
			while(it.hasNext()){
				System.out.println(it.next());
			}
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
