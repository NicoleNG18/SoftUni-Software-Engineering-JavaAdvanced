package setAndMapAdvanced.lab;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class AcademyGraduation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countOfInput = Integer.parseInt(scanner.nextLine());

        Map<String, Double> students = new TreeMap<>();

        fillTheMap(scanner, countOfInput, students);

        print(students);
    }

    private static void print(Map<String, Double> students) {

        for (Map.Entry<String, Double> entry : students.entrySet()) {

            System.out.println(entry.getKey() + " is graduated with " + entry.getValue());

        }

    }

    private static void fillTheMap(Scanner scanner, int countOfInput, Map<String, Double> students) {

        for (int i = 0; i < countOfInput; i++) {

            String name = scanner.nextLine();

            double[] scores = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToDouble(Double::parseDouble)
                    .toArray();

            double sum = 0;

            for (double score : scores) {
                sum += score;
            }

            students.put(name, sum / scores.length);
        }

    }


}

