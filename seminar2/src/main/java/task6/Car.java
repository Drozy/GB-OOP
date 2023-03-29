package task6;

public class Car implements Transport{
    @Override
    public void drive() {
        System.out.println("Едем на машине");
    }

    @Override
    public void stop() {
        System.out.println("Машина остановилась");
    }
}
