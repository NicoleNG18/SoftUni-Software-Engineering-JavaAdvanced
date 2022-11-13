package setAndMapAdvanced.exercise;

import java.util.*;

public class UserLogs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        TreeMap<String, LinkedHashMap<String, Integer>> users = new TreeMap<>();

        while (!input.equals("end")) {

            String[] firstArr = input.split("\\s+");

            String ipAddress = firstArr[0].split("=")[1];
            String message = firstArr[1].split("=")[1];
            String user = firstArr[2].split("=")[1];

            users.putIfAbsent(user, new LinkedHashMap<>());

            users.get(user).putIfAbsent(ipAddress, 0);
            users.get(user).put(ipAddress, users.get(user).get(ipAddress) + 1);

            input = scanner.nextLine();
        }

        print(users);
    }

    private static void print(TreeMap<String, LinkedHashMap<String, Integer>> users) {

        for (var people : users.entrySet()) {

            System.out.printf("%s:%n", people.getKey());

            Map<String, Integer> attacks = people.getValue();
            StringBuilder sb = new StringBuilder();

            for (var entry : attacks.entrySet()) {
                sb.append(entry.getKey())
                        .append(" => ")
                        .append(entry.getValue())
                        .append(", ");
            }

            String finalOutput = sb.substring(0, sb.length() - 2);

            finalOutput = finalOutput + ".";

            System.out.println(finalOutput);
        }

    }


}

