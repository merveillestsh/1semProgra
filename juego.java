import java.util.Scanner;
public class juego
{
   public static void main(String[] arrr){
       System.out.print('\u000c'); 
       int bc, bf, cc, cf, d;
        int i=1;
        int [][] cuadricula = new int [9][9];
        System.out.print("");
        Scanner datos = new Scanner(System.in);
        int colum=0;
        int fil=0;
        do{
            System.out.println("Juego:" + i);
            do{
            bc= datos.nextInt();
                if (bc>=0){
                bf= datos.nextInt();
                cc= datos.nextInt();
                cf= datos.nextInt();
                d= datos.nextInt();
                colum= bc*3+cc;
                fil=bf*3+cf;
                cuadricula [colum][fil] = d;
            }else if (bc==-1 || bc==-2){
                imprimir(cuadricula);
                cuadricula= new int [9][9];
            }
            }while(bc != -1);
            i++;
        }while(bc != -2);
    }
    public static void imprimir(int[] [] cuadricula){
    for(int k=0; k<cuadricula.length; k++){
                for(int j=0; j<cuadricula[k].length; j++){
                    if(cuadricula[k][j]==0){
                        if(j==2 || j==5){
                            System.out.print("  | ");
                        }else{
                            System.out.print("  ");
                        }
                    }else{
                        if(j==2 || j==5){
                            System.out.print(cuadricula[k][j] + " | ");
                        }else{
                            System.out.print(cuadricula[k][j] + " ");
                        }
                    }
                }
                System.out.println();
                if(k==2  || k ==5){
                    System.out.println("__________________________");
                }
            }
    }
}
/*
0 0 0 0 9
0 0 2 0 4
0 0 1 1 5
0 0 0 2 2
1 0 1 0 8
1 0 2 0 7
1 0 0 2 3
2 0 2 0 1
2 0 0 1 6
2 0 1 1 8
2 0 2 2 9
0 1 1 0 3
0 1 2 0 6
0 1 0 2 5
0 1 2 2 7
1 1 0 0 1
1 1 2 0 5
1 1 2 1 9
1 1 0 2 4
2 1 0 0 2
2 1 2 0 4
2 1 1 1 7
2 1 1 2 3
2 1 2 2 8
0 2 0 1 4
0 2 2 1 9
0 2 1 2 1
0 2 2 2 5
1 2 0 1 6
1 2 2 2 2
2 2 2 0 5
2 2 1 1 1
2 2 1 2 6
2 2 2 2 3
-1
0 0 1 1 5
1 0 0 0 8
1 0 0 2 2
1 0 1 2 3
0 1 0 0 3
0 1 0 1 9
0 1 1 1 6
0 1 2 2 2
1 1 0 0 7
1 1 2 1 8
2 1 0 0 9
2 1 1 2 5
2 1 2 1 7
2 1 2 2 4
0 2 0 1 6
0 2 1 1 7
0 2 2 2 3
1 2 0 0 5
1 2 0 1 4
1 2 1 2 7
2 2 0 0 7
2 2 0 2 2
2 2 2 0 8
2 2 2 1 9
2 2 2 2 6
-2
 */