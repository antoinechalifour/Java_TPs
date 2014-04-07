package tpJava.tp3.exercice1;

/**
 * Implémentation de l'interface Stack en utilisant un tableau
 * @author Antoine
 *
 */
public class ArrayStack implements Stack{
	protected Object tab[];
	private int sommet;
	private int size;
	
	
	
	public ArrayStack() {
		sommet=-1;
		size=10;
		tab = new Object[size];
	}

	@Override
	public void push(Object o) throws Exception {
		if(sommet+1==size) throw new Exception("La pile est pleine");
		sommet++;
		tab[sommet]= o;
	}

	@Override
	public Object pop() throws Exception {
		if(isEmpty()) throw new Exception("La pile est vide");
		sommet--;
		return tab[sommet+1];
	}

	@Override
	public Object top() throws Exception {
		if(isEmpty()) throw new Exception("La pile est vide");
		return tab[sommet];
	}

	@Override
	public boolean isEmpty() {
		return (sommet==-1);
	}

	@Override
	public String toString() {
		String tmp="";
		for(int i=0 ; i <= sommet ; i++){
			tmp = tmp + " " + tab[i];
		}
		return tmp;
	}

	
}
