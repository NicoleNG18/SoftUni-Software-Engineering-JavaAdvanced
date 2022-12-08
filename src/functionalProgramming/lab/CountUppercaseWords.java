package functionalProgramming.lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class CountUppercaseWords {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Predicate<String> hasUpperCase = l -> Character.isUpperCase(l.charAt(0));

        List<String> words = Arrays.stream(scanner.nextLine().split(" "))
                .filter(hasUpperCase).toList();

        System.out.println(words.size());

        words.forEach(System.out::println);
    }


}

