package tpJava.tp4.exercice1;

public class DecoBotte extends PolyHeroDeco{
	
	public DecoBotte(Hero myhero) {
		super(myhero);
	}

	@Override
	public String description() {
		return myHero.description() + " Botte";
	}

}
