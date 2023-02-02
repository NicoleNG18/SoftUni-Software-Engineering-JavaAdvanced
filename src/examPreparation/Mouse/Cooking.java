package examPreparation.Mouse;

import java.util.*;
import java.util.stream.Collectors;

public class Cooking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> queue=Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toCollection(ArrayDeque::new));

        ArrayDeque<Integer> stack=new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).forEach(stack::push);

        int countBread = 0;
        int countCake = 0;
        int countPie = 0;
        int countPastry = 0;

        while (!queue.isEmpty() && !stack.isEmpty()) {

            int curLi = queue.poll();
            int curIn = stack.pop();
            int sum = curIn + curLi;

            switch (sum) {
                case 25 -> countBread++;
                case 50 -> countCake++;
                case 75 -> countPastry++;
                case 100 -> countPie++;
                default -> stack.push(curIn + 3);
            }
        }

        if (countBread != 0 && countCake != 0 && countPastry != 0 && countPie != 0) {
            System.out.println("Wohoo! You succeeded in cooking all the food!");

        } else {
            System.out.println("Ugh, what a pity! You didn't have enough materials to cook everything.");
        }

        if (queue.isEmpty()) {
            System.out.println("Liquids left: none");

        } else {
            System.out.print("Liquids left: ");

            String remLi=queue.stream().map(String::valueOf).collect(Collectors.joining(", "));
            System.out.println(remLi);
        }

        if (stack.isEmpty()) {
            System.out.println("Ingredients left: none");

        } else {
            System.out.print("Ingredients left: ");

            String remIn=stack.stream().map(String::valueOf).collect(Collectors.joining(", "));
            System.out.println(remIn);
        }

        System.out.printf("Bread: %d%n", countBread);
        System.out.printf("Cake: %d%n", countCake);
        System.out.printf("Fruit Pie: %d%n", countPie);
        System.out.printf("Pastry: %d%n", countPastry);
    }
}
