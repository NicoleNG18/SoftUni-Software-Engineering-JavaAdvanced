package functionalProgramming.lab.exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class ReverseAndExclude {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> collection = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int divider = Integer.parseInt(scanner.nextLine());

        Collections.reverse(collection);

        UnaryOperator<List<Integer>> reduced = l -> l.stream().filter(e -> e % divider != 0).collect(Collectors.toList());

        collection = reduced.apply(collection);

        collection.forEach(e -> System.out.printf("%d ", e));
    }


}

