package functionalProgramming.lab.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class AppliedArithmetic {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        UnaryOperator<List<Integer>> add = l -> l.stream().map(e -> e + 1).collect(Collectors.toList());

        UnaryOperator<List<Integer>> multiply = l -> l.stream().map(e -> e * 2).collect(Collectors.toList());

        UnaryOperator<List<Integer>> subtract = l -> l.stream().map(e -> e - 1).collect(Collectors.toList());

        Consumer<List<Integer>> print = l -> l.forEach(e -> System.out.print(e + " "));

        String command = scanner.nextLine();

        while (!command.equals("end")) {

            switch (command) {
                case "add" -> numbers = add.apply(numbers);
                case "subtract" -> numbers = subtract.apply(numbers);
                case "multiply" -> numbers = multiply.apply(numbers);
                case "print" -> {
                    print.accept(numbers);
                    System.out.println();
                }
            }
            command = scanner.nextLine();
        }

    }


}

