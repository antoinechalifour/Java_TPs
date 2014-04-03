package tpJava.tp2.exercice1;

public abstract class IngredientNew extends PizzaNew {
	protected PizzaNew piz;

	public IngredientNew(PizzaNew piz) {
		super();
		this.piz = piz;
	}

	@Override
	public String getDescription() {
		return this.toString() + " " +  piz.getDescription();
	}
	
}
