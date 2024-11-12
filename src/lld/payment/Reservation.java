package lld.payment;

public class Reservation {
    private String reservationId;
    private String userId;
    private String vehicleId;
    private String status;
    private double amount;

    public Reservation(String reservationId, String userId, String vehicleId, double amount) {
        this.reservationId = reservationId;
        this.userId = userId;
        this.vehicleId = vehicleId;
        this.amount = amount;
    }

    public PaymentStatus processPayment(Payment paymentMethod) {
        // Process payment through the provided payment method
        PaymentStatus status = paymentMethod.pay(amount);
        if (status == PaymentStatus.COMPLETED) {
            this.status = "Confirmed";
            System.out.println("Payment successful. Reservation confirmed.");
        } else {
            this.status = "Pending";
            System.out.println("Payment failed. Reservation not confirmed.");
        }
        return status;
    }
}
