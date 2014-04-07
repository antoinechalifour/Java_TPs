package tpJava.tp3.exercice1;

/**
 * Implémentation d'une stack stackable
 * @author Antoine & Mathieu
 *
 */
public class StackableStackImpl implements Stack, StackableStack{
	private Stack s;
	
	public StackableStackImpl(Stack s) {
		super();
		this.s = s;
	}
	
	@Override
	public void pushAll(Stack st) throws Exception {
		while(!st.isEmpty()){
			this.push(st.pop());
		}
		
	}
	@Override
	public void push(Object o) throws Exception {
		s.push(o);		
	}
	@Override
	public Object pop() throws Exception {
		return s.pop();
	}
	@Override
	public Object top() throws Exception {
		return s.top();
	}
	@Override
	public boolean isEmpty() {
		return s.isEmpty();
	}

	@Override
	public String toString() {
		return s.toString();
	}

	public static void main(String args[]){
		Stack a = new ArrayStack();
		Stack v = new VectorStack();
		try{
			v.push("ab");
			v.push("cd");
			StackableStackImpl abs = new StackableStackImpl(a);
			abs.push("ef");
			abs.push("gh");
			
			abs.pushAll(v);
			System.out.println(abs);
		}
		catch(Exception e){
			System.out.println("Exception - " + e.getMessage());
		}
	}
}
