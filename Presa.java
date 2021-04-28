import java.awt.EventQueue;
import javax.swing.*;
import java.awt.Event.Actionlistener;
import java.awt.Event.ActionEvent;
import java.swing.JLable; 
/**
 * Write a description of class Compuerta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Presa extends JFrame
{
    private JPanel contentPane;
    private JSpiner Spinner1;
    private JSpiner Spinner1;
    private JSpiner Spinner1;
    private JLabel lbladvertencia;
    
    public static void main(String[] args){
        EventQueue.invokeLater (new Runnable(){
            public void run(){
                try{
                    Presa frame = new Presa();
                    frame.setVisible(true);
                    
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
         };
        }
        
        public Presa(){
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setBounds(100, 100, 450, 300);
            contentPane = new JPanel();
            contentPane.setBorder(new EmptyBorder(5,5,5,5);
            setContentPane(contentPane);
            contentPane.setLayout(null);
            
            spinner1 = new JSpinner();
            spinner1.setModel(new SpinnerNumberModel(0,0,100,1));
            spinner1.setBounds(31, 35, 62, 20);
            contentPane.add(spinner1);
            
            spinner2 = new JSpinner();
            spinner2.setModel(new SpinnerNumberModel(0,0,100,1));
            spinner2.setBounds(31, 95, 62, 20);
            contentPane.add(spinner2);
            
            spinner3 = new JSpinner();
            spinner3.setModel(new SpinnerNumberModel(0,0,100,1));
            spinner3.setBounds(31, 134, 62, 20);
            contentPane.add(spinner3);
            
            
            JLabel lblcompuerta = new JLabel("Compuerta 1");
            lblCompuerta.setBounds(106, 38, 82, 14);
            contentPane.add(lblCompuerta);
            
            JLabel lblcompuerta1 = new JLabel("Compuerta 2");
            lblCompuerta.setBounds(106, 38, 82, 14);
            contentPane.add(lblCompuerta1);
            
            JLabel lblcompuerta2 = new JLabel("Compuerta 3");
            lblCompuerta.setBounds(106, 38, 82, 14);
            contentPane.add(lblCompuerta2);
            
            Jbutton btnOk = new JButton("Actualizar caudal");
            btnOk.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent arg[]){
                    int valor1 = Integer.paseInt(spinner1.getText().toStrins());
                    int valor2 = Integer.paseInt(spinner2.getText().toStrins());
                    int valor3 = Integer.paseInt(spinner3.getText().toStrins());
                    int sumaCaudal;
                    sumaCaudal = valor1+valor2+valor3;
                    
                    if (sumaCaudal<=100){
                        lbladvertencia.setText("no hay peli");
                    }
                }
            });
        }
    }
}
