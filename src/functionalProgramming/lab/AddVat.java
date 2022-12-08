package functionalProgramming.lab;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class AddVat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        UnaryOperator<Double> newPrices = l -> l * 1.20;

        String input = scanner.nextLine();

        System.out.println("Prices with VAT:");

        Arrays.stream(input.split(", "))
                .map(Double::parseDouble)
                .map(newPrices).forEach(n -> System.out.printf("%.2f%n", n));

    }


}

