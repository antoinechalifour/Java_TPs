package tpJava.tp2.exercice1;

public class FactoryPizzaStrasbourg extends FactoryPizza {
	@Override
	public Pizza getInstanceMargherita() {
		Pizza p1 = new Pizza(EnumPates.PateFine, EnumSauces.SauceTomates);
		p1.addIngredient(EnumIngredients.Mozzarella);
		p1.addIngredient(EnumIngredients.Champignon);
		
		return p1;
	}

	@Override
	public Pizza getInstanceVegetarienne() {
		Pizza p3 = new Pizza(EnumPates.PateFine, EnumSauces.SauceTomates);
		p3.addIngredient(EnumIngredients.Mozzarella);
		p3.addIngredient(EnumIngredients.Olive);
		p3.addIngredient(EnumIngredients.Oignons);
		p3.addIngredient(EnumIngredients.Tomates);
		
		return p3;
	}

	@Override
	public Pizza getInstancePepperoni() {
		Pizza p2 = new Pizza(EnumPates.PateEpaisse, EnumSauces.SauceBarbecue);
		p2.addIngredient(EnumIngredients.PoivronsVerts);
		p2.addIngredient(EnumIngredients.PoivronsVerts);
		p2.addIngredient(EnumIngredients.Oignons);
	
		return p2;
	}
}
