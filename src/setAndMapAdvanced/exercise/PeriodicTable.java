package setAndMapAdvanced.exercise;

import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        Set<String> elements = new TreeSet<>();

        addElements(scanner, count, elements);

        output(elements);
    }

    private static void output(Set<String> elements) {

        for (String element : elements) {
            System.out.print(element + " ");
        }

    }

    private static void addElements(Scanner scanner, int count, Set<String> elements) {

        for (int i = 0; i < count; i++) {

            String[] elArr = scanner.nextLine().split("\\s+");

            Collections.addAll(elements, elArr);

        }

    }


}

