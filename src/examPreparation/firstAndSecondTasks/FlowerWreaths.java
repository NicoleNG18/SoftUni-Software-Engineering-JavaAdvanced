package examPreparation.firstAndSecondTasks;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FlowerWreaths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wreaths=0;
        int additionalFlowers=0;

        ArrayDeque<Integer> lilies=new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .forEach(lilies::push);

        ArrayDeque<Integer> roses=Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));

        while (!lilies.isEmpty() && !roses.isEmpty()){

            int curLilies=lilies.pop();
            int curRoses= roses.poll();
            int sum=curLilies+curRoses;

            if(sum==15){
                wreaths++;
            }
            else if(sum>15){

                while (sum>15){
                    sum-=2;
                }

                wreaths++;
            }
            else{
                additionalFlowers+=sum;
            }
        }

        wreaths+=additionalFlowers/15;

        if(wreaths>=5){
            System.out.printf("You made it, you are going to the competition with %d wreaths!",wreaths);

        } else{
            System.out.printf("You didn't make it, you need %d wreaths more!",5-wreaths);
        }

    }
}

