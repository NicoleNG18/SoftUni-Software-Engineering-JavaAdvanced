package functionalProgramming.lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class FindEvensOrOdds {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] range = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        String evenOrOdd = scanner.nextLine();

        List<Integer> numbers = new ArrayList<>();

        numbers = FindNumbers(range, numbers, evenOrOdd(evenOrOdd));

        numbers.forEach(e -> System.out.printf("%d ", e));
    }


    public static Predicate<Integer> evenOrOdd(String evenOrOdd) {
        if (evenOrOdd.equals("even")) {
            return l -> l % 2 == 0;

        } else {
            return l -> l % 2 != 0;
        }

    }


    public static List<Integer> FindNumbers(int[] range, List<Integer> numbers, Predicate<Integer> everOrOdd) {

        for (int i = range[0]; i <= range[1]; i++) {

            if (everOrOdd.test(i)) {
                numbers.add(i);
            }

        }

        return numbers;
    }


}

