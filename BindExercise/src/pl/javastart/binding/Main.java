package pl.javastart.binding;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IntegerProperty first = new SimpleIntegerProperty();
        IntegerProperty second = new SimpleIntegerProperty();

        second.bind(first);

        int input;

        Scanner scanner = new Scanner(System.in);
        System.out.print("First number: ");
        input = scanner.nextInt();
        first.setValue(input);

        System.out.println("First: " + first.get() + ", Second: " + second.get());

        System.out.print("Second number: ");
        input = scanner.nextInt();
        first.setValue(input);
        System.out.println("First: " + first.get() + ", Second: " + second.get());
        scanner.close();
    }
}
