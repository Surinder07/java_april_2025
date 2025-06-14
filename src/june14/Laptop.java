package june14;

public class Laptop implements Computer{
    @Override
    public void calculate() {
        System.out.println("Calculating.. ");
    }

    @Override
    public void storeDate() {
        System.out.println("Storage");
    }

    @Override
    public void multiMediaAccess() {
        System.out.println("Multi media ");
    }
}
