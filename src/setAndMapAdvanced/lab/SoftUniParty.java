package setAndMapAdvanced.lab;

import java.util.*;

public class SoftUniParty {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String invitedGuests = scanner.nextLine();

        Set<String> guests = new TreeSet<>();

        makeLists(scanner, invitedGuests, guests);

        partyMode(scanner, guests);

        print(guests);
    }

    private static void print(Set<String> guests) {

        System.out.println(guests.size());

        for (String guest : guests) {
            System.out.println(guest);
        }

    }

    private static void partyMode(Scanner scanner, Set<String> guests) {

        String partyMode = scanner.nextLine();

        while (!partyMode.equals("END")) {

            guests.remove(partyMode);

            partyMode = scanner.nextLine();
        }

    }

    private static void makeLists(Scanner scanner, String invitedGuests, Set<String> guests) {

        while (!invitedGuests.equals("PARTY")) {

            if (invitedGuests.length() == 8) {
                guests.add(invitedGuests);
            }

            invitedGuests = scanner.nextLine();
        }

    }


}

