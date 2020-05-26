package pilasnodos;

public class PilaEnteros {
	
	private Nodo cima;
	
	public PilaEnteros() {
		
		this.cima = null;
	}
	
	public boolean push(Integer i) {
		Nodo num=new Nodo(i);
		num.siguiente =this.cima;
		this.cima=num;
		return true;
	}
	
	public Integer pop() {
		Integer salida = this.cima.getValor();
		this.cima=this.cima.getSiguiente();
		return salida;
	}
	
	public Integer top() {
		
		if(this.cima!=null) {
			Integer consulta=this.cima.getValor();
			return consulta;
			}
		
		else {
			Integer consulta = null;
			return consulta;
		}
		
	}
	
	public boolean isEmpty() {
		boolean verificacion;
		if(this.cima==null) {
			verificacion = true;
		}
		else {
			verificacion =false;
		}
		return verificacion;
	}
	
	public boolean isFull() {
		boolean verificacion = false;
		
		return verificacion;
		
	}

}
