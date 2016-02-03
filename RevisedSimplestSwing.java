//Revised
import javax.swing.JFrame;
	public class RevisedSimplestSwing{
	public static void main(String[] ar){

	//Create the frame
	JFrame frame = new JFrame("Revised Simplest Swing");
	//Set the default behavrio to exit the application
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//set the x,y width and heigth properties in one go
	frame.setBounds(50,50,200,200);
	//Display the frame
	frame.setVisible(true);
	}
}
