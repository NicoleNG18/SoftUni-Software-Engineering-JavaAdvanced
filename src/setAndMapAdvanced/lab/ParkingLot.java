package setAndMapAdvanced.lab;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ParkingLot {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        Set<String> carPlates = new LinkedHashSet<>();

        doTheCommands(scanner, command, carPlates);

        print(carPlates);
    }

    private static void doTheCommands(Scanner scanner, String command, Set<String> carPlates) {

        while (!command.equals("END")) {

            String[] commandArr = command.split(", ");

            if (commandArr[0].equals("IN")) {
                carPlates.add(commandArr[1]);

            } else {
                carPlates.remove(commandArr[1]);
            }

            command = scanner.nextLine();
        }

    }

    private static void print(Set<String> carPlates) {
        if (carPlates.isEmpty()) {
            System.out.println("Parking Lot is Empty");

        } else {

            for (String s : carPlates) {
                System.out.println(s);
            }

        }
    }


}

