package MultiDimensionalArrays.lab;

import java.util.Arrays;
import java.util.Scanner;

public class SumMatrix {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] meas = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        makeOutput(meas, scanner);

    }

    private static void makeOutput(int[] meas, Scanner scanner) {

        System.out.println(meas[0]);
        System.out.println(meas[1]);

        int sum = 0;

        for (int i = 0; i < meas[0]; i++) {

            int[] currentRow = Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt).toArray();

            for (int j = 0; j < meas[1]; j++) {
                sum += currentRow[j];
            }

        }

        System.out.println(sum);
    }


}

