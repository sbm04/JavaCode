package lld.diagram.parkingLotAssignment;

public class Reservation {
    public CustomerVisit customerVisit;
    public Table reservedTable;
    public String reservationDate;

    public Reservation(CustomerVisit visit, Table table, String date) {
        this.customerVisit = visit;
        this.reservedTable = table;
        this.reservationDate = date;
        table.isAvailable = false;
    }
}
