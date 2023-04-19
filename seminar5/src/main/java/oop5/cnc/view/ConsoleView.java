package oop5.cnc.view;

import java.util.Scanner;

public class ConsoleView implements View {
    Scanner in = new Scanner(System.in);

    @Override
    public String get() {
        return in.nextLine();
    }

    @Override
    public void set(String value) {
        System.out.println(value);
    }

}
