
/**
 * Write a description of class Automobil here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Automovil
{
    // instance variables - replace the example below with your own
   int cap_pasajeros;
   int cap_combustible;
   int kmpl;
   /**
    * Constructor for objects of class Automobil
   */
   public Automovil(int cp, int cc, int k)
    {
        // initialise instance variables
        cap_pasajeros = cp;
        cap_combustible = cc;
        kmpl = k;
   }
   int km_recorridos_con_tanque_lleno(){
       return kmpl * cap_combustible;
    }
   double calcular_gasolina_necesaria_por_recorrido(int cantKm){
       return (double) cantKm / kmpl;
    }
}
