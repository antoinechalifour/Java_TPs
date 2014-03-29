package tpJava.tp1.exercice2;

public class ActivityParcours extends ActivityMap {

	public ActivityParcours(){
		//super();
		System.out.println("Constructeur de ActivityParcours");
	}
	
	@Override
	public void chargerVue() {
		System.out.println("Charger vue en mode parcours");		
	}

	@Override
	public void chargerAction() {
		System.out.println("Charger action en mode parcours");
	}

}
