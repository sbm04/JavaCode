package lld.payment;

public class Paypal implements Payment {
    private String paypalAccountEmail;

    public Paypal(String paypalAccountEmail) {
        this.paypalAccountEmail = paypalAccountEmail;
    }

    @Override
    public PaymentStatus pay(double amount) {
        // Payment processing logic for Paypal
        System.out.println("Processing payment of $" + amount + " through Paypal...");
        // Simulate payment success or failure
        return PaymentStatus.COMPLETED; // Assume success for simplicity
    }
}
