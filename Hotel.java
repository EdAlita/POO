public class Hotel{
	private Habitacion[] habitacion;
	private String nombre;

	public Hotel(String nombre, int numero){
		this.nombre=nombre;
		this.habitacion = new Habitacion[numero];
		for(int i=0;i<habitacion.length;i++){
			int num = i+100;
			habitacion[i]=new Habitacion(num);
		}
	}

	public int checkin(String nombre,int adultos, int ninos, double credito){
		for(int j=0;j<this.habitacion.length;j++){
			if(this.habitacion[j].getDisponible()){
					this.habitacion[j].checkin(nombre,adultos,ninos,credito);
					return this.habitacion[j].getNumero();
			}
		}
		return -1;
	}

	public boolean checkout(int numero){
		for(int j=0;j<this.habitacion.length;j++){
			if(this.habitacion[j].getNumero()==numero){
					this.habitacion[j].checkout();
					return true;
			}
		}
		return false;
	}

	public String realizarCargosHabitacion(int j,double cargo){
			int num = j -100;
			if(this.habitacion[num].realizarCargo(cargo)){
				return "Cargo hecho";
			}
		return "Cargo no hecho";
	}

	public void imprimeOcupacion(){
		System.out.println("Ocupacion en "+this.nombre);
		for(int j=0;j<this.habitacion.length;j++){
				System.out.print(this.habitacion[j].toString());
		}
	}
public static void main(String[] args){
	int num = 5;
	Hotel tmp = new Hotel("Edwing",5);
	tmp.checkin("juan",3,5,2500.00);
	tmp.checkin("Paco",4,1,4500.00);
	tmp.checkin("fabian",3,2,20.00);
	tmp.checkin("hujo",4,2,458.00);
	tmp.checkin("ed",3,0,2025.00);
	tmp.realizarCargosHabitacion(100,1000);
	tmp.imprimeOcupacion();

	tmp.checkout(103);
	tmp.imprimeOcupacion();
}
}
