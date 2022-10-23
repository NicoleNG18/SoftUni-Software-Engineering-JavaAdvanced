package stackAndQueueExercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split("\\s+");

        int numToOffer = Integer.parseInt(inputArr[0]);
        int numToPoll = Integer.parseInt(inputArr[1]);
        int isInTheQueue = Integer.parseInt(inputArr[2]);

        String[] data = scanner.nextLine().split("\\s+");

        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        for (int i = 0; i < numToOffer; i++) {
            numbers.offer(Integer.parseInt(data[i]));
        }

        boolean isBreaked = false;

        while (numToPoll > 0) {

            numbers.poll();

            if (numbers.isEmpty()) {

                System.out.println("0");
                isBreaked = true;

                break;
            }

            numToPoll--;
        }

        if (!isBreaked) {

            if (numbers.contains(isInTheQueue)) {
                System.out.println("true");

            } else {
                minimumElement(numbers);
            }
        }


    }

    private static void minimumElement(ArrayDeque<Integer> numbers) {

        int min = Integer.MAX_VALUE;

        while (numbers.size() != 0) {

            if (numbers.peek() < min) {
                min = numbers.peek();
            }

            numbers.poll();

        }

        System.out.println(min);
    }


}

