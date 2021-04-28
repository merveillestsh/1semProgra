
/**
 * Write a description of class sintaxis here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class sintaxis
{
    public static void main(String arg[]){
        int opcion;
        //opcion puede recibir los siguientes datos
        // 1- felicitacion
        // 2- asombro
        // 3- super asombro
        // 4y5- increible
        opcion = 2;
        switch (opcion){
            case 1:
                 System.out.println("Felicidades, vous vous etes enceinte");
                 break;
            case 2:
                 System.out.println("oh, ai faite il y en a 2");
                 break;
            case 3:
                 System.out.println("Felicidades, il y en a 3");
                 break;
            case 4:
            case 5: 
                 System.out.println("Increible' " + opcion + " bebes");
            default: 
                    if (opcion < 1)
                        System.out.println("lo siento, no hay embarazoooo");
                    else if (opcion > 5) 
                           System.out.println("Cherchez de l'argent");
                    break; 
        }
    }
}
