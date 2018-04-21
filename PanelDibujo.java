import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.*;

public class PanelDibujo extends JPanel implements Runnable, MouseListener, MouseMotionListener {
	private int xN,
				Mx,
				My,
				yN;
	private Image fondo;
	private String nombre;
	private Color color;
	private boolean moverse;
	
	public PanelDibujo(){
		super();
		this.setPreferredSize(new Dimension(800,600));
		this.xN=this.yN=0;
		this.fondo=new ImageIcon("contador.jpg").getImage();
		this.nombre="Pocoyo";
		this.color=Color.LIGHT_GRAY;
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		this.moverse=false;
		this.Mx=110;
		this.My=500;
		
		Thread hilo=new Thread(this);
		hilo.start();
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setFont(new Font("Default",Font.BOLD,15));
		g.drawImage(this.fondo, 0, 0,this.getWidth(),this.getHeight(), this);
		g.setColor(Color.ORANGE);
		g.fillOval(50+this.xN, 430-this.yN, 200, 100);
		g.setColor(Color.CYAN);
		g.fillArc(50+this.xN, 430-this.yN, 200, 100,0,100);
		g.setColor(Color.BLACK);
		g.drawLine(130+this.xN, 432-this.yN, 130+this.xN, 330-this.yN);
		g.setColor(Color.red);
		g.fillOval(80+this.xN, 230-this.yN, 100, 100);
		g.setColor(Color.WHITE);
		g.drawString("Vamos "+this.nombre,Mx,My );
		g.setColor(this.color);
		g.fillRect(0, 530, 800,70 );
	}
	
	public void setNombre(String nombre){
		this.nombre=nombre;
		this.repaint();	
	}
	
	public void setColor(Color color2){
		this.color=color2;
		this.repaint();
	}
	
	public void setAltura(int altura){
		this.yN=altura;
		this.repaint();
	}
	
	public void run() {
		while(this.xN+250<800){
			try{
					if(moverse){
					this.xN+=3;
					this.yN++;
					this.repaint();
					}
					Thread.sleep(20);
			}
			catch(InterruptedException ex){
				System.out.println("Error"+ex);
			}
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		this.moverse=true;
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		this.Mx=arg0.getX();
		this.My=arg0.getY();
		this.repaint();
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}	
}