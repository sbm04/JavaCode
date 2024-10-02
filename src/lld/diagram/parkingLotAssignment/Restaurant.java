package lld.diagram.parkingLotAssignment;

import java.util.*;

public class Restaurant {
    public String name;
    public String address;
    public String phone;
    public Menu menu;
    public List<Chef> chefs;
    List<waiter> waiters;
    public void hireChef(Chef chef) {
        chefs.add(chef);
    }

    public void hireWaiter(waiter waiter) {
        waiters.add(waiter);
    }


}
