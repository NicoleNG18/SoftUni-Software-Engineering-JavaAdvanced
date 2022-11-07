package setAndMapAdvanced.lab;

import java.util.*;
import java.util.stream.Collectors;

public class VoinaNumberGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Set<Integer> firstPlayer = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        Set<Integer> secondPlayer = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        int rounds = 0;

        while (!firstPlayer.isEmpty() && !secondPlayer.isEmpty()) {

            rounds++;

            if (rounds == 51) {
                break;
            }

            Iterator<Integer> first = firstPlayer.iterator();
            int firstCard = first.next();
            first.remove();

            Iterator<Integer> second = secondPlayer.iterator();
            int secondCard = second.next();
            second.remove();

            if (firstCard > secondCard) {
                firstPlayer.add(secondCard);
                firstPlayer.add(firstCard);

            } else if (secondCard > firstCard) {
                secondPlayer.add(firstCard);
                secondPlayer.add(secondCard);
            }

        }


        if (firstPlayer.size() > secondPlayer.size()) {
            System.out.println("First player win!");

        } else if (secondPlayer.size() > firstPlayer.size()) {
            System.out.println("Second player win!");

        } else {
            System.out.println("Draw!");
        }

    }


}

