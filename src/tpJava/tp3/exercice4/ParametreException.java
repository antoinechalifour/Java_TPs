package tpJava.tp3.exercice4;

/**
 * Exception permettant de g�rer les param�tres du programme.
 * @author Antoine & Mathieu
 *
 */
public class ParametreException extends Exception {

	@Override
	public String getMessage() {
		return "Mauvais nombre d'arguments";
	}

}
