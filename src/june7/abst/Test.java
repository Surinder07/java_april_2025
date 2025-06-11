package june7.abst;

public abstract class Test {

    // abstract method
    public abstract void show();

    public void display(){
        System.out.println("display");
    }

}

abstract class Test2 extends Test {

    @Override
    public void show() {
        System.out.println("This is in the show method..");
    }

    public abstract void set();
}

class Main {
    public static void main(String[] args) {
        //Test test = new Test();
    }
}
