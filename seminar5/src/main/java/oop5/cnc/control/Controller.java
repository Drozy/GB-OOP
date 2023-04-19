package oop5.cnc.control;

import oop5.cnc.model.ComplexNumber;
import oop5.cnc.model.OperationFactory;
import oop5.cnc.view.View;

public class Controller {
    private View ui;

    public Controller(View ui) {
        this.ui = ui;
    }

    public void run() {
        ComplexNumber a, b;
        String op;
        OperationFactory operationFactory = new OperationFactory();
        ui.set(" <<<  Complex number calculator  >>> ");
        ui.set("Value examples: 12; 6,67; 2-3i;  3,43-0,9i");
        while (true) {
            StringBuilder result = new StringBuilder();
            ui.set("Enter value:");
            a = new ComplexNumber(ui.get());
            result.append(a);
            while (true) {
                ui.set("Enter operation ( +, -, *, / , =):");
                op = ui.get();
                result.append(" ").append(op).append(" ");
                if (op.equals("=")) {
                    result.append(a);
                    break;
                }
                ui.set("Enter value:");
                b = new ComplexNumber(ui.get());
                result.append(b);
                a = operationFactory.calculate(a, b, op);
            }
            ui.set(result.toString());
            ui.set("Type \"Q\" to exit or any character to continue:");
            if (ui.get().equalsIgnoreCase("Q"))
                break;
        }
    }
}
