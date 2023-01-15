package iterators.listIterator;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) throws IllegalAccessException {
        Scanner scanner = new Scanner(System.in);
        ListIterator elements = null;

        for(String command = scanner.nextLine(); !command.equals("END"); command = scanner.nextLine()) {
            String[] arr = command.split("\\s+");
            String var5 = arr[0];
            byte var6 = -1;
            switch(var5.hashCode()) {
                case -1933554547:
                    if (var5.equals("HasNext")) {
                        var6 = 2;
                    }
                    break;
                case -1101719596:
                    if (var5.equals("PrintAll")) {
                        var6 = 4;
                    }
                    break;
                case 2404337:
                    if (var5.equals("Move")) {
                        var6 = 1;
                    }
                    break;
                case 77382285:
                    if (var5.equals("Print")) {
                        var6 = 3;
                    }
                    break;
                case 2026540316:
                    if (var5.equals("Create")) {
                        var6 = 0;
                    }
            }

            switch(var6) {
                case 0:
                    elements = new ListIterator((String[])Arrays.copyOfRange(arr, 1, arr.length));
                    break;
                case 1:
                    System.out.println(elements.move());
                    break;
                case 2:
                    System.out.println(elements.hasNext());
                    break;
                case 3:
                    try {
                        elements.print();
                    } catch (IllegalStateException var9) {
                        System.out.println("Invalid Operation!");
                    }
                    break;
                case 4:
                    try {
                        elements.printAll();
                    } catch (IllegalStateException var8) {
                        System.out.println("Invalid Operation!");
                    }
            }
        }

    }
}

