package tpJava.tp1.exercice5;

public class Immatriculation {
	/*
	 *  Variables de classe
	 *  - le compteur qui permet de générer les numéros
	 */
	static int COMPTEUR=0;
	
	/*
	 * Variables d'instances
	 */
	int prefixeNumerique;
	char partieAlphanumerique;
	int postfixeNumerique;
	
	/*
	 * Constructeur(s)
	 */
	public Immatriculation(){
		COMPTEUR++;
		prefixeNumerique= COMPTEUR%99;
		partieAlphanumerique= 'a' + 1;
		postfixeNumerique= 1;
	}
	
	/*
	 * Méthodes propres à la classe Immatriculation
	 */
	public String getImmat(){
		return toString();
	}
	
	public int getNbImmat(){
		return COMPTEUR;
	}

	/*
	 * Methodes héritées redéfinies
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String tmp;
		tmp= "" +prefixeNumerique+partieAlphanumerique+postfixeNumerique;
		
		return tmp;
	}
	
	/*
	 * Méthodes de test
	 */
	public static void testerImmat(){
		for(int i=0 ; i<1000 ; i++){
			Immatriculation tmp = new Immatriculation();
			System.out.println(tmp.getImmat());
		}
	}
	
	
}
