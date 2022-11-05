package setAndMapAdvanced.lab;

import java.util.*;

public class LargestThreeNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*System.out.println(Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" ")));*/
        int[] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        List<Integer> numbers = new ArrayList<>();

        for (int j : arr) {
            numbers.add(j);
        }

        if (arr.length <= 3) {

            Collections.sort(numbers);
            Collections.reverse(numbers);

            for (int num : numbers) {
                System.out.print(num + " ");
            }

        } else {

            Collections.sort(numbers);
            Collections.reverse(numbers);

            for (int i = 0; i < 3; i++) {
                System.out.print(numbers.get(i) + " ");
            }

        }

    }


}

