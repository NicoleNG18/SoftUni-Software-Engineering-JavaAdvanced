package MultiDimensionalArrays.exercise;

import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        int size = Integer.parseInt(input[0]);

        String fillingType = input[1];

        int[][] matrix = new int[size][size];

        if (fillingType.equals("A")) {
            makeMatrixA(matrix);

        } else {
            makeMatrixB(matrix);
        }

        printMatrix(matrix);

    }

    private static void makeMatrixB(int[][] matrix) {

        int fillingElement = 1;

        int cols = 0;
        int rows = 0;

        int countOfFilling = 0;

        while (countOfFilling < matrix.length) {
            //down
            if (countOfFilling % 2 == 0) {

                for (int i = 0; i < matrix.length; i++) {
                    matrix[rows][cols] = fillingElement;
                    fillingElement++;
                    rows++;
                }

                cols++;
                rows--;
            }
            //up
            else {

                for (int i = matrix.length - 1; i >= 0; i--) {
                    matrix[rows][cols] = fillingElement;
                    fillingElement++;
                    rows--;
                }

                cols++;
                rows++;

            }
            countOfFilling++;
        }

    }

    private static void makeMatrixA(int[][] matrix) {

        int fillingElement = 1;

        for (int cols = 0; cols < matrix.length; cols++) {

            for (int rows = 0; rows < matrix.length; rows++) {
                matrix[rows][cols] = fillingElement;
                fillingElement++;
            }

        }

    }

    private static void printMatrix(int[][] matrix) {

        for (int[] ints : matrix) {

            for (int j = 0; j < matrix.length; j++) {
                System.out.print(ints[j] + " ");
            }

            System.out.println();
        }

    }


}

