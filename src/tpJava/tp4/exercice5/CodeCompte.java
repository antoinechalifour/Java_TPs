package tpJava.tp4.exercice5;

public class CodeCompte {
	private static int nbcomptes=0;
	
	
	private int numero;

	public CodeCompte() {
		numero= nbcomptes;
		nbcomptes++;
	}
	
	public int getCount(){
		return nbcomptes;
	}

	public int getNumero() {
		return numero;
	}

	@Override
	public String toString() {
		return "CodeCompte [numero=" + numero + "]";
	}
}
