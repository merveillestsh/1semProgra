import java.util.Scanner;
/**
 * Write a description of class empleado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Empleado
{
    public String nombre;
    public double sueldo;
    public void initializar_datos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre del empleado: ");
        nombre = sc.nextLine();
        System.out.println("Sueldo del empleado: ");
        sueldo = sc.nextDouble();
         }
    public void pagar_impuestos(){
         if (sueldo > 3000.00){
             System.out.println("Pagar impuestos");
            }
         else{
             System.out.println("No tiene impuesto");
            }   
    }
    
}

