package oop1;

public class Cat extends Animal{
    public Cat(String name, String color, Integer age) {
        this.name = name;
        this.color = color;
        if(age < 0) {
            System.out.println("Данные введены некорректно.");
        } else {
            this.age = age;
        }
    }

    public Cat() {
        this.name = "Барсик";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if(age < 0) {
            System.out.println("Данные введены некорректно.");
        } else {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void voice() {
        System.out.println("мяу мяу");
    }

    @Override
    public void jump() {
        System.out.println("Животное подпрыгнуло");
    }

    public void catMethod() {
        System.out.println("свернуться в клубок");
    }
}
