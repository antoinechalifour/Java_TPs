package tpJava.tp2.exercice1;

public class BuilderNantes extends Builder{

	public BuilderNantes() {
		super(new FactoryPizzaNantes());
	}

	@Override
	protected void preparationPate() {
		System.out.println("Preparation de la pate a la nantaise...");
		
	}

	@Override
	protected void ajoutSauce() {
		System.out.println("Ajout de la sauce a la nantaise...");
	}

	@Override
	protected void ajoutIngredient() {
		System.out.println("Ajouts des ingredients a la nantaise...");
	}

	@Override
	protected void cuisson() {
		System.out.println("Cuisson a la nantaise...");
	}

}
