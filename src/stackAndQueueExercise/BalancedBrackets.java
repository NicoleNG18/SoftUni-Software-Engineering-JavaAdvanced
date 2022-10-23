package stackAndQueueExercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedBrackets {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StringBuilder input = new StringBuilder(scanner.nextLine());

        if (input.length() % 2 == 0) {
            isParentheses(input);

        } else {
            System.out.println("NO");
        }

    }

    private static void isParentheses(StringBuilder input) {

        ArrayDeque<Character> stack = new ArrayDeque<>();

        boolean isBreaked = true;

        for (int i = 0; i < input.length(); i++) {

            if (input.charAt(i) == '{' || input.charAt(i) == '[' || input.charAt(i) == '(') {
                stack.push(input.charAt(i));

            } else if (input.charAt(i) == '}' || input.charAt(i) == ']' || input.charAt(i) == ')') {

                if (input.charAt(i) == ')' && stack.pop() != '(' || input.charAt(i) == '}' && stack.pop() != '{'
                        || input.charAt(i) == ']' && stack.pop() != '[') {

                    isBreaked = false;
                    break;
                }
            }

        }


        if (isBreaked) {
            System.out.println("YES");

        } else {
            System.out.println("NO");
        }
    }


}

