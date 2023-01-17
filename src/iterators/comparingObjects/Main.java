package iterators.comparingObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> people=new ArrayList<>();
        String command=scanner.nextLine();
        while (!command.equals("END")){
            String arr[]=command.split("\\s+");
            Person current=new Person(arr[0],Integer.parseInt(arr[1]),arr[2]);
            people.add(current);
            command=scanner.nextLine();
        }
        int index=Integer.parseInt(scanner.nextLine())-1;
        int equal=0;
        for (int i = 0; i < people.size(); i++) {
            if(people.get(index).compareTo(people.get(i))==0){
                equal++;
            }
        }
        if(equal!=1) {
            System.out.printf("%d %d %d", equal, people.size() - equal, people.size());
        }
        else{
            System.out.println("No matches");
        }
    }
}
