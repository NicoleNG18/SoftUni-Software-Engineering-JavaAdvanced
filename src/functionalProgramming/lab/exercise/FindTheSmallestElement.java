package functionalProgramming.lab.exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class FindTheSmallestElement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        Function<int[], Integer> returnIndex = (int[] e) -> {

            int min = Integer.MAX_VALUE;
            int index = -1;

            for (int i = 0; i < e.length; i++) {

                if (e[i] <= min) {
                    min = e[i];
                    index = i;
                }

            }

            return index;
        };

        System.out.println(returnIndex.apply(numbers));
    }


}

