package homework1;

public class User {
    String login;
    String password;
    Basket basket = new Basket();

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public User() {
    }

    /**
     * Покупка товара
     * @param goods товар
     * @param amt количество
     */
    public void purchase(Goods goods, double amt) {
        this.basket.addToBasket(goods, amt);
    }

    public void showPurchases() {
        System.out.println("\n" + login + " купил: " + basket);
    }
}
