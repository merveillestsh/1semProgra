import java.util.Scanner;
/**
 * Write a description of class Conversion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Conversion
{
   
    public static void main(String[] arg){
        System.out.print('\u000c');
        Scanner sc = new Scanner(System.in);
        System.out.println("Celsius ==> Fahrenheit, Escribe 1");
        System.out.println("Fahrenheit ==> celsius, Escribe 2");
        System.out.println("Celsius ==> Kelvin, Escribe 3");
        System.out.println("Kelvin ==> celsius, Escribe 4");
        System.out.println("Fahrenheit ==> kelvin, Escribe 5");
        System.out.println("kelvin ==> Fahrenheit, Escribe 6");
        int opcion = sc.nextInt();
        System.out.println("ingresa la temperatura");
        double temperatura = sc.nextDouble();
        double nuevaTemp;
        
        
        switch (opcion){
            case 1: 
            {
                nuevaTemp = (temperatura * (9/5)) + 32;
                System.out.println(temperatura + "°C ="+ nuevaTemp +" °F");
                break;
            }
            case 2: 
            {
                nuevaTemp = (temperatura - 32) * (5/9) ;
                System.out.println(temperatura + "°F ="+ nuevaTemp +" °C");
                break;
            }
            case 3: 
            {
                nuevaTemp = temperatura + 273 ;
                System.out.println(temperatura + "°C ="+ nuevaTemp +" °K");
                break;
            }
            case 4: 
            {
                nuevaTemp = temperatura - 273 ;
                System.out.println(temperatura + "°K ="+ nuevaTemp +" °C");
                break;
            }
            case 5: 
            {
                nuevaTemp = ((temperatura - 32) * (5/9)) + 273 ;
                System.out.println(temperatura + "°F ="+ nuevaTemp +" °K");
                break;
            }
            case 6: 
            {
                nuevaTemp =  ((temperatura - 273) * (9/5)) + 32 ;
                System.out.println(temperatura + "°K ="+ nuevaTemp +" °F");
                break;
            }
            default:
                System.out.println("Revisa el menu");
                break;
        }
    }
    
}
