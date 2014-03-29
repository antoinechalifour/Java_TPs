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
	 * @param modele le modèle du Vehicule.
	 * @param region la région d'immatriculation.
	 * @throws Exception Si la génération de l'immatriculation ne s'est pas bien passée.
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
	 * Retourne le modèle.
	 * @return le modèle du véhicule.
	 */
	public String getModele() {
		return modele;
	}

	/**
	 * Changer le modèle du véhicule.
	 * @param modele le nouveau modèle.
	 */
	public void setModele(String modele) {
		this.modele = modele;
	}

	/**
	 * Retourne l'immatriculation générée automatiquement.
	 * @return l'immatriculation du véhicule.
	 */
	public Immatriculation getImmat() {
		return immat;
	}

	/**
	 * Retourne la région du véhicule.
	 * @return la région du véhicule.
	 */
	public int getRegion(){
		return region;
	}
	
	/*
	 * Méthodes propres à la classe Vehicule
	 */
	/**
	 * Retourne les informations du véhicule.
	 * @return les informations du véhicule
	 * @see toString();
	 */
	public String id(){
		return marque + " " + modele + " immatriculée " + immat;
	}
	
	/*
	 * Méthodes héritées redéfinies;
	 */
	/**
	 * Retourne les informations du véhicule
	 * @return les informations du véhicule dans une chaine de caractères.
	 */
	@Override
	public String toString() {
		return id();
	}

	/*
	 * Méthodes de tests
	 */
	
	public static void main(String args[]){
		Vehicule.TesterVehicules();		
	}
	
	/**
	 * Génère 1000 véhicules dans des régions aléatoires.
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
