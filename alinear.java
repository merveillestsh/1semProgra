import java.util.Scanner;
/**
 * Write a description of class alinear here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class alinear
{
    public static void main(){
        int valor1, valor2, valor3;
        System.out.print('\u000c');
        Scanner sc = new Scanner(System.in);
        System.out.print("ingresa el primer valor : ");
        valor1 = sc.nextInt();
        System.out.print("ingresa el segundo valor : ");
        valor2 = sc.nextInt();
        System.out.print("ingresa el tercer valor : ");
        valor3 = sc.nextInt();
        if (valor1>valor2>valor3){
            System.out.println(valor1 + valor2 + valor3);
        }else{}
        if (valor2>valor3>valor1){
            System.out.println(valor2 + valor3 + valor1);
        }else{}
        if (valor3>valor1>valor2){
            System.out.print(valor3 + valor1 + valor2);
        }else{}
    }
}
