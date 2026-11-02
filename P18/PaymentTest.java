package P18;
class Payment {

    double calculateAmount(double amount) {
        return amount;
    }

    double calculateAmount(double amount, double discount) {
        return amount - (amount * discount / 100);
    }
}

class CardPayment extends Payment {

    @Override
    double calculateAmount(double amount) {
        return amount + (amount * 0.02);
    }
}

class UPIPayment extends Payment {

    @Override
    double calculateAmount(double amount) {
        return amount + (amount * 0.01);
    }
}

public class PaymentTest {

    public static void main(String[] args) {

        Payment payment1 = new CardPayment();
        Payment payment2 = new UPIPayment();

        System.out.println("Card payment: " +
                payment1.calculateAmount(1000));

        System.out.println("UPI payment: " +
                payment2.calculateAmount(1000));

        System.out.println("Amount after discount: " +
                payment1.calculateAmount(1000, 10));
    }
}