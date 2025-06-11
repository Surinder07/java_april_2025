package june10;

public class AnimalMain {
    public static void main(String[] args) {

       // Animal animal = new Animal(); // cannot create object of this class
        Animal dog = new Dog();
        dog.makeSound();

        Animal animal = new Cat();
        animal.makeSound();

    }
}
