package june10.car;

public class Tesla extends Car{

    public void acceralte(){
        System.out.println("running...");
    }

    @Override
    public void brake() {
        System.out.println("Brake using electronic mech.");
    }
}
