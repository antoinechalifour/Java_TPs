package tpJava.tp3.exercice1;

/**
 * Implementation de l'interface Stack en utilisant un vector. Possibilité de pusher une autre Stack dans notre classe.
 * @author Antoine
 *
 */
public class VectorStackableStack extends VectorStack implements StackableStack{

	@Override
	public void pushAll(Stack st) throws Exception {
		while(!st.isEmpty()){
			this.push(st.pop());
		}
	}

}
