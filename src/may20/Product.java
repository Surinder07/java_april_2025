package may20;

public class Product {
    int id;
    String name;
    double price;
    static String brand = "Apple";

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void display(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(price);
        System.out.println(brand);
        System.out.println();
    }
}
