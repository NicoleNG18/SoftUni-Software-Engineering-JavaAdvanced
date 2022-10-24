package stackAndQueueExercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumbersAtStack {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().split("\\s+");

        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        Arrays.stream(arr).forEach(e -> numbers.push(Integer.parseInt(e)));

        numbers.forEach(e -> System.out.print(e + " "));

    }


}

