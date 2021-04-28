import javax.swing.JApplet;
import java.awt.Graphics;
public class HappyFace extends JApplet
{
   public void paint(Graphics canvas) {
       canvas.drawOval(100, 50, 200, 200); //coodenadas
       canvas.drawOval(155, 100, 10, 20); //ojo izquierdo
       canvas.drawOval(230, 100, 200, 200);
   }
}
