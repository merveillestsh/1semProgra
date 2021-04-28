import java.util.Scanner;
/**
 * Write a description of class voltajeE here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class voltajeE
{
    public static void main(String[]arg){
        
        Scanner sc = new Scanner(System.in);
        int I, V, R;
        System.out.println(" Elija una opcion del menu: ");
        System.out.println("A: hallar el voltaje(V) ");
        System.out.println("B: hallar la coriente(I) ");
        System.out.println("C: hallar la resistencia(R) ");
        String formula;
        formula = sc.nextLine();
        switch (formula){
        case "A":{
            System.out.println("V= I*R");
            break;
        }
        case "B":{
            System.out.println("I= V/R");
            break;
        }
        case "C":{
            System.out.println("R= V/I");
            break;
        }
        default:
            System.out.println("ERROR ");
        }
    }
    
}
