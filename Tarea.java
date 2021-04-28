import java.util.Scanner;
/**
 * Write a description of class Tarea here.
 * 
 * @author (merveilles ntumba) 
 * @version (2020)
 */
public class Tarea
{
    public static void main(String arg[]) {
        float moneda;
        float tasadeCambio;
        float cambio;
        System.out.print('\u000c');
        Scanner sc = new Scanner(System.in);
        System.out.print("ingresa un valor de 1 a 99 centavos");
    
        moneda = sc.nextFloat();
        tasadeCambio = 0.046F;
        cambio = moneda * tasadeCambio;
        
        System.out.print(" Su cambio es = " + cambio);
    }
    
}
