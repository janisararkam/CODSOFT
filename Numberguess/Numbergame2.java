import java.util.*;
import java.util.Random;
public class Numbergame2
{
    public static void main(String[] args) 
    {
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        boolean playAgain=true;
        while(playAgain)
        {
            int attempts=0;
            int randomNumber=random.nextInt(100)+1;
            boolean guessedCorrectly=false;
            System.out.println("Welcome in guessing the number game!");
            System.out.println("I have chosen a number in between range of 1 to 100 can you guess it ? ");
            while(!guessedCorrectly && attempts<10)
            {
                System.out.println("Enter your guess (1-100):");
                int guess=scanner.nextInt();
                attempts++;
                if(guess==randomNumber)
                {
                    guessedCorrectly=true;
                    System.out.println("!! Hurray Congratulations!! you have guessed the correct number in "+attempts+ "attempts");

                }
                else if(guess<randomNumber)
                {
                    System.out.println("your guessing is too low! Please try again");
            }
            else 
            {
                System.out.println("your guessing is too high! Please try again");

            }
        }
           if(!guessedCorrectly)
           {
            System.out.println("sorry you have run out of attempts the correct number was"+randomNumber);
            
           }
           System.out.print("Do you want to play again? (yes/no):");
           String playchoice =scanner.next();
           playAgain=playchoice.equalsIgnoreCase("yes");
        }
        System.out.println("Thanks for playing guessing the number game!");
            scanner.close();
}
 }
