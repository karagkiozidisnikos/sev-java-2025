package gr.aueb.sev.ch3;

import java.util.Scanner;

public class Bingo2App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SECRET_KEY = 12;
        int inputNum = 0;

        while (true) {
            System.out.println("Παρακαλώ εισάγετε έναν ακέραιο");
            inputNum = scanner.nextInt();

            if (inputNum != SECRET_KEY) {
                System.out.println("Not found. Try again");
                continue;
            }
            System.out.println("Success! BINGO!");
            break;
        }

        System.out.println("Thank you for using the app!");
    }
}
