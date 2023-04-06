package oop3;

public class Main {
    public static void main(String[] args) {
        Fruit fruit = Fruit.APPLE;
        switch (fruit) {
            case APPLE -> System.out.println("This is!");
            case ORANGE, BANANA, KIWI -> System.out.println("Not this");
        }
        for (Fruit f : Fruit.values()) {
            System.out.println(f);
        }
        System.out.println(Fruit.valueOf("APPLE"));
    }
}

