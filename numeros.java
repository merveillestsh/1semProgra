import java.util.Scanner;
/**
 * Write a description of class numeros here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class numeros
{
    public static void main(String[]arg){
        
        Scanner sc = new Scanner(System.in);
        int opcion;
        opcion = 0;
        System.out.println("Ingresa un numero de 1 a 10");
        int num;
        num = sc.nextInt();
        switch (opcion){
            case 1:{
                String letra;
                
                letra = "Uno";
                if (num == 1){
                System.out.println(num + " = " + letra);}
                break;
            }
            case 2:{
                String letra;
                letra = "Dos";
                if (num == 2){
                System.out.println(num + " = " + letra);}
                break;
            }
            case 3:{
                String letra;
                letra = "Tres";
                if (num == 3)
                System.out.println(num + " = " + letra);
                break;
           }
           case 4:{
                String letra;
                letra = "Cuatro";
                if (num == 4)
                System.out.println(num + " = " + letra);
                break;
            }
            case 5:{
                String letra;
                
                letra = "Cinco";
                System.out.println(num + " = " + letra);
                break;
            }
            case 6:{
                String letra;
                
                letra = "Seis";
                System.out.println(num + " = " + letra);
                break;
            }
            case 7:{
                String letra;
                
                letra = "Siete";
                System.out.println(num + " = " + letra);
                break;
            }
            case 8:{
                String letra;
                
                letra = "Ocho";
                System.out.println(num + " = " + letra);
                break;
            }
            case 9:{
                String letra;
                
                letra = "Nueve";
                System.out.println(num + " = " + letra);
                break;
            }
            case 10:{
                String letra;
                
                letra = "Diez";
                System.out.println(num + " = " + letra);
                break;
            }
            default :
  
                 
        }  
        if (num < 1 || num > 10 ){
            System.out.println("error");
            System.out.println("fin del programa");
        }
        
    }
}
