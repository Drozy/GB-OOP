package hw1.packing;

import hw1.warehouse.Product;


/**
 * Dependency Inversion Principle
 */
public class PackingInBag implements Packing{
    @Override
    public void packing(Product product) {
        System.out.println(product + " упакован в мешки.");
    }
}
