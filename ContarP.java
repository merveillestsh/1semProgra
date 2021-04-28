import java.util.Scanner;
/**
 * contar las calificaationes aprobatorias de un grupo de alumnos y determinar el numero de aprobados y reprobados
 * asumiendo que la calif minima aprobatoria es 7.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ContarP
{
    public static void main(){
        int i, numAlumnos;
        int califi, calif1, calif2, calif3;
        int promedio;
        int aprobados = 0, reprobados = 0;
        i = 1;
        Scanner sc = new Scanner(System.in);
        numAlumnos = 3;
        while (i <= numAlumnos){
            System.out.println("Calificacion 1: ");
            calif1 = sc.nextInt();
            System.out.println("Calificacion 2: ");
            calif2 = sc.nextInt();
            System.out.println("Calificacion 3: ");
            calif3 = sc.nextInt();
            promedio = (calif1 + calif2 + calif3) / 3;
            if (promedio >= 7){
                aprobados = aprobados + 1;
            }
            else {
                reprobados = reprobados + 1;
            }
            i++;
            System.out.println("alumno: " + i + " promedio: " + promedio);
        }
    }
    System.out.println("Acreditados:" + aprobados);
    System.out.println("Acreditados:" + reprobados);
}
