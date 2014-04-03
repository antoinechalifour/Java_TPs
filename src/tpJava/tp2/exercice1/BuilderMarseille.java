package tpJava.tp2.exercice1;

public class BuilderMarseille extends Builder{

	public BuilderMarseille() {
		super(new FactoryPizzaMarseille());
	}
	
	@Override
	protected void preparationPate() {
		System.out.println("Preparation de la pate a la marseillaise...");
		
	}

	@Override
	protected void ajoutSauce() {
		System.out.println("Ajout de la sauce a la marseillaise...");
	}

	@Override
	protected void ajoutIngredient() {
		System.out.println("Ajouts des ingredients a la marseillaise...");
	}

	@Override
	protected void cuisson() {
		System.out.println("Cuisson a la marseillaise...");
	}
}
