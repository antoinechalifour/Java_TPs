package tpJava.tp4.exercice1;

public class DecoCasque extends PolyHeroDeco{
	
	public DecoCasque(Hero myhero) {
		super(myhero);
	}

	@Override
	public String description() {
		return myHero.description() + " Casque";
	}

}
