package tpJava.tp1.exercice5;

import java.lang.Math;

public class Vehicule {
	/*
	 * Variables d'instances
	 */
	private String marque;
	private String modele;
	private Immatriculation immat;
	private int region;
	
	/*
	 * Constructeur(s)
	 */
	/**
	 * Constructeur de la classe Vehicule.
	 * @param marque la marque du Vehicule.
	 * @param modele le mod�le du Vehicule.
	 * @param region la r�gion d'immatriculation.
	 * @throws Exception Si la g�n�ration de l'immatriculation ne s'est pas bien pass�e.
	 */
	public Vehicule(String marque, String modele, int region) throws Exception {
		super();
		this.marque = marque;
		this.modele = modele;
		this.region = region;
		this.immat = new Immatriculation(region);
	}

	/*
	 * Getters / Setters
	 */
	/**
	 * Retourne la marque.
	 * @return la marque du vehicule.
	 */
	public String getMarque() {
		return marque;
	}

	/**
	 * Changer la marque du vehicule.
	 * @param marque la nouvelle marque.
	 */
	public void setMarque(String marque) {
		this.marque = marque;
	}

	/**
	 * Retourne le mod�le.
	 * @return le mod�le du v�hicule.
	 */
	public String getModele() {
		return modele;
	}

	/**
	 * Changer le mod�le du v�hicule.
	 * @param modele le nouveau mod�le.
	 */
	public void setModele(String modele) {
		this.modele = modele;
	}

	/**
	 * Retourne l'immatriculation g�n�r�e automatiquement.
	 * @return l'immatriculation du v�hicule.
	 */
	public Immatriculation getImmat() {
		return immat;
	}

	/**
	 * Retourne la r�gion du v�hicule.
	 * @return la r�gion du v�hicule.
	 */
	public int getRegion(){
		return region;
	}
	
	/*
	 * M�thodes propres � la classe Vehicule
	 */
	/**
	 * Retourne les informations du v�hicule.
	 * @return les informations du v�hicule
	 * @see toString();
	 */
	public String id(){
		return marque + " " + modele + " immatricul�e " + immat;
	}
	
	/*
	 * M�thodes h�rit�es red�finies;
	 */
	/**
	 * Retourne les informations du v�hicule
	 * @return les informations du v�hicule dans une chaine de caract�res.
	 */
	@Override
	public String toString() {
		return id();
	}

	/*
	 * M�thodes de tests
	 */
	
	public static void main(String args[]){
		Vehicule.TesterVehicules();		
	}
	
	/**
	 * G�n�re 1000 v�hicules dans des r�gions al�atoires.
	 */
	public static void TesterVehicules(){
		Vehicule tmp;
		try {
			for(int i=0 ; i<1000 ; i++){
				int debug=(int) (Math.random() * 3 + 1);
				tmp = new Vehicule("Fiat", "Panda", debug);
				System.out.println(tmp);
			}
			System.out.println("Immatriculations totales : " + Immatriculation.getNbImmat());
			System.out.println("Immatriculation region 1 : " + Immatriculation.getNbImmatParRegion(1));
			System.out.println("Immatriculation region 2 : " + Immatriculation.getNbImmatParRegion(2));
			System.out.println("Immatriculation region 3 : " + Immatriculation.getNbImmatParRegion(3));
		} catch (Exception e) {
			e.getMessage();
		}
	}

	
	
}
