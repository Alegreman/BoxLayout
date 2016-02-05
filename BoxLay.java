//librerias que ocuparé
import javax.swing.BoxLayout; //para usar el tipo de layout requerido
import javax.swing.JTextField; // para la captura de datos
import javax.swing.JPanel; //para implementar un panel
import javax.swing.JLabel; // uso de etiquetas
import javax.swing.JFrame; //para usar el frame
import javax.swing.JButton; // implementar botones
import javax.swing.JPasswordField; //campo de pass 
import javax.swing.WindowConstants; //para usar exit on close

	public class BoxLay{
		//declaración de objetos que usaremos
		private JPanel panelSup,panelMed,panelInfe;
		private JLabel lbl1,lbl2,lbl3;
		private JTextField cajaTxt;
		private JPasswordField cajaPass;
		private JButton btnAceptar, btnCancelar;
		private JFrame frame;

		public void panelSuperior(){
			//para crear el panel superior donde se pondra el usuario
			panelSup = new JPanel();
			lbl2 = new JLabel("Super Usuario");
			cajaTxt = new JTextField(10);
			panelSup.setLayout(new BoxLayout(panelSup, BoxLayout.X_AXIS));
			panelSup.add(lbl2);
			panelSup.add(cajaTxt);

		}

		public void panelMedio(){
			//panel medio para el password
			panelMed = new JPanel();
			lbl3 = new JLabel("Contraseña");
			cajaPass = new JPasswordField(10);
			panelMed.setLayout(new BoxLayout(panelMed, BoxLayout.X_AXIS));
			panelMed.add(lbl3);
			panelMed.add(cajaPass);
		}

		public void panelInfe(){
			
				//panel para los botones	
			panelInfe = new JPanel();
			btnAceptar =  new JButton("Aceptar");
			btnCancelar = new JButton("Cancelar");
			panelInfe.setLayout(new BoxLayout(panelInfe, BoxLayout.X_AXIS));
			panelInfe.add(btnAceptar);
			panelInfe.add(btnCancelar);
			
		}

		public void ventana(){
			//creacion de la ventana
			frame = new JFrame();
			lbl1 = new JLabel("Ejemplo Cajita para log in");
			frame.setLayout(new BoxLayout(frame.getContentPane(),BoxLayout.Y_AXIS));
			frame.add(lbl1);
			frame.add(panelSup);
			frame.add(panelMed);
			frame.add(panelInfe);
			frame.pack();
			frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			frame.setSize(300,110);
			frame.setVisible(true);
			
		}

		public BoxLay(){	
			//constructor de la clase, donde usa los métodos para integrarlos a la ventana
			panelSuperior();
			panelMedio();
			panelInfe();
			ventana();
		}

		public static void main(String[] a){
			//uso de la ventana
			new BoxLay();
		}
}
