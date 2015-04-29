import java.util.Scanner;
import java.util.Random;

/**
 * This is a class set up to ask the user to give a guess between 1 and 10. 
 * If the guess is correct the user will receive a congratulation message. The user
 * only will only be allowed three guesses and if at the end of the three guesses
 * the answer hasn't been guessed a you lost message will appear.
 * 
 * @author Samuel Lowry
 * @version .1
 */
public class GuessingGame
{
       private int[] guesses;
       private int guess;
       private int answer;
       Scanner input = new Scanner(System.in);
       Random rand = new Random();
       private boolean found;
       
       public GuessingGame()
       { 
           guesses = new int[3];
           answer = rand.nextInt(10);
           found = false;
       }
       
       public void getGuess()
       {
           
           
           for(int number = 0; number < guesses.length; number++)
           {
               System.out.println("Enter your guessed number between 0 - 10: ");
               guess = input.nextInt();
               guesses[number] = guess;
               
               if(guesses[number] == answer)
               {
                   found = true;
                   System.out.println("Congratulations!! you guessed correctly!");
                   System.out.println("The answer was: " + answer);
                   break;
               }
           }
           if(!found)
           {
               System.out.println("Sorry. you didn't guess the correct number.");
               System.out.println("Try again? Enter Y or N: ");
               
           }
           
       }
           

}
    





