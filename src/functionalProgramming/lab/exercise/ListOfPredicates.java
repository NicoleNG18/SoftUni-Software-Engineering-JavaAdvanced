package functionalProgramming.lab.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListOfPredicates {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int upRange = Integer.parseInt(scanner.nextLine());

        List<Integer> numbersToDivide = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).toList();

        Predicate<Integer> isDivided = l -> {

            for (Integer integer : numbersToDivide) {

                if (l % integer != 0) {
                    return false;
                }

            }

            return true;
        };

        for (int i = 1; i <= upRange; i++) {

            if (isDivided.test(i)) {
                System.out.print(i + " ");
            }

        }

    }


}

