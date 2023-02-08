package examPreparation.firstAndSecondTasks;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MagicBox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> first = Arrays.stream(scanner.nextLine().split("\\s+")).
                map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));

        ArrayDeque<Integer> second = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .forEach(second::push);

        int finalSum = 0;
        while (!first.isEmpty() && !second.isEmpty()) {

            Integer firstItem=first.peek();
            Integer secondItem=second.peek();

            int sum = Integer.parseInt(String.valueOf(firstItem)) + Integer.parseInt(String.valueOf(secondItem));
            if (sum % 2 == 0) {
                finalSum += sum;
                first.poll();
                second.pop();

            } else {
                int sec = second.pop();
                first.offer(sec);
            }
        }

        if (first.isEmpty()) {
            System.out.println("First magic box is empty.");

        } else {
            System.out.println("Second magic box is empty.");
        }

        if (finalSum >= 90) {
            System.out.printf("Wow, your prey was epic! Value: %d",finalSum);

        }
        else{
            System.out.printf("Poor prey... Value: %d",finalSum);
        }
    }
}

