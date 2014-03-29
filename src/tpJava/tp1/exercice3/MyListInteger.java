package tpJava.tp1.exercice3;

import java.util.AbstractList;
import java.util.ArrayList;

public class MyListInteger extends AbstractList<Integer>{

	private int[] tab;
	private int tailleMax;
	private int sommet=-1;
	
	public MyListInteger(int taille){
		this.tailleMax= taille;
		this.tab= new int[taille];
	}
	
	@Override
	public Integer get(int index){
		if(index > tailleMax-1 || index < 0) throw new IndexOutOfBoundsException("Get | Index out of bound.");
		return tab[index];
	}

	@Override
	public int size() {
		return sommet+1;
	}
	
	@Override
	public Integer set(int index, Integer i){
		if(index > sommet-1 || index < 0) throw new IndexOutOfBoundsException("Set | Index out of bound");
		Integer ret = tab[index];
		tab[index] = i;
		
		return ret;
	}
	
	@Override
	public boolean add(Integer i){
		if(sommet+1==tailleMax) throw new IndexOutOfBoundsException("Add | Index out of bound");
		sommet++;
		tab[sommet] = i;
		
		return true;
	}
	
	@Override
	public Integer remove(int index){
		if(index > sommet-1 || index < 0) throw new IndexOutOfBoundsException("Remove | Index out of bound");
		Integer ret = tab[index];
		
		for(int i=index ; i<sommet ; i++){
			tab[i] = tab[i+1];
		}
		
		return ret;
	}
	
	public static void main(String args[]){
		/*
		 * Pas besoin de lire la doc -> mêmes opérations que abstractlist
		 * On change une seule ligne
		 */
		AbstractList<Integer> listInteger = new MyListInteger(11);
		try{
			for(int i=0 ; i<10 ; i++){
				listInteger.add(i);
			}
			
			for(int i=0 ; i<10 ; i++){
				System.out.println("i= " + listInteger.get(i));
			}
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
