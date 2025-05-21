package may20;

public class Bottle {

    static int water = 5;

    Bottle(){
        water--;
        System.out.println(water);
    }

    public static void main(String[] args) {
        new Bottle();
        new Bottle();
        new Bottle();

        // 2 3 4 - ?
    }
}
