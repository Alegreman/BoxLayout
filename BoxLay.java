import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.WindowConstants;

	public class BoxLay{

		private JPanel panelSup,panelMed,panelInfe;
		private JLabel lbl1,lbl2,lbl3;
		private JTextField cajaTxt;
		private JPasswordField cajaPass;
		private JButton btnAceptar, btnCancelar;
		private JFrame frame;

		public void panelSuperior(){

			panelSup = new JPanel();
			lbl2 = new JLabel("User");
			cajaTxt = new JTextField(10);
			panelSup.setLayout(new BoxLayout(panelSup, BoxLayout.X_AXIS));
			panelSup.add(lbl2);
			panelSup.add(cajaTxt);

		}

		public void panelMedio(){
	
			panelMed = new JPanel();
			lbl3 = new JLabel("Password");
			cajaPass = new JPasswordField(10);
			panelMed.setLayout(new BoxLayout(panelMed, BoxLayout.X_AXIS));
			panelMed.add(lbl3);
			panelMed.add(cajaPass);
		}

		public void panelInfe(){
			
			
			panelInfe = new JPanel();
			btnAceptar =  new JButton("Aceptar");
			btnCancelar = new JButton("Cancelar");
			panelInfe.setLayout(new BoxLayout(panelInfe, BoxLayout.X_AXIS));
			panelInfe.add(btnAceptar);
			panelInfe.add(btnCancelar);
			
		}

		public void ventana(){

			frame = new JFrame();
			lbl1 = new JLabel("Ejemplo Cajita para log in");
			frame.setLayout(new BoxLayout(frame.getContentPane(),BoxLayout.Y_AXIS));
			frame.add(lbl1);
			frame.add(panelSup);
			frame.add(panelMed);
			frame.add(panelInfe);
			frame.pack();
			frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			frame.setSize(400,100);
			frame.setVisible(true);
			
		}

		public BoxLay(){	

			panelSuperior();
			panelMedio();
			panelInfe();
			ventana();
		}

		public static void main(String[] a){

			new BoxLay();
		}
}
