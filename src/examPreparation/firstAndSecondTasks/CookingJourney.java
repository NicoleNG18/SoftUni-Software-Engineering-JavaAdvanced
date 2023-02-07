package examPreparation.firstAndSecondTasks;

import java.util.Scanner;

public class CookingJourney {

    private static int row = 0;
    private static int col = 0;
    private static int rowFirst = 0;
    private static int colFirst = 0;
    private static int rowSec = 0;
    private static int colSec = 0;
    private static int money = 0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        char[][] matrix = new char[n][n];
        int countP = 0;

        for (int i = 0; i < n; i++) {
            String currentRow = scanner.nextLine();

            for (int j = 0; j < n; j++) {
                matrix[i][j] = currentRow.charAt(j);

                if (matrix[i][j] == 'S') {
                    row = i;
                    col = j;

                } else if (matrix[i][j] == 'P') {

                    countP++;
                    if (countP == 1) {
                        rowFirst = i;
                        colFirst = j;

                    } else {
                        rowSec = i;
                        colSec = j;
                    }
                }

            }
        }

        while (true) {
            String command = scanner.nextLine();

            switch (command) {
                case "up" -> move(matrix, -1, 0);
                case "down" -> move(matrix, 1, 0);
                case "left" -> move(matrix, 0, -1);
                case "right" -> move(matrix, 0, 1);
            }

            if (!isInBounds(matrix, row, col) || money >=50) {
                break;
            }

        }

        if(!isInBounds(matrix,row,col)){
            System.out.println("Bad news! You are out of the pastry shop.");

        } else{
            System.out.println("Good news! You succeeded in collecting enough money!");
        }

        System.out.printf("Money: %d%n",money);

        printTheMatrix(matrix);
    }

    private static void printTheMatrix(char[][] matrix) {
        for (char[] chars : matrix) {

            for (int j = 0; j < matrix.length; j++) {
                System.out.print(chars[j]);
            }

            System.out.println();
        }
    }

    private static void move(char[][] matrix, int i, int i1) {
        int newRow = row + i;
        int newCol = col + i1;

        matrix[row][col]='-';

        if (!isInBounds(matrix, newRow, newCol)) {
            matrix[row][col] = '-';

            row=newRow;
            col=newCol;
            return;
        }


        if (matrix[newRow][newCol] == 'P') {

            if (newRow == rowFirst) {
                matrix[newRow][newCol] = '-';

                newRow = rowSec;
                newCol = colSec;

                matrix[newRow][newCol] = 'S';

            } else {
                matrix[newRow][newCol] = '-';

                newRow = rowFirst;
                newCol = colFirst;

                matrix[newRow][newCol] = 'S';
            }

        } else if (matrix[newRow][newCol] != '-') {
            money += Integer.parseInt(String.valueOf(matrix[newRow][newCol]));

            matrix[newRow][newCol]='S';
        }

        row=newRow;
        col=newCol;


    }

    private static boolean isInBounds(char[][] matrix, int newRow, int newCol) {
        return newRow >= 0 && newCol >= 0 && newRow < matrix.length && newCol < matrix.length;
    }


}

