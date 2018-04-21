import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Copy {

	public static void main(String[] args) {
		String ubicacion1 = args[0];
		String ubicacion2 = args[1];
		
		try {
			BufferedReader bf = new BufferedReader(new FileReader(ubicacion1));
			PrintWriter  pw= new PrintWriter(new FileWriter(ubicacion2));
			String linea;
			while((linea=bf.readLine())!=null){
				pw.println(linea);
			}
			pw.close();
			bf.close();
		} catch (FileNotFoundException e) {
			System.out.println("No se ha encontrado el archivo"+e);
		} catch (IOException e) {
			System.out.println("No se ha pudido leer el archivo");
		}
	
	}

}
