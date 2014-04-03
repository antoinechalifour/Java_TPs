package tpJava.tp2.exercice1;

public class PateNew extends PizzaNew {
	
	@Override
	public String getDescription() {
		return "Pate";
	}
	
	public static void main(String agrs[]){
		PizzaNew p = new MozzarellaNew(new SauceTomateNew(new PateNew()));
		System.out.println(p.getDescription());
	}
}
