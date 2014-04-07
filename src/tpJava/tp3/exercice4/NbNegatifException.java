package tpJava.tp3.exercice4;

/**
 * Exception permettant de gérer les nombres négatifs.
 * @author Antoine & Mathieu
 *
 */
public class NbNegatifException extends Exception{

	@Override
	public String getMessage() {
		return "Les nombres ne doivent pas etre négatifs";
	}

}
