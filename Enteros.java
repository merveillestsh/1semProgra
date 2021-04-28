import java.util.Scanner;
/**
 * Pruebas proyecto integrador primer semestre. 
 */
public class Enteros
{
   public static void main(String args[]){
   int i, cantPos, cantNeg, cantMul, sumaPar;
   int num = 0;
   sumaPar = 0;
   cantMul = 0;
   Scanner sc = new Scanner(System.in);
   for(i=1; i<=10; i++){
       num = sc.nextInt();
       if(num/2 == 0){
           sumaPar += num;
           System.out.println("la suma es: " + sumaPar);
       }else {
       }
       if(num/15 == 0){
           cantMul++;
       }
       else if(num>0){
           cantPos++;
           System.out.println("hay" + cantPos + "positivos");
        }
        else{
            cantNeg++;
            System.out.println("hay" + cantNeg + "negativos");
        }
    }
  }
}
