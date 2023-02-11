package examPreparation.regularExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StickyFingers {
    private static int curRow = 0;
    private static int curCol = 0;
    private static boolean reachedPolice = false;
    private static int pocket = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> commands =
                Arrays.stream(scanner.nextLine().split(","))
                        .collect(Collectors.toList());

        char[][] matrix = new char[n][n];

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");

            for (int j = 0; j < n; j++) {
                matrix[i][j] = input[j].charAt(0);

                if (matrix[i][j] == 'D') {
                    curRow = i;
                    curCol = j;
                }

            }
        }

        while (true) {
            String currentCom = commands.get(0);
            commands.remove(0);

            switch (currentCom) {
                case "up" -> moveDillinger(matrix, -1, 0);
                case "down" -> moveDillinger(matrix, 1, 0);
                case "left" -> moveDillinger(matrix, 0, -1);
                case "right" -> moveDillinger(matrix, 0, 1);
            }

            if (commands.size() == 0 && !reachedPolice) {
                System.out.printf("Your last theft has finished successfully with %d$ in your pocket.%n", pocket);
                break;
            }

            if (reachedPolice) {
                break;
            }

        }

        print2dArray(matrix);
    }

    private static void print2dArray(char[][] matrix) {
        for (char[] chars : matrix) {

            for (int j = 0; j < matrix.length; j++) {
                System.out.print(chars[j] + " ");
            }

            System.out.println();
        }
    }

    private static void moveDillinger(char[][] matrix, int r, int c) {
        int newRow = curRow + r;
        int newCol = curCol + c;

        if (isInBounds(matrix, newRow, newCol)) {
            matrix[curRow][curCol] = '+';

            if (matrix[newRow][newCol] == '$') {
                matrix[newRow][newCol] = 'D';

                int sum = newRow * newCol;
                pocket += sum;

                System.out.printf("You successfully stole %d$.%n", sum);

                curRow = newRow;
                curCol = newCol;

            } else if (matrix[newRow][newCol] == 'P') {
                System.out.printf("You got caught with %d$, and you are going to jail.%n", pocket);
                matrix[newRow][newCol] = '#';

                curCol = newCol;
                curRow = newRow;

                reachedPolice = true;
                return;

            } else {
                matrix[newRow][newCol] = 'D';

                curRow = newRow;
                curCol = newCol;
            }

        } else {
            System.out.println("You cannot leave the town, there is police outside!");
        }
    }

    private static boolean isInBounds(char[][] matrix, int newRow, int newCol) {
        return newRow >= 0 && newCol >= 0 && newRow < matrix.length && newCol < matrix.length;
    }
}

