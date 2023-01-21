package iterators.stackIterator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command= scanner.nextLine();
        Stack data=new Stack();
        while (!command.equals("END")){
            String [] arr=command.split("\\s+|, ");
            if(arr[0].equals("Push")){
                data.push(Arrays.copyOfRange(arr,1,arr.length));
            }
            else{
                try{
                    data.pop();
                }
                catch(IllegalStateException e){
                    System.out.println("No elements");
                }
            }
            command= scanner.nextLine();
        }
        Stack secondData=data.clone();
        print(data);
        print(secondData);
    }

    private static void print(Stack data) {
        for (String s : data) {
            System.out.println(s);
        }
    }
}

