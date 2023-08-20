package app;

import java.util.Scanner;

public class CoffeeMachine implements Machine {

    Scanner scanner;

    public CoffeeMachine() {
        scanner = new Scanner(System.in);
    }

    @Override
    public void displayMenu() {
        System.out.println("""
                Choose a drink:
                1 - Espresso
                2 - Cappuccino
                3 - Latte
                """);
    }

    @Override
    public int chooseDrink() {
        int choice;
        while (true) {
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice >= 1 && choice <= 3) {
                    break;
                } else {
                    System.out.println("Invalid choice! Please select a valid drink.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid number.");
            }
        }
        return choice;
    }

    @Override
    public void makeCoffee(Coffee coffee) {
        coffee.make();
        System.out.println("Your " + coffee.getName() + " is ready. Enjoy :)");
    }

    public Coffee createCoffee(int choice) {
        return switch (choice) {
            case 1 -> new Espresso();
            case 2 -> new Cappuccino();
            case 3 -> new Latte();
            default -> null;
        };
    }
}
