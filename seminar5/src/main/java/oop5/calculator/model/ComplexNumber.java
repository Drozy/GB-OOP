package oop5.calculator.model;

import java.text.NumberFormat;
import java.util.Objects;

public class ComplexNumber {
    private double re; //действительная часть числа
    private double im; //мнимая часть числа

    /**
     * Создает новый экземпляр ComplexNumber
     *
     * @param value экземпляр класса ComplexNumber
     */
    public ComplexNumber(ComplexNumber value) {
        re = value.getRe();
        im = value.getIm();
    }

    /**
     * Создает новый экземпляр ComplexNumber
     *
     * @param re действительная часть числа
     * @param im мнимая часть числа
     */
    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    /**
     * Создает новый экземпляр ComplexNumber
     * значение по умолчанию 0.0
     */
    public ComplexNumber() {
        re = 0.0;
        im = 0.0;
    }

    /**
     * Создает новый экземпляр ComplexNumber
     * Это вещественное число
     *
     * @param re действительная часть числа
     */
    public ComplexNumber(double re) {
        this.re = re;
        im = 0.0;
    }

    /**
     * Возвращает действительную часть числа
     */
    public double getRe() {
        return re;
    }

    /**
     * Возвращает мнимую часть числа
     */
    public double getIm() {
        return im;
    }


    @Override
    public String toString() {
        String result;
        NumberFormat nf = NumberFormat.getInstance();
        if (re == 0)
            result = nf.format(im) + "i";
        else
            result = nf.format(re) + (im < 0 ? "-" : "+") + nf.format(Math.abs(im)) + "i";
        if (im == 0)
            result = nf.format(re);
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComplexNumber that = (ComplexNumber) o;
        return Double.compare(that.re, re) == 0 && Double.compare(that.im, im) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(re, im);
    }
}
