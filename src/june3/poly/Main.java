package june3.poly;


import may31.inheritance.car.Honda;

public class Main {
    public static void main(String[] args) {


        Honda honda = new Honda();
        honda.accelerate();


        Larbrador larbrador = new Larbrador();
        larbrador.labradorMethod();
        larbrador.sound();
        larbrador.dogMethod();
        larbrador.animalMethod();


        Animal animal = new GermanSheppard();
        animal.sound();
        animal.animalMethod();


        /*
                        C
        List[P]    - ArrayList[fast in 1 M , may inconsient ]
                   - Linked [1M,    slow , but 100 Accurate ]

                   List l = new LinkedList();


        method overriding


       Vehicle
        run(), acceralte(), stop()

                                 Honda,        Hyundai     Audi

        create objects

        Vehicle honda = new Honda();
        Honda honda = new Honda();
        1. Honda
        2. Hyundai
        3. Audi


                                            - paying using some generic method




                                                Paying using pay pal
  apple pay tap
                       paying using
                       debit
                       Payment payment = new ApplePay();



         */












// parent class ref ==== child class obj
       /* // upcasting
        Animal larbrador = new Larbrador();
        larbrador.sound();

        Animal animal = new TestAnimal();
        animal.sound();



        Dog dog = new Larbrador();
        dog.sound();
*/



    }
}
