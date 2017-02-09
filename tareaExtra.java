import javax.swing.*;

public class tareaExtra{
	public static void paroimparif(int num){
		if(num%2==0){
		System.out.println(num+" es par");
		}
		else{
		System.out.println(num+" es impar");
		}
	}
	public static void paroimparsw(int num){
		switch(num%2){
		case 0:
		System.out.println(num+" es par");
		break;

		case 1:
		System.out.println(num+" es impar");
		break;
		}
	}
	public static void tarifa(){
		int distancia = Integer.parseInt(JOptionPane.showInputDialog("Cuanta distancia va a viajar"));
		int tarifanocturna = Integer.parseInt(JOptionPane.showInputDialog("Si es tarifa nocturna pon 1"));
		if(tarifanocturna==1){
				if(distancia<=15){
				double a = (distancia*5)*1.15;
				System.out.println("tu tarifa es "+a);
				}
				else{
				double a = (distancia*4)*1.15;
				System.out.println("tu tarifa es "+a);	
				}
		}
		else{
				if(distancia<=15){
					int a = distancia*5;
					System.out.println("tu tarifa es "+a);
				}
				else{
					int a = distancia*4;
					System.out.println("tu tarifa es "+a);
				}
		}
	}
	public static void sumatoria(int a,int b){
		int contador = (b-a)-1;
		int suma = a + b;
		while(contador!=0){
		 	suma+= a+contador;
			contador--;
		}
		System.out.println("La sumatoria es "+suma);
	}
	public static void main(String[] args){
		paroimparif(7);
		paroimparsw(7);
		tarifa();
		sumatoria(3,7);
	}
}