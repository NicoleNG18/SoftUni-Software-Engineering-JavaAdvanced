package setAndMapAdvanced.exercise;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, String> contacts = new LinkedHashMap<>();

        search(scanner, contacts);

        checkAndPrint(scanner, contacts);
    }

    private static void checkAndPrint(Scanner scanner, Map<String, String> contacts) {

        String searchCommand = scanner.nextLine();

        while (!searchCommand.equals("stop")) {

            if (contacts.containsKey(searchCommand)) {
                System.out.printf("%s -> %s%n", searchCommand, contacts.get(searchCommand));

            } else {
                System.out.printf("Contact %s does not exist.%n", searchCommand);
            }

            searchCommand = scanner.nextLine();
        }

    }

    private static void search(Scanner scanner, Map<String, String> contacts) {

        String addCommand = scanner.nextLine();

        while (!addCommand.equals("search")) {

            String[] arr = addCommand.split("-");

            contacts.putIfAbsent(arr[0], " ");
            contacts.put(arr[0], arr[1]);

            addCommand = scanner.nextLine();
        }

    }

}

