package tpJava.tp1.exercice2;

public abstract class ActivityMap {
	
	public ActivityMap(){
		System.out.println("Constructeur de ActivityMap");
	}

	public void preparerImages(){
		System.out.println("Preparation des images");
	}
	
	public void recupererLocalisationImages(){
		System.out.println("Recuperer localisation des images");
	}
	
	public abstract void chargerVue();
	public abstract void chargerAction();
	
	public static void main(String args[]){
		/* Programme de test.
		 * La solution parait  plus lisible et maintenable -> en fonction de l'utilisation, seule l'instanciation change :
		 * new ArcivityParcours () / new ActivityLocalisation()
		 */
		ActivityMap act = new ActivityParcours();
		
		act.preparerImages();
		act.chargerVue();
		act.recupererLocalisationImages();
		act.chargerAction();
	}
}
