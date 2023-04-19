package oop5.cnc.model.operations;

import oop5.cnc.model.ComplexNumber;

public class Division implements Operation{
    @Override
    public ComplexNumber execute(ComplexNumber a, ComplexNumber b) {
        double denominator = b.getRe() * b.getRe() + b.getIm() * b.getIm();
        if (denominator == 0) return new ComplexNumber();
        return new ComplexNumber(
                (a.getRe() * b.getRe() + a.getIm() * b.getIm()) / denominator,
                (a.getIm() * b.getRe() - a.getRe() * b.getIm()) / denominator);
    }
}
