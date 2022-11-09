package setAndMapAdvanced.exercise;

import java.util.*;

public class HandsOfCards {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<String>> people = new LinkedHashMap();

        fillWithCards(scanner, input, people);

        sumAndPrint(people);
    }

    private static void sumAndPrint(Map<String, List<String>> people) {

        for (Map.Entry<String, List<String>> entry : people.entrySet()) {
            int sum = calculatePoints(entry);

            System.out.printf("%s: %d%n", entry.getKey(), sum);
        }

    }

    private static int calculatePoints(Map.Entry<String, List<String>> entry) {

        int sum = 0;

        for (int i = 0; i < entry.getValue().size(); i++) {

            int power = 0;
            int type = 0;

            if (entry.getValue().get(i).length() == 3) {

                power = 10;
                char third = entry.getValue().get(i).charAt(2);

                if (third == 'S') {
                    type = 4;

                } else if (third == 'H') {
                    type = 3;

                } else if (third == 'D') {
                    type = 2;

                } else if (third == 'C') {
                    type = 1;

                }

            } else {

                char first = entry.getValue().get(i).charAt(0);
                char second = entry.getValue().get(i).charAt(1);

                if (first >= 50 && first <= 57) {
                    power = (int) first - 48;

                } else if (first == 65) {
                    power = 14;

                } else if (first == 74) {
                    power = 11;

                } else if (first == 81) {
                    power = 12;

                } else if (first == 75) {
                    power = 13;

                }

                if (second == 'S') {
                    type = 4;

                } else if (second == 'H') {
                    type = 3;

                } else if (second == 'D') {
                    type = 2;

                } else if (second == 'C') {
                    type = 1;
                }

            }

            sum += power * type;
        }

        return sum;
    }

    private static void fillWithCards(Scanner scanner, String input, Map<String, List<String>> people) {
        while (!input.equals("JOKER")) {

            String name = input.split(": ")[0];
            String element = input.split(": ")[1];

            String[] cards = element.split(", ");

            people.putIfAbsent(name, new ArrayList<>());

            for (String card : cards) {

                if (!people.get(name).contains(card)) {
                    people.get(name).add(card);
                }

            }

            input = scanner.nextLine();
        }

    }


}

