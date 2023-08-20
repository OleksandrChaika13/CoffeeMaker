package app;

public class Latte implements Coffee{

    @Override
    public String getName() {
        return "Latte";
    }

    @Override
    public void make() {
        System.out.println("Making latte...");
    }
}
