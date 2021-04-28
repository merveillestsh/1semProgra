
/**
 * Write a description of class Autodemo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AutoDemo
{
    // instance variables - replace the example below with your own
   public static void main(String args[]){
       Automovil minivan = new Automovil(7, 60, 16);
       Automovil deportivo = new Automovil(2, 50, 5);
       Automovil sedan = new Automovil(5, 45, 4);
       System.out.print('\u000c');
       double litros;
       int distancia = 252;
       
       litros = minivan.calcular_gasolina_necesaria_por_recorrido(distancia);
       System.out.println("Para recorrer " + distancia + "Kms una minivan necesita " + litros +" litros de combustible");
       System.out.println(minivan.cap_pasajeros + ", " + minivan.cap_combustible + ", " + minivan.kmpl);
       
       litros = deportivo.calcular_gasolina_necesaria_por_recorrido(distancia);
       System.out.println("Para recorrer " + distancia + "Kms un carro deportivo necesita " + litros +" litros de combustible");
       System.out.println(deportivo.cap_pasajeros + ", " + deportivo.cap_combustible + ", " + deportivo.kmpl);
       
       litros = sedan.calcular_gasolina_necesaria_por_recorrido(distancia);
       System.out.println("Para recorrer " + distancia + "Kms un sedan necesita " + litros +" litros de combustible");
       System.out.println(sedan.cap_pasajeros + ", " + sedan.cap_combustible + ", " + sedan.kmpl);
       
       
    }
}
