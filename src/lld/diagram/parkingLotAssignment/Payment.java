package lld.diagram.parkingLotAssignment;

public class Payment {
    public PaymentStatus paymentStatus;
    public double amountPaid;
    public String paymentDate;
    public Payment() {
        this.paymentStatus = PaymentStatus.UNPAID;
    }

    public void makePayment(double amount) {
        this.amountPaid = amount;
        this.paymentStatus = PaymentStatus.PAID;
    }
}