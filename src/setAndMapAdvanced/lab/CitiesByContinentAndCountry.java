package setAndMapAdvanced.lab;

import java.util.*;

public class CitiesByContinentAndCountry {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countInput = Integer.parseInt(scanner.nextLine());

        Map<String, Map<String, List<String>>> continents = new LinkedHashMap<>();

        addInfo(scanner, countInput, continents);

        output(continents);
    }

    private static void addInfo(Scanner scanner, int countInput, Map<String, Map<String, List<String>>> continents) {

        for (int i = 0; i < countInput; i++) {

            String[] inputArr = scanner.nextLine().split("\\s+");

            String continent = inputArr[0];
            String country = inputArr[1];
            String city = inputArr[2];

            continents.putIfAbsent(continent, new LinkedHashMap<>());

            continents.get(continent).putIfAbsent(country, new ArrayList<>());

            continents.get(continent).get(country).add(city);
        }

    }

    private static void output(Map<String, Map<String, List<String>>> continents) {

        for (Map.Entry<String, Map<String, List<String>>> entry : continents.entrySet()) {

            System.out.println(entry.getKey() + ":");

            for (Map.Entry<String, List<String>> countries : entry.getValue().entrySet()) {
                System.out.print(countries.getKey() + " -> ");
                System.out.println(String.join(", ", countries.getValue()));
            }

        }

    }


}



