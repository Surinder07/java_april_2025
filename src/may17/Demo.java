package may17;

public class Demo {

    public String greeting(String name){ // parameters
        return "Hello " + name;
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        String result = demo.greeting("Utsav");
        System.out.println(result);
    }
}
