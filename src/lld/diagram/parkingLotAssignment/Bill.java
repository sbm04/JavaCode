package lld.diagram.parkingLotAssignment;

public class Bill  implements Invoiceable{
    public int billId;
    public String invoiceNumber;
    public  double amount;
    public CustomerVisit customerVisit;
    public PaymentStatus PaymantStatus;
    public String invoiceDate;
    public Payment payment;

    @Override
    public void generateInvoice() {

    }
}
