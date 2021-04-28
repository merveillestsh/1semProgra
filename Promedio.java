import java.util.Scanner;
/**
 * Write a description of class Promedio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Promedio
{
    public static void main(String[] arg){
        System.out.print('\u000c');
        double edad_matutino, edad_vespertino;
        int estudiantes = 0;
        double sumaM1= 0;
        double sumaM2= 0;
        double sumaM3= 0;
        double promedioM1, promedioM2, promedioM3;
        double sumaV1= 0;
        double sumaV2= 0;
        double sumaV3= 0;
        double promedioV1, promedioV2, promedioV3;
        Scanner sc = new Scanner(System.in);
        edad_matutino = sc.nextDouble();
        edad_vespertino = sc.nextDouble();
        while (edad_matutino <= 60){
        
        System.out.println("ingresar edad turno matutino(primera ronda): ");
        sumaM1 = sumaM1 + edad_matutino;
        promedioM1 = + sumaM1/estudiantes;
        estudiantes++; 
        System.out.println("promedio (primera ronda): "+ promedioM1);
        edad_matutino++; 
        }
        while (edad_matutino <= 60){
        
        System.out.println("ingresar edad turno matutino(segunda ronda): ");
        sumaM2 = sumaM2 + edad_matutino;
        promedioM2 = + sumaM2/estudiantes;
        estudiantes++; 
        System.out.println("promedio (segunda ronda): " + promedioM2);
        edad_matutino++; 
        }
        while (edad_matutino <= 60){
        
        System.out.println("ingresar edad turno matutino(tercera ronda): ");
        sumaM3 = sumaM3 + edad_matutino;
        promedioM3 = sumaM3/estudiantes;
        estudiantes++; 
        System.out.println("promedio (primera ronda): "+ promedioM3);
        edad_matutino++; 
        }
         while (edad_vespertino <= 110){
        
        System.out.println("ingresar edad turno vespetino(primera ronda): ");
        sumaV1 = sumaV1 + edad_matutino;
        promedioV1 = sumaV1/estudiantes;
        estudiantes++; 
        System.out.println("promedio (primera ronda): "+ promedioV1);
        edad_vespertino++; 
        }
        while (edad_vespertino <= 110){
        
        System.out.println("ingresar edad turno vespertino(segunda ronda): ");
        sumaV2 = sumaV2 + edad_matutino;
        promedioV2 = sumaV2/estudiantes;
        estudiantes++; 
        System.out.println("promedio (segunda ronda): " + promedioV2);
        edad_vespertino++; 
        }
        while (edad_vespertino <= 110){
        
        System.out.println("ingresar edad turno VESPERTINO(tercera ronda): ");
        sumaV3 = sumaV3 + edad_matutino;
        promedioV3 = sumaV3/estudiantes;
        estudiantes++; 
        System.out.println("promedio (tercera ronda): "+ promedioV3);
        edad_vespertino++; 
        }
        if ((promedioM1 || promedioM2 || promedioM3) > (promedioV1 || promedioV2 || promedioV3)){
            System.out.println("el turno matutino tiene el promedio mas elevado");
        } else {
            System.out.println("el turno vespertino tiene el promedio mas elevado");
        }
    }
}
