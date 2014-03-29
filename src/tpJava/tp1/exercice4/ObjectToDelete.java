package tpJava.tp1.exercice4;

/**
 * Classe testant le GarbageCollector.
 * @author Antoine & Mathieu
 *
 */
public class ObjectToDelete {
	/**
	 * Compteur d'objects cr��s.
	 */
	static int compteur=0;
	int numero;
	
	/**
	 * Constructeur par d�faut.
	 */
	public ObjectToDelete(){
		compteur++;
		numero = compteur+1;
		System.out.println("Construction de l'objet : " + numero);
	}

	/**
	 * M�thode appel�e avant destruction de l'objet par le garbage collector.
	 */
	@Override
	protected void finalize() throws Throwable {
		System.out.println("\tDestruction de l'objet : " + numero);
		super.finalize();
	}
	
	public static void main(String args[]){
		for(int i =0 ; i< 10  ; i++){
			new ObjectToDelete();
			System.gc();
		}
	}
}
