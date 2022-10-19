package stackAndQueue.lab;

import java.util.*;


public class HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        ArrayDeque<String> queue = new ArrayDeque<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (String e : input) {
            queue.offer(e);
        }

        while (queue.size() > 1) {

            for (int i = 1; i < n; i++) {
                queue.offer(Objects.requireNonNull(queue.poll()));
            }

            System.out.println("Removed " + queue.poll());

        }

        System.out.println("Last is " + queue.poll());

    }


}

