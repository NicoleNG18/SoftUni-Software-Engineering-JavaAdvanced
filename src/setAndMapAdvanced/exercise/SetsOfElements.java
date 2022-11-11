package setAndMapAdvanced.exercise;


import java.util.*;

public class SetsOfElements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int n = dimensions[0];
        int m = dimensions[1];

        Set<Integer> first = new LinkedHashSet<>();
        Set<Integer> second = new LinkedHashSet<>();

        Set<Integer> repeated = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            first.add(Integer.parseInt(scanner.nextLine()));
        }

        for (int i = 0; i < m; i++) {
            second.add(Integer.parseInt(scanner.nextLine()));
        }

        makeRepeated(n, m, first, second, repeated);

        output(repeated);
    }

    private static void output(Set<Integer> repeated) {

        for (Integer integer : repeated) {
            System.out.print(integer + " ");
        }

    }

    private static void makeRepeated(int n, int m, Set<Integer> first, Set<Integer> second, Set<Integer> repeated) {

        if (m > n) {

            for (int i = 0; i < n; i++) {

                Iterator<Integer> num = first.iterator();

                if (num.hasNext()) {

                    int currentNum = num.next();
                    num.remove();

                    if (second.contains(currentNum)) {
                        repeated.add(currentNum);
                    }

                }

            }

        } else if (m < n) {

            for (int i = 0; i < m; i++) {

                Iterator<Integer> num = second.iterator();

                if (num.hasNext()) {
                    int currentNum = num.next();
                    num.remove();

                    if (first.contains(currentNum)) {
                        repeated.add(currentNum);
                    }

                }
            }

        } else {

            for (int i = 0; i < n; i++) {

                Iterator<Integer> num = first.iterator();

                if (num.hasNext()) {
                    int currentNum = num.next();
                    num.remove();

                    if (second.contains(currentNum)) {
                        repeated.add(currentNum);
                    }

                }

            }

        }

    }


}

