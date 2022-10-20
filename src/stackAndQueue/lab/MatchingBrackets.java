package stackAndQueue.lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder input = new StringBuilder(scanner.nextLine());
        ArrayDeque<Integer> indexes = new ArrayDeque<>();

        for (int i = 0; i <= input.length() - 1; i++) {

            if (input.charAt(i) == 40) {
                indexes.push(i);

            } else if (input.charAt(i) == 41) {
                System.out.println(input.substring(indexes.pop(), i + 1));
            }

        }

    }


}

