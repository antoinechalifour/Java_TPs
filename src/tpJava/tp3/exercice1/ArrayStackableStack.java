package tpJava.tp3.exercice1;

/**
 * Implémentation d'un stack stackable en utilisant un array.
 * @author Antoine & Mathieu
 *
 */
public class ArrayStackableStack extends ArrayStack implements StackableStack{

	@Override
	public void pushAll(Stack st) throws Exception {
		while(!st.isEmpty()){
			this.push(st.pop());
		}
	}

}
