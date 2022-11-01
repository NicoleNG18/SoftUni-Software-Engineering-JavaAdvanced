package MultiDimensionalArrays.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        String[][] matrix = new String[dimensions[0]][dimensions[1]];

        readMatrix(matrix, dimensions, scanner);

        String command = scanner.nextLine();

        String[] array = command.split("\\s+");

        commands(scanner, dimensions, matrix, command);
    }

    private static void commands(Scanner scanner, int[] dimensions, String[][] matrix, String command) {

        while (!command.equals("END")) {

            String[] arr = command.split("\\s+");

            if (arr[0].equals("swap") && arr.length == 5) {

                int row1 = Integer.parseInt(arr[1]);
                int col1 = Integer.parseInt(arr[2]);

                int row2 = Integer.parseInt(arr[3]);
                int col2 = Integer.parseInt(arr[4]);

                if (areValid(dimensions, row1, col1, row2, col2)) {

                    swapElements(matrix, row1, col1, row2, col2);

                    printMatrix(matrix);

                } else {
                    System.out.println("Invalid input!");
                }

            } else {
                System.out.println("Invalid input!");
            }

            command = scanner.nextLine();
        }

    }


    private static void printMatrix(String[][] matrix) {
        for (String[] strings : matrix) {

            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(strings[j] + " ");
            }

            System.out.println();
        }

    }

    private static void swapElements(String[][] matrix, int row1, int col1, int row2, int col2) {
        String help = matrix[row1][col1];

        matrix[row1][col1] = matrix[row2][col2];

        matrix[row2][col2] = help;
    }

    private static boolean areValid(int[] dimensions, int row1, int col1, int row2, int col2) {
        return row1 >= 0 && row1 < dimensions[0] && col1 >= 0 && col1 < dimensions[1]
                && row2 >= 0 && row2 < dimensions[0] && col2 >= 0 && col2 < dimensions[1];
    }

    private static void readMatrix(String[][] matrix, int[] meas, Scanner scanner) {
        for (int i = 0; i < meas[0]; i++) {

            String[] row = scanner.nextLine().split("\\s+");

            if (meas[1] >= 0) System.arraycopy(row, 0, matrix[i], 0, meas[1]);
        }

    }


}

