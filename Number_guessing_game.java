import java.util.*;
import java.util.random.*;

class Number_guessing_game{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rm = new Random();
        boolean playagain = true;

        while(playagain)
        {
            int guess = 0;
            int attempts = 0;
            int target_num = rm.nextInt(200);
            System.out.println("Guess the number between 1 and 200!");

            while (guess != target_num)
            {
                System.out.println("Enter your guess:- ");

                try 
                {
                    guess = Integer.parseInt(sc.nextLine());
                    attempts++;

                    if (guess < target_num)
                        System.out.println("Too Low! Try Again!");
                    else if (guess > target_num)
                        System.out.println("Too High! Try Again!");
                    else
                        System.out.println("Congratulations! You guessed it right!");
                }
                catch (NumberFormatException n)
                {
                    System.out.println("Invalid input! Please Enter a number.");
                }
            }
        }
        System.out.println("Do you want to play again? (YES/NO): ");
        playagain = sc.nextLine().equalsIgnoreCase("YES");

        System.out.println("Thank you for playing!");
        sc.close();
    }
}