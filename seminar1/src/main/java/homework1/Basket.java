package homework1;

import java.util.ArrayList;

public class Basket {
    ArrayList<Goods> basket = new ArrayList<>();

    /**
     * Добавление товара в корзину
     * @param goods товар
     * @param amt количество
     */
    public void addToBasket(Goods goods, double amt) {
        amt = goods.decrease(amt);
        this.basket.add(new Goods(goods.name, goods.price, amt));
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        basket.forEach((g) -> str.append("\n").append(g));
        return str.toString();
    }
}
