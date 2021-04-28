import java.util.Scanner;
/**
 * Write a description of class SValores here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SValores
{
    public static void main(String args[]){
        System.out.print('\u000c');
        int i;
        double num, suma;
        suma = 0;
        Scanner sc = new Scanner(System.in);
        for(i=1; i<=10; i++){
           num = sc.nextDouble();
           suma += num;
           
        }
        System.out.println("La suma = " + suma);
        
    }
}
