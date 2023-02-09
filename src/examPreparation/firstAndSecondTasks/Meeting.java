package examPreparation.firstAndSecondTasks;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Meeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> mal = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt)
                .forEach(mal::push);

        ArrayDeque<Integer> fem = Arrays.stream(scanner.nextLine().split("\\s")).map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));

        int countMatches = 0;

        while (!fem.isEmpty() && !mal.isEmpty()) {
            Integer curF = fem.peek();
            Integer curM = mal.peek();

            if (curF <= 0) {
                fem.poll();
                continue;
            }

            if (curM <= 0) {
                mal.pop();
                continue;
            }

            if (curM % 25 == 0) {
                mal.pop();
                mal.pop();
                continue;
            }

            if (curF % 25 == 0) {
                fem.poll();
                fem.poll();
                continue;
            }

            if (curM.equals(curF)) {
                mal.pop();
                fem.poll();
                countMatches++;

            } else {
                fem.poll();
                Integer male5 = mal.pop();
                mal.addFirst(Integer.parseInt(String.valueOf(male5)) - 2);
            }

        }

        System.out.printf("Matches: %d%n", countMatches);

        if (mal.isEmpty()) {
            System.out.println("Males left: none");

        } else {
            System.out.print("Males left: ");

            System.out.print(mal.stream().map(String::valueOf).
                    collect(Collectors.joining(", ")));
            System.out.println();
        }


        if (fem.isEmpty()) {
            System.out.println("Females left: none");

        } else {
            System.out.print("Females left: ");

            System.out.print(fem.stream().map(String::valueOf).
                    collect(Collectors.joining(", ")));
        }
    }

}

