package setAndMapAdvanced.lab;

import java.util.*;

public class AverageStudentGrades {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countInput = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> grades = new TreeMap<>();

        for (int i = 0; i < countInput; i++) {

            String[] students = scanner.nextLine().split("\\s+");

            String name = students[0];
            double grade = Double.parseDouble(students[1]);

            grades.putIfAbsent(name, new ArrayList<>());
            grades.get(name).add(grade);
        }

        for (Map.Entry<String, List<Double>> entry : grades.entrySet()) {
            double sum = 0;

            for (int i = 0; i < entry.getValue().size(); i++) {
                sum += entry.getValue().get(i);
            }

            double average = sum / entry.getValue().size();

            System.out.print(entry.getKey() + " -> ");

            for (int i = 0; i < entry.getValue().size(); i++) {
                System.out.printf("%.2f ", entry.getValue().get(i));
            }

            System.out.printf("(avg: %.2f)%n", average);
        }

    }


}

