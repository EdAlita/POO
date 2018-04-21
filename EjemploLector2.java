import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

//A01227886 Edwing Yair Ulin Briseno
//Fundamentos de Programacion orientada a objetos
//01 de Marzo del 2017

public class EjemploLector2 {

	public static void main(String[] args) {
		String locacion =JOptionPane.showInputDialog("Dame la ubicacion del documento: ");
		try {
			BufferedReader bf = new BufferedReader(new FileReader(locacion));
			String linea;
			while((linea=bf.readLine())!=null){
				System.out.println(linea);
			}
			bf.close();
		} catch (FileNotFoundException e) {
			System.out.println("No se ha encontrado el Archivo"+e);
		} catch (IOException e) {
			System.out.println("No se puede leer el Archivo ");
		}

	}

}
