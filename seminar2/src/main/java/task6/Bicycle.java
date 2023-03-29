package task6;

public class Bicycle implements Transport{
    @Override
    public void drive() {
        System.out.println("Едем на велосипеде");
    }

    @Override
    public void stop() {
        System.out.println("Велосипед остановился");
    }
}
