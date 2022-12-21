package definingClasses.carTask;

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
            Car car=new Car();
            car.setBrand(helpArr[0]);
            car.setModel(helpArr[1]);
            car.setHorsepower(Integer.parseInt(helpArr[2]));
            System.out.println(car.carInfo());
        }

    }
}
