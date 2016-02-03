import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BoxLyy {

  public static void main(String[] args) {

    JFrame frame = new JFrame("Ejemplo Boxlayout eje Y");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    BoxLayout boxLayout = new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS); // aplicando la posicion
    frame.setLayout(boxLayout);
    frame.add(new JButton("Boton 1"));
    frame.add(new JButton("Boton 2"));
    frame.add(new JButton("Boton 3"));
    frame.pack();

    frame.setVisible(true);
  }
}
