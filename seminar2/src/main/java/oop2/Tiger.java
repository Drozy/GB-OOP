package oop2;

public class Tiger extends Cat {
    static int count;
    public Tiger(Integer runDistance, Integer swimDistance, String name, String type) {
        super(runDistance, swimDistance, name, type);
        count++;
    }

    @Override
    public void swim(Integer distance) {
        if (distance > runDistance) {
            System.out.println(name + " не доплыл");
        } else {
            System.out.println(name + " проплыл " + distance);
        }
    }
}
