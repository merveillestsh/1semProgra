import java.util.Scanner;
/**
 * Write a description of class comparar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class comparar
{
    public static void main(){
        int valor1, valor2;
        System.out.print('\u000c');
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresa el primer valor : ");
        valor1 = sc.nextInt();
        System.out.println("ingresa el segundo valor : ");
        valor2 = sc.nextInt();
        if (valor1==valor2){
            System.out.print("los valores son iguales");
        }else{
        if (valor1>valor2){
            System.out.println(valor1 + "es mayor que " + valor2);
        }else{
              System.out.println(valor2 + " es mayor que " + valor1);
        }
       }
    }
}
