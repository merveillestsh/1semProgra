import java.util.Scanner;
/**
 * Write a description of class fuerza here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fuerza
{
    public static void main(String arg[]){
       final double gravitacion_universal = 6.673e-8;
       double masa1, masa2, distancia, fuerza;
       System.out.print('\u000c');
       Scanner sc = new Scanner(System.in);
       System.out.print("capturar las valores de las masas y de la distancia entre ellas");
       masa1 = sc.nextDouble();
       masa2 = sc.nextDouble();
       distancia = sc.nextDouble();
  
       fuerza = (gravitacion_universal * masa1 * masa2) / (distancia * distancia);
       System.out.println("la fueza de atraccion de masa1= " + masa1);
       System.out.print(" y de una masa2= " + masa2);
       System.out.print(" con una distancia de " + distancia);
       System.out.println(" es de " + fuerza + " dinas");
       
    }
}
