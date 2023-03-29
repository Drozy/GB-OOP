package task6;

public class Skate implements Transport{
    @Override
    public void drive() {
        System.out.println("Едем на скейте");
    }

    @Override
    public void stop() {
        System.out.println("Скейт остановился");
    }
}
