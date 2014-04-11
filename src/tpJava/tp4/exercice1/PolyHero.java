package tpJava.tp4.exercice1;

public class PolyHero extends Hero{
	private String nom;

	public PolyHero(String nom) {
		this.nom = nom;
	}

	@Override
	public String description() {
		return nom;
	}
	
	
	public static void main(String args[]){
		Hero h = new PolyHero("Captain polytech");
		PolyHeroDeco casque = new DecoCasque(h);
		PolyHeroDeco cape = new DecoCape(casque);
		
		System.out.println(cape.description());
	}
}
