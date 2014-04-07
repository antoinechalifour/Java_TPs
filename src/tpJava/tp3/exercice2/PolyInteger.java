package tpJava.tp3.exercice2;

public class PolyInteger extends PolyNombre{
	private int i;
	
	public PolyInteger(int i) {
		super();
		this.i = i;
	}

	@Override
	public int getPolyIntegerValue() {
		return i;
	}

	@Override
	public float getPolyFloatValue() {
		return (float) i;
	}
	
	@Override
	public double getPolyDoubleValue() {
		return (double) i;
	}

	@Override
	public void setValeur(PolyNombre pn) {
		i = pn.getPolyIntegerValue();
	}

	@Override
	public String toString() {
		String tmp="" + i;
		
		return tmp;
	}
}
