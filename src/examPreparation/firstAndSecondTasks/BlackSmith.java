package examPreparation.firstAndSecondTasks;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BlackSmith {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> steel = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));

        ArrayDeque<Integer> carbon = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .forEach(carbon::push);

        int totalSum=0;

        int countSabre = 0;
        int countKatana = 0;

        int countShamshir = 0;
        int countGladius = 0;

        while (!steel.isEmpty() && !carbon.isEmpty()) {

            int curSteel = steel.poll();
            int curCarbon = carbon.pop();

            int sum = curSteel + curCarbon;

            switch (sum) {

                case 70 -> {
                    totalSum += sum;
                    countGladius++;
                }

                case 80 -> {
                    totalSum += sum;
                    countShamshir++;
                }

                case 90 -> {
                    totalSum += sum;
                    countKatana++;
                }

                case 110 -> {
                    totalSum += sum;
                    countSabre++;
                }

                default -> carbon.push(curCarbon + 5);
            }

        }

        if (countGladius == 0 && countKatana == 0 && countSabre == 0 && countShamshir == 0) {
            System.out.println("You did not have enough resources to forge a sword.");

        } else {
            System.out.printf("You have forged %d swords.%n", totalSum);
        }

        if (steel.isEmpty()) {
            System.out.println("Steel left: none");

        } else {
            System.out.print("Steel left: ");

            String result= steel.stream().map(String::valueOf).collect(Collectors.joining(", "));

            System.out.print(result);
            System.out.println();
        }

        if (carbon.isEmpty()) {
            System.out.println("Carbon left: none");

        } else {
            System.out.print("Carbon left: ");

            String result= carbon.stream().map(String::valueOf).collect(Collectors.joining(", "));

            System.out.print(result);
            System.out.println();
        }

        if(countGladius!=0){
            System.out.printf("Gladius: %d%n",countGladius);
        }

        if(countKatana!=0){
            System.out.printf("Katana: %d%n",countKatana);
        }

        if(countSabre!=0){
            System.out.printf("Sabre: %d%n",countSabre);
        }

        if(countShamshir!=0){
            System.out.printf("Shamshir: %d%n",countShamshir);
        }
    }
}

