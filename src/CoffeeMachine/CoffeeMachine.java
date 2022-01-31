package CoffeeMachine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        System.out.println("Write how many cups of coffee you will need:");
        Scanner userInput = new Scanner(System.in);
        int cofeeCups = Integer.parseInt(userInput.nextLine());
        System.out.printf("For %d cups of coffee you will need:\n%d ml of water\n%d ml of milk\n%d g of coffee beans",
                cofeeCups, cofeeCups * 200, cofeeCups * 50, cofeeCups * 15);
    }
}