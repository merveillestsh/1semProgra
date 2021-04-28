
/**
 * Write a description of class calculadora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class calculadora
{
    public static double sumar(double val1, double val2){
        return val1+val2;
    }
    
    public static double restar(double val1, double val2){
        return val1 - val2;
    }
    
    public static double multiplicar(double val1, double val2){
        return val1 * val2;
    }
    
    public static double dividir(double val1, double val2){
        return val1 / val2;
    }
    public static void main(String arg[]){
        int operacion;
        System.out.println("opciones de menu: ");
        System.out.println("1: sumar ");
        System.out.println("2: restar ");
        System.out.println("3: multiplicar ");
        System.out.println("4: dividir");
        System.out.println("<1 o > 4: opcion incorrecta ");
        
        operacion = 3;
        switch (operacion){
            case 1:
            {
                double resultado = sumar(2,2);
                System.out.println("la suma es " + resultado);
                break;
            }
            case 2:
            {
                double resultado = restar(2,2);
                System.out.println("la resta es " + resultado);
                break;
            }
            case 3:
            {
                double resultado = multiplicar(2,2);
                System.out.println("el producto es " + resultado);
                break;
            }
            case 4:
            {
                double resultado = dividir(2,2);
                System.out.println("el quotiente es " + resultado);
                break;
            }
            default :
                System.out.println(" operacion incorrecta");
                break;
        }
            
    }
}
