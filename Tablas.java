
/**
 * Write a description of class Tablas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tablas
{
    public static void main(){ 
    int i, j;
    System.out.print('\u000c');
    for(i=1; i<=10; i++)//la tabla a multiplicar
    {
     System.out.println("la tabla de multiplicar del "+ i);
     for(j=1; j<=10; j++)//realisa las multipliaciones de cada tabla
      {
       int tabla;
       tabla= j * i;
       System.out.println(tabla);
     }
    }
    
    System.out.println("fin de ciclo for");
  }
}
