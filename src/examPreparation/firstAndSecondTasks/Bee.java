package examPreparation.firstAndSecondTasks;

import java.util.Scanner;

public class Bee {
    private static int currentRow = 0;
    private static int currentCol = 0;
    private static int flowers = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        char[][] matrix = new char[n][n];

        for (int i = 0; i < n; i++) {

            String input = scanner.nextLine();

            for (int j = 0; j < n; j++) {

                matrix[i][j] = input.charAt(j);

                if (matrix[i][j] == 'B') {
                    currentRow = i;
                    currentCol = j;
                }
            }
        }

        String command = scanner.nextLine();

        while (!command.equals("End")) {
            switch (command) {
                case "up" -> moveTheBee(matrix, -1, 0);
                case "down" -> moveTheBee(matrix, 1, 0);
                case "left" -> moveTheBee(matrix, 0, -1);
                case "right" -> moveTheBee(matrix, 0, 1);
            }

            if (!isInBoundsMatrix(currentRow, currentCol, matrix)) {
                break;
            }

            command = scanner.nextLine();
        }

        if (!isInBoundsMatrix(currentRow, currentCol, matrix)) {
            System.out.println("The bee got lost!");
        }

        if (flowers < 5) {
            System.out.printf("The bee couldn't pollinate the flowers, she needed %d flowers more%n", 5 - flowers);

        } else {
            System.out.printf("Great job, the bee manage to pollinate %d flowers!%n", flowers);
        }

        print2DArray(matrix);
    }

    private static void print2DArray(char[][] matrix) {
        for (char[] chars : matrix) {

            for (int j = 0; j < matrix.length; j++) {
                System.out.print(chars[j]);
            }

            System.out.println();
        }

    }

    private static void moveTheBee(char[][] matrix, int row, int col) {
        int newRow = currentRow + row;
        int newCol = currentCol + col;

        matrix[currentRow][currentCol] = '.';

        if (isInBoundsMatrix(newRow, newCol, matrix)) {

            if (matrix[newRow][newCol] == 'f') {

                flowers++;
                matrix[newRow][newCol] = 'B';

                currentRow = newRow;
                currentCol = newCol;

            } else if (matrix[newRow][newCol] == 'O') {

                matrix[newRow][newCol] = 'B';

                currentCol = newCol;
                currentRow = newRow;

                moveTheBee(matrix, row, col);

            } else {
                matrix[newRow][newCol] = 'B';

                currentRow = newRow;
                currentCol = newCol;
            }
        } else {
            currentRow = newRow;
            currentCol = newCol;

            return;
        }

    }

    private static boolean isInBoundsMatrix(int newRow, int newCol, char[][] matrix) {
        return newRow >= 0 && newCol >= 0 && newRow < matrix.length && newCol < matrix.length;
    }

}
