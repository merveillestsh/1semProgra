import java.util.Scanner;
import java.lang.Math.*;
/**
 * Write a description of class hipotenus here.
 * 
 * @author (merveilles) 
 * @version (a version number or a date)
 */
public class hipotenus
{
   public static void main(String arg[]){
       double cateo1, cateo2, hipotenus, angulo;
       final double pi = 3.141592;
       Scanner sc = new Scanner(System.in);
       System.out.print('\u000c');
       System.out.print("ingresa las valores cateo1 y cateo2  ");
       
       cateo1 = sc.nextDouble();
       cateo2 = sc.nextDouble();
       
       hipotenus = Math.sqrt(cateo1 * cateo1) + (cateo2 * cateo2);
       angulo = 180 / pi * Math.asin(cateo1 / hipotenus);
       
       System.out.println("angulo1 =" + angulo);
       System.out.println("angulo2 =" + (90 - angulo));
       
    }   
}
