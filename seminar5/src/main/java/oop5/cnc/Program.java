package oop5.cnc;

import oop5.cnc.control.Controller;
import oop5.cnc.view.*;

public class Program {
    public static void main(String[] args) {
        View view = new ConsoleView();
        Loggable logger = new LogIntoFile();
        View logableView = new LoggableView(view, logger);
        Controller app = new Controller(logableView);
        app.run();
    }
}
