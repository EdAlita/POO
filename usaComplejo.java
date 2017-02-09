public class usaComplejo{
	public static void main(String[] args){
		Complejo a = new Complejo();
		Complejo b = new Complejo(8.5,+9.6);

		a.imprimir();
		b.imprimir(); 
		
		a.establecer(4.9,-7.8);
		a.imprimir();

		b.agregar(1.0,1.0);
		b.imprimir();
		b.agregar(a);
		b.imprimir();

		Complejo c=a.suma(b);
		c.imprimir();

		Complejo d=a.resta(b);
		d.imprimir();

		Complejo e=a.multiplicacion(b);
		e.imprimir();	

		Complejo f=a.multiplicacion(2);
		f.imprimir();	

		Complejo g=a.conjugado();
		g.imprimir();
	}
}