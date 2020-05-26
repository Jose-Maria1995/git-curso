package pilasnodos;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PilaEnteros pila = new PilaEnteros();
		
		System.out.println(pila.isEmpty());
		
		pila.push(4);
		pila.push(5);
		pila.push(8);
		pila.push(9);
		pila.push(10);
		
		System.out.println(pila.top());
		System.out.println(pila.isFull());
		System.out.println(pila.isEmpty());
		
		System.out.println(pila.pop());
		System.out.println(pila.top());
		pila.pop();
		System.out.println(pila.top());
		pila.pop();
		System.out.println(pila.top());
		pila.pop();
		System.out.println(pila.top());
		System.out.println(pila.isEmpty());
		pila.pop();
		System.out.println(pila.top());
		
	}

}
