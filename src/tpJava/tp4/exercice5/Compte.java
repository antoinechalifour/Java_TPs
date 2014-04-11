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
	
	public CodeCompte getCode() {
		return code;
	}

	public void setCode(CodeCompte code) {
		this.code = code;
	}

	public int getCle() {
		return cle;
	}

	public void setCle(int cle) {
		this.cle = cle;
	}

	public float getMontant() {
		return montant;
	}

	public void setMontant(float montant) {
		this.montant = montant;
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

	@Override
	public String toString() {
		return "Compte [code=" + code + ", montant=" + montant + "]";
	}
}
