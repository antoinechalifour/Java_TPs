package tpJava.tp4.exercice1;

public class DecoCeinture extends PolyHeroDeco{

	public DecoCeinture(Hero myhero) {
		super(myhero);
	}

	@Override
	public String description() {
		return myHero.description() + " Ceinture";
	}
	
	/*
	 * Ajout d'une classe -> aucune autre classe modifiée.
	 */
}
