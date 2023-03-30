package homework2;

public class Cat implements Overcome{
    int maxDistance;
    int maxHeight;

    public Cat(int maxDistance, int maxHeight) {
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;
    }

    @Override
    public boolean overcome(Obstacle obstacle) {
        return false;
    }
}
