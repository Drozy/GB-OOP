package oop5.cnc.model.operations;

import oop5.cnc.model.ComplexNumber;

public class Multiplication implements Operation{
    @Override
    public ComplexNumber execute(ComplexNumber a, ComplexNumber b) {
        return new ComplexNumber(
                a.getRe() * b.getRe() - a.getIm() * b.getIm(),
                a.getIm() * b.getRe() + a.getRe() * b.getIm());
    }
}
