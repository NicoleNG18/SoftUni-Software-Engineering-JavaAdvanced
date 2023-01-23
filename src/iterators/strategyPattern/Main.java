package iterators.strategyPattern;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        Set<Person> byName=new TreeSet<>(new CompareByName());
        Set<Person> byAge=new TreeSet<>(new CompareByAge());
        while (n-->0){
            String [] input=scanner.nextLine().split("\\s+");
            Person person=new Person(input[0],Integer.parseInt(input[1]));
            byName.add(person);
            byAge.add(person);
        }
        for (Person p:byName) {
            System.out.println(p.toString());
        }
        for (Person e:byAge) {
            System.out.println(e.toString());
        }
    }
}

