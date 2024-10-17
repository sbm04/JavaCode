package lld.diagram.parkingLotAssignment;

import java.util.*;

public class CustomerVisit extends User {
    public List<Order> orders;
    public Bill invoice;

    public CustomerVisit(String name, String email) {
        this.name = name;
        this.email = email;
        this.orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void generateInvoice() {

    }

}
