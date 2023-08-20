package app.machine;

import app.coffee.Coffee;

public interface Machine {

    void displayMenu();
    int chooseDrink();
    void makeCoffee(Coffee coffee);
    Coffee createCoffee(int choice);
}
