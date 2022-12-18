package functionalProgramming.lab.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateForNames {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int wantedLength = Integer.parseInt(scanner.nextLine());

        List<String> names = Arrays.stream(scanner.nextLine().split("\\s+")).toList();

        Predicate<String> isWantedLength = l -> l.length() <= wantedLength;

        names.stream().filter(isWantedLength).forEach(System.out::println);
    }


}

