package MultiDimensionalArrays.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[size][size];

        readMatrix(matrix, size, scanner);

        int difference = sumMainDiagonal(matrix) - sumSecondDiagonal(matrix);

        System.out.println(Math.abs(difference));
    }

    private static int sumSecondDiagonal(int[][] matrix) {
        int sum = 0;

        int rows = matrix.length - 1;
        int cols = 0;

        while (rows >= 0) {
            sum += matrix[rows][cols];

            rows--;
            cols++;
        }

        return sum;
    }

    private static int sumMainDiagonal(int[][] matrix) {

        int sum = 0;

        int rows = 0;
        int cols = 0;

        while (rows < matrix.length) {
            sum += matrix[rows][cols];

            rows++;
            cols++;

        }

        return sum;
    }

    private static void readMatrix(int[][] matrix, int size, Scanner scanner) {
        for (int i = 0; i < size; i++) {

            int[] row = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();

            System.arraycopy(row, 0, matrix[i], 0, size);

        }

    }


}

