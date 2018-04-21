
public class Pila <T> {
	int TAM = 10;
	T datos [];
	int elementos;
	
	public Pila(){
		this.elementos = 0;
		this.datos= (T[]) new Object[TAM];
	}
	
	public void push(T dato){
		if (this.elementos < this.TAM){
			this.datos[this.elementos++]=dato;
		}
	}
	
	public T pop(){
		this.datos[this.elementos-1]=null;
		T valor = this.datos[this.elementos-1];
		this.elementos--;
		return valor;
	}
	
	public T top(){
		return this.datos[this.elementos-1];
	}
	
	public int size(){
		return this.elementos;
	}
	
	public String toString(){
		String acm="";
		for(int i=0;i<this.elementos;i++){
			acm+=this.datos[i]+",";
		}
		return acm;
	}
	
	public static void main(String[] args) {
		Pila<Integer> pila= new Pila<Integer>();
		pila.push(40);
		pila.push(35);
		pila.push(20);
		pila.push(55);
		pila.push(75);
		pila.push(37);
		pila.push(24);
		
		System.out.println(pila.pop());
		
		System.out.println(pila.toString());
		
		System.out.println("numero elementos"+pila.elementos);
		
		System.out.println(pila.top());
		
		System.out.println(pila.pop());
		
		System.out.println(pila.top());
		
		System.out.println(pila.size());
		
		System.out.println(pila.toString());
	}

}
