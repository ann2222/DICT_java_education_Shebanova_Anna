package ChatBot;

import java.util.Scanner;

public class ChatBot {
    final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        greet();
        remindName();
    }

    static void greet() {
        System.out.println("Hello! My name is " + "Aid" + ".");
        System.out.println("I was created in " + "2018" + ".");
        System.out.println("Please, remind me your name.");
    }
    static void remindName()
    {
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }
}