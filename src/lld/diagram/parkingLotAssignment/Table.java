package lld.diagram.parkingLotAssignment;

public class Table {
    public int tableNumber;
    public int capacity;
    public boolean isAvailable;

    public Table(int tableNumber, int capacity) {
        this.tableNumber = tableNumber;
        this.capacity = capacity;
        this.isAvailable = true;
    }
}