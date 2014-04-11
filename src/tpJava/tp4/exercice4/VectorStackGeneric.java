package tpJava.tp4.exercice4;

import java.util.Vector;

public class VectorStackGeneric<T>{
	private Vector<T> tab;
	
	public VectorStackGeneric() {
		super();
		tab = new Vector<T>();
	}

	public void push(T o) throws Exception {
		tab.add(o);
	}


	public T pop() throws Exception {
		int t = tab.size();
		return tab.remove(t-1);
	}


	public T top() throws Exception {
		int t = tab.size();
		return tab.elementAt(t-1);
	}


	public boolean isEmpty() {
		return (tab.size()==0);
	}


	public String toString() {String tmp="";
		for(T o : tab){
			tmp = tmp + " " + o;
		}
		return tmp;
	}

	public static void main(String args[]){
		VectorStackGeneric<Integer> vi = new VectorStackGeneric<Integer>();
		VectorStackGeneric<String> vs = new VectorStackGeneric<String>();
		try {
			vi.push(1);
			vi.push(2);

			vs.push("titi");
			vs.push("toto");

			System.out.println(vi);
			System.out.println(vs);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
