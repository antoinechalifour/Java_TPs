package tpJava.tp4.exercice1;

public class DecoCape extends PolyHeroDeco{
	
	public DecoCape(Hero myhero) {
		super(myhero);
	}

	@Override
	public String description() {
		return myHero.description() + " Cape";
	}

}
