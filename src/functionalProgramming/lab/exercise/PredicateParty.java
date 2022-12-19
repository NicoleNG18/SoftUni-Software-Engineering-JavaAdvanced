package functionalProgramming.lab.exercise;

import java.sql.SQLOutput;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateParty {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> names = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("Party!")) {

            String[] commandArr = command.split("\\s+");
            Predicate<String> pr = getPredicate(commandArr);

            switch (commandArr[0]) {
                case "Double" -> {
                    List<String> help = new ArrayList<>();
                    names.stream().filter(pr).forEach(help::add);
                    names.addAll(help);
                }
                case "Remove" -> names.removeIf(pr);
            }

            command = scanner.nextLine();
        }

        if (names.isEmpty()) {
            System.out.println("Nobody is going to the party!");

        } else {
            Collections.sort(names);
            System.out.print(String.join(", ", names) + " are going to the party!");
        }

    }

    private static Predicate<String> getPredicate(String[] commandArr) {

        Predicate<String> predicate = switch (commandArr[1]) {
            case "StartsWith" -> l -> l.startsWith(commandArr[2]);
            case "EndsWith" -> n -> n.endsWith(commandArr[2]);
            case "Length" -> n -> n.length() == Integer.parseInt(commandArr[2]);
            default -> null;
        };

        return predicate;
    }


}
