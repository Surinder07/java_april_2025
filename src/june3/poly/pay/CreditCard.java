package june3.poly.pay;

public class CreditCard extends Payment{
    @Override
    public void pay() {
        System.out.println("Paying using credit Card");
    }
}
