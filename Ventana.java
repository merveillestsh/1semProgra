import java.awt.*;// objetos graficos
import java.awt.event.*;// manipular los eventos de los dispoditivas de entrada o salida
import javax.swing.*;// gestionar los controles/objetos de un formulario o ventana 

/**
 * botones.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ventana extends JFrame implements ActionListener{
    private JButton button;
    private JTextField textField;
    
   public static void main(String args[]){
       Ventana ventana1 = new Ventana();
       ventana1.setSize(300, 120);
       ventana1.crearVentana();
       ventana1.setVisible(true);
    }
    public void crearVentana(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container ventana = getContentPane();
        ventana.setLayout(new FlowLayout());
        
        button = new JButton("Acceptar");
        ventana.add(button);
        button.addActionListener(this);
        textField = new JTextField(20);
        ventana.add(textField);
   }
   
   public void actionPerformed(ActionEvent event){
       int numero;
       String numeracion = "";
       numero = 1;
       
       while(numero <= 10){
           numeracion = numeracion + Integer.toString(numero) + " ";
           numero++;//numero + 1
        }
       textField.setText(numeracion);
    }
}
