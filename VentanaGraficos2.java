import javax.swing.JFrame;

public class VentanaGraficos2 extends JFrame{
	
	public VentanaGraficos2(){
		super("Grficos");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		VentanaGraficos2 win = new VentanaGraficos2();
	}

}
