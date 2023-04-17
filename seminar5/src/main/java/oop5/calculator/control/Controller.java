package oop5.calculator.control;

import oop5.calculator.model.ComplexNumber;
import oop5.calculator.model.Operation;
import oop5.calculator.view.Output;
import oop5.cw2.View;

import java.util.Scanner;

public class Controller {
    public Controller() {
        Scanner sc = new Scanner(System.in);
        String userResponse = String.valueOf(Input.getResponse(sc));
        while (true) {

            ComplexNumber x = Input.getNumber(sc);
            System.out.println("x = " + x);
            Operation op = new Operation(Input.getOperation(sc));
            System.out.println("op = " + op);
            ComplexNumber y = Input.getNumber(sc);
            System.out.println("y = " + y);
            System.out.println(op.execute(x, y));


        }

    }

}
