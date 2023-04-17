package hw1.employee;

import hw1.warehouse.Product;

public class Storekeeper extends Employee implements Order{

    public Storekeeper(String name, int id) {
        super(name, id);
    }

    @Override
    public void processOrder(Product product, int amount) {

    }
}
