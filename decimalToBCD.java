import javax.swing.*;

public class decimalToBCD{

	public static void main(String[] args){
	int numDado=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero a convertir: "));
	decimalToBCD(numDado);	
	}
	
	public static void decimalToBCD(int num){
		int[] digitos={0,0,0,0};
		int contador =3;
		int[] resultado={0,0,0,0};
		while(num>0){
			digitos[contador--]=num%10;
			num/=10;
		}

		for(int j=0;j<4;j++){
			int a = digitos[j];
			if(a>=8){
				System.out.print(1);
				a-=8;
			}
			else{
				System.out.print(0);
			}
			if(a>=4){
				System.out.print(1);
				a-=4;
			}
			else{
				System.out.print(0);
			}
			if(a>=2){
				System.out.print(1);
				a-=2;
			}
			else{
				System.out.print(0);
			}
			if(a>=1){
			System.out.print(1);
			a-=1;
			}
			else{
				System.out.print(0);
			}
		}
	}
}