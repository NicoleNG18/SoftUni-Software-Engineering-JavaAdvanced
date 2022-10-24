package stackAndQueueExercise;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numOfCommands = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        for (int i = 0; i < numOfCommands; i++) {

            String[] commandArr = scanner.nextLine().split("\\s+");

            if (commandArr[0].equals("1")) {
                numbers.push(Integer.parseInt(commandArr[1]));

            } else if (commandArr[0].equals("2")) {
                numbers.pop();

            } else if (commandArr[0].equals("3")) {
                maximumElement(numbers);
            }

        }


    }

    private static void maximumElement(ArrayDeque<Integer> numbers) {

        ArrayDeque<Integer> helpDeque = new ArrayDeque<>();

        int max = Integer.MIN_VALUE;

        while (numbers.size() != 0) {

            if (numbers.peek() > max) {
                max = numbers.peek();
            }

            helpDeque.push(numbers.pop());
        }

        helpDeque.forEach(numbers::push);

        System.out.println(max);
    }


}

