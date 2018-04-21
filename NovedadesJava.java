import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class NovedadesJava {
	
	public static <E> void ejemploForEach(E[] datos){
		for(E Valor:datos){
			System.out.println(Valor+",");
		}
		System.out.println();
	}
	
	public static void notas(String califAN){
		System.out.println("La nota es ");
		switch (califAN){
			case "E":
				System.out.println("100");
				break;
			case "ME":
				System.out.println("90");
				break;
			case "B":
				System.out.println("80");
				break;
			case "S":
				System.out.println("70");
				break;
			default:
				System.out.println("50");	
		}
	}
	
	public static void ejemploTryRecursos(String ruta){
		try(PrintWriter pw = new PrintWriter(new FileWriter(ruta))){
			pw.print("Hola");
		}
		catch(IOException e){
			System.out.println("Error "+e);
		}
	}
	
	public static int suma(int...valores){
		int resp=0;
		for(int tmp:valores){
			resp+=tmp;
		}
		return resp;
	}
	
	public static void ejemploPrintf(int a, double f){
		System.out.printf("El primer elemento %d y el segundo elemento %#.2f y ya",a,f);
	}
	
	public static int suma(ArrayList<Number> valores){
		int resp=0;
		for(Number n:valores){
			resp+=n.doubleValue();
		}
		
		return resp;
	}
	
	public static void main(String[] args){
		Integer[] numeros={10,20,30,40,50};
		ejemploForEach(numeros);
		notas("S");
		ejemploTryRecursos("nuevaPrueba2.txt");
		suma(10);
		suma(10,20);
		suma(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
		ejemploPrintf(10,100.00);
	} 

}
