package homework1;

public class Main {
    public static void main(String[] args) {
        Goods[] fruitsArray = {
                new Goods("Яблоки", 100.0),
                new Goods("Апельсины", 140.0),
                new Goods("Бананы", 120.0),
                new Goods("Грушы", 200.0)};
        Category fruits = new Category("Фрукты", fruitsArray);
        Goods[] vegetablesArray = {
                new Goods("Помидоры", 320.0),
                new Goods("Огурцы", 280.0),
                new Goods("Морковь", 70.0),
                new Goods("Картофель", 60.0),
                new Goods("Лук", 90.0)};
        Category vegetables = new Category("Овощи", vegetablesArray);



    }
}