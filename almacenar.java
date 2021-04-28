import java.util.Scanner;
/**
 * Write a description of class almacenar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class almacenar
{
    public static void main(){
        double valor;
        System.out.print('\u000c');
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresa un valor");
        valor = sc.nextDouble();
        if (valor>=0 && valor<=999){
            
        }else{
            System.out.println("erro-ingresa otro valor");
        }
    }
}
