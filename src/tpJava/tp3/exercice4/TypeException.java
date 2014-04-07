package tpJava.tp3.exercice4;

/**
 * Exception permettant de gérer le type des arguments.
 * @author Antoine & Mathieu
 *
 */
public class TypeException extends Exception{

	@Override
	public String getMessage() {
		return "L'argument doit etre un nombre";
	}

}
