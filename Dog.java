
/**
 * Write a description of class dog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dog
{
    public String name;
    public String breed;
    public int age;
    public double size;
    
    public void outputValues()
    {
        System.out.println("Name " + name);
        System.out.println("Breed " + breed);
        System.out.println("Size " + size);
    }
    
    public int getAgeInHumanYears();
    {
        int humanAge = 0;
        if (age<=2){
            humanage = age * 11;
        }
        else {
            humanAge = 22 + ((age - 2 )* 5);
        }
        return humanAge;
    }
}
