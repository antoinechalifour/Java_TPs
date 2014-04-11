package tpJava.tp4.exercice1;

public class DecoShort extends PolyHeroDeco{
	
	public DecoShort(Hero myhero) {
		super(myhero);
	}

	@Override
	public String description() {
		return myHero.description() + " Short";
	}

}
