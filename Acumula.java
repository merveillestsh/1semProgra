import java.util.Scanner;
/**
 * Write a description of class sasde here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Acumula
{
  // acumuladores 
  public static void main(String args[]){
      int numAlumnos;
      double tarea1, tarea2, tarea3;
      double promedio;
      int i;
      Scanner sc = new Scanner(System.in);
      System.out.print('\u000c');
      System.out.println("capture el num de alumnos :");
      numAlumnos = sc.nextInt();
      i = 1;
      while (i<=numAlumnos){
          System.out.println("alumno no. " + i);
          System.out.println("capture la calificacion tarea1:");
          tarea1 = sc.nextDouble();
          System.out.println("capture la calificacion tarea2 :");
          tarea2 = sc.nextDouble();
          System.out.println("capture la calificacion tarea3 :");
          tarea3 = sc.nextDouble();
          
          if ((tarea1 >= 0.0 && tarea1 <= 10.0) && (tarea2 >= 0.0 && tarea2 <= 10.0) && (tarea3 >= 0.0 && tarea3 <= 10.0)){
              promedio = (tarea1 * 20) + (tarea2 * 35) + (tarea3 * 45);
              System.out.println("Alumno: " + 1 + " Promedio = " + promedio);
            }
          else{
              System.out.println("una o mas tareas presentan calificaciones no validas");
           }
          i++;
        }
  }
}
