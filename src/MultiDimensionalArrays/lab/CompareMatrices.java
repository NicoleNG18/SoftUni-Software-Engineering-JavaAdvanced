package MultiDimensionalArrays.lab;

import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] measurements1 = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[][] matrix1 = new int[measurements1[0]][measurements1[1]];

        for (int i = 0; i < measurements1[0]; i++) {

            String[] currentRow = scanner.nextLine().split("\\s+");

            for (int j = 0; j < measurements1[1]; j++) {
                matrix1[i][j] = Integer.parseInt(currentRow[j]);
            }

        }

        int[] measurements2 = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[][] matrix2 = new int[measurements2[0]][measurements2[1]];

        for (int i = 0; i < measurements2[0]; i++) {

            String[] currentRow = scanner.nextLine().split("\\s+");

            for (int j = 0; j < measurements2[1]; j++) {
                matrix2[i][j] = Integer.parseInt(currentRow[j]);
            }

        }

        if (measurements1[0] == measurements2[0] && measurements1[1] == measurements2[1]) {
            if (comparingMatrix(matrix1, matrix2, measurements1)) {
                System.out.println("equal");

            } else {
                System.out.println("not equal");
            }

        } else {
            System.out.println("not equal");
        }


    }


    private static boolean comparingMatrix(int[][] firstMatrix, int[][] secondMatrix, int[] meas) {

        for (int i = 0; i < meas[0]; i++) {

            for (int j = 0; j < meas[1]; j++) {

                if (firstMatrix[i][j] != secondMatrix[i][j]) {
                    return false;
                }

            }

        }
        return true;
    }


}


