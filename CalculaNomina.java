import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class CalculaNomina {

	public static void main(String[] args) {
		try {
			StringTokenizer st;
			BufferedReader bf=new BufferedReader(new FileReader("horasTrabajadas.txt"));
			PrintWriter pw = new PrintWriter(new FileWriter("nominas.csv"));
			String linea = bf.readLine();
			String nombre
				   ,paterno;
			int hrs;
			double tabulador;
			pw.println("Nombre Paterno, Pago Semanal");
			while((linea=bf.readLine())!=null){
				st = new StringTokenizer(linea);
				linea=bf.readLine();
				System.out.println();
				nombre=st.nextToken();
				paterno=st.nextToken();
				hrs=Integer.parseInt(st.nextToken());
				tabulador=Double.parseDouble(st.nextToken());
				pw.println(nombre+" "+paterno+","+hrs*tabulador);
			}
			bf.close();
			pw.close();
		}
		catch (FileNotFoundException e){
			System.out.println("No se encontro el Archivo "+e);
		}catch (IOException ex) {
			System.out.println("No se puede leer el Archivo ");
	    }

}}
