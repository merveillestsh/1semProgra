import java.util.Scanner;
/**
 * Write a description of class area here.
 * 
 * @author (merveilles) 
 * @version (a version number or a date)
 */
public class area1
{
   public static void main(String arg[]){
       double radio, altura, volumen, areaLateral;
       final double pi = 3.141592;
       Scanner sc = new Scanner(System.in);
       System.out.print('\u000c');
       System.out.print("Ingresa las valores" + " radio =");
       System.out.println("  Ingresa las valores" + " altura =");
       radio = sc.nextDouble();
       altura = sc.nextDouble();
       areaLateral = 2 * pi * radio * altura;
       volumen = pi * (radio * radio) * altura;
       System.out.println("volumen =" + volumen);
       System.out.println("areaLateral =" + areaLateral);
    }
}
