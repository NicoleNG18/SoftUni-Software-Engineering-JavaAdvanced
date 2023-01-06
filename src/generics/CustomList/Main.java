package generics.CustomList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        CustomList<String> data = new CustomList<String>();

        String command = scanner.nextLine();

        while (!command.equals("END")) {

            String[] arr = command.split("\\s+");

            switch (arr[0]) {
                case "Add" -> {
                    String str = arr[1];
                    data.add(str);
                }

                case "Remove" -> data.remove(Integer.parseInt(arr[1]));

                case "Max" -> System.out.println(data.getMax());

                case "Min" -> System.out.println(data.getMin());

                case "Greater" -> {
                    String comparable = arr[1];
                    System.out.println(data.countGreaterThan(comparable));
                }

                case "Swap" -> {
                    int firstIndex = Integer.parseInt(arr[1]);
                    int secondIndex = Integer.parseInt(arr[2]);
                    data.swap(firstIndex, secondIndex);
                }

                case "Contains" -> {
                    String element = arr[1];
                    System.out.println(data.contains(element));
                }

                case "Print" -> data.print();

                case "Sort" -> Sort.sort(data);

                default -> System.out.println("Invalid command");

            }

            command = scanner.nextLine();
        }

    }


}

