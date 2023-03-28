package oop2;

public abstract class Cat extends Animal{
    static int count;
    public Cat(Integer runDistance, Integer swimDistance, String name, String type) {
        super(runDistance, swimDistance, name, type);
        count++;
    }
}
