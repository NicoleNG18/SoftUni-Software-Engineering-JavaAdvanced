package stackAndQueue.lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int decimalNum = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> digits = new ArrayDeque<>();

        while (decimalNum != 0) {

            digits.push(decimalNum % 2);
            decimalNum /= 2;

        }

        if (!digits.isEmpty()) {
            digits.forEach(System.out::print);

        } else {
            System.out.println("0");
        }

    }


}

