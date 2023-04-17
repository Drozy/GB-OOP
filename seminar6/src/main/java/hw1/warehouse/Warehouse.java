package hw1.warehouse;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Open-Closed Principle
 * Interface Segregation Principle
 */
@Data
public class Warehouse implements ChangeQuantity, SearchProduct {

    private List<Product> store = new ArrayList<>();

    public void addProduct(Product product) {
        store.add(product);
    }

    public void delProduct(Product product) {
        store.remove(product);
    }

    @Override
    public void receipt(Product product) {
        int i = store.indexOf(product);
        if (i == -1) {
            addProduct(product);
        } else {
            store.get(i).increaseQuantity(product.getQuantity());
        }
    }

    @Override
    public void consumption(Product product) {
        int i = store.indexOf(product);
        if (i == -1) {
            System.out.println("Такого товара нет на складе.");
        } else if (store.get(i).getQuantity() < product.getQuantity()) {
            System.out.println("Недостаточно товара на складе");
        } else {
            store.get(i).decreaseQuantity(product.getQuantity());
        }
    }

    @Override
    public void searchProduct(Product product) {
        int i = store.indexOf(product);
        if (i == -1) {
            System.out.println("Такого товара нет на складе.");
        } else {
            System.out.println(store.get(i));
        }
    }
}
