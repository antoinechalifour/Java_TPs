package tpJava.tp1.exercice3;

import java.util.AbstractList;

/**
 * Classe permettant la gestion d'une liste d'entiers. Implémente AbstractList<Integer>.
 * @author Antoine & Mathieu
 *
 */
public class MyListInteger extends AbstractList<Integer>{

	private int[] tab;
	private int tailleMax;
	private int sommet=-1;
	
	/**
	 * Le constructeur à un paramètre.
	 * @param taille la taille de la liste.
	 */
	public MyListInteger(int taille){
		this.tailleMax= taille;
		this.tab= new int[taille];
	}
	
	/**
	 * Retourne l'élément positionné à l'index index;
	 * @param index 
	 * @return l'élement positionné à index.
	 */
	@Override
	public Integer get(int index){
		if(index > tailleMax-1 || index < 0) throw new IndexOutOfBoundsException("Get |Â Index out of bound.");
		return tab[index];
	}

	/**
	 * Retourne la taille courrante de la liste.
	 * @return
	 */
	@Override
	public int size() {
		return sommet+1;
	}
	
	/**
	 * Change l'élément à la position i. Retourne l'ancien élément.
	 * @param index
	 * @param i
	 * @return l'ancien élément.
	 */
	@Override
	public Integer set(int index, Integer i){
		if(index > sommet-1 || index < 0) throw new IndexOutOfBoundsException("Set |Â Index out of bound");
		Integer ret = tab[index];
		tab[index] = i;
		
		return ret;
	}
	
	/**
	 * Ajoute un élément à la liste.
	 * @param i l'élément à ajouter.
	 * @return true.
	 */
	@Override
	public boolean add(Integer i){
		if(sommet+1==tailleMax) throw new IndexOutOfBoundsException("Add |Â Index out of bound");
		sommet++;
		tab[sommet] = i;
		
		return true;
	}
	
	/**
	 * Supprime et revoie l'élément à la position index.
	 * @param index
	 * @return l'élément supprimé.
	 */
	@Override
	public Integer remove(int index){
		if(index > sommet-1 || index < 0) throw new IndexOutOfBoundsException("Remove |Â Index out of bound");
		Integer ret = tab[index];
		
		for(int i=index ; i<sommet ; i++){
			tab[i] = tab[i+1];
		}
		
		return ret;
	}
	
	public static void main(String args[]){
		/*
		 * Pas besoin de lire la doc -> mÃªmes opÃ©rations que abstractlist
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
