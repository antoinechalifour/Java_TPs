package tpJava.tp2.exercice1;

import java.util.ArrayList;
import java.util.List;


public class Pizza {
	private EnumPates pat;
	private EnumSauces sau;
	private List<EnumIngredients> listeIngredients;
	
	public Pizza(EnumPates pat, EnumSauces sau) {
		super();
		this.pat = pat;
		this.sau = sau;
		this.listeIngredients = new ArrayList<EnumIngredients>();
	}

	public EnumPates getPat() {
		return pat;
	}

	public void setPat(EnumPates pat) {
		this.pat = pat;
	}

	public EnumSauces getSau() {
		return sau;
	}

	public void setSau(EnumSauces sau) {
		this.sau = sau;
	}

	public void addIngredient(EnumIngredients ing){
		listeIngredients.add(ing);
	}
	
	public static void main(String args[]){
		/* EXERCICE 1.1 */
		/*
		Pizza p1 = new Pizza(EnumPates.PateFine, EnumSauces.SauceTomates);
		p1.addIngredient(EnumIngredients.Mozzarella);
		p1.addIngredient(EnumIngredients.Mozzarella);
		
		Pizza p2 = new Pizza(EnumPates.PateFine, EnumSauces.SauceTomates);
		p2.addIngredient(EnumIngredients.Mozzarella);
		
		Pizza p3 = new Pizza(EnumPates.PateFine, EnumSauces.SauceTomates);
		p3.addIngredient(EnumIngredients.Mozzarella);
		p3.addIngredient(EnumIngredients.Champignon);
		p3.addIngredient(EnumIngredients.Oignons);
		p3.addIngredient(EnumIngredients.PoivronsVerts);
		p3.addIngredient(EnumIngredients.Tomates);*/
		
		/* EXERCICE 1.2 */
		/*FactoryPizza restaurant = new FactoryPizzaNantes();
		Pizza p4 = restaurant.getInstanceMargherita();*/
		
		/* EXERCICE 1.3 */
		BuilderMarseille restaurantMarseillais = new BuilderMarseille();
		BuilderStrasbourg restaurantStrasgourgois = new BuilderStrasbourg();
		BuilderNantes restaurantNantais = new BuilderNantes();
		Pizza pnantes = restaurantNantais.preparerPizza(TypePizza.Margherita);
		Pizza pmarseille = restaurantMarseillais.preparerPizza(TypePizza.Vegetarienne);
		Pizza pstrasbourg = restaurantStrasgourgois.preparerPizza(TypePizza.Pepperoni);
	}
}
