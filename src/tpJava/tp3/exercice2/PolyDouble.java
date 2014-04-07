package tpJava.tp3.exercice2;

public class PolyDouble extends PolyNombre {
	private double d;
	
	public PolyDouble(double d) {
		super();
		this.d = d;
	}

	@Override
	public int getPolyIntegerValue() {
		return (int) d;
	}

	@Override
	public float getPolyFloatValue() {
		return (float) d;
	}

	@Override
	public void setValeur(PolyNombre pn) {
		d = pn.getPolyDoubleValue();
	}

	@Override
	public String toString() {
		String tmp="" + d;
		
		return tmp;
	}

	@Override
	public double getPolyDoubleValue() {
		return d;
	}

}
