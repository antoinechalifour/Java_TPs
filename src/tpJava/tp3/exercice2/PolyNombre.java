package tpJava.tp3.exercice2;

/**
 * Classe abstraite permettant la gestion de diff�rents types.
 * Solution utilis�e : similaire � Number -> chaque classe fournit une m�thode de cast.
 * @author Antoine & Mathieu
 *
 */
public abstract class PolyNombre {
	public abstract int getPolyIntegerValue();
	public abstract float getPolyFloatValue();
	public abstract double getPolyDoubleValue();
	public abstract void setValeur(PolyNombre pn);
	public abstract String toString();
}