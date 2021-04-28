import java.util.Scanner;
/**
 * Write a description of class operacion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class operacion
{
    public static void main(){
        double num1, num2, suma, resta, producto, div;
        short operacion;
        System.out.print('\u000c');
        Scanner sc = new Scanner(System.in);
        
        System.out.println("introduzca el primer numero : ");
        num1 = sc.nextDouble();
        System.out.println("introduzca el segundo numero : ");
        num2 = sc.nextDouble();
        System.out.println("cual operacion quiere realizar?(suma=1,resta=2,producto=3,div=4) : ");
        operacion = sc.nextShort();
        suma = num1 + num2;
        resta = num1 - num2;
        producto= num1 * num2;
        div = num1 / num2;
        
        if (operacion == 1){
            System.out.println( suma );
        }else{
              
        }
        if (operacion == 2){
            System.out.println( resta );
        }else{
              
        } 
        if (operacion == 3){
            System.out.println( producto );
        }else{
              
        }
        if (operacion == 4){
            System.out.println( div );
        }else{
              
        }
    }
}
