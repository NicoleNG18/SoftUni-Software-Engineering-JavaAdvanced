package MultiDimensionalArrays.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int matrixRows = input[0];
        int matrixCols = input[1];

        String[][] matrix = new String[matrixRows][matrixCols];

        fillTheMatrix(matrixRows, matrixCols, matrix);

        printMatrix(matrix);
    }

    private static void printMatrix(String[][] matrix) {
        for (String[] strings : matrix) {

            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(strings[j] + " ");
            }

            System.out.println();
        }

    }

    private static void fillTheMatrix(int matrixRows, int matrixCols, String[][] matrix) {

        for (int currentRow = 0; currentRow < matrixRows; currentRow++) {

            for (int currentCol = 0; currentCol < matrixCols; currentCol++) {

                StringBuilder currentStr = new StringBuilder();

                char firstAndLast = (char) (97 + currentRow);

                char middle = (char) (97 + currentCol + currentRow);

                currentStr.append(firstAndLast);
                currentStr.append(middle);
                currentStr.append(firstAndLast);

                matrix[currentRow][currentCol] = currentStr.toString();
            }

        }

    }


}

