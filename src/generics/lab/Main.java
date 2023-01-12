package generics.lab;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Scale<Integer> strings=new Scale<>(5,-156);

        System.out.println(strings.getHeavier());
    }
}
