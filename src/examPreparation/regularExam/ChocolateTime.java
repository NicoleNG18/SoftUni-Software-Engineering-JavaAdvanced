package examPreparation.regularExam;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChocolateTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Double> milk = Arrays.stream(scanner.nextLine().split("\\s+")).map(Double::parseDouble)
                .collect(Collectors.toCollection(ArrayDeque::new));
        ArrayDeque<Double> cacao = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+")).map(Double::parseDouble)
                .forEach(cacao::push);

        int countMilk = 0;
        int countDark = 0;
        int countBaking = 0;

        while (!milk.isEmpty() && !cacao.isEmpty()) {

            Double curMilk = milk.poll();
            Double curCacao = cacao.pop();

            double sum = Double.parseDouble(String.valueOf(curMilk)) + Double.parseDouble(String.valueOf(curCacao));
            double per = Double.parseDouble(String.valueOf(curCacao)) / sum;

            double percentage = per * 100;

            switch ((int) percentage) {
                case 30 -> countMilk++;
                case 50 -> countDark++;
                case 100 -> countBaking++;
                default -> {
                    double newMilk = Double.parseDouble(String.valueOf(curMilk)) + 10;
                    milk.offer(newMilk);
                }
            }
        }

        if (countBaking != 0 && countDark != 0 && countMilk != 0) {
            System.out.println("It’s a Chocolate Time. All chocolate types are prepared.");

        } else{
            System.out.println("Sorry, but you didn't succeed to prepare all types of chocolates.");
        }

        if(countBaking!=0){
            System.out.printf("# Baking Chocolate --> %d%n",countBaking);
        }

        if(countDark!=0){
            System.out.printf("# Dark Chocolate --> %d%n",countDark);
        }

        if(countMilk!=0){
            System.out.printf("# Milk Chocolate --> %d%n",countMilk);
        }

    }
}

