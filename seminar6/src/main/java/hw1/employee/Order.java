package hw1.employee;

import hw1.packing.Packing;
import hw1.warehouse.Product;

public interface Order {
    void processOrder(Product product, Packing packing);
}
