package homework2;

public class Robot implements Overcome{
    int maxDistance;
    int maxHeight;

    public Robot(int maxDistance, int maxHeight) {
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;
    }

    private boolean run(int distance) {
        boolean flag = false;
        if (distance <= maxDistance) {
            flag = true;
            System.out.printf("Робот успешно пробежал дорожку %d м\n", distance);
        } else System.out.printf("Робот не смог преодолеть дорожку %d м\n", distance);
        return flag;
    }

    private boolean jump(int height) {
        boolean flag = false;
        if (height <= maxHeight) {
            flag = true;
            System.out.printf("Робот перепрыгнул стену высотой %d м\n", height);
        } else System.out.printf("Робот не смог преодолеть стену высотой %d м\n", height);
        return flag;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "maxDistance=" + maxDistance +
                ", maxHeight=" + maxHeight +
                '}';
    }

    @Override
    public boolean overcome(Obstacle obstacle) {
        boolean flag;
        if (obstacle instanceof Track) flag = run(obstacle.size);
        else flag = jump(obstacle.size);
        return flag;
    }
}