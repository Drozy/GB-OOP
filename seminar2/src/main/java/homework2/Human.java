package homework2;

public class Human implements Overcome{
    int maxDistance;
    int maxHeight;

    public Human(int maxDistance, int maxHeight) {
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;
    }

    @Override
    public boolean overcome(Obstacle obstacle) {
        return false;
    }
}
