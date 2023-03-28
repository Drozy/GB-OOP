package oop1;

public abstract class Animal {
    protected String name;
    protected String color;
    protected Integer age;
    public void animalInfo() {
        System.out.println("Информация о животном " + name);
    }

    public abstract void voice();

    public abstract void jump();

}
