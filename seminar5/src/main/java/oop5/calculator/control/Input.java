package oop5.calculator.control;

import oop5.calculator.model.ComplexNumber;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Input {

    /**
     * @param in ввод, экземпляр Scanner
     * @return символ
     */
    public static char getOperation(Scanner in) {
        char operation = 0;
        boolean validInput = false;
        System.out.println("Введите оператор (+, -, *, /): ");
        if (in.hasNext()) {
            operation = in.next().charAt(0);
            if ("+-*/".contains("" + operation)) validInput = true;
        }
        if (!validInput) {
            System.out.println("Ошибка ввода. Попробуйте еще раз.");
            operation = getOperation(in);
        }
        return operation;
    }

    /**
     * @param in ввод, экземпляр Scanner
     * @return первый введенный символ
     */
    public static char getResponse(Scanner in) {
        char ch;
        if (in.hasNext()) {
            ch = in.next().charAt(0);
        } else {
            System.out.println("Ошибка ввода. Попробуйте еще раз.");
            in.next();
            ch = getResponse(in);
        }
        return ch;
    }

    /**
     * Преобразует ввод в комплексное число
     *
     * @param in ввод, экземпляр Scanner
     * @return комплексное число типа ComplexNumber
     */
    public static ComplexNumber getNumber(Scanner in) {
        ComplexNumber num = new ComplexNumber();
        String str = "";
        System.out.println("Введите число: ");
        if (in.hasNext()) {
            str = in.next();
        } else {
            System.out.println("Ошибка ввода. Попробуйте еще раз.");
            in.next();
            num = getNumber(in);
        }
        try {
            num = parseComplexNumber(str);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return num;
    }

    /**
     * Получение комплексного числа из строки
     *
     * @param str строка, содержащая число
     * @return комплексное число типа ComplexNumber
     * @throws ParseException
     */
    private static ComplexNumber parseComplexNumber(String str) throws ParseException {
        str = str.replaceAll(" ", "").replace("\n", "");
        StringTokenizer st = new StringTokenizer(str, "+-", true);
        String previousToken = "";
        String currentToken = "";
        String numb = "";
        double re = 0, im = 0;
        NumberFormat nf = NumberFormat.getInstance();
        while (st.hasMoreTokens()) {
            currentToken = st.nextToken();
            if (previousToken.equals("-"))
                numb = previousToken + currentToken;
            else
                numb = currentToken;
            if (!numb.equals("+") && !numb.equals("-")) {
                if (numb.indexOf('i') == -1)
                    re = nf.parse(numb).doubleValue();
                else {
                    numb = numb.replace('i', ' ');
                    if (numb.equals(" "))
                        numb = "1";
                    if (numb.equals("- "))
                        numb = "-1";
                    im = nf.parse(numb).doubleValue();
                }
            }
            previousToken = currentToken;
        }
        return new ComplexNumber(re, im);
    }
}
