package oop5.cw1;

public class Outer {

    public Outer() {
    }

    static class Inner {
        int innerValue;

        public Inner(int innerValue) {
            this.innerValue = innerValue;
        }

        public Inner() {
        }

        public void innerMethod() {
            System.out.println(innerValue);
//            System.out.println(outerValue);
//            outerMethod();
        }

    }

    int outerValue;

    public void outerMethod() {
        System.out.println(outerValue);
//        System.out.println(innerValue);
//        innerMethod();
    }


    public Outer(int outerValue) {
        this.outerValue = outerValue;
    }


    public static void main(String[] args) {
//        Inner inner = new Outer().new Inner(11);
        Inner inner = new Inner();
        class Vector {
            int x;
            int y;
            int z;

            public Vector(int x, int y, int z) {
                this.x = x;
                this.y = y;
                this.z = z;
            }
        }
        Vector vector = new Vector(1, 2, 3);

    }
}
