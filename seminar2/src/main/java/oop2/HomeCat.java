package oop2;

public class HomeCat extends Cat {
    static int count;
    public HomeCat(Integer runDistance, Integer swimDistance, String name, String type) {
        super(runDistance, swimDistance, name, type);
        count++;
    }

    @Override
    public void swim(Integer distance) {
        System.out.println(name + " плавать не умеет");
    }
}
