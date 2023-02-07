package examPreparation.firstAndSecondTasks;

import java.util.Scanner;

public class Bomb {

    private static int row = 0;
    private static int col = 0;
    private static boolean reachedEnd = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        char[][] matrix = new char[n][n];

        String[] commands = scanner.nextLine().split(",");

        for (int i = 0; i < n; i++) {

            String[] curRow = scanner.nextLine().split("\\s+");

            for (int j = 0; j < n; j++) {
                matrix[i][j] = curRow[j].charAt(0);

                if (matrix[i][j] == 's') {
                    row = i;
                    col = j;
                }
            }
        }

        for (String move : commands) {
            switch (move) {
                case "up" -> moveTheSapper(matrix, -1, 0);
                case "down" -> moveTheSapper(matrix, 1, 0);
                case "left" -> moveTheSapper(matrix, 0, -1);
                case "right" -> moveTheSapper(matrix, 0, 1);
            }

            if (reachedEnd) {
                break;
            }
        }

        if (areThereBombs(matrix)) {
            System.out.println("Congratulations! You found all bombs!");

        } else if (reachedEnd) {


        } else {
            System.out.printf("%d bombs left on the field. Sapper position: (%d,%d)", bombsLeft(matrix), row, col);
        }
    }

    private static void moveTheSapper(char[][] matrix, int curRow, int curCol) {

        int newRow=row+curRow;
        int newCol=col+curCol;

        if(isInBounds(newRow,newCol,matrix)){
            matrix[row][col]='+';

            if(matrix[newRow][newCol]=='e'){
                reachedEnd=true;
                return;

            } else if(matrix[newRow][newCol]=='B'){
                System.out.println("You found a bomb!");
                matrix[newRow][newCol]='s';

            } else if(matrix[newRow][newCol]=='+'){
                matrix[newRow][newCol]='s';
            }

        } else{
            return;
        }

        row=newRow;
        col=newCol;

    }

    private static boolean isInBounds(int row, int col, char[][] matrix) {
        return row >= 0 && row < matrix.length && col >= 0 && col < matrix.length;
    }

    private static int bombsLeft(char[][] matrix) {
        int count = 0;

        for (char[] chars : matrix) {

            for (int j = 0; j < matrix.length; j++) {

                if (chars[j] == 'B') {
                    count++;
                }
            }
        }
        return count;

    }

    private static boolean areThereBombs(char[][] matrix) {
        for (char[] chars : matrix) {

            for (int j = 0; j < matrix.length; j++) {

                if (chars[j] == 'B') {
                    return false;
                }

            }
        }
        return true;
    }


}

