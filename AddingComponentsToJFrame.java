import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Container;
	public class AddingComponentsToJFrame{


		public static void main(String[] ar){

			JFrame frame = new JFrame("Adding components to JFrame");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Container contentPane = frame.getContentPane();
			//Add a close button
			JButton closeButton = new JButton("Close");
			frame.add(closeButton);
			frame.setBounds(50,50,400,400);
			frame.setVisible(true);
		}
	}
