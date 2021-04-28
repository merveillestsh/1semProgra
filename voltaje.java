import java.util.Scanner;
/**
 * Write a description of class voltaje here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class voltaje
{
   public static double multiplicar(double i, double r){
        return i * r;
    }
    public static double dividir(double v, double r){
        return v / r;
    }
    public static void main(String[]arg){
        
        Scanner sc = new Scanner(System.in);
        System.out.println(" Elija una opcion del menu: ");
        System.out.println("A: hallar el voltaje(V) ");
        System.out.println("B: hallar la coriente(I) ");
        System.out.println("C: hallar la resistencia(R) ");
        double resultadoV, resultadoI, resultadoR;
        resultadoV = multiplicar(200,54);
        resultadoI = dividir(resultadoV,54);
        resultadoR = dividir(resultadoV,resultadoI);
        String formula;
        formula = sc.nextLine();
        
        switch (formula){
            case "A":{
            System.out.println(" I= 200 mA ,R= 54 ");
            System.out.println("V=I*R");
            resultadoV = multiplicar(200,54);
            System.out.println(" V= " + resultadoV);
            break;
        }
        case "B":{
            System.out.println("R= 54 ");
            System.out.println("I=V/R");
            System.out.println(" I= " + resultadoI);
            break;
        }
        case "C":{
            System.out.println("v=10,800, I= 200");
            System.out.println("R=V/I");
            System.out.println(" R= " + resultadoR);
            break;
        }
        default:
               System.out.println("ERROR ");
    }
   }
}
