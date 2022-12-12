package functionalProgramming.lab;

package ready;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SortEvenNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();

        Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt)
                .forEach(numbers::add);

        numbers.removeIf(e -> e % 2 != 0);

        if (numbers.size() != 0) {
            printSb(numbers);

            numbers.sort(Integer::compareTo);

            printSb(numbers);
        }

    }

    private static void printSb(List<Integer> numbers) {

        StringBuilder sb = new StringBuilder(String.join(", ", String.valueOf(numbers)));

        sb.deleteCharAt(0);

        sb.deleteCharAt(sb.length() - 1);

        System.out.println(sb);
    }


}

