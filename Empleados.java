
/**
 * Write a description of class Empleado1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Empleados
{
    public static void main(){
        Empleado empleado1 = new Empleado();
        Empleado empleado2;
        empleado2 = new Empleado();
        Empleado empleado3 = new Empleado();
        empleado1.initializar_datos();
        System.out.println(empleado1.nombre + "tiene un sueldo de " + empleado1.sueldo);
        
        System.out.print("y por lo percibido: ");
        empleado1.pagar_impuestos();
        empleado1.initializar_datos();
        System.out.println(empleado1.nombre + "tiene un sueldo de " + empleado1.sueldo);
        
        System.out.print("y por lo percibido: ");
        empleado1.pagar_impuestos();
    }
}
