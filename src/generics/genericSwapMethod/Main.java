package generics.genericSwapMethod;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Integer> elements = new ArrayList<>();

        while (n-- > 0) {
            elements.add(Integer.parseInt(scanner.nextLine()));
        }

        int[] indexes = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        List<Integer> newElements = GenBox.swap(elements, indexes[0], indexes[1]);

        newElements.forEach(e -> System.out.println(e.getClass().getName() + ": " + e));
    }

}



