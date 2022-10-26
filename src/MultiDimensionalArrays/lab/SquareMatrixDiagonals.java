package MultiDimensionalArrays.lab;

import java.util.Arrays;
import java.util.Scanner;

public class SquareMatrixDiagonals {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int[][] matrix = readMatrix(num, scanner);

        printMainDiagonal(matrix);

        printSecondDiagonal(matrix);

    }

    private static void printSecondDiagonal(int[][] matrix) {

        int cols = 0;

        for (int rows = matrix.length - 1; rows >= 0; rows--) {

            System.out.print(matrix[rows][cols] + " ");
            cols++;

        }

        System.out.println();

    }

    private static void printMainDiagonal(int[][] matrix) {

        int cols = 0;

        for (int[] ints : matrix) {
            System.out.print(ints[cols] + " ");
            cols++;
        }

        System.out.println();

    }

    private static int[][] readMatrix(int num, Scanner scanner) {

        int[][] matrix = new int[num][num];

        for (int i = 0; i < num; i++) {

            int[] currentRow = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();

            System.arraycopy(currentRow, 0, matrix[i], 0, num);

        }

        return matrix;
    }


}
