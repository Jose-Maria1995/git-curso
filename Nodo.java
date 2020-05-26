package pilasnodos;

public class Nodo {
	
	Integer valor;
	
	Nodo siguiente;
	
	public Nodo(Integer num) {
		
		this.valor = num ;
		this.siguiente = null;
		
	}
		
	 public Nodo getSiguiente() {
			 
		 return this.siguiente;
			
	}
	
	public void setNodo(Nodo nodo) {
		
		this.siguiente=nodo;
	}
	
	public Integer getValor() {
		
		return this.valor;
	}
		

}
