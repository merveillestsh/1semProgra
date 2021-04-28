import java.util.Scanner;
/**
 * hacer un programa para calcular el tiempo que toma a un a poblacion de insectos.
 * llenar un casa desde el piso hasta el techo
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bichos
{
    public static final double TASA_CRECIMIENTO = 0.95;// 95% por semana
    public static final double VOLUMEN_POR_BICHO = 0.002;// pies cubicos
    
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print('\u000c');
        System.out.println("volumen de la casa en pies cubicos: ");
        double volumen_casa = sc.nextDouble();
        
        System.out.println("numero estimado de insectos en la casa: ");
        int poblacionInicial = sc.nextInt();
        int contSemana = 0;
        double poblacion = poblacionInicial;
        double volumen_total_de_bichos = poblacion * VOLUMEN_POR_BICHO;
        double nuevosBichos, nuevo_volumen_bichos;
        
        while (volumen_total_de_bichos < volumen_casa){
            nuevosBichos = poblacion * TASA_CRECIMIENTO;
            nuevo_volumen_bichos = nuevosBichos * VOLUMEN_POR_BICHO;
            poblacion = poblacion + nuevosBichos;
            contSemana++;
        }
        System.out.println("iniciando con una poblacion de bichos de: " +poblacionInicial);
        System.out.println("volumen para una casa de "+ volumen_casa + " pies cubicos");
        System.out.println("despues de "+ contSemana + " semanas");
        System.out.println("la casa se lleno con "+ (int)poblacion + " bichos");
        System.out.println("llenaron un volumen de "+ (int)volumen_total_de_bichos + " pies cubicos");
        
    }
}
