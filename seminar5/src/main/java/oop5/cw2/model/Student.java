package oop5.cw2.model;

public class Student extends APeople {
    public Student() {
        super();
    }

    @Override
    public String toString() {
        return "Student "+ super.toString();
    }
}
