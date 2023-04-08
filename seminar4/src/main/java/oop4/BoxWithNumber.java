package oop4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BoxWithNumber<T extends Number> {
    private T[] numbers;

    public double average() {
        double result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i].doubleValue();
        }
        result = result / numbers.length;
        return result;
    }

    public int compareAverage(BoxWithNumber<?> box2) {
        double avr1 = this.average();
        double avr2 = box2.average();
        if (avr1 > avr2) return 1;
        else if (Math.abs(avr1 - avr2) < 0.0000000001) return 0;
        else return -1;
    }

    public boolean compare(BoxWithNumber<?> box2) {
        return Math.abs(this.average() - box2.average()) < 0.0000000001;
    }
}
