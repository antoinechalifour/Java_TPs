package tpJava.tp3.exercice4;

/**
 * Exception utilis�e en cas de d�nominateur nul
 * @author Antoine & Mathieu
 *
 */
public class DenominateurException extends Exception{

	@Override
	public String getMessage() {
		return "le d�nominateur est nul";
	}

}
