package homework1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Category fruits = new Category("Фрукты", fillFruits());
        Category vegetables = new Category("Овощи", fillVegetables());
        Category meat = new Category("Мясо", fillMeat());
        ArrayList<Category> assortment = new ArrayList<>();
        assortment.add(fruits);
        assortment.add(vegetables);
        assortment.add(meat);
        // вывод каталога продуктов
        printAssortment(assortment);

        User user1 = new User("Ivanov", "123456");
        User user2 = new User("Petrov", "654321");
        // покупки
        user1.purchase(fruits.goods.get(0), 2);
        user1.purchase(fruits.goods.get(2), 2);
        user1.purchase(vegetables.goods.get(0), 1.5);
        user1.purchase(vegetables.goods.get(1), 1.5);
        user1.purchase(vegetables.goods.get(3), 2.5);
        user1.purchase(meat.goods.get(0), 2);

        user2.purchase(fruits.goods.get(1), 2);
        user2.purchase(fruits.goods.get(2), 1.2);
        user2.purchase(fruits.goods.get(3), 2);
        user2.purchase(vegetables.goods.get(0), 1.5);
        user2.purchase(vegetables.goods.get(1), 1.5);
        user2.purchase(vegetables.goods.get(3), 2.5);
        user2.purchase(meat.goods.get(1), 1);

        user1.showPurchases();
        user2.showPurchases();
        printAssortment(assortment);
    }

    private static ArrayList<Goods> fillFruits() {
        ArrayList<Goods> fruits = new ArrayList<>();
        fruits.add(new Goods("Яблоки", 100.0, 10.0));
        fruits.add(new Goods("Апельсины", 140.0, 10.0));
        fruits.add(new Goods("Бананы", 120.0, 10.0));
        fruits.add(new Goods("Грушы", 200.0, 8.0));
        return fruits;
    }

    private static ArrayList<Goods> fillVegetables() {
        ArrayList<Goods> vegetables = new ArrayList<>();
        vegetables.add(new Goods("Помидоры", 320.0, 10.0));
        vegetables.add(new Goods("Огурцы", 280.0, 10.0));
        vegetables.add(new Goods("Морковь", 70.0, 10.0));
        vegetables.add(new Goods("Картофель", 60.0, 20.0));
        vegetables.add(new Goods("Лук", 90.0, 5.0));
        return vegetables;
    }

    private static ArrayList<Goods> fillMeat() {
        ArrayList<Goods> meat = new ArrayList<>();
        meat.add(new Goods("Свинина", 320.0, 6.0));
        meat.add(new Goods("Говядина", 280.0, 5.0));
        meat.add(new Goods("Курица", 70.0, 10.0));
        meat.add(new Goods("Индейка", 60.0, 5.0));
        return meat;
    }

    /**
     * Вывод каталога продуктов
     * @param assortment список категорий
     */
    private static void printAssortment(ArrayList<Category> assortment) {
        assortment.forEach(System.out::println);
    }
}