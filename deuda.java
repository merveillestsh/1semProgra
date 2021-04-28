import java.util.Scanner;// para que el usuario pueda ingresar los datos
/**
 * Write a description of class deuda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class deuda
{
    public static void main(String[]arg){
        System.out.print('\u000c');// borrar la pantalla
        double deuda, pago;//crear las variables
        double credito;//crear las variables
        Scanner sc = new Scanner(System.in);
        System.out.println("Monto adeudado: ");// pedir que el usuario ingrese el monto
        deuda = sc.nextDouble();// atribuar el valor a la variable
        System.out.println("Su pago: ");// pedir que el usuario ingrese el pago
        pago = sc.nextDouble();// atribuar el valor a la variable
        credito = pago - deuda;// atribuar el valor a la variable
        if (deuda < pago){// una condicion
            System.out.println("tiene un credito: " + credito); 
        }// clacular  el credito y mandar a imprimir
        else{
            double nuevaDeuda; // una nueva variable
            nuevaDeuda = (deuda * 0.03)+ credito;// calcular el valor
            System.out.println(+ pago);// imprimir
            System.out.println("deuda actualizada: " + nuevaDeuda );// imprimir
        }
        
        
        
    }
}
