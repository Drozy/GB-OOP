package oop2;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new HomeCat(200, 0, "Барсик", "home cat"),
                new Dog(500, 10, "Бобик", "dog"),
                new Tiger(800, 20, "Шерхан", "tiger")
        };
        for (Animal a : animals) {
            a.run(450);
            a.swim(15);
        }
        System.out.println(String.valueOf(Animal.count));
        System.out.println(String.valueOf(Cat.count));
        System.out.println(String.valueOf(HomeCat.count));
        System.out.println(String.valueOf(Tiger.count));
        System.out.println(String.valueOf(Dog.count));
    }
}