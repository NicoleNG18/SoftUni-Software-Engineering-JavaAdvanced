package MultiDimensionalArrays.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] meas = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        int[][] matrix = new int[meas[0]][meas[1]];

        readMatrix(scanner, meas, matrix);

        printMatrix(findIndexes(matrix), matrix);
    }

    private static void printMatrix(int[] indexes, int[][] matrix) {

        System.out.printf("Sum = %d%n", indexes[2]);

        for (int i = indexes[0]; i < indexes[0] + 3; i++) {

            for (int j = indexes[1]; j < indexes[1] + 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }

    }

    private static int[] findIndexes(int[][] matrix) {

        int bestRow = -1;
        int bestColumn = -1;

        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < matrix.length - 2; i++) {

            for (int j = 0; j < matrix[0].length - 2; j++) {

                int sum = matrix[i][j] + matrix[i][j + 1] + matrix[i][j + 2]
                        + matrix[i + 1][j] + matrix[i + 1][j + 1] + matrix[i + 1][j + 2]
                        + matrix[i + 2][j] + matrix[i + 2][j + 1] + matrix[i + 2][j + 2];

                if (sum > maxSum) {

                    bestRow = i;
                    bestColumn = j;

                    maxSum = sum;

                }

            }

        }

        return new int[]{bestRow, bestColumn, maxSum};

    }

    private static void readMatrix(Scanner scanner, int[] meas, int[][] matrix) {

        for (int i = 0; i < meas[0]; i++) {

            int[] singleRow = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();

            matrix[i] = singleRow;
        }

    }


}

