package oop1;

public class Dog extends Animal{
    public Dog() {
    }

    @Override
    public void voice() {
        System.out.println("гав гав");
    }

    @Override
    public void jump() {
        System.out.println("Собака подпрыгнула");
    }
}
