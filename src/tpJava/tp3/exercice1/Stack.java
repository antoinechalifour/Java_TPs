package tpJava.tp3.exercice1;

/**
 * Interface d'un pile
 * @author Antoine & Mathieu
 *
 */
public interface Stack {
	void push(Object o) throws Exception;
	Object pop() throws Exception;
	Object top() throws Exception;
	boolean isEmpty();
	String toString();
}
