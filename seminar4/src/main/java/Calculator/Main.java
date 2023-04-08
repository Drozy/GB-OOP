package Calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer[] arr1 = new Integer[5];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = 5 - i;
        }
        Double[] arr2 = new Double[5];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = 5 - i * 1.1;
        }
        String[] arr3 = {"абв", "123", "asdf"};

        List<Integer> list1 = new ArrayList<>(Arrays.stream(arr1).toList());
        List<Double> list2 = new ArrayList<>(Arrays.stream(arr2).toList());
        List<String> list3 = new ArrayList<>(Arrays.stream(arr3).toList());
        System.out.println(list1);
        System.out.println("Сумма: " + Calculator.sum(list1));
        System.out.println("Произведение: " + Calculator.multipl(list1));
        System.out.println("Деление: " + Calculator.div(list1));
        System.out.println("Бинарный перевод: " + Calculator.toBinary(list1));
        System.out.println();

        System.out.println(list2);
        System.out.println("Сумма: " + Calculator.sum(list2));
        System.out.println("Произведение: " + Calculator.multipl(list2));
        System.out.println("Деление: " + Calculator.div(list2));
        System.out.println("Бинарный перевод: " + Calculator.toBinary(list2));
        System.out.println();

        System.out.println(list3);
        System.out.println("Бинарный перевод: " + Calculator.toBinary(list3));

    }
}
