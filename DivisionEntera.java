import javax.swing.JOptionPane;

//A01227886 Edwing Yair Ulin Briseno
//Fundamentos de Programacion orientada a objetos
//26 de Febrero del 2017

public class DivisionEntera {
	
	public int divide(int num, int den){
		return num/den;
	}
	
	public static void main(String[] args) {
		while(true){
		try{
		DivisionEntera de=new DivisionEntera();
		int num = Integer.parseInt(JOptionPane.showInputDialog("Escribe un numero"));
		int den = Integer.parseInt(JOptionPane.showInputDialog("Escribe otro numero"));
		JOptionPane.showMessageDialog(null, "El resultado es "+de.divide(num,den));
		break;
		}
		catch(NumberFormatException ex){
			JOptionPane.showMessageDialog(null, "Ingresa un valor valido"); 
		}
		catch(ArithmeticException es){
			JOptionPane.showMessageDialog(null, "No se puede dividir entre 0");
		}
		}
	}
}