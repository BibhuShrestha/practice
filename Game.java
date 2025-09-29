import java.util.*;

public class Game {
    public static void guessingNumberGame(){
        Scanner sc = new Scanner(System.in);2
        

        int number = 1 + (int)(100*Math.random());

        int k = 5;

        System.out.println(" A number is choosen Between 1 to 100.");
        System.out.println("you have" + k + "attempts to guess the correct number.");

        for(int i=0; i<k; i++){
            System.out.print("ENter your guess:");
            int guess = sc.nextInt();

            if ( guess == number){
                System.out.println("Congratuation! you guessed the correct number.");
                sc.close();
            }
            else if (guess < number){
                System.out.println("The number is greater than" + guess);

            }
             else { 
                System.out.println("The number is less" + guess);
             }
        }
        System.out.println("You have exhausted all attempts. The correct number was: " + number);
        sc.close();
    }
    
    public static void main(String[] args)
    {
        guessingNumberGame();
    }
}