
/**
 * Write a description of class Double here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Double
{
   public static void main(String[] args){
      Dog criollo = new Dog();
      criollo.name = "bunie";
      criollo.age = 1;
      criollo.breed = "criollo";
      criollo.size = 45.00;
      criollo.outputValues();
      int humanYears = criollo.getAgeInHumanYears();
      System.out.print("Bunie tiene" + humanYears + " en anos humans");
      
      Dog maltes = new Dog();
      maltes.name = "Benjie";
      maltes.breed = "Maltes";
      maltes.age = 8;
      maltes.size = 32.00;
      maltes.outputValues();
      humanYears = maltes.getAge
   }
}
