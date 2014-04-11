package tpJava.tp4.exercice5;

public class Compte {
	private CodeCompte code;
	private int cle;
	private float montant;
	
	public Compte() {
		super();
		code = new CodeCompte();
		cle = 0;
		this.montant = 0;
	}
	
	public void crediter(float m){
		montant+=m;
	}
	
	public void debiter(float m){
		montant-=m;
	}
	
	public void virement(float m, Compte c){
		montant-=m;
		c.montant +=m;
	}
}
