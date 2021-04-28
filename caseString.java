import java.util.Scanner;
/**
 * Write a description of class caseString here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class caseString
{
    public static void main(String args[]){
        String clasificacion;
        System.out.print('\u000c');
        Scanner sc = new Scanner(System.in);
        clasificacion = sc.nextLine();
        switch(clasificacion){
            case "infante":{
                int costoBoleto = 50;
                int a_pagar;
                a_pagar = costoBoleto - ((50 / 100) * 100);
                System.out.println("pagar: " + a_pagar);
                break;
            }
            case "intermedio":{
                int costoBoleto = 50;
                double descuento = 25/100;
                double a_pagar;
                a_pagar = (double) costoBoleto + descuento;
                System.out.println("clasificacion: " + clasificacion);
                System.out.println("pagar: " + a_pagar);
                break;
                 
            }
            case "adulto":{
                int costoBoleto = 50;
                double descuento = 25/100;
                double a_pagar;
                a_pagar = (double) costoBoleto + descuento;
                System.out.println("clasificacion: " + clasificacion);
                System.out.println("pagar: " + a_pagar);
                break;
                 
            }
    }
 }
}
