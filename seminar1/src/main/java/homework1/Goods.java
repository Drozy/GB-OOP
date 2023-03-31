package homework1;

public class Goods {
    String name;
    double price;
    double rating;
    double amount;

    /**
     * Товар
     *
     * @param name   наименование
     * @param price  цена
     * @param amount количество
     */
    public Goods(String name, double price, double amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public Goods() {
    }

    @Override
    public String toString() {
        return name +
                ": цена = " + price +
                ", рейтинг = " + rating +
                ", количество = " + amount;
    }

    /**
     * Проверяет наличие требуемого количества товара к покупке
     * @param amt запрашиваемое количество
     * @return возможное количество
     */
    public double decrease(double amt) {
        if (amt <= this.amount)
            this.amount -= amt;
        else {
            amt = this.amount;
            this.amount = 0;
        }
        return amt;
    }
}
