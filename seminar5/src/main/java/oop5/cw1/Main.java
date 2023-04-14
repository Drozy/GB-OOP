package oop5.cw1;

public class Main {
    public static void main(String[] args) {
        Flyable flyable = new Flyable() {
            @Override
            public void fly() {
                System.out.println("fly - fly");
            }
        };
        flyable.fly();
        System.out.println(flyable.getClass().getName());

        Flyable flyable2 = new Flyable() {
            @Override
            public void fly() {
                System.out.println("z - z");
            }
        };
        flyable2.fly();

//         oop5.Main$1 implements Flyable
//         @override
//         Main flyable = new Main();
    }
}
