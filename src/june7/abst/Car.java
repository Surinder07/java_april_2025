package june7.abst;

public abstract class Car {


    public abstract void drive();
    public abstract void accelerate();
//    public abstract void charge();
    public abstract void brake();


}

class Tesla extends Car{

    @Override
    public void drive() {

    }

    @Override
    public void accelerate() {

    }

    @Override
    public void brake() {
        System.out.println("Electonic brake");
    }

    public void charge(){

    }
}

class Honda extends Car {

    @Override
    public void drive() {

    }

    @Override
    public void accelerate() {

    }

    @Override
    public void brake() {
        System.out.println("Brake using break pads");
    }
}
