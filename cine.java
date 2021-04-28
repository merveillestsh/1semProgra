import java.util.Scanner; 
/**
 * Write a description of class cine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cine
{
    public static void main(String[] agg){
        System.out.print('\u000c');
        Scanner sc= new Scanner(System.in);
        int edad, tarifa, opcion;
        System.out.println("Tarifa:");
        tarifa = sc.nextInt();
        System.out.println("Edad: ");
        edad = sc.nextInt();
        System.out.println("opciones de menu: ");
        System.out.println("1: menor de 5 años  ");
        System.out.println("2: De 5 a 12 años ");
        System.out.println("3: De 13 a 54 años ");
        System.out.println("Opción: ");
        edad = sc.nextInt();
        
        
        
        
        switch (edad){
            case 1:
                 if (edad < 5 || edad >= 55 )
                  System.out.println("Para usted es gratis");
                 break;
            case 2:
                 if (edad >= 5 || edad <= 12)
                  System.out.println("paga la mitad del tarifa");
                 break;
            case 3:
                 if (edad >= 13 || edad <= 54)
                  System.out.println("paga la totalidad");
                 break;
            default: 
                    if (edad < 0)
                        System.out.println(" fin del programa");
                    break; 
        }
    }
}

