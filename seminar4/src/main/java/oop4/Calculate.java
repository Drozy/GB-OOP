package oop4;

import java.util.List;

public class Calculate {
    public static double sum(List<? extends Number> numbers) {
        double res = 0.0;
        for (Number num: numbers) {
            res += num.doubleValue();
        }
        return res;
    }
}
