package lesson01.store;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Order> orders = new ArrayList<>();

    public boolean addOrder(Order order) {
        orders.add(order);
        return true;
    }

    public boolean cancelOrder(Order order) {
        // TODO: отмена заказа
        return true;
    }

    public boolean paymentOrder(Order order) {
        // TODO: отмена заказа
        return true;
    }
}
