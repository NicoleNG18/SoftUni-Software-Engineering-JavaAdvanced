package MultiDimensionalArrays.lab;

import java.util.Arrays;
import java.util.Scanner;

public class WrongMeasurements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());

        //readingTheInputMatrix
        String[] current = scanner.nextLine().split("\\s+");

        int cols = current.length;

        int[][] inputMatrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {

            int[] intRow = Arrays.stream(current).mapToInt(Integer::parseInt).toArray();

            System.arraycopy(intRow, 0, inputMatrix[i], 0, intRow.length);

            if (i != rows - 1) {
                current = scanner.nextLine().split("\\s+");
            }

        }

        int[] indexes = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        int wrong = inputMatrix[indexes[0]][indexes[1]];

        int[][] finalMatrix = new int[rows][cols];

        //filling the final matrix

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                if (inputMatrix[i][j] != wrong) {
                    finalMatrix[i][j] = inputMatrix[i][j];

                } else {

                    int sum = 0;
                    //left
                    if (validateIndex(inputMatrix, i, j - 1) && inputMatrix[i][j - 1] != wrong) {
                        sum += inputMatrix[i][j - 1];
                    }
                    //right
                    if (validateIndex(inputMatrix, i, j + 1) && inputMatrix[i][j + 1] != wrong) {
                        sum += inputMatrix[i][j + 1];
                    }
                    //up
                    if (validateIndex(inputMatrix, i - 1, j) && inputMatrix[i - 1][j] != wrong) {
                        sum += inputMatrix[i - 1][j];
                    }
                    //down
                    if (validateIndex(inputMatrix, i + 1, j) && inputMatrix[i + 1][j] != wrong) {
                        sum += inputMatrix[i + 1][j];
                    }

                    finalMatrix[i][j] = sum;
                }

            }

        }

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {
                System.out.print(finalMatrix[i][j] + " ");
            }

            System.out.println();
        }


    }

    public static boolean validateIndex(int[][] matrix, int i, int j) {
        return i >= 0 && j >= 0 && i < matrix.length && j < matrix[0].length;
    }


}

