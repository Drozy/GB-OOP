package hw1.packing;

import hw1.warehouse.Product;

/**
 * Dependency Inversion Principle
 */
public interface Packing {
    void packing(Product product);
}
