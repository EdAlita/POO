import javax.swing.*;

//A01227886 Edwing Yair Ulin Briseno
//Tarae Condicionales-Programacion Orientada a Objetos
//13 de Enero del 2017

public class getNaipes{

	public static void getNaipes(String carta){
		char arr[]=carta.toCharArray();
		char num[]={'2','3','4','5','6','7','8','9','A','J','Q','K'};
		char pal[]={'D','C','E','T'};
		String nombres[]={"Dos","Tres","Cuatro","Cinco","Seis","Siete","Ocho","Nueve","As","Joto","Reina","Rey"};
		String palos[]={"Diamantes","Corazones","Espadas","Treboles"};
		String nombre,palo;
			if(arr[1]=='0'){
			System.out.print("Diez");
				for(int j=0;j<pal.length;j++){
					if(arr[2]==pal[j]){
						palo = palos[j];
						System.out.print(" de "+palo);
					}
				}

				System.exit(0);

			}
				for(int i=0;i<num.length;i++){
					if(arr[0]==num[i]){
						nombre = nombres[i];
						System.out.print(nombre);
					}
				}

				for(int j=0;j<pal.length;j++){
					if(arr[1]==pal[j]){
						palo = palos[j];
						System.out.print(" de "+palo);
					}

				}
	}

	public static void main(String[] args){
		String cartaDada=JOptionPane.showInputDialog("Introduzca la notación de la carta: ");
		getNaipes(cartaDada);	
	}
}

