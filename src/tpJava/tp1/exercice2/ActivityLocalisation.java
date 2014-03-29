package tpJava.tp1.exercice2;

public class ActivityLocalisation extends ActivityMap{

	public ActivityLocalisation(){
		//super();
		System.out.println("Constructeur de ActivityLocalisation");
	}
	@Override
	public void chargerVue() {
		System.out.println("Charger vue en mode localisation");
	}

	@Override
	public void chargerAction() {
		System.out.println("Charger action en mode localisation");
	}

}
