import java.util.Scanner;
/**
 * Write a description of class Recibo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Recibo
{
    private Scanner sc;
    private String nombre_usuario;
    private String[] bimestre;
    private double[] consumo;
    private double[] costo_bimestral; 
    private double promedio = 0;
    public void llenarregistro(){
        sc = new Scanner(System.in);
        bimestre = new String[6];
        consumo = new double[6];
        costo_bimestral = new double[6];
        int i;
        System.out.print("nombre del usuario: ");
        nombre_usuario = sc.next();
        
        for (i=0; i<bimestre.length; i++){
            System.out.print("Bimestre actual: ");
            bimestre[i] = sc.next();
            System.out.println("consumo del bimestre");
            consumo[i] = sc.nextDouble();
            System.out.println("costo del bimestre");
            costo_bimestral[i] = sc.nextDouble();
        }
    }
    
    public void consumoPromedio(){
        System.out.println("El consumo promedio de el usuario" + nombre_usuario);
        int i;
        double consumo_bimestral = 0.0;
        for (i=0; i<consumo.length; i++){
            consumo_bimestral = consumo_bimestral + consumo[i];
        }
        System.out.println("i = "+ 1);
        promedio = consumo_bimestral / i;
        System.out.println("consumo promedio: "+ promedio);
        
    }
    
    public void imprimir_consumo_bimestral(){
        int i;
        for (i=0; i<bimestre.length; i++){
            System.out.print("Bimestre: "+ bimestre[i]);
            System.out.println("consumo: " + consumo[i]);
            System.out.println("costo: " + costo_bimestral[i]);
        }
    }
    public static void main(String[] args){
        Recibo recibo1 = new Recibo();
        recibo1.llenarregistro();
        recibo1.consumoPromedio();
        recibo1.imprimir_consumo_bimestral();
    }
}
