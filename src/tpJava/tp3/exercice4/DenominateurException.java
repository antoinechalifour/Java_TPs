package tpJava.tp3.exercice4;

/**
 * Exception utilisée en cas de dénominateur nul
 * @author Antoine & Mathieu
 *
 */
public class DenominateurException extends Exception{

	@Override
	public String getMessage() {
		return "le dénominateur est nul";
	}

}
