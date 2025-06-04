package june3.poly.pay;

public class PaymentMain {
    public static void main(String[] args) {
       /* Payment creditCard = new CreditCard();
        creditCard.pay();

        Payment payPal = new PayPal();
        payPal.pay();*/


        Payment[] paymentMethods = {new CreditCard(), new PayPal(), new Amex()};

        for (Payment pay : paymentMethods) {
            pay.pay();
        }


    }
}
