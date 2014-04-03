package tpJava.tp2.exercice1;

public class BuilderStrasbourg extends Builder{

	public BuilderStrasbourg() {
		super(new FactoryPizzaStrasbourg());
	}
	
	@Override
	protected void preparationPate() {
		System.out.println("Preparation de la pate a la strasbourgeoise...");
		
	}

	@Override
	protected void ajoutSauce() {
		System.out.println("Ajout de la sauce a la strasbourgeoise...");
	}

	@Override
	protected void ajoutIngredient() {
		System.out.println("Ajouts des ingredients a la strasbourgeoise...");
	}

	@Override
	protected void cuisson() {
		System.out.println("Cuisson a la strasbourgeoise...");
	}
}
