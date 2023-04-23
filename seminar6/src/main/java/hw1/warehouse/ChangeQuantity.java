package hw1.warehouse;

/**
 * Open-Closed Principle
 * Interface Segregation Principle
 */
public interface ChangeQuantity {
    /**
     * Приход товара
     *
     * @param product товар
     */
    void receipt(Product product);

    /**
     * Расход товара
     *
     * @param product товар
     * @return ложь, если на складе недостаточно товара
     */
    boolean consumption(Product product);

}
