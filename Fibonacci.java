import java.util.Scanner;
/**
 * Write a description of class Fibonacci here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fibonacci
{
    public static void main(String args[]){
        System.out.print('\u000c');
        int n; /* numero de serie */
        int anterior, nuevo; /* para calcular la serie*/
        int temp; /* almacena temporal de los resultados*/
        int i; /* control del ciclo*/
        Scanner sc = new Scanner(System.in);
        System.out.println("numero de terminos");
        n = sc.nextInt();
        anterior = 0;
        nuevo = 1;
        System.out.println("la serie de fibonacci" + n + " es: " + anterior + "--" + nuevo);
        for (i = 1; i <= n-2; i++){
          temp = anterior + nuevo;
          anterior = nuevo;
          nuevo = temp;
          System.out.println("==>" + nuevo);
        }
    }
}
