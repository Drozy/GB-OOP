package oop5.cnc.model;

public enum CalcOperator {
    ADD("+"), SUB("-"), MULT("*"), DIV("/"), EQ("="), ERR("Input error");
    private String op;

    CalcOperator(String op) {
        this.op = op;
    }

//    public String getOp() {
//        return op.;
//    }
}
