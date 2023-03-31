package homework2;

public class Main {
    public static void main(String[] args) {
        Overcome[] runners = {
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

        for (var r : runners) {
            System.out.println(r + " начинает забег.");
            boolean flag = false;
            for (Obstacle o : course) {
                flag = r.overcome(o);
                if (!flag) {
                    System.out.println(r + " выбывает.");
                    break;
                }
            }
            if (flag) System.out.println(r + " преодолел полосу препятствий!");
        }
    }
}
