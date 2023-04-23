package hw1.warehouse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * Open-Closed Principle
 * Interface Segregation Principle
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Warehouse implements ChangeQuantity, SearchProduct {

    private List<Product> store = new ArrayList<>();

    private void addProduct(Product product) {
        store.add(product);
    }

    private void delProduct(Product product) {
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
        System.out.println("Оформлен приход товара: " + product);
    }

    @Override
    public boolean consumption(Product product) {
        boolean isOk = false;
        for (Product p: store) {
            if (p.getName().equalsIgnoreCase(product.getName())) {
                if (p.getQuantity() < product.getQuantity()) {
                    System.out.println("Недостаточно товара " + product.getName() + " на складе");
                } else if (p.getQuantity() == product.getQuantity()) {
                    delProduct(product);
                    isOk = true;
                    System.out.println("Отпущено: " + product + " Больше нет.");
                } else {
                    p.decreaseQuantity(product.getQuantity());
                    isOk = true;
                    System.out.println("Отпущено: " + product);
                }
            }
        }
        return isOk;
    }

    @Override
    public Product searchProduct(String productName) {
        for (Product p : store) {
            if (p.getName().equalsIgnoreCase(productName)) {
                return p;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Product p: store) {
            sb.append(p).append("\n");
        }
        return sb.toString();
    }
}
