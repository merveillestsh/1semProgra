import java.util.Scanner;
/**
 * Write a description of class cat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cat
{
    public static void main(String[]arg){
       System.out.print('\u000c');// borrar la pantalla
       int variableX;// variables
       int opcion;// crear variable
       Scanner sc = new Scanner(System.in);// metodo
       System.out.println(" x=  ");// atribuar valor
       opcion = 1;// valor
        variableX= 0;// inicializando
       switch (opcion){// switch cuando hay muchas opciones
           case 1:
           if (variableX > 0){
               System.out.println("CAT = (A+B)(C+D)");
            }
            case 2:
           if (variableX == 0){
               System.out.println("CAT = (A+B)/(C+D)");
            }
            case 3:
           if (variableX < 0){
               System.out.println("CAT = A+B-C+D");
            }
           
            default: {
                
            }
        }
    }
}


