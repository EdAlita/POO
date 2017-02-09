//A01227886 Edwing Yair Ulin Briseno
//Fundamentos de Programacion orientada a objetos
//31 de Enero del 2017

public class Complejo{
	private double real,
			imaginario;

	public Complejo(){
		this(7,-1);
	}

	public Complejo(double real,double imaginario){
		this.establecer(real,imaginario);
	}

	public void establecer(double real,double imaginario){
		this.real=real;
		this.imaginario=imaginario;
	}

	public void imprimir(){
		if(this.imaginario<0){
			System.out.println(this.real+""+this.imaginario+"i");
		}
		else{
			System.out.println(this.real+"+"+this.imaginario+"i");
		}
	}

	public void agregar(double real,double imaginario){
		this.real=this.real+real;
		this.imaginario=this.imaginario+imaginario;
	}

	public void agregar(Complejo C){
		this.real=this.real+C.real;
		this.imaginario=this.imaginario+C.imaginario;
	}

	public Complejo suma(Complejo C){
		double r=this.real+C.real;
		double c=this.imaginario+C.imaginario;
		return new Complejo(r,c);
	}

	public Complejo resta(Complejo C){
		double r=this.real-C.real;
		double c=this.imaginario-C.imaginario;
		return new Complejo(r,c);
	}
	
	public Complejo multiplicacion(Complejo C){
		double r=this.real*C.real;
		double c=this.imaginario*C.imaginario;
		return new Complejo(r,c);
	}

	public Complejo multiplicacion(double D){
		double r=this.real*D;
		double c=this.imaginario*D;
		return new Complejo(r,c);
	}

	public Complejo conjugado(){
		double c = this.imaginario*-1;
		return new Complejo(this.real,c);
	}
}