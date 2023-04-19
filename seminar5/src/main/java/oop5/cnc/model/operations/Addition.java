package oop5.cnc.model.operations;

import oop5.cnc.model.ComplexNumber;

public class Addition implements Operation {

    @Override
    public ComplexNumber execute(ComplexNumber a, ComplexNumber b) {
        return new ComplexNumber(
                a.getRe() + b.getRe(),
                a.getIm() + b.getIm());
    }
}
