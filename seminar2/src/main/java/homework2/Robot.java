package homework2;

public class Robot implements Overcome{
    int maxDistance;
    int maxHeight;

    public Robot(int maxDistance, int maxHeight) {
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;
    }

    @Override
    public boolean overcome(Obstacle obstacle) {
        return false;
    }
}
