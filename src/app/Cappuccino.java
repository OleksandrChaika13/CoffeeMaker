package app;

public class Cappuccino implements Coffee{

    @Override
    public String getName() {
        return "Cappuccino";
    }

    @Override
    public void make() {
        System.out.println("Making cappuccino...");
    }
}
