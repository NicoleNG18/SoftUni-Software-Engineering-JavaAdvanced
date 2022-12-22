package definingClasses.bankAccountTask;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<Integer, BankAccount> accounts = new HashMap<>();

        while (!input.equals("End")) {

            String[] commandArr = input.split("\\s+");

            switch (commandArr[0]) {

                case "Create" -> {
                    BankAccount account = new BankAccount();
                    int currentId = account.getId();

                    accounts.put(currentId, account);
                    System.out.println("Account ID" + (currentId) + " created");
                }

                case "Deposit" -> {
                    int curId = Integer.parseInt(commandArr[1]);
                    BankAccount currentAcc = accounts.get(curId);

                    if (currentAcc != null) {
                        double amount = Double.parseDouble(commandArr[2]);
                        currentAcc.deposit(amount);
                        System.out.printf("Deposited %.0f to ID%d%n", amount, curId);

                    } else {
                        System.out.println("Account does not exist");
                    }

                }

                case "SetInterest" -> BankAccount.setInterestRate(Double.parseDouble(commandArr[1]));

                case "GetInterest" -> {
                    int currId = Integer.parseInt(commandArr[1]);
                    int years = Integer.parseInt(commandArr[2]);

                    BankAccount bankAcc = accounts.get(currId);

                    if (bankAcc != null) {
                        System.out.printf("%.2f%n", bankAcc.getInterest(years));

                    } else {
                        System.out.println("Account does not exist");
                    }

                }

            }

            input = scanner.nextLine();
        }

    }
}
