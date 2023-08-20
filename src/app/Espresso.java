package app;

public class Espresso implements Coffee{

    @Override
    public String getName() {
        return "Espressso";
    }

    @Override
    public void make() {
        System.out.println("Making espresso...");
    }
}
