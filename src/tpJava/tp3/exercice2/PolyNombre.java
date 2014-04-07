package tpJava.tp3.exercice2;

/**
 * Classe abstraite permettant la gestion de différents types.
 * Solution utilisée : similaire à Number -> chaque classe fournit une méthode de cast.
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