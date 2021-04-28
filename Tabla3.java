import java.util.Scanner;
/**
 * Write a description of class Tabla3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tabla3
{
    public static void main(String arg[]){
        System.out.print('\u000c');
        int i, num;
        System.out.println("Ingresa un valor del 1 al 10: ");
        Scanner sc= new Scanner(System.in);
        num = sc.nextInt();
        
        for(i=1; i<=12; i++){
            int resultado;
            resultado = num * i;
            System.out.println(resultado);
        }
    }
}
