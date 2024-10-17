package lld.diagram.parkingLotAssignment;

public class Payment {
    private PaymentStrategy paymentStrategy;
    public PaymentStatus paymentStatus;
    public double amountPaid;
    public String paymentDate;

    public Payment(PaymentStrategy paymentStrategy, PaymentStatus paymentStatus, double amountPaid, String paymentDate) {
        this.paymentStrategy = paymentStrategy;
        this.paymentStatus = paymentStatus;
        this.amountPaid = amountPaid;
        this.paymentDate = paymentDate;
    }

    public void makePayment(double amount) {
        paymentStrategy.pay(amount);
    }
}