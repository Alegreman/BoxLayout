import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BoxLX {

  public static void main(String[] args) {

    JFrame.setDefaultLookAndFeelDecorated(true);
    JFrame frame = new JFrame("Ejemplo Boxlayout eje X");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    BoxLayout boxLayout = new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS); // aplicando la posicion
    frame.setLayout(boxLayout);
    frame.add(new JButton("Boton 1"));
    frame.add(new JButton("Boton 2"));
    frame.add(new JButton("Boton 3"));
    frame.pack();

    frame.setVisible(true);
  }
}
