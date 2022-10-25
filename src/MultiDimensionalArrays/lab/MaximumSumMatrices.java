package MultiDimensionalArrays.lab;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumMatrices {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] meas = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt).toArray();

        int[][] matrix = readingMatrix(meas[0], meas[1], scanner);

        int[][] finalMatrix = new int[2][2];

        int maxSum = findMaxSum(matrix, meas[0], meas[1], finalMatrix);

        makeOutput(finalMatrix, maxSum);

    }

    private static int findMaxSum(int[][] matrix, int mea, int mea1, int[][] finalMatrix) {
        int maxSum = 0;
        for (int rows = 0; rows < mea - 1; rows++) {

            int currentSum;

            for (int columns = 0; columns < mea1 - 1; columns++) {

                int first = matrix[rows][columns];
                int second = matrix[rows][columns + 1];
                int third = matrix[rows + 1][columns];
                int fourth = matrix[rows + 1][columns + 1];

                currentSum = first + second + third + fourth;

                if (currentSum > maxSum) {

                    maxSum = currentSum;

                    finalMatrix[0][0] = first;
                    finalMatrix[0][1] = second;
                    finalMatrix[1][0] = third;
                    finalMatrix[1][1] = fourth;

                }

            }

        }

        return maxSum;
    }

    private static void makeOutput(int[][] finalMatrix, int maxSum) {

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 2; j++) {

                System.out.print(finalMatrix[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println(maxSum);

    }

    private static int[][] readingMatrix(int rows, int columns, Scanner scanner) {

        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {

            String[] currentRow = scanner.nextLine().split(", ");

            for (int j = 0; j < columns; j++) {
                matrix[i][j] = Integer.parseInt(currentRow[j]);
            }

        }

        return matrix;
    }


}

