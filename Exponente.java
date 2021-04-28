import java.util.Scanner;
/**
 * Write a description of class exponente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Exponente
{
    public static void main()
    {
       final int num_interaciones = 15;
       int i;
       Scanner sc = new Scanner(System.in);
       System.out.print('\u000c');
       double e, f_e;
       for (i = 1; i <= num_interaciones; i++)
    {
          f_e = Math.exp(2 * e) - e;
          System.out.println("Exp (" + e + ") =" + f_e);
       }
       System.out.println("ciclo terminado");
    }
    
}
