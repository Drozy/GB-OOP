package hw1.employee;

import hw1.packing.Packing;
import hw1.warehouse.Product;

/**
 * Open-Closed Principle
 * Interface Segregation Principle
 */
public class Storekeeper extends Employee implements Order {

    public Storekeeper(String name, int id) {
        super(name, id);
    }

    @Override
    public void processOrder(Product product, Packing packing) {
        packing.packing(product);
    }

}
