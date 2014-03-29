package tpJava.tp1.exercice5;
/**
 * Classe représentant des immatriculations.
 * @author Antoine & Mathieu
 *
 */
public class Immatriculation {
	/*
	 *  Variables de classe
	 *  - le compteur qui permet de générer les numéros
	 */
	/**
	 * Compteur de la region 1.
	 */
	private static double COMPTEURR1=0;
	
	/**
	 * Compteur de la region 2.
	 */
	private static double COMPTEURR2=0;
	
	/**
	 * Compteur de la region 3.
	 */
	private static double COMPTEURR3=0;
	
	/*
	 * Variables d'instances
	 */
	private int prefixeNumerique;
	private char partieAlphanumerique;
	private int postfixeNumerique;
	
	/*
	 * Constructeur(s)
	 */
	/**
	 * Constructeur de la classe Immatriculation. Génère automatiquement et indépendamment pour chaque région.
	 * @param region la region (comprises entre 1 et 3 inclus)
	 * @throws Exception dans le cas où la région n'est pas prise en charge, où si le nombre max d'immatriculations est atteint.
	 */
	public Immatriculation(int region) throws Exception{
		postfixeNumerique= region;
		double compteurTmp;
		switch(region){
		case 1 : compteurTmp= COMPTEURR1;
			COMPTEURR1++;
			break;
			
		case 2: compteurTmp= COMPTEURR2;
			COMPTEURR2++;
			break;
			
		case 3: compteurTmp= COMPTEURR3;
			COMPTEURR3++;
			break;
		
		default: throw new Exception("Region non prise en charge");
		}
		if(compteurTmp+1> 99*26) throw new Exception("Nombre maximal d'immatriculation atteint.");
		prefixeNumerique= (int)compteurTmp%99+1;
		partieAlphanumerique= (char) ('a' + compteurTmp/99);

	}
	
	/*
	 * Méthodes propres à la classe Immatriculation
	 */
	/**
	 * Retourne l'immatriculation.
	 * @return immatriculation sous la forme prefixe-lettre-postfixe
	 */
	public String getImmat(){
		return "" +prefixeNumerique+partieAlphanumerique+postfixeNumerique;
	}
	
	/**
	 * Retourne le nombre total d'immatriculation
	 * @return COMPTEUR le nombre d'immatriculations totales
	 */
	public static double getNbImmat(){
		return COMPTEURR1 + COMPTEURR2 + COMPTEURR3;
	}
	
	/**
	 * Retourne le nombre d'immatriculations par region.
	 * @param i le numéro de la région
	 * @return COMPTEURI le nombre d'immatriculations par region.
	 * @throws Exception Si la region n'est pas prise en charge.
	 */
	public static double getNbImmatParRegion(int i) throws Exception{
		switch(i){
		case 1: return COMPTEURR1;
		case 2 : return COMPTEURR2;
		case 3 : return COMPTEURR3;
		default: throw new Exception("Region non prise en charge");
		}
	}

	/*
	 * Methodes héritées redéfinies
	 * @see java.lang.Object#toString()
	 */
	/**
	 * Retourne les informations sur l'immatriculation.
	 */
	@Override
	public String toString() {
		return getImmat();
	}
	
	/*
	 * Méthodes de test
	 */
	/**
	 * Génère 26*99+1 immatriculations pour tester la classe.
	 */
	public static void testerImmat(){
		for(int i=0 ; i<99*26+1 ; i++){
			Immatriculation tmp;
			try {
				tmp = new Immatriculation((int) (Math.random() * 3 + 1));
				System.out.println("Immatriculation : " + tmp.getImmat());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	public static void main(String args[]){
		Immatriculation.testerImmat();
	}
}
