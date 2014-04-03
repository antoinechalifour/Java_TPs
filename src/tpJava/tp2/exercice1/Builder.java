package tpJava.tp2.exercice1;

public abstract class Builder {
	private Pizza p;
	private FactoryPizza restaurant;
	
	public Builder(FactoryPizza restaurant) {
		super();
		this.restaurant = restaurant;
	}

	public Pizza preparerPizza(TypePizza typePizza){
		switch(typePizza){
		case Margherita: p = restaurant.getInstanceMargherita();
			break;
			
		case Vegetarienne: p = restaurant.getInstanceVegetarienne();
			break;
		
		case Pepperoni: p = restaurant.getInstancePepperoni();
			break;
		}
		preparationPate();
		ajoutSauce();
		ajoutIngredient();
		cuisson();
		return p;
	}
	
	protected abstract void preparationPate();
	protected abstract void ajoutSauce();
	protected abstract void ajoutIngredient();
	protected abstract void cuisson();
}
