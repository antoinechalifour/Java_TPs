package tpJava.tp2.exercice2;

public abstract class FigureSimple {
	protected String description;
	
	public static void main(String args[]){
		FigureComposite c1 = new FigureComposite();
		FigureComposite c2 = new FigureComposite();
		
		FigureSimple cercle = new Cercle();
		FigureSimple ligne = new Ligne();
		FigureSimple point = new Point();
		
		c1.add(c2);
		c1.add(cercle);
		
		c2.add(ligne);
		c2.add(point);
		
		System.out.println(c1);
	}
}
