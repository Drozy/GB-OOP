package oop2;

public abstract class Animal {
    protected Integer runDistance;
    protected Integer swimDistance;
    protected String name;
    protected String type;
    static int count;

    public Animal() {
    }

    public Animal(Integer runDistance, Integer swimDistance, String name, String type) {
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
        this.name = name;
        this.type = type;
        count++;
    }

    public abstract void swim(Integer distance);

    public void run(Integer distance) {
        if (distance > runDistance) {
            System.out.println(name + " пробежал только " + runDistance);
        } else {
            System.out.println(name + " пробежал " + distance);
        }
    }
}
