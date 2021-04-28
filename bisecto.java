
/**
 * Write a description of class bisecto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bisecto
{
    public static boolean bisecto(int y){
     if (y % 400 == 0)
         return true;
      else if (y % 100 == 0)
           return false;
           else if (y % 4 == 0)
             return true;
               else 
                 return false;
     }

}
