import java.util.Scanner;

public class Examen
{
    public void validarEdad(edad){
        int edad;
        edad = sc.nextInt();
        
        if (edad < 18){
            System.out.println("acceso negado");
        }
        else if (edad <= 18){
            System.out.println("acceso autorizado");
        }
    }
    public void main (String[] arg){
        Examen alumno = new Examen();
        alumno.validarEdad(); 
        
    }
}
