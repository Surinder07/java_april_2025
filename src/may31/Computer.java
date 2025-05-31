package may31;

public class Computer {
    int capacity;
    String brand;

    public void calculate(){
        System.out.println("calculating...");
    }

}


class Laptop extends Computer {

    public void surfingInternet(){

        System.out.println("Surfing internet");
    }
}

class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.surfingInternet();
        laptop.calculate();
    }
}