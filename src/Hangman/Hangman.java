package Hangman;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        String word = "java";
        System.out.println("HANGMAN");
        System.out.println("Guess the word:");
        Scanner user_input = new Scanner(System.in);
        String answer = user_input.nextLine();
        if (answer.equals(word)) {
            System.out.println("You survived!");
        }
        else {
            System.out.println("You lost");
        }

    }
}