package stackAndQueue.lab;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Scanner;

public class MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        ArrayDeque<String> queue = new ArrayDeque<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (String e : input) {
            queue.offer(e);
        }

        int j = 1;

        while (queue.size() > 1) {

            if (j == 1) {

                for (int i = 1; i < n; i++) {
                    queue.offer(Objects.requireNonNull(queue.poll()));
                }

                System.out.println("Removed " + queue.poll());

            } else if (isPrime(j)) {

                for (int i = 1; i < n; i++) {
                    queue.offer(Objects.requireNonNull(queue.poll()));
                }

                System.out.println("Prime " + queue.peek());

            } else {

                for (int i = 1; i < n; i++) {
                    queue.offer(Objects.requireNonNull(queue.poll()));
                }

                System.out.println("Removed " + queue.poll());

            }

            j++;
        }

        System.out.println("Last is " + queue.poll());

    }

    private static boolean isPrime(int j) {

        int count = 0;

        for (int i = 2; i < j; i++) {

            if (j % i == 0) {
                count++;
            }

        }

        return count == 0;
    }


}

