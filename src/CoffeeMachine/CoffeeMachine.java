package CoffeeMachine;
import java.util.Scanner;


public class CoffeeMachine {
    int water = 400;
    int milk = 540;
    int beans = 120;
    int cups = 9;
    int money = 550;
    Scanner userInput = new Scanner(System.in);

    public void start () {
        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String choice = userInput.nextLine();
            if (choice.equals("buy")) {
                buy();
            } else if (choice.equals("fill")) {
                fill();
            } else if (choice.equals("remaining")) {
                remaining();
            } else if (choice.equals("take")) {
                take();
            } else if (choice.equals("exit")) {
                break;
            }
        }
    }

    public void remaining () {
        System.out.printf("The coffee machine has:\n" +
                "%d of water\n" +
                "%d of milk\n" +
                "%d of coffee beans\n" +
                "%d of disposable cups\n" +
                "%d of money\n", water, milk, beans, cups, money);
    }

    public void take () {
        System.out.printf("I give you %d money\n", money);
        money = 0;
    }

    public void fill () {
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
    }

    public void buy () {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino 'back' -" +
                " back to main menu:");
        String choice = userInput.nextLine();

        if (choice.equals("1")) {
            if (checker(choice)) {
                water = water - 250;
                beans = beans - 16;
                cups = cups - 1;
                money = money + 4;
            }
        } else if (choice.equals("2")) {
            if (checker(choice)) {
                water -= water - 350;
                beans -= beans - 20;
                milk -= milk - 75;
                cups -= cups - 1;
                money += money + 7;
            }
        } else if (choice.equals("3")){
            if (checker(choice)) {
                water -= 200;
                beans -= 12;
                milk -= 100;
                cups -= 1;
                money += 6;
            }
        } else if (choice.equals("back")) {;}
    }

    public boolean checker (String choice) {
        if (choice.equals("1")) {
            if (water - 250 < 0) {
                System.out.println("Sorry, not enough water");
                return false;
            } else if (beans - 16 < 0) {
                System.out.println("Sorry, not enough beans");
                return false;
            } else if (cups - 1 < 0) {
                System.out.println("Sorry, not enough cups");
                return false;
            } else {
                return true;
            }

        } else if (choice.equals("2")) {
            if (water - 350 < 0) {
                System.out.println("Sorry, not enough water");
                return false;
            } else if (milk - 75 < 0) {
                System.out.println("Sorry, not enough milk");
                return false;
            } else if (beans - 20 < 0) {
                System.out.println("Sorry, not enough beans");
                return false;
            } else if (cups - 1 < 0) {
                System.out.println("Sorry, not enough cups");
                return false;
            } else {
                return true;
            }
        } else if (choice.equals("3")) {
            if (water - 200 < 0) {
                System.out.println("Sorry, not enough water");
                return false;
            } else if (milk - 100 < 0) {
                System.out.println("Sorry, not enough milk");
                return false;
            } else if (beans - 12 < 0) {
                System.out.println("Sorry, not enough beans");
                return false;
            } else if (cups - 1 < 0) {
                System.out.println("Sorry, not enough cups");
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        CoffeeMachine myCoffeeMachine = new CoffeeMachine();
        myCoffeeMachine.start();

    }
}