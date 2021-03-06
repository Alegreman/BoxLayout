import java.awt.LayoutManager;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

	public class BoxLayoutDemo1{
		public static void main(String[] args){

			JFrame frame = new JFrame();
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			JPanel panel = new JPanel();
			LayoutManager layout = new BoxLayout(panel, BoxLayout.X_AXIS);
			panel.setLayout(layout);

			panel.add(new JLabel("Ejemplo de BoxLayout de puro Texto "));
			panel.add(new JLabel(" a,"));
			panel.add(new JLabel(" b,"));
			panel.add(new JLabel(" c,"));
			panel.add(new JLabel(" d,"));
			panel.add(new JLabel(" e,"));
			panel.add(new JLabel(" f,"));
			panel.add(new JLabel(" este es el BoxLayout más simple."));
			frame.add(panel);
			
			frame.setSize(700,300);
			frame.setVisible(true);
		}

	}
