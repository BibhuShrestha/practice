import java.util.*;

public class Guess {
    public static void guessedCorrectly(){

        Scanner sc = new Scanner(System.in);

        int number = 1 + (int)(100+Math.random());

        int attempts = 0;

        int k = 5;

        boolean guessedCorrectly = false;

        System.out.println("A number is choosen between 1 to 100");
        System.out.println("You have" + k + "attempts per round to guess the correct number.");

        while(!guessedCorrectly) {
            for(int i = 0; i < k; i++) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();
                attempts++;

                if(guess == number) {
                    System.out.println("Congratulations! you guessed the correct number in" + attempts + "attempts");
                    guessedCorrectly = true;
                    break;
                    
                }
                else if (guess < number) {
                    System.out.println("The numbeis grater then: " + guess);
                }
                else{
                    System.out.println("The number is less than" + guess);

                }
            }
            if (!guessedCorrectly) {
                System.out.println("You have used all " + k +"sttempts");
                System.out.println("DO you want to continue guessing> (Yes/no): ");
                String response = sc.next();

                if (!response.equalsIgnoreCase("yes")){
                    System.out.println("Game over! the correct number was:"+ number);
                    break;
                }
            }
        }
        sc.close();
    }
    public static void main(String[] args)
    { 
    guessedCorrectly();
    }
}
