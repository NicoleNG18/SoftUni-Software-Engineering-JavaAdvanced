package stackAndQueueExercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> stack = new ArrayDeque<>();

        StringBuilder text = new StringBuilder();

        for (int i = 0; i < n; i++) {

            String input = scanner.nextLine();

            if (input.charAt(0) == '4') {

                if (!stack.isEmpty()) {

                    stack.pop();

                    text.delete(0, text.length());
                    text.append(stack.peek());

                }

            } else {
                String[] command = input.split("\\s+");

                switch (command[0]) {

                    case "1":
                        text.append(command[1]);
                        stack.push(text.toString());

                        break;

                    case "2":
                        int count = Integer.parseInt(command[1]);

                        text.delete(text.length() - count, text.length());
                        stack.push(text.toString());

                        break;

                    case "3":
                        int index = Integer.parseInt(command[1]);
                        System.out.println(text.charAt(index - 1));

                        break;
                }

            }

        }

    }


}

