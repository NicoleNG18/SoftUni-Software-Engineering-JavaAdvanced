package functionalProgramming.lab.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class CustomComparator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        UnaryOperator<List<Integer>> evenNumbers = l -> l.stream()
                .filter(e -> e % 2 == 0).sorted().collect(Collectors.toList());

        UnaryOperator<List<Integer>> oddNumbers = l -> l.stream()
                .filter(e -> e % 2 != 0).sorted().collect(Collectors.toList());

        List<Integer> evens = evenNumbers.apply(input);
        List<Integer> odds = oddNumbers.apply(input);

        evens.forEach(e -> System.out.printf("%d ", e));
        odds.forEach(e -> System.out.printf("%d ", e));

    }


}

