package oop5.cnc.model;

import oop5.cnc.model.operations.*;

public class OperationFactory {
    static Operation operation;

    public ComplexNumber calculate(ComplexNumber a, ComplexNumber b, String op) {
        switch (op.strip()) {
            case "+" -> {
                operation = new Addition();
                return operation.execute(a, b);
            }
            case "-" -> {
                operation = new Subtraction();
                return operation.execute(a, b);
            }
            case "*" -> {
                operation = new Multiplication();
                return operation.execute(a, b);
            }
            case "/" -> {
                operation = new Division();
                return operation.execute(a, b);
            }
            default -> throw new IllegalStateException("Unexpected value: " + op);
        }
    }
}
