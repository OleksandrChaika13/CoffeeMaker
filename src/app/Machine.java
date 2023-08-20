package app;

public interface Machine {

    void displayMenu();
    int chooseDrink();
    void makeCoffee(Coffee coffee);
    Coffee createCoffee(int choice);
}
