package generics.GenericCountMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Double> elements = new ArrayList<>();

        while (n-- > 0) {
            elements.add(Double.parseDouble(scanner.nextLine()));
        }

        double comparableEl = Double.parseDouble(scanner.nextLine());

        Integer count = GenList.getCount(elements, comparableEl);

        System.out.println(count);
    }


}

