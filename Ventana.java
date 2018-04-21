import java.awt.BorderLayout;
import javax.swing.JFrame;

public class Ventana extends JFrame {
	public Ventana(){
		super("Mi primer Ventana en Java");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		PanelDibujo pd = new PanelDibujo();
		this.add(pd);
		this.add(new PanelControles(pd),BorderLayout.WEST);
		this.pack();
		this.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		Ventana win=new Ventana();
	}

}
