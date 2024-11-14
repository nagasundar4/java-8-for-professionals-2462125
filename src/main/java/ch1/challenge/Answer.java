package ch1.challenge;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


class Answer {
    // Change these boolean values to control whether you see
    // the expected answer and/or hints
    static boolean showExpectedResult = false;
    static boolean showHints = false;

    public static List<Order> filterOrders(List<Order> orders, LocalDate filterDate) {

        ArrayList<Order> filteredOrders = OrderUtil.getOrdersAfterDate(orders, filterDate);
        if (showExpectedResult) {
            System.out.println("Expected Result: " + filteredOrders);
        }
        if (showHints) {
            System.out.println("Hint: Use the method 'OrderUtil.getOrdersAfterDate'");
        }
        System.out.println("Filtered Orders: " + filteredOrders);
        return filteredOrders;
    }
}

class OrderUtil {
    /**
     * Method to filter orders after a given date
     */
    public static ArrayList<Order> getOrdersAfterDate(List<Order> orders, LocalDate afterDate) {
        ArrayList<Order> ordersAfterDate = new ArrayList<>();
        for (Order order : orders) {
            if (order.getDate().isAfter(afterDate)) {
                ordersAfterDate.add(order);
            }
        }
        return ordersAfterDate;
    }
}

class Order {
    private String name;
    private LocalDate date;

    public Order(String name, LocalDate date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return String.format("Order '%s'\nDate: '%s'", name, date);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(name, order.name) && Objects.equals(date, order.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, date);
    }

    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("Order 1", LocalDate.of(2020, 1, 1)));
        orders.add(new Order("Order 2", LocalDate.of(2020, 1, 2)));
        orders.add(new Order("Order 3", LocalDate.of(2020, 1, 3)));
        orders.add(new Order("Order 4", LocalDate.of(2020, 1, 4)));
        orders.add(new Order("Order 5", LocalDate.of(2020, 1, 5)));
        orders.add(new Order("Order 6", LocalDate.of(2020, 1, 6)));
        orders.add(new Order("Order 7", LocalDate.of(2020, 1, 7)));
        orders.add(new Order("Order 8", LocalDate.of(2020, 1, 8)));
        orders.add(new Order("Order 9", LocalDate.of(2020, 1, 9)));
        orders.add(new Order("Order 10", LocalDate.of(2020, 1, 10)));
        orders.add(new Order("Order 11", LocalDate.of(2020, 1, 11)));
    }
}
