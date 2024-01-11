package view;

import java.util.Scanner;

public abstract class Menu {
    private static Scanner scanner = new Scanner(System.in);

    public static int displayMenu() {
        System.out.println("Menu:");
        System.out.println("----------------------");
        System.out.println("1. Count letters");
        System.out.println("2. Count characters");
        System.out.println("3. Exit");
        System.out.println("----------------------");
        System.out.print("Enter your choice: ");
        

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        return choice;
    }

    public static String getInput() {
        System.out.print("Enter your content: ");
        return scanner.nextLine();
    }
}