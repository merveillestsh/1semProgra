import java.util.Scanner;
/**
 * Write a description of class terreno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class area2
{
    public static void main(String arg[]){
       final float pi = 3.141592F;
       float radio, volumen, altura, area;
       System.out.print('\u000c');
       Scanner sc = new Scanner(System.in);
       System.out.print("ingresa los valores del radio y la altura");
       radio = sc.nextFloat();
       altura = sc.nextFloat();
       volumen = pi * radio * radio * altura;
       area = volumen + (2 * pi * radio * radio);
       System.out.println("volumen = " + volumen + " y area = " + area);
    }
    
}
