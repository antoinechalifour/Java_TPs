package tpJava.tp2.exercice2;

import java.util.ArrayList;

public class FigureComposite extends FigureSimple{	
	private ArrayList<FigureSimple> figures;

	public FigureComposite() {
		super();
		figures = new ArrayList<FigureSimple>();
	}
	
	public void add(FigureSimple f){
		figures.add(f);
	}

	@Override
	public String toString() {
		String s = "FigureComposite";
		
		for(FigureSimple f : figures){
			s = s+"(" + f+")";
		}
		return s;
	}
	
	
}
