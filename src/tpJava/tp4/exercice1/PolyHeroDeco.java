package tpJava.tp4.exercice1;

public abstract class PolyHeroDeco extends Hero{
	protected Hero myHero;

	public PolyHeroDeco(Hero myhero) {
		super();
		this.myHero = myhero;
	}
}
