package oop5.cnc.model.operations;

import oop5.cnc.model.ComplexNumber;

public interface Operation {
    ComplexNumber execute (ComplexNumber a, ComplexNumber b);
}
