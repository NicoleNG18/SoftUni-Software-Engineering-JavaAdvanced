package functionalProgramming.lab;

import java.util.*;
import java.util.stream.Collectors;

public class FilterByAge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        List<Person> people = new ArrayList<>();

        while (count-- > 0) {
            String[] input = scanner.nextLine().split(", ");
            people.add(new Person(input[0], Integer.parseInt(input[1])));
        }

        String condition = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String format = scanner.nextLine();

        people = filterThePeople(people, age, condition);

        printOutput(people, format);
    }


    public static void printOutput(List<Person> people, String format) {
        if (format.equals("name")) {
            people.forEach(e -> System.out.println(e.name));

        } else if (format.equals("age")) {
            people.forEach(e -> System.out.println(e.age));

        } else {
            people.forEach(e -> System.out.println(e.name + " - " + e.age));
        }

    }


    public static List<Person> filterThePeople(List<Person> people, int age, String condition) {

        if (condition.equals("younger")) {
            return people.stream().filter(e -> e.age <= age).collect(Collectors.toList());
        }

        return people.stream().filter(e -> e.age >= age).collect(Collectors.toList());
    }


    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

    }


}
