package oop5.cnc.model;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Objects;
import java.util.StringTokenizer;

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
     * Создает новый экземпляр ComplexNumber из строки
     *
     * @param str вводная строка
     */
    public ComplexNumber(String str) {
        str = str.replaceAll(" ", "").replace("\n", "");
        StringTokenizer st = new StringTokenizer(str, "+-", true);
        String previousToken = "";
        String currentToken, numb;
        double re = 0, im = 0;
        NumberFormat nf = NumberFormat.getInstance();
        while (st.hasMoreTokens()) {
            currentToken = st.nextToken();
            if (previousToken.equals("-"))
                numb = previousToken + currentToken;
            else
                numb = currentToken;
            if (!numb.equals("+") && !numb.equals("-")) {
                if (numb.indexOf('i') == -1) {
                    try {
                        re = nf.parse(numb).doubleValue();
                    } catch (ParseException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    numb = numb.replace('i', ' ');
                    if (numb.equals(" "))
                        numb = "1";
                    if (numb.equals("- "))
                        numb = "-1";
                    try {
                        im = nf.parse(numb).doubleValue();
                    } catch (ParseException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            previousToken = currentToken;
        }
        this.re = re;
        this.im = im;
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
            result = (im == 1 ? "" : nf.format(im)) + "i";
        else
            result = nf.format(re) +
                    (im < 0 ? "-" : "+") +
                    (im == 1 ? "" : nf.format(Math.abs(im))) +
                    "i";
        if (im == 0)
            result = nf.format(re);
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComplexNumber that = (ComplexNumber) o;
        return Double.compare(that.re, re) == 0 &&
                Double.compare(that.im, im) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(re, im);
    }
}
