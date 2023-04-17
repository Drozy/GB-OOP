package oop5.calculator.model;

public class Operation {
    private char operation;

    public Operation(char operation) {
        this.operation = operation;
    }

    public ComplexNumber execute(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = new ComplexNumber();
        switch (operation) {
            case '+':
                result = add(a, b);
                break;
            case '-':
                result = sub(a, b);
                break;
            case '*':
                result = mult(a, b);
                break;
            case '/':
                result = div(a, b);
                break;
            default:
                System.out.println("Операция не распознана.");
        }
        return result;
    }

    /**
     * Сумма двух чисел
     *
     * @param a первое число
     * @param b второе число
     */
    private ComplexNumber add(ComplexNumber a, ComplexNumber b) {
        return new ComplexNumber(
                a.getRe() + b.getRe(),
                a.getIm() + b.getIm());
    }

    /**
     * Разность двух чисел
     *
     * @param a первое число
     * @param b второе число
     */
    private ComplexNumber sub(ComplexNumber a, ComplexNumber b) {
        return new ComplexNumber(
                a.getRe() - b.getRe(),
                a.getIm() - b.getIm());
    }

    /**
     * Умножение двух чисел
     *
     * @param a первое число
     * @param b второе число
     */
    private ComplexNumber mult(ComplexNumber a, ComplexNumber b) {
        return new ComplexNumber(
                a.getRe() * b.getRe() - a.getIm() * b.getIm(),
                a.getIm() * b.getRe() + a.getRe() * b.getIm());
    }

    /**
     * Деление первого числа на второе
     *
     * @param a первое число
     * @param b второе число
     */
    private ComplexNumber div(ComplexNumber a, ComplexNumber b) {
        double denominator = b.getRe() * b.getRe() + b.getIm() * b.getIm();
        if (denominator == 0) return new ComplexNumber();
        return new ComplexNumber(
                (a.getRe() * b.getRe() + a.getIm() * b.getIm()) / denominator,
                (a.getIm() * b.getRe() - a.getRe() * b.getIm()) / denominator);
    }

    public char getOperation() {
        return operation;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    @Override
    public String toString() {
        return "" + operation;
    }
}
