package task6;

public class Motocycle implements Transport{
    @Override
    public void drive() {
        System.out.println("Едем на мотоцикле");
    }

    @Override
    public void stop() {
        System.out.println("Машина остановилась");
    }
}
