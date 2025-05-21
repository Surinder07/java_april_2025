package may20;

public class ProductMain {
    public static void main(String[] args) {
        Product iphone = new Product(101, "Iphone 16", 1500.21);
        Product macbook = new Product(102, "Macbook air", 1400.50);
        Product watch = new Product(103, "Apple watch", 400.00);
        Product airpods = new Product(104, "Airpods", 250.23);

        iphone.display();
        macbook.display();
        watch.display();
        airpods.display();
    }
}
