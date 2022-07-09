package challengeQuestions;

import java.util.Scanner;
import java.util.Random;

public class ReverseGuessingGame {
    public static void main(String[] args) {
        guessGame(chooseNumber());
    }

    public static void guessGame(int n) {
        Random ran = new Random();
        int total_guesses = 0;

        Scanner scg = new Scanner(System.in);

        while(true) {
            int r = ran.nextInt(10) + 1;
            total_guesses += 1;

            System.out.println("Is it " + Integer.toString(r) + "? (y/n)");

            String s = scg.nextLine();

            if(s.equals("y")) {
                System.out.println("I got your number " + Integer.toString(r) + " in " + Integer.toString(total_guesses) + " tries");
                break;
            }




        }
    }


    public static int chooseNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert number you want the computer to guess");
        int n = sc.nextInt();
        return n;
    }
}
