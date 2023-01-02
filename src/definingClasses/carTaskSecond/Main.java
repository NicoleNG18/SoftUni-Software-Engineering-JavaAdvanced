package definingClasses.carTaskSecond;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());

        List<Car> myCars=new ArrayList<>();

        while(n-->0){

            String [] helpArr=scanner.nextLine().split("\\s+");
            if(helpArr.length==1){
                myCars.add(new Car(helpArr[0]));

            } else {
                myCars.add(new Car(helpArr[0], helpArr[1], Integer.parseInt(helpArr[2])));
            }

        }

        myCars.forEach(e-> System.out.println(e.carInfo()));

    }
}
