import java.util.Scanner;
/**
 * Write a description of class fecha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fechaA
{
    public static void main(){
        int day, month, year;
        System.out.print('\u000c');
        Scanner sc = new Scanner(System.in);
        System.out.print("ingresa el dia");
        day = sc.nextInt();
        System.out.print("ingresa el mes mm");
        month = sc.nextInt();
        System.out.print("ingresa el año");
        year = sc.nextInt();
        if( (day >= 1 && day <= 30) &&  ( month >= 1 && month <= 12 ) && (year > 0)  ){
            System.out.println("datos validos");
        }else {
            System.out.println("fecha no valida");
        }
        
    }
}

