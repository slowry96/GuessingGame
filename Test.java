import java.util.Random;

public class Test 
{
   public static void main(String args[]) 
   {
        int x = 1;
        Random rand = new Random();
        
        while( x != 25)
        {
            System.out.print("x is: " + x);
            x = rand.nextInt(100);
            System.out.print("x is: " + x);
        }
   }
}   
