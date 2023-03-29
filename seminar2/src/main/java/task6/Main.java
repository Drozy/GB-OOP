package task6;

public class Main {
    public static void main(String[] args) {
        Human man = new Human();
        Car car = new Car();

        man.drive(car);
        man.stop();
        man.drive(new Bicycle());
        man.stop();
        man.stop();
        Motocycle moto = new Motocycle();
        man.drive(moto);
        man.stop();
    }
}
