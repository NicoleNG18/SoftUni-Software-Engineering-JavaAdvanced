package stackAndQueue.lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String data = scanner.nextLine();
        ArrayDeque<String> documentsToPrint = new ArrayDeque<>();

        while (!data.equals("print")) {

            if (data.equals("cancel")) {

                if (documentsToPrint.isEmpty()) {
                    System.out.println("Printer is on standby");

                } else {
                    System.out.printf("Canceled %s%n", documentsToPrint.poll());
                }

            } else {
                documentsToPrint.offer(data);

            }

            data = scanner.nextLine();
        }

        documentsToPrint.forEach(System.out::println);

    }


}

