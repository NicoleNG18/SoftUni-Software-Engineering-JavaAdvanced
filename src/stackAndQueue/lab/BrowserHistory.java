package stackAndQueue.lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        ArrayDeque<String> urlS = new ArrayDeque<>();
        String currentURL = "blank";

        while (!command.equals("Home")) {

            if (command.equals("back")) {

                if (!urlS.isEmpty()) {
                    currentURL = urlS.pop();

                } else {
                    System.out.println("no previous URLs");
                    command = scanner.nextLine();
                    continue;
                }

            } else {

                if (!currentURL.equals("blank")) {
                    urlS.push(currentURL);
                }

                currentURL = command;

            }

            System.out.println(currentURL);

            command = scanner.nextLine();
        }

    }


}

