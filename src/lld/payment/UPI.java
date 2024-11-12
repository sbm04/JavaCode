package lld.payment;

public class UPI implements Payment {
    private String upiId;

    public UPI(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public PaymentStatus pay(double amount) {
        // Payment processing logic for UPI
        System.out.println("Processing payment of $" + amount + " through UPI...");
        // Simulate payment success or failure
        return PaymentStatus.COMPLETED; // Assume success for simplicity
    }
}
