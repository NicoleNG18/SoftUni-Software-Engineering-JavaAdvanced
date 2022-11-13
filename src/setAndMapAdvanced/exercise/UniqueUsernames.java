package setAndMapAdvanced.exercise;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueUsernames {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Set<String> commands = new LinkedHashSet<>();

        int count = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < count; i++) {
            String current = scanner.nextLine();
            commands.add(current);
        }

        for (String command : commands) {
            System.out.println(command);
        }

    }


}

