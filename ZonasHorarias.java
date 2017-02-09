public class ZonasHorarias{

    	private Clock[] horas;
	
	public ZonasHorarias(){
        	this.horas=new Clock[10];
	}

	public void ponerHora(int pos, int hr, int min, int sec, String cd){
		if(this.horas[pos]==null){
			this.horas[pos]= new Clock(hr,min,sec,cd);
		}
		else{
			this.horas[pos].setTime(hr,min,sec);
		}
	}

	public String toString(){
		String res="";
		for(int i=0;i<this.horas.length;i++){
			if(this.horas[i]!=null){
				res=res+this.horas[i]/*.returnTime()*/+"\n";
			}	
		}
		return res;
	}

	public void cambiarHorarioInvierno(){
		for(int i=0;i<this.horas.length;i++){
			if(this.horas[i]!=null){
				this.horas[i].incrementHours();
			}	
		}
	}
	
	public static void main(String[] args){
		ZonasHorarias zh= new ZonasHorarias();
		zh.ponerHora(0,10,31,20,"Guadaljara");
		zh.ponerHora(1,8,31,20,"Guayabitos");
		System.out.println(zh);

		zh.ponerHora(0,11,10,0,"Guanajuato");
		System.out.println(zh);

		zh.cambiarHorarioInvierno();
		System.out.println(zh);
	}
}
