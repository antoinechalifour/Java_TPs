package tpJava.tp3.exercice1;

/**
 * Interface d'un stack stackable
 * @author Antoine & Mathieu
 *
 */
public interface StackableStack {
	public void pushAll(Stack st) throws Exception;
}

/*
*	Question 1.(c)
*	- inconvénient de l'approche : redondance de code puisque pas d'héritage multiple
*/