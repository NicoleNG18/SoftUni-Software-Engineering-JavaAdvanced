package stackAndQueue.lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> data = new ArrayDeque<>();
        String[] input = scanner.nextLine().split("\\s+");

        for (int i = input.length - 1; i >= 0; i--) {
            data.push(input[i]);
        }

        int sum = 0;
        int leftNum;
        char sign;
        int rightNum;

        while (data.size() != 1) {

            leftNum = Integer.parseInt(data.pop());

            sign = data.pop().charAt(0);

            rightNum = Integer.parseInt(data.pop());

            if (sign == 43) {
                sum = leftNum + rightNum;

            } else if (sign == 45) {
                sum = leftNum - rightNum;
            }

            data.push(String.valueOf(sum));
        }

        System.out.println(sum);
    }


}

