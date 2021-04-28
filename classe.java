import java.util.Scanner;
/**
 * Write a description of class cat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class classe
{
    public static void main(String[]arg){
       System.out.print('\u000c');// borrar la pantalla
       double calificacion;// variables
       int opcion;// crear variable
       Scanner sc = new Scanner(System.in);// metodo
       System.out.println("calificacion:  ");// atribuar valor
       opcion = 1;// valor
       calificacion = 0;// inicializando
       switch (opcion){// switch cuando hay muchas opciones
           case 1:
           if (calificacion >= 0 || calificacion <= 5){
               System.out.println(+ calificacion + ": insuficiente");
            }
            case 2:
           if (calificacion == 6){
               System.out.println(+ calificacion + ": suficiente");
            }
            case 3:
           if (calificacion == 7){
               System.out.println(+ calificacion + ": regular");
            }
            case 4:
           if (calificacion == 8){
               System.out.println(+ calificacion + ": regular");
               
            }
            case 5:
           if (calificacion == 9){
               System.out.println(+ calificacion + ": notable");
            }
            case 6:
           if (calificacion == 10){
               System.out.println(+ calificacion + ": sobresaliente");
            }
            default: {
                
            }
        }
    }
}
