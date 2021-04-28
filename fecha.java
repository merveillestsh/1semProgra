import java.util.Scanner;
/**
 * Write a description of class fecha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fecha
{
    public static void main(){
        int dia, mes, year;
        System.out.print('\u000c');
        Scanner sc = new Scanner(System.in);
        System.out.print("ingresa el dia");
        dia = sc.nextInt();
        System.out.print("ingresa el mes mm");
        mes = sc.nextInt();
        System.out.print("ingresa el año");
        year = sc.nextInt();
        if( (dia == 28 || dia == 30 || dia == 31) && ( mes >= 1 && mes <= 12 ) && (year > 0)  ){
            System.out.println("datos validos");
        }else {
            System.out.println("fecha no valida");
            
        }
        
    }
}
