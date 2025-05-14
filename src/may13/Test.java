package may13;

public class Test {
    public static void main(String[] args) {

        // Object    // new keyword is used to give memory to the object
        // heap - where the objects are stored
        Computer computer = new Computer();
        computer.brand = "Dell";
        computer.type = "Laptop";
        computer.capacity = 256;

        System.out.println("Object 1 ");
        computer.printDetails();

        System.out.println();

        // 2nd Object
        Computer computer1 = new Computer();
        computer1.type = "Desktop";
        computer1.brand = "HP";
        computer1.capacity = 128;
        System.out.println("Object 2");
        computer1.printDetails();
    }
}
