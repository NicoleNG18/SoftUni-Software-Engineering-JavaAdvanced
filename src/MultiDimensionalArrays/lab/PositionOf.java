package MultiDimensionalArrays.lab;

import java.util.Arrays;
import java.util.Scanner;

public class PositionOf {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] matrix = readingMatrix(scanner);
        int number = Integer.parseInt(scanner.nextLine());

        boolean check = false;

        for (int i = 0; i < matrix.length; i++) {

            int help = matrix[i].length;

            for (int j = 0; j < help; j++) {

                if (number == matrix[i][j]) {
                    System.out.printf("%d %d%n", i, j);
                    check = true;
                }

            }

        }

        if (!check) {
            System.out.println("not found");
        }


    }

    private static int[][] readingMatrix(Scanner scanner) {

        int[] measurements = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[][] matrix = new int[measurements[0]][measurements[1]];

        for (int i = 0; i < measurements[0]; i++) {

            String[] currentRow = scanner.nextLine().split("\\s+");

            for (int j = 0; j < measurements[1]; j++) {
                matrix[i][j] = Integer.parseInt(currentRow[j]);
            }

        }

        return matrix;
    }


}

