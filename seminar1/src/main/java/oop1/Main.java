package oop1;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        System.out.println(cat1);
        cat1.setName("Барсик");
        cat1.setColor("Рыжий");
        cat1.setAge(4);
        System.out.println(cat1);
        Cat cat2 = new Cat("Васька", "Серый", 7);
        cat2.setAge(-10);
        System.out.println("Кот имя: " + cat2.getName() +
                " цвет: " + cat2.getColor() +
                " возраст: " + cat2.getAge());
        Animal cat3 = new Cat("qwe", "asd", -5);
        System.out.println(cat3);
        cat3.animalInfo();
        cat1.voice();

        Dog dog = new Dog();
        dog.voice();

        ((Cat) cat3).catMethod();
        Animal[] catsAndDogs = {
                new Cat("1", "2", 3),
                new Dog()
        };
        for (Animal o : catsAndDogs) {
            o.jump();
        }

        if (cat3 instanceof Cat) {
            System.out.println("это кот");
        } else System.out.println("не кот");

//        Vector v1 = new Vector(1.0, 2.0, 3.0);
//        System.out.println(v1);
//        System.out.println("Длина " + v1.length());
//        Vector v2 = new Vector(3.0, 2.0, 1.0);
//        System.out.println("Скалярное произведение " + v1.scalar(v2));
//        System.out.println("Векторное произведение " + v1.power(v2));
//        System.out.println("Косинус угла " + v1.cosinus(v2));
//        System.out.println("Сумма " + v1.summ(v2));
//        System.out.println("Разность " + v1.diff(v2));
    }
}