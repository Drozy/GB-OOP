package oop4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SimpleBox box1 = new SimpleBox(123);
        SimpleBox box2 = new SimpleBox("str");
        SimpleBox box3 = new SimpleBox(456);
        System.out.println(box1);
        System.out.println(box2);
        System.out.println(box3);
        int summ;

        box3.setObj("string");
        if (box1.getObj() instanceof Integer && box3.getObj() instanceof Integer) {
            summ = (Integer) box1.getObj() + (Integer) box3.getObj();
            System.out.println(summ);
        } else System.out.println("Тип не Integer");

        GenBox<Integer> genBox1 = new GenBox<>(123);
        GenBox<Integer> genBox2 = new GenBox<>(456);
        GenBox<String> genBox3 = new GenBox<>("string");
        summ = genBox1.getObj() + genBox2.getObj();
        System.out.println(summ);

        Integer[] arr1 = new Integer[5];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i;
        }
        Double[] arr2 = new Double[5];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i * 1.1;
        }
        BoxWithNumber<Integer> nBox1 = new BoxWithNumber<>(arr1);
        BoxWithNumber<Double> nBox2 = new BoxWithNumber<>(arr2);
        System.out.println(nBox1.average());
        System.out.println(nBox2.average());
        System.out.println(nBox1.compare(nBox2));
        System.out.println(nBox1.compareAverage(nBox2));

        List<Integer> list1 = new ArrayList<>(Arrays.stream(arr1).toList());
        List<Double> list2 = new ArrayList<>(Arrays.stream(arr2).toList());
        System.out.println(Calculate.sum(list1));
        System.out.println(Calculate.sum(list2));

        LRUCache<Employee> cash = new LRUCache<>(3);
        for (int i = 0; i < 5; i++) {
            cash.addElement(new Employee("Ivanov" + i, 1000.0, "worker"));
        }
        System.out.println(cash);
    }
}