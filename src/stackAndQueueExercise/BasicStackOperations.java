package stackAndQueueExercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String [] firstLineInput=scanner.nextLine().split("\\s+");

        int numPush=Integer.parseInt(firstLineInput[0]);

        int numPop=Integer.parseInt(firstLineInput[1]);

        int isInTheStack=Integer.parseInt(firstLineInput[2]);

        String [] secondLine=scanner.nextLine().split("\\s+");

        ArrayDeque <Integer> numbers=new ArrayDeque<>();

        for(int i=0;i<numPush;i++){
            numbers.push(Integer.parseInt(secondLine[i]));
        }

        boolean isBreaked=false;

        while(numPop>0){

            numbers.pop();

            if(numbers.isEmpty()){

                System.out.println("0");
                isBreaked=true;

                break;
            }

            numPop--;
        }

        if(!isBreaked){

            if(numbers.contains(isInTheStack)){
                System.out.println("true");

            } else{
                System.out.println(Collections.min(numbers));
            }
        }


    }

}

