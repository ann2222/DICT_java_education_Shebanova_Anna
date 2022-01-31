package CoffeeMachine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        int water = 400;
        int milk = 540;
        int beans = 120;
        int cups = 9;
        int money = 550;
        while (true) {
            Scanner userInput = new Scanner(System.in);
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String action = userInput.nextLine();
            if (action.equals("buy")) {
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino 'back' -" +
                        " back to main menu:");
                String choice = userInput.nextLine();
                if (choice.equals("1")) {
                    if (water - 250 < 0) {
                        System.out.println("Sorry, not enough water");
                    } else if (beans - 16 < 0) {
                        System.out.println("Sorry, not enough beans");
                    } else if (cups - 1 < 0) {
                        System.out.println("Sorry, not enough cups");
                    } else {
                        water = water - 250;
                        beans = beans - 16;
                        cups = cups - 1;
                        money = money + 4;
                    }
                } else if (choice.equals("2")) {
                    if (water - 350 < 0) {
                        System.out.println("Sorry, not enough water");
                    } else if (milk - 75 < 0) {
                        System.out.println("Sorry, not enough milk");
                    } else if (beans - 20 < 0) {
                        System.out.println("Sorry, not enough beans");
                    } else if (cups - 1 < 0) {
                        System.out.println("Sorry, not enough cups");
                    } else {
                        water = water - 350;
                        beans = beans - 20;
                        milk = milk - 75;
                        cups = cups - 1;
                        money = money + 7;
                    }
                } else if (choice.equals("3")) {
                    if (water - 200 < 0) {
                        System.out.println("Sorry, not enough water");
                    } else if (milk - 100 < 0) {
                        System.out.println("Sorry, not enough milk");
                    } else if (beans - 12 < 0) {
                        System.out.println("Sorry, not enough beans");
                    } else if (cups - 1 < 0) {
                        System.out.println("Sorry, not enough cups");
                    } else {
                        water = water - 200;
                        beans = beans - 12;
                        milk = milk - 100;
                        cups = cups - 1;
                        money = money + 6;
                    }
                } else if (choice.equals("back")) {
                    ;
                }

            } else if (action.equals("fill")) {
                System.out.println("Write how many ml of water you want to add:");
                int waterAdd = Integer.parseInt(userInput.nextLine());
                System.out.println("Write how many ml of milk you want to add:");
                int milkAdd = Integer.parseInt(userInput.nextLine());
                System.out.println("Write how many ml of beans you want to add:");
                int beansAdd = Integer.parseInt(userInput.nextLine());
                System.out.println("Write how many ml of beans you cups to add:");
                int cupsAdd = Integer.parseInt(userInput.nextLine());
                water = water + waterAdd;
                milk = milk + milkAdd;
                beans = beans + beansAdd;
                cups = cups + cupsAdd;
            } else if (action.equals("take")) {
                System.out.printf("I give you %d money\n", money);
                money = 0;
            } else if (action.equals("remaining")) {
                System.out.printf("The coffee machine has:\n" +
                        "%d of water\n" +
                        "%d of milk\n" +
                        "%d of coffee beans\n" +
                        "%d of disposable cups\n" +
                        "%d of money\n", water, milk, beans, cups, money);
            } else if (action.equals("exit")) {
                break;
            }
        }
    }
}