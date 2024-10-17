package lld.diagram.parkingLotAssignment;

import java.util.*;

public class Restaurant {
    public String name;
    public String address;
    public String phone;
    public Menu menu;
    public List<Chef> chefs;
    public List<Waiter> waiters;
    public List<Table> tables;

    public Restaurant(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.menu = new MenuImpl();  // Aggregation relationship
        this.chefs = new ArrayList<>();
        this.waiters = new ArrayList<>();
        this.tables = new ArrayList<>();
    }

    public void hireChef(Chef chef) {
        chefs.add(chef);
    }

    public void hireWaiter(Waiter waiter) {
        waiters.add(waiter);
    }

    public void addTable(Table table) {
        tables.add(table);
    }


}
