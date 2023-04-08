package Calculator;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Calculator {
    public static double sum(List<? extends Number> numbers) {
        double res = 0.0;
        for (Number num : numbers) {
            res += num.doubleValue();
        }
        return res;
    }

    public static double multipl(List<? extends Number> numbers) {
        double res = 1.0;
        for (Number num : numbers) {
            res *= num.doubleValue();
        }
        return res;
    }

    /**
     * Деление первого элемента на остальные, исключая 0
     *
     * @param numbers лист чисел
     * @return результат деления
     */
    public static double div(List<? extends Number> numbers) {
        double res = numbers.get(0).doubleValue();
        for (int i = 1; i < numbers.size(); i++) {
            if (Double.compare(numbers.get(i).doubleValue(), 0.0) != 0)
                res = res / numbers.get(i).doubleValue();
        }
        return res;
    }

    public static List<String> toBinary(List<?> list) {
        List<String> res = new ArrayList<>();
        if (list.get(0) instanceof String) {
            for (var el : list) {
                BigInteger bi = new BigInteger(1, ((String) el).getBytes());
                res.add(bi.toString(2));
            }
        }
        else if(list.get(0) instanceof Integer) {
            for (var el : list) {
                res.add((Integer.toBinaryString((Integer) el)));
            }
        }
        else {
            for (var el : list) {
                int left = (int) (double) el;
                String bin = Integer.toBinaryString(left);
                double right = (double) el - left;
                if (right != 0.0) {
                    bin += ".";
                    for (int i = 0; i < 20; i++) {
                        right = right * 2 - (int) right * 2;
                        bin = bin + (int) right;
                        if (right == 1.0) {
                            break;
                        }
                    }
                }
                res.add(bin);
            }
        }
        return res;
    }

}
