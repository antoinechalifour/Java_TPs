package tpJava.tp3.exercice2;

public class PolyFloat extends PolyNombre{
	private float f;
	
	public PolyFloat(float f) {
		super();
		this.f = f;
	}
	
	public PolyFloat(Integer f) {
		super();
		this.f = (float) f;
	}

	@Override
	public int getPolyIntegerValue() {
		return (int) f;
	}

	@Override
	public float getPolyFloatValue() {
		return f;
	}

	@Override
	public double getPolyDoubleValue() {
		return (double) f;
	}

	
	@Override
	public void setValeur(PolyNombre pn) {
		f = pn.getPolyFloatValue();
	}

	@Override
	public String toString() {
		String tmp="" + f;
		
		return tmp;
	}
}
