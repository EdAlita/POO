import javax.swing.*;

//A01227886 Edwing Yair Ulin Briseño
//Programacion Orientada a Objetos-IntroJava
//13 de Enero del 2017

public class IntroJava{
	public static void calificacion(){
		String sNota = JOptionPane.showInputDialog("Dime una nota");
		int nota = Integer.parseInt(sNota);
		if(nota>=70){
			System.out.println("Aprobado");
		}
		else{
			System.out.println("Reprobado");
		}
	}
	public static void numerosDel1al100(){
		for(int i=0;i<100;i++){
			System.out.println(i+1);
		}
	}
	public static void serie(int base){
		for(int i=0;i<50;i++){
			System.out.println(base*(i+1));
		}
	}
	public static int calorias(){
		int numComidas=Integer.parseInt(JOptionPane.showInputDialog("Cuantas Comidas hiciste hoy?"));
		int caloriasTotales=0;
		for(int i=0;i<numComidas;i++){
			caloriasTotales+= Integer.parseInt(JOptionPane.showInputDialog("Cuantas calorias consumiste en tu comida"+(i+1)+"?"));	
		}
		return caloriasTotales;
	}
	public static void main(String[] args){
		calificacion();
		numerosDel1al100();
		serie(7);
		int cal=calorias();
		System.out.println("El total de calorias condumidas fue: "+cal);
	}
}