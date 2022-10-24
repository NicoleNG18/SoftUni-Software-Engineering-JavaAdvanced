package stackAndQueueExercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int fibonacciNum = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Long> fibonacci = new ArrayDeque<>();

        fibonacci.push(1L);
        fibonacci.push(2L);

        if (fibonacciNum == 1 || fibonacciNum == 0) {
            System.out.println("1");

        } else if (fibonacciNum == 2) {
            System.out.println("2");

        } else {

            int help = 3;

            while (help <= fibonacciNum) {

                long peekNum = fibonacci.pop();

                long newNum = peekNum + fibonacci.peek();

                fibonacci.push(peekNum);
                fibonacci.push(newNum);

                help++;
            }

            System.out.println((fibonacci.peek()));
        }

    }


}

