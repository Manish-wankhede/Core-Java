interface Payment {
    
    public abstract void makePayment(double amount);

    public default void paymentInfo() {
        System.out.println("Payment is being processed");
    }
}

class UpiPayment implements Payment {
    public void makePayment(double amount) {
        System.out.println("Paid $" + amount + " using UIP.");
    }
}

class CreditPayment implements Payment {
    public void makePayment(double amount) {
        System.out.println("Paid $" + amount + " using credit card.");
    }
}

public class PaymentApp {
    public static void main(String[] args) {
        Payment payment;

        payment = new UpiPayment();
        payment.makePayment(1500.00);

        payment = new CreditPayment();
        payment.makePayment(3000.00);
    }
}
