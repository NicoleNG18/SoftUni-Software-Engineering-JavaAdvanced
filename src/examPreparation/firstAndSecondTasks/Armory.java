package examPreparation.firstAndSecondTasks;

import java.util.Scanner;

public class Armory {
    private static int currentRow = 0;
    private static int currentCol = 0;
    private static int finalSum = 0;
    private static int firstMrow = 0;
    private static int firstMcol = 0;
    private static int secondMrow = 0;
    private static int secondMcol = 0;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countM = 0;
        int n = Integer.parseInt(scanner.nextLine());

        char[][] matrix = new char[n][n];

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();

            for (int j = 0; j < n; j++) {
                matrix[i][j] = input.charAt(j);

                if (matrix[i][j] == 'A') {
                    currentCol = j;
                    currentRow = i;
                }

                if (matrix[i][j] == 'M' && countM == 0) {
                    countM++;
                    firstMrow = i;
                    firstMcol = j;

                } else if (matrix[i][j] == 'M' && countM == 1) {
                    secondMrow = i;
                    secondMcol = j;
                }
            }
        }

        while (true) {
            String command = scanner.nextLine();
            switch (command) {
                case "up" -> moveTheOfficer(matrix, -1, 0);
                case "down" -> moveTheOfficer(matrix, 1, 0);
                case "left" -> moveTheOfficer(matrix, 0, -1);
                case "right" -> moveTheOfficer(matrix, 0, 1);
            }

            if(!isInTheMatrix(matrix,currentRow,currentCol) || finalSum>=65){
                break;
            }
        }


        if(!isInTheMatrix(matrix,currentRow,currentCol)){
            System.out.println("I do not need more swords!");

        } else{
            System.out.println("Very nice swords, I will come back for more!");
        }

        System.out.printf("The king paid %d gold coins.%n",finalSum);
        printTheArmory(matrix);
    }

    private static void printTheArmory(char[][] matrix) {

        for (char[] chars : matrix) {

            for (int m = 0; m < matrix.length; m++) {
                System.out.print(chars[m]);
            }

            System.out.println();
        }
    }

    private static void moveTheOfficer(char[][] matrix, int i, int i1) {

        int newRow = currentRow + i;
        int newCol = currentCol + i1;

        matrix[currentRow][currentCol]='-';

        if (isInTheMatrix(matrix, newRow, newCol)) {

            if (matrix[newRow][newCol] == 'M') {

                if(newRow==firstMrow && newCol==firstMcol){
                    matrix[newRow][newCol]='-';

                    currentRow=secondMrow;
                    currentCol=secondMcol;

                    matrix[currentRow][currentCol]='A';

                } else{

                    matrix[newRow][newCol]='-';

                    currentRow=firstMrow;
                    currentCol=firstMcol;

                    matrix[currentRow][currentCol]='A';
                }

            } else if (matrix[newRow][newCol] != '-') {

                finalSum += Integer.parseInt(String.valueOf(matrix[newRow][newCol]));

                matrix[newRow][newCol]='A';

                currentRow=newRow;
                currentCol=newCol;

            } else {
                matrix[newRow][newCol] = 'A';

                currentRow = newRow;
                currentCol = newCol;
            }
        } else {
            matrix[currentRow][currentCol] = '-';

            currentRow=newRow;
            currentCol=newCol;
            return;
        }
    }

    private static boolean isInTheMatrix(char[][] matrix, int r, int c) {
        return r >= 0 && c >= 0 && r < matrix.length && c < matrix.length;
    }

}

