import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EjemploEscritor {

	public static void main(String[] args) {
		try {
			PrintWriter  pw= new PrintWriter(new FileWriter("C:\\Users\\Edwing Ulin\\Google Drive\\Tec de Monterrey\\ITE\\2do Semestre\\POO\\2 do Parcial\\nuevo.txt"));
			pw.println("Este es mi primer archivo de texto con java");
			pw.println("Me siento muy feliz");
			pw.flush(); //guarda sin cerrar el archivo
			pw.println("Es muy facil crear archivos de texto");
			pw.println("Bueno Bye");
			pw.close();
			System.out.println("fin");
		} 
		catch (IOException e) {
			System.out.println("Error al intentar crear archivo");
		}
	}
}
