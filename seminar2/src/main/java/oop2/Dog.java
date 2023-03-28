package oop2;

public class Dog extends Animal {
    static int count;
    public Dog(Integer runDistance, Integer swimDistance, String name, String type) {
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
