import java.util.Scanner;
/**
 * Write a description of class Tabla here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TablaMultiplicar
{
   public static void main ()
   {
       int i;
       int tabla;
       System.out.print('\u000c');
       System.out.println("tabla= ");
       Scanner sc = new Scanner(System.in);
       tabla = sc.nextInt();
       
       
        for(i=1; i<=20; i++ )
       {
           int resultado;
           resultado = tabla * i;
           System.out.println(tabla +" x "+ i + " = " + resultado);
       }
       System.out.println("bandera = roja");
   }
}
