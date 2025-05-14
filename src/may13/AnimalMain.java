package may13;

public class AnimalMain {
    public static void main(String[] args) {
        // Object 1
        Animal animal = new Animal();
        animal.color = "Black";
        animal.weight = 20.23;
        animal.height = 12.12;

        animal.eat();
        animal.run();
        animal.sleep();

        System.out.println("\n## Animal Details ");
        animal.printAnimalDetails();


    }
}
