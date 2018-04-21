import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EjemploLector {

	public static void main(String[] args) {
		try {
			BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\Edwing Ulin\\Google Drive\\Tec de Monterrey\\ITE\\2do Semestre\\POO\\2 do Parcial\\Oscars.txt"));
			String linea = bf.readLine();
			System.out.println(linea);
			linea = bf.readLine();
			System.out.println(linea);
			bf.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Archivo no Encontrado"+ex);
		} catch (IOException e) {
			System.out.println("Error al intentar leer el Archivo");
		}

	}

}
