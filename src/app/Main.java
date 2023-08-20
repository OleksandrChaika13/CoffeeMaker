package app;

public class Main {

    public static void main(String[] args) {

        CoffeeMachine coffeeMachine = new CoffeeMachine();

        coffeeMachine.displayMenu();
        int choice = coffeeMachine.chooseDrink();
        Coffee coffee = coffeeMachine.createCoffee(choice);

        if (coffee != null) {
            coffeeMachine.makeCoffee(coffee);
        } else {
            System.out.println("Invalid choice!");
        }
    }
}