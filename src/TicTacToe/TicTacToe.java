package TicTacToe;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter cells:");
        String cells = userInput.nextLine();
        System.out.printf("---------\n" +"| %s |\n" +"| %s |\n" +"| %s |\n" +"---------", cells.substring(0, 3), cells.substring(3, 6), cells.substring(6, 9));
    }
}