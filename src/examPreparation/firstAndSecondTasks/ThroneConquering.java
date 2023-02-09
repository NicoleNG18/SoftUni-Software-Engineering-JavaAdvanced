package examPreparation.firstAndSecondTasks;

import java.util.Scanner;

public class ThroneConquering {
    private static int currentRow = 0;
    private static int currentCol = 0;
    private static int energy = 0;
    private static boolean reachedHelen = false;
    private static boolean diedParis = false;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        energy = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        char[][] matrix = new char[n][input.length()];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < input.length(); j++) {
                matrix[i][j] = input.charAt(j);

                if (matrix[i][j] == 'P') {
                    currentRow = i;
                    currentCol = j;
                }
            }

            if (i != n - 1) {
                input = scanner.nextLine();
            }

        }

        while (true) {
            String[] arr = scanner.nextLine().split("\\s+");

            int spRow = Integer.parseInt(arr[1]);
            int spCol = Integer.parseInt(arr[2]);

            matrix[spRow][spCol] = 'S';

            switch (arr[0]) {
                case "up" -> moveParis(matrix, -1, 0);
                case "down" -> moveParis(matrix, 1, 0);
                case "left" -> moveParis(matrix, 0, -1);
                case "right" -> moveParis(matrix, 0, 1);
            }

            if(diedParis || reachedHelen){
                break;
            }

        }


        if(diedParis){
            System.out.printf("Paris died at %d;%d.%n",currentRow,currentCol);

        } else{
            System.out.printf("Paris has successfully abducted Helen! Energy left: %d%n",energy);
        }

        printTheSpartaField(matrix);

    }

    private static void moveParis(char[][] matrix, int i, int i1) {
        int newRow = currentRow + i;
        int newCol = currentCol + i1;

        energy--;
        matrix[currentRow][currentCol] = '-';

        if (isInTheField(newRow, newCol, matrix)) {

            if (matrix[newRow][newCol] == 'H') {

                matrix[newRow][newCol] = '-';
                reachedHelen = true;
                return;

            } else if (matrix[newRow][newCol] == 'S') {

                currentRow = newRow;
                currentCol = newCol;
                energy -= 2;

                if (energy <= 0) {
                    diedParis = true;
                    matrix[currentRow][currentCol] = 'X';
                    return;

                } else {
                    matrix[currentRow][currentCol] = 'P';
                }
            } else if (matrix[newRow][newCol] == '-') {

                if(energy>0) {
                    currentRow = newRow;
                    currentCol = newCol;

                    matrix[currentRow][currentCol] = 'P';

                } else{
                    diedParis=true;
                    currentRow=newRow;
                    currentCol=newCol;

                    matrix[newRow][newCol]='X';
                }
            }
        } else {

            matrix[currentRow][currentCol] = 'P';

            if (energy <= 0) {
                diedParis = true;
                matrix[currentRow][currentCol] = 'X';
            }

        }

    }

    public static boolean isInTheField(int row, int col, char[][] matrix) {
        return row >= 0 && col >= 0 && row < matrix.length && col < matrix.length;
    }

    private static void printTheSpartaField(char[][] matrix) {
        for (char[] chars : matrix) {

            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(chars[j]);
            }

            System.out.println();
        }
    }
}

