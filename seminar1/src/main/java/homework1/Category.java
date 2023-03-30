package homework1;

import java.util.Arrays;

public class Category {
    String name;
    Goods[] goods;

    public Category() {
    }

    public Category(String name, Goods[] goods) {
        this.name = name;
        this.goods = goods;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", goods=" + Arrays.toString(goods) +
                '}';
    }
}
