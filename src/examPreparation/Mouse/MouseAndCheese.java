package examPreparation.Mouse;

import java.util.Scanner;

public class MouseAndCheese {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Character[][] matrix = new Character[n][n];

        int mouseRow = -1;
        int mouseCol = -1;

        for (int i = 0; i < n; i++) {

            String command = scanner.nextLine();

            for (int j = 0; j < n; j++) {
                matrix[i][j] = command.charAt(j);
                if (matrix[i][j] == 'M') {
                    mouseRow = i;
                    mouseCol = j;
                }
            }

        }

        boolean check = true;
        int cheeseEated = 0;
        String commands = scanner.nextLine();

        while (!commands.equals("end")) {

            matrix[mouseRow][mouseCol] = '-';

            switch (commands) {
                case "up" -> {
                    mouseRow--;
                    if (mouseRow >= 0 && mouseRow < n) {

                        if (matrix[mouseRow][mouseCol] == 'c') {
                            cheeseEated++;

                        } else if (matrix[mouseRow][mouseCol] == 'B') {
                            matrix[mouseRow][mouseCol] = '-';
                            mouseRow--;

                            if (mouseRow >= 0 && mouseRow < n) {
                                if (matrix[mouseRow][mouseCol] == 'c') {
                                    cheeseEated++;
                                }

                            } else {
                                check = false;
                                break;
                            }
                        }

                        matrix[mouseRow][mouseCol] = 'M';

                    } else {
                        check = false;
                        break;
                    }

                    break;
                }

                case "down" -> {
                    mouseRow++;

                    if (mouseRow < n) {

                        if (matrix[mouseRow][mouseCol] == 'c') {
                            cheeseEated++;

                        } else if (matrix[mouseRow][mouseCol] == 'B') {
                            matrix[mouseRow][mouseCol] = '-';
                            mouseRow++;

                            if (mouseRow < n) {
                                if (matrix[mouseRow][mouseCol] == 'c') {
                                    cheeseEated++;
                                }

                            } else {
                                check = false;
                                break;
                            }
                        }

                        matrix[mouseRow][mouseCol] = 'M';
                    } else {
                        check = false;
                        break;
                    }
                    break;
                }

                case "right" -> {
                    mouseCol++;

                    if (mouseCol < n) {
                        if (matrix[mouseRow][mouseCol] == 'c') {
                            cheeseEated++;

                        } else if (matrix[mouseRow][mouseCol] == 'B') {
                            matrix[mouseRow][mouseCol] = '-';
                            mouseCol++;

                            if (mouseCol < n) {
                                if (matrix[mouseRow][mouseCol] == 'c') {
                                    cheeseEated++;
                                }

                            } else {
                                check = false;
                                break;
                            }
                        }
                        matrix[mouseRow][mouseCol] = 'M';

                    } else {
                        check = false;
                        break;
                    }
                    break;
                }

                case "left" -> {
                    mouseCol--;

                    if (mouseCol >= 0 && mouseCol < n) {
                        if (matrix[mouseRow][mouseCol] == 'c') {
                            cheeseEated++;

                        } else if (matrix[mouseRow][mouseCol] == 'B') {
                            matrix[mouseRow][mouseCol] = '-';
                            mouseCol--;

                            if (mouseCol >= 0 && mouseCol < n) {
                                if (matrix[mouseRow][mouseCol] == 'c') {
                                    cheeseEated++;
                                }

                            } else {
                                check = false;
                                break;
                            }
                        }
                        matrix[mouseRow][mouseCol] = 'M';
                    } else {
                        check = false;
                        break;
                    }
                    break;
                }
            }

            if (mouseCol < 0 || mouseRow < 0 || mouseRow >= n || mouseCol >= n) {
                break;
            }

            commands = scanner.nextLine();

        }

        if (!check) {
            System.out.println("Where is the mouse?");
        }

        if (cheeseEated >= 5) {
            System.out.printf("Great job, the mouse is fed %d cheeses!%n", cheeseEated);

        } else {
            System.out.printf("The mouse couldn't eat the cheeses, she needed %d cheeses more.%n", 5 - cheeseEated);
        }

        for (Character[] characters : matrix) {

            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(characters[j]);
            }

            System.out.println();
        }


    }
}

