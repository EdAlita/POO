import java.awt.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PanelControles extends JPanel implements ActionListener, MouseListener, ChangeListener{
	
	private JButton btCambiar,
					btCambiarColor,
					btArchivo;
	private JTextField tfNombre,
					   tfarchivo;
	private JRadioButton rbRojo,
						 rbAzul,
						 rbVerde;
	private PanelDibujo pd;
	private JPanel pe;
	private JFileChooser fc;
	private JSlider slider;
	
	public PanelControles(PanelDibujo pd){
		super();
		this.pd=pd;
		
		this.setPreferredSize(new Dimension(150,600));
		
		this.btCambiar=new JButton("Cambiar");
		this.btCambiar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("Hola "+PanelControles.this.tfNombre.getText());
				pd.setNombre(PanelControles.this.tfNombre.getText());
			}
		});
		this.add(this.btCambiar);
		
		this.tfNombre= new JTextField(10);
		this.add(tfNombre);
		
		this.rbRojo=new JRadioButton("Color Rojo",true);
		this.rbAzul=new JRadioButton("Color Azul");
		this.rbVerde=new JRadioButton("Color Verde");
		this.add(rbAzul);
		this.add(rbRojo);
		this.add(rbVerde);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(this.rbAzul);
		bg.add(this.rbRojo);
		bg.add(this.rbVerde);
		
		this.btCambiarColor= new JButton("Cambiar Color");
		this.btCambiarColor.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(PanelControles.this.rbRojo.isSelected()){
					PanelControles.this.setBackground(Color.RED);
				}else if(PanelControles.this.rbVerde.isSelected()){
					PanelControles.this.setBackground(Color.GREEN);
				}else{
					PanelControles.this.setBackground(Color.CYAN);
				}
			}
		});
		this.add(this.btCambiarColor);
		
		this.pe=new JPanel();
		this.pe.setPreferredSize(new Dimension(80,80));
		this.pe.setBackground(Color.PINK);
		this.pe.addMouseListener(this);
		this.add(this.pe);
		
		this.fc= new JFileChooser("C:\\Users\\Edwing Ulin\\Google Drive\\Tec de Monterrey\\ITE\\2do Semestre\\POO\\2 do Parcial\\POO2");
		
		this.tfarchivo=new JTextField(12);
		this.btArchivo=new JButton("Selecciona Archivo");
		this.btArchivo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int resp=PanelControles.this.fc.showOpenDialog(PanelControles.this.pd);
				if(resp==JFileChooser.APPROVE_OPTION){
					PanelControles.this.fc.getSelectedFile().toString();
					String ruta=PanelControles.this.fc.getCurrentDirectory().toString();
					String file=PanelControles.this.fc.getSelectedFile().toString();
					PanelControles.this.tfarchivo.setText(ruta+"\""+file);
					try {
						BufferedReader bf = new BufferedReader(new FileReader(file));
						pd.setNombre(bf.readLine());
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		});
		this.add(this.tfarchivo);
		this.add(this.btArchivo);
		
		
		
		this.slider= new JSlider(SwingConstants.VERTICAL, 0, 200, 0);
		this.slider.setPaintTicks(true);
		this.slider.setPaintLabels(true);
		this.slider.setMajorTickSpacing(50);
		this.slider.setMinorTickSpacing(10);
		this.slider.addChangeListener(this);
		this.add(slider);
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		Color seleccionado = JColorChooser.showDialog(this.pd, "Selecciona el color de la base", Color.blue);
		pd.setColor(seleccionado);
		this.pe.setBackground(seleccionado);
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stateChanged(ChangeEvent arg0) {
		this.pd.setAltura(this.slider.getValue());
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}