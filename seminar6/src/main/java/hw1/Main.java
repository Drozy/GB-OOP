package hw1;

import hw1.employee.Order;
import hw1.employee.Storekeeper;
import hw1.packing.Packing;
import hw1.packing.PackingInBag;
import hw1.packing.PackingInBox;
import hw1.warehouse.Product;
import hw1.warehouse.Warehouse;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Как Вас зовут?");
        Order storekeeper = new Storekeeper(in.nextLine(), 1);
        System.out.println("Добро пожаловать в систему управления складом, " +
                ((Storekeeper) storekeeper).getName());
        Warehouse warehouse = new Warehouse();
        warehouse.receipt(new Product("Винтики", 10000, 1.0));
        warehouse.receipt(new Product("Шпунтики", 10000, 1.0));
        Product searchResult;
        StringBuilder menu = new StringBuilder()
                .append("\n ====================================== \n")
                .append("1 - Выписать расходный ордер\n")
                .append("2 - Найти товар на складе по наименованию\n")
                .append("3 - Оформить поступление товара\n")
                .append("4 - Показать все товары\n")
                .append("0 - Выход\n");
        while (true) {
            System.out.println(menu);
            switch (in.nextLine()) {
                case "1":
                    System.out.println("Введите название товара:");
                    searchResult = warehouse.searchProduct(in.nextLine().trim());
                    if (searchResult != null) {
                        System.out.println("Введите количество товара:");
                        int qt = Integer.parseInt(in.nextLine());
                        Product purchase = new Product(
                                searchResult.getName(),
                                qt,
                                searchResult.getPrice());
                        if (warehouse.consumption(purchase))
                            storekeeper.processOrder(purchase, choosePacking());
                    }
                    else System.out.println("Такого товара нет на складе.");
                    break;
                case "2":
                    System.out.println("Введите название товара:");
                    searchResult = warehouse.searchProduct(in.nextLine().trim());
                    if (searchResult != null)
                        System.out.println(searchResult);
                    else
                        System.out.println("Такого товара нет на складе.");
                    break;
                case "3":
                    warehouse.receipt(newProduct());
                    break;
                case "4":
                    System.out.println(warehouse);
                    break;
                case "0":
                    in.close();
                    return;
            }
        }
    }

    private static Product newProduct() {
        System.out.println("Введите название товара: ");
        String pName = in.nextLine().trim();
        System.out.println("Введите количество: ");
        int pQt = Integer.parseInt(in.nextLine());
        System.out.println("Введите цену за единицу товара (разделитель '.'): ");
        double pPrice = Double.parseDouble(in.nextLine());
        return new Product(pName, pQt, pPrice);
    }

    private static Packing choosePacking() {
        Packing pack;
        System.out.println("""
                Выберите упаковку:
                1 - Коробка
                2 - Пакет
                """);
        switch (in.nextLine()) {
            case "1":
                pack = new PackingInBox();
                break;
            case "2":
                pack = new PackingInBag();
                break;
            default:
                System.out.println("Неверный ввод, попробуйте ещё раз.");
                pack = choosePacking();
        }
        return pack;
    }
}
