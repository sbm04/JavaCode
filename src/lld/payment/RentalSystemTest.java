package lld.payment;

public class RentalSystemTest {
    public static void main(String[] args) {
        Reservation reservation = new Reservation("R001", "U123", "V456", 200.0);

        // Pay using Paypal
        Payment paypalPayment = new Paypal("user@example.com");
        reservation.processPayment(paypalPayment);

        // Pay using Credit Card
        Payment creditCardPayment = new CreditCard("1234 5678 9012 3456", "John Doe", "12/25", "123");
        reservation.processPayment(creditCardPayment);

        // Pay using UPI
        Payment upiPayment = new UPI("user@upi");
        reservation.processPayment(upiPayment);
    }
}
