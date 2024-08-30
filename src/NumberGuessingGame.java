import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        //create a random object to generate a random number
        Random random = new Random();
        int numbertoguess = random.nextInt(101);
        int numberTries=0;
        Scanner input = new Scanner(System.in);
        int guess;
        boolean win = false;
        System.out.println("****Welcome to Number Guessing Game****");
        System.out.println("I have already selected a number between 1 and 100 \n Try to guess it");

        while (!win){
            System.out.println("Enter your guess");
            guess =input.nextInt();
            numberTries++;
            if(guess<1 || guess>100){
                System.out.println("Please enter number between 1 and 100");
            } else if(guess < numbertoguess){
                System.out.println("Your guess is too low");
            }else if(guess> numbertoguess){
                System.out.println("Your guess is to high");
            }else{
                System.out.println("Congratulations! You got it\n It took"+ " " +numberTries + " " + "tries" );

            }
            }
input.close();
        }

    }

