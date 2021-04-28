
/**
 * Write a description of class Caida here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Caida
{
    public static void main(String args[])
    {
       final double a = 9.78;
       int tiempo; // variable contador
       double distancia;
       
       // comenzar el cielo
       for (tiempo = 1; tiempo<=5; tiempo = tiempo + 1){
           distancia = 0.5 * a * tiempo * tiempo; 
           System.out.println("La distancia recorrida despues de" + tiempo + " segundos es:" + distancia);
       }
       System.out.println("Fin");
    }
}
