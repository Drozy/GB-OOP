package homework2;

public class Main {
    public static void main(String[] args) {
        Object[] runners = {
                new Human(100, 2),
                new Robot(500, 5),
                new Cat(200, 1)
        };
        Obstacle[] course = {
                new Track(50),
                new Wall(1),
                new Track(80),
                new Wall(2),
                new Track(150)
        };

        for (var o : runners) {

        }
    }
}
