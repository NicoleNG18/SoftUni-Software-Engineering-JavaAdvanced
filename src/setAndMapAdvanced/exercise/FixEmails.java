package setAndMapAdvanced.exercise;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        Map<String, String> people = new LinkedHashMap<>();

        while (!command.equals("stop")) {

            String name = command;
            String email = scanner.nextLine();

            String[] arr = email.split("\\.");
            arr[arr.length - 1].toLowerCase(Locale.ROOT);

            if (!isValid(arr)) {
                people.putIfAbsent(name, " ");
                people.put(name, email);
            }

            command = scanner.nextLine();
        }

        for (Map.Entry<String, String> entry : people.entrySet()) {
            System.out.printf("%s -> %s%n", entry.getKey(), entry.getValue());
        }

    }

    private static boolean isValid(String[] arr) {
        return arr[arr.length - 1].equals("us") || arr[arr.length - 1].equals("uk") || arr[arr.length - 1].equals("com");
    }


}
