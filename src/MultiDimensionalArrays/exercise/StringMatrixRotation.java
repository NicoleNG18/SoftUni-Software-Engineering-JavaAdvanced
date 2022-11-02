package MultiDimensionalArrays.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rotateCommand = scanner.nextLine();

        StringBuilder strDegrees = new StringBuilder();

        int degrees = findDegrees(rotateCommand, strDegrees);

        List<String> lines = new ArrayList<>();

        int maxLength = readInput(scanner, lines);

        Character[][] matrix = new Character[lines.size()][maxLength];

        fillTheMatrix(lines, maxLength, matrix);

        int typeOfRotation = degrees % 360;

        switch (typeOfRotation) {
            case 0:
                printMatrix(matrix);
                break;

            case 90:
                nineDegrees(matrix);
                break;

            case 180:
                oneiDegrees(matrix);
                break;

            case 270:
                twseDegrees(matrix);
                break;
        }

        // System.out.println();
    }

    private static void twseDegrees(Character[][] matrix) {

        for (int cols = matrix[0].length - 1; cols >= 0; cols--) {

            for (Character[] characters : matrix) {
                System.out.print(characters[cols]);
            }

            System.out.println();

        }

    }

    /* for (int col = cols - 1; col >= 0; col--) {
                        for (int row = 0; row < rows; row++) {
                            System.out.print(matrix[row][col]);
                        }
                        System.out.println();
                    }

     */
    private static void oneiDegrees(Character[][] matrix) {

        for (int row = matrix.length - 1; row >= 0; row--) {

            for (int col = matrix[0].length - 1; col >= 0; col--) {
                System.out.print(matrix[row][col]);
            }

            System.out.println();
        }

    }

    private static void nineDegrees(Character[][] matrix) {

        for (int col = 0; col < matrix[0].length; col++) {

            for (int row = matrix.length - 1; row >= 0; row--) {
                System.out.print(matrix[row][col]);
            }

            System.out.println();
        }

    }


    private static void printMatrix(Character[][] matrix) {
        for (Character[] characters : matrix) {

            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(characters[j]);
            }

            System.out.println();
        }

    }


    private static int findDegrees(String rotateCommand, StringBuilder strDegrees) {
        for (int i = 0; i < rotateCommand.length(); i++) {

            if (rotateCommand.charAt(i) >= 48 && rotateCommand.charAt(i) <= 57) {
                strDegrees.append(rotateCommand.charAt(i));
            }

        }
        return Integer.parseInt(strDegrees.toString());
    }

    private static int readInput(Scanner scanner, List<String> lines) {

        String input = scanner.nextLine();

        int maxLength = Integer.MIN_VALUE;

        while (!input.equals("END")) {

            lines.add(input);

            if (input.length() > maxLength) {
                maxLength = input.length();
            }

            input = scanner.nextLine();

        }

        return maxLength;
    }

    private static void fillTheMatrix(List<String> lines, int maxLength, Character[][] matrix) {
        for (int i = 0; i < lines.size(); i++) {

            for (int j = 0; j < maxLength; j++) {

                if (j < lines.get(i).length()) {
                    matrix[i][j] = lines.get(i).charAt(j);

                } else {
                    matrix[i][j] = 32;
                }
            }

        }

    }


}

