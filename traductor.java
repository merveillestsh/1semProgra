import java.util.Scanner; 
/**
 * Write a description of class traductor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class traductor
{
   
    public static void main(String arg[]){
       int opcion;
       
       Scanner sc = new Scanner(System.in);
       String palabra = sc.nextLine();
       opcion = 1;
       
       switch (opcion){
           case 1:
           {    
                if ( palabra == "pan" )
                     System.out.println(palabra +" bread");
                  else if( palabra == " bread")
                       System.out.println(palabra +" = pan");
                break;      
           }
           case 2:
           {   
                if ( palabra == "carro" )
                     System.out.println(palabra +" = car");
                  else if( palabra == "car")
                       System.out.println(palabra +" = carro");
                break;      
           }
           case 3:
           {   
                if ( palabra == "perro" )
                     System.out.println(palabra +" = dog");
                  else if( palabra == "dog")
                       System.out.println(palabra +" = perro");
                break;      
           }
           case 4:
           {   
                if ( palabra == "agua" )
                     System.out.println(palabra +" = water");
                  else if( palabra == "water")
                       System.out.println(palabra +" = agua");
                break;      
           }
           case 5:
           {   
                if ( palabra == "padre" )
                     System.out.println(palabra +" = father");
                  else if( palabra == "father")
                       System.out.println(palabra +" = padre");
                break;      
           }
           case 6:
           {   
                if ( palabra == "madre" )
                     System.out.println(palabra +" = mother");
                  else if( palabra == "mother")
                       System.out.println(palabra +" = madre");
                break;      
           }
           case 7:
           {   
                if ( palabra == "hermano" )
                     System.out.println(palabra +" = brother");
                  else if( palabra == "brother")
                       System.out.println(palabra +" = hermano");
                break;
           }
           case 8:
           {   
                if ( palabra == "gato" )
                     System.out.println(palabra +" = cat");
                  else if( palabra == "cat")
                       System.out.println(palabra +" = gato");
                break;      
           }
           case 9:
           {   
                if ( palabra == "estudiar" )
                     System.out.println(palabra +" = study");
                  else if( palabra == "study")
                       System.out.println(palabra +" = estudiar");
                break;      
           }
           case 10:
           {   
                if ( palabra == "computadora" )
                     System.out.println(palabra +" = computer");
                  else if( palabra == "computer")
                       System.out.println(palabra +" = computadora");
                break;      
           }
           case 11:
           {   
                if ( palabra == "comida" )
                     System.out.println(palabra +" = food");
                  else if( palabra == "food")
                       System.out.println(palabra +" = comida");
                break;      
           }
           case 12:
           {   
                if ( palabra == "tiempo" )
                     System.out.println(palabra +" = time");
                  else if( palabra == "time")
                       System.out.println(palabra +" = tiempo");
                break;      
           }
           case 13:
           {   
                if ( palabra == "teléfono" )
                     System.out.println(palabra +" = phone");
                  else if( palabra == "phone")
                       System.out.println(palabra +" = teléfono");
                break;      
           }
           case 14:
           {   
                if ( palabra == "familia" )
                     System.out.println(palabra +" = family");
                  else if( palabra == "family")
                       System.out.println(palabra +" = familia");
                break;      
           }
           case 15:
           {   
                if ( palabra == "covid" )
                     System.out.println(palabra +" = covid");
                break;      
           }
           case 16:
           {   
                if ( palabra == "presidente" )
                     System.out.println(palabra +" = president");
                  else if( palabra == "president")
                       System.out.println(palabra +" = presidente");
                break;      
           }
           case 17:
           {   
                if ( palabra == "palabra" )
                     System.out.println(palabra +" = word");
                  else if( palabra == "word")
                       System.out.println(palabra +" = palabra");
                break;      
           }
           case 18:
           {   
                if ( palabra == "mundo" )
                     System.out.println(palabra +" = world");
                  else if( palabra == "world")
                       System.out.println(palabra +" = mundo");
                break;      
           }
           case 19:
           {   
                if ( palabra == "jugo" )
                     System.out.println(palabra +" = juice");
                  else if( palabra == "juice")
                       System.out.println(palabra +" = jugo");
                break;      
           }
           case 20:
           {   
                if ( palabra == "correr" )
                     System.out.println(palabra +" = run");
                  else if( palabra == "run")
                       System.out.println(palabra +" = correr");
                break;      
           }
           default:
                  System.out.println(" palabra no reconocida");
                break;
       }
    }
    
}
