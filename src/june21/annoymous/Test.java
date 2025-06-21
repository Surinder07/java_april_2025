package june21.annoymous;

public class Test {
    public static void main(String[] args) {

   /*     Animal animal = new Dog();
        animal.makeSound();
*/

        Animal animal = new Animal(){
            @Override
            void makeSound() {
                System.out.println("dog barks..");
            }
        };
        animal.makeSound();
    }
}
