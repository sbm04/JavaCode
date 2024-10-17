package lld.diagram.parkingLotAssignment;
import  java.util.*;


public class Order {
    public List<Dish> orderedDishes = new ArrayList<>();
    public OrderStatus orderStatus;
    public Table table;

    public Order(Table table) {
        this.table = table;
        this.orderStatus = OrderStatus.IN_PROCESS;
    }

    public void addDish(Dish dish) {
        orderedDishes.add(dish);
    }
}
