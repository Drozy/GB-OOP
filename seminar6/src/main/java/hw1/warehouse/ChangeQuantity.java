package hw1.warehouse;

/**
 * Open-Closed Principle
 * Interface Segregation Principle
 */
public interface ChangeQuantity {
    public void receipt(Product product);

    public void consumption(Product product);

}
