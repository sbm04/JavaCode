package lld.payment;

public interface Payment {
    PaymentStatus pay(double amount);
}

