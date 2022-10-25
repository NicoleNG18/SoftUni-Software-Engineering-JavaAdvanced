package MultiDimensionalArrays.lab;

import java.util.Scanner;

public class IntersectionOfMatrices {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        char[][] first = readingMatrix(rows, columns, scanner);
        char[][] second = readingMatrix(rows, columns, scanner);

        makeOutput(first, second);

    }

    private static void makeOutput(char[][] firstMatrix, char[][] second) {

        for (int i = 0; i < firstMatrix.length; i++) {

            for (int j = 0; j < firstMatrix[i].length; j++) {

                if (firstMatrix[i][j] == second[i][j]) {
                    System.out.print(firstMatrix[i][j] + " ");

                } else {
                    System.out.print("* ");
                }

            }

            System.out.println();
        }

    }

    private static char[][] readingMatrix(int rows, int columns, Scanner scanner) {

        char[][] matrix = new char[rows][columns];

        for (int i = 0; i < rows; i++) {

            String[] currentRow = scanner.nextLine().split("\\s+");

            for (int j = 0; j < columns; j++) {
                matrix[i][j] = currentRow[j].charAt(0);
            }

        }

        return matrix;
    }


}

