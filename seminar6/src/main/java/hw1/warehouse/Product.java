package hw1.warehouse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Single Responsibility Principle
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private String name;
    private int quantity;
    private double price;

    public void increaseQuantity(int amount) {
        this.quantity += amount;
    }

    public void decreaseQuantity(int amount) {
        this.quantity -= amount;
    }
}
