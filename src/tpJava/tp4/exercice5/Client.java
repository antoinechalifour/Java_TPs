package tpJava.tp4.exercice5;

import java.util.ArrayList;
import java.util.List;

public class Client {
	private String nom;
	private String prenom;
	private List<Compte> comptes;
	
	public Client(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
		comptes = new ArrayList<Compte>();
	}

	/* ACCES / MODIFICATIONS DES INFOS */
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
	
	/* CREATION / SUPPRESSION DE COMPTES */
	public void addCompte(){
		Compte tmp = new Compte();
		comptes.add(tmp);
	}
	
	public void removeCompte(int no){
		comptes.remove(no);
	}
	
	/* ACCES A UN / PLUSIEURS COMPTES */
	public void listerComptes() throws Exception{
		if(comptes.isEmpty()) throw new Exception("Aucun compte n'a été ajouté.");
		
		int i=0;
		for(Compte c : comptes){
			System.out.println(i + ". " + c.getCode() + " : " + c.getMontant());
			i++;
		}
	}
	
	public Compte getCompte(int no){
		return comptes.get(no);
	}
	
	public int getNbComptes(){
		return comptes.size();
	}
	
	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + "]";
	}

}
