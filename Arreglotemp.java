import java.util.Scanner;
/**
 * Write a description of class Arreglo here.
 * crear un programa que calcule el promedio anual de las temperaturas de una localidad
 * los valores de la temperatura se almacenan como un numero intero
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arreglotemp
{
    private Scanner sc;
    private int[] temperaturas;
    private int promedio;
    public void llenarArreglo(){
        sc = new Scanner(System.in);
        temperaturas = new int[12];
        int i;
        for(i=0; i<temperaturas.length; i++){
            System.out.println("capturar la temperatura del mes: ");
            temperaturas[i]= sc.nextInt();
        }
    }
    
    public void temperaturaAnual(){
        int suma;
        suma = 0;
        
        promedio = 0;
        int i;
        for(i=0; i<temperaturas.length; i++){
        suma = suma + temperaturas[i];
        }
        promedio = suma / (i-1);
        System.out.println("la temperatura media anual es: "+ promedio);
    }
    
    public void estadisticasTemp(){
        int mayor = 0, menor = 0;
        int i;
        for(i=0; i<12; i++){
            if(temperaturas[i]>promedio){
                System.out.println("temperatura alta: "+ temperaturas[i]);
                mayor++;
            }else if(temperaturas[i]>promedio){
                System.out.println("temperatura baja: "+ temperaturas[i]);
                menor++;
            }
        }
        System.out.println("las temperaturas mayores a la temp anual"+ mayor);
        System.out.println("las temperaturas mayores a la temp anual"+ menor);
    }
    public static void main(String[] args){
    Arreglotemp tempLugar1 = new Arreglotemp();
    tempLugar1.llenarArreglo();
    tempLugar1.temperaturaAnual();
    tempLugar1.estadisticasTemp();
    }
}
