import java.util.Scanner;
/**
 * Write a description of class clasificacion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class clasificacion
{
   public static void main(){
       double num;
       System.out.print("Ingresa un valor: ");
       Scanner sc = new Scanner(System.in);
       num = sc.nextDouble();
       
       if( num == 0){
           System.out.println( num + " es igaul a cero");
        }
        else{
              if( num > 0){
                  System.out.println( num + " es positivo ");
            }else{
                    System.out.println( num + " es negativo");
            }
        }
    }
}
