
public class Caja extends Rectangulo{
	protected double alto;
	
	public Caja(double ancho, double largo,double alto){
		super(largo,ancho);
		this.alto=alto;
	}
	
	public Caja(){
		this(3.0,5.0,4.0);
	}
	
	public double perimetro(){
		return 4.0*this.largo+2.0*this.ancho+8.0*this.alto;
	}
	
	public double area(){
		return 2*(this.largo*this.alto+super.area()+this.alto*this.ancho);
	}
	
	public double volumen(){
		return super.area()*this.alto;
	}
	
	public void saluda(){
		System.out.println("Saludos");
	}
	
	public String toString(){
		return "Caja con largo de "+this.largo+", ancho de "+this.ancho+" y alto de "+this.alto;
	}
}
