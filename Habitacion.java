public class Habitacion{
	private int numero,
		          adultos,
	            infantes;
	private double credito,
			           cargo;
	private String nombre;
	private boolean disponible;

	public Habitacion(int numero){
		this.numero=numero;
		this.disponible=true;
	}

	public int getNumero(){
		return this.numero;
	}

	public boolean getDisponible(){
		return this.disponible;
	}

	public void checkin(String nombre,int adultos,int infantes, double credito){
		this.nombre=nombre;
		this.adultos=adultos;
		this.infantes=infantes;
		this.credito=credito;
		this.disponible=false;
	}

	public boolean checkout(){
		if(this.disponible!=true){
			this.nombre=null;
			this.adultos=0;
			this.infantes=0;
			this.credito=0;
			this.disponible=true;
			return true;
		}
		else{
			return false;
		}
	}

	public int getTarifaBase(){
		int t=0;
		t+=this.adultos*350;
		t+=this.infantes*100;
		return t;
	}

	public boolean realizarCargo(double cargo){
		if(cargo>0 && this.credito>=(this.cargo+cargo)){
			this.cargo+=cargo;
			return true;
		}
		else{
			return false;
		}
	}

	public String toString(){
		String acm="";
		if(this.nombre!=null){
			acm+= this.numero+", Huesped: "+this.nombre+", Tarifa Base: "+this.getTarifaBase()+", Credito: "+this.credito+", Cargos: "+this.cargo+"\n";
		}
		return acm;
	}
}
