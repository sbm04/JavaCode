package lld.payment;

public class CreditCard implements Payment {
    private String cardNumber;
    private String cardHolderName;
    private String expiryDate;
    private String cvv;

    public CreditCard(String cardNumber, String cardHolderName, String expiryDate, String cvv) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    @Override
    public PaymentStatus pay(double amount) {
        // Payment processing logic for Credit Card
        System.out.println("Processing payment of $" + amount + " through Credit Card...");
        // Simulate payment success or failure
        return PaymentStatus.COMPLETED; // Assume success for simplicity
    }
}

