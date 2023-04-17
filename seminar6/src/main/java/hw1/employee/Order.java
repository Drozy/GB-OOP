package hw1.employee;

import hw1.warehouse.Product;

public interface Order {
    public void processOrder(Product product, int amount);
}
