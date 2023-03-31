package homework1;

import java.util.ArrayList;

public class Category {
    String name;
    ArrayList<Goods> goods;

    public Category() {
    }

    /**
     * Категория товаров
     * @param name наименование
     * @param goods перечень товаров
     */
    public Category(String name, ArrayList<Goods> goods) {
        this.name = name;
        this.goods = goods;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("\n").append(name).append(":");
        goods.forEach((g) -> str.append("\n").append(g));
        return str.toString();
    }
}
