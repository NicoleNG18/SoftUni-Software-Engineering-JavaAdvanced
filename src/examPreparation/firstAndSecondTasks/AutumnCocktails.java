package examPreparation.firstAndSecondTasks;

import java.util.*;
import java.util.stream.Collectors;

public class AutumnCocktails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> ingredients = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));

        ArrayDeque<Integer> freshness = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .forEach(freshness::push);

        int countPearSour = 0;
        int countTheHarvest = 0;
        int countAppleHinny = 0;
        int countHighFashion = 0;

        while (!ingredients.isEmpty() && !freshness.isEmpty()) {

            int curIngr = ingredients.poll();

            if (curIngr != 0) {

                int curFr = freshness.pop();
                int sum = curFr * curIngr;

                switch (sum) {
                    case 150 -> countPearSour++;
                    case 250 -> countTheHarvest++;
                    case 300 -> countAppleHinny++;
                    case 400 -> countHighFashion++;
                    default -> {
                        curIngr += 5;
                        ingredients.offer(curIngr);
                    }
                }
            }
        }

        if (areAllMade(countAppleHinny, countHighFashion, countPearSour, countTheHarvest)) {
            System.out.println("It's party time! The cocktails are ready!");

        } else {
            System.out.println("What a pity! You didn't manage to prepare all cocktails.");
        }

        if(!ingredients.isEmpty()){
            System.out.printf("Ingredients left: %d%n",ingredients.stream().reduce(0,Integer::sum));
        }

        if(countAppleHinny!=0){
            System.out.printf("# Apple Hinny --> %d%n",countAppleHinny);
        }

        if(countHighFashion!=0) {
            System.out.printf("# High Fashion --> %d%n", countHighFashion);
        }

        if(countPearSour!=0) {
            System.out.printf("# Pear Sour --> %d%n", countPearSour);
        }

        if(countTheHarvest!=0) {
            System.out.printf("# The Harvest --> %d%n", countTheHarvest);
        }


    }

    private static boolean areAllMade(int countAppleHinny, int countHighFashion, int countPearSour, int countTheHarvest) {
        return countAppleHinny != 0 && countHighFashion != 0 && countPearSour != 0 && countTheHarvest != 0;
    }
}

