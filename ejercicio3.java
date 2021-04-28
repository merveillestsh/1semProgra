
/**
 * Write a description of class ejercicio3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ejercicio3
{
    public static void main(String arg[]){
        int day, month, year;
        day = 30;
        month = 8;
        year = 7;
        
        System.out.println( day + "/" +month + "/" + year);
        if(!(day >= 1 && day <= 30) &&  ( month >= 1 && month <= 12 ) && (year > 0)){
            System.out.println("la fecha es incorecta");
        }else {
            System.out.println("la fecha es corecta");
            if((day >= 1 && day <= 30) && (month == 1)){
              System.out.println(month + "es ");  
            }
        }
    }
    
}
