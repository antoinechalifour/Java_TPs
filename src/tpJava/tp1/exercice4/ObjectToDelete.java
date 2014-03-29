package tpJava.tp1.exercice4;

public class ObjectToDelete {
	static int compteur=0;
	int numero;
	
	public ObjectToDelete(){
		compteur++;
		numero = compteur+1;
		System.out.println("Construction de l'objet : " + numero);
	}

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
