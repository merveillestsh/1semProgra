import java.util.Scanner;
/**
 * Write a description of class nota here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class nota
{
    public static void main(String arg[]){
        double nota;
        System.out.print('\u000c');
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresa su calificacion : ");
        nota = sc.nextDouble();
        if (nota<=50){
            System.out.println("Muy deficiente-baja definitiva");
        }else{
              
        }
        if (nota<=60){
            System.out.println("Insuficiente-repetir curso");
        }else{}
        if (nota<=69){
            System.out.println("Extraordinario");
        }else{}
        if (nota<=74){
            System.out.println("Suficiente");
        }else{}
        if (nota<=79){
            System.out.println("regular");
        }else{}
        if (nota<=89){
            System.out.println("Bien");
        }else{}
        if (nota<=95){
            System.out.println("notable");
        }else{}
        if (nota<=100){
            System.out.println("Sobresaliente");
        }else{}
    }
}
