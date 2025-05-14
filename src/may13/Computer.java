package may13;

public class Computer {
    // member variables
    // fields   // attributes
    int capacity;
    String brand;
    String type;

    // behaviour
    // methods are same a behaviour

    public void calculate(){
        System.out.println("Calculating using computer");
    }

    public void storeData(){
        System.out.println("Storing 500 GB of data");
    }
    public void printDetails(){

        System.out.println("Capacity : "+capacity);
        System.out.println("Brand : "+brand);
        System.out.println("Type : "+type);

    }
}
