package tpJava.tp4.exercice3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class Personne implements Iterable<Personne>, Cloneable, Serializable{

	private static final long serialVersionUID = 1L;
	private String nom;
	private String prenom;
	private List<Personne> enfants;
	private Genre genre;
	private int noSecu;
	
	public Personne(String nom, String prenom, Genre genre, int noSecu) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.genre = genre;
		this.noSecu = noSecu;
		enfants = new ArrayList<Personne>();
	}
	
	public void addEnfant(Personne p){
		enfants.add(p);
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getNoSecu() {
		return noSecu;
	}

	public void setNoSecu(int noSecu) {
		this.noSecu = noSecu;
	}

	@Override
	public Iterator<Personne> iterator() {
		return new Iterator<Personne>(){
			int cur=0;
			@Override
			public boolean hasNext() {
				try{
					enfants.get(cur+1);
					return true;
				}
				catch(IndexOutOfBoundsException e){
					return false;
				}
			}

			@Override
			public Personne next() {
				cur++;
				return enfants.get(cur);
			}

			@Override
			public void remove() {
				throw new NoSuchElementException("Operation non supportee");
			}
			
		};
	}
	
	@Override
	public String toString() {
		String tmp="Personne [nom=" + nom + ", prenom=" + prenom + ", genre="
				+ genre + ", noSecu=" + noSecu + "]";
		
		for(Personne p : enfants){
			tmp=tmp + "\n\t-" + p.toString();
		}
		return tmp;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + noSecu;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Personne))
			return false;
		Personne other = (Personne) obj;
		if (noSecu != other.noSecu)
			return false;
		return true;
	}

	@Override
	protected Personne clone() throws CloneNotSupportedException {
		Personne p = new Personne(this.nom, this.prenom, this.genre, this.noSecu);
		for(Personne e : enfants){
			p.addEnfant(e.clone());
		}
		
		return p;
	}
}
