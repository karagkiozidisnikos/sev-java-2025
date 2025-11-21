package gr.aueb.sev.ch5;

import com.sun.source.doctree.EscapeTree;

import java.util.Scanner;

/**
 * Απλός υπολογιστής τσέπης με μεθόδους
 */
public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;

        while (true) {
            printMenu();

            choice = getOneInt();

            if (choice == 6) {
                System.out.println("Exiting...");
                break;
            }

            if(!isChoiceValid(choice)) {
                System.out.println("Παρακαλώ εισάγετε μία έγκυρη τιμή!");
                continue;
            }

            System.out.println("Το αποτέλεσμα της πράξης είναι " + getResultOnChoice(choice));
            System.out.println("Προχωράμε στην επόμενη πράξη");

        }
    }

    public static void printMenu(){
        System.out.println("Επιλέξτε ένα από τα παρακάτω:");
        System.out.println("1. Πρόσθεση");
        System.out.println("2. Αφαίρεση");
        System.out.println("3. Πολλαπλασιασμός");
        System.out.println("4. Διαίρεση");
        System.out.println("5. Υπόλοιπο διαίρεσης");
        System.out.println("6. Έξοδος");

    }

    public static int getOneInt() {
        return scanner.nextInt();
    }

    public static boolean isChoiceValid(int choice) {
        return choice >= 1 && choice <= 6;
    }

    public static int getResultOnChoice(int choice) {
        int num1 = 0;
        int num2 = 0;
        int result = 0;

        System.out.println("Παρακαλώ εισάγετε δύο ακεραίους");

        num1 = getOneInt();
        num2 = getOneInt();

        switch (choice) {
            case 1:
                result = add(num1, num2);
                break;
            case 2:
                result = sub(num1, num2);
                break;
            case 3:
                result = mul(num1, num2);
                break;
            case 4:
                result = div(num1, num2);
                break;
            case 5:
                result = mod(num1, num2);
                break;
            default:
                System.out.println("Error in choice");
                break;
        }

        return result;
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        return a / b;
    }

    public static int mod(int a, int b) {
        return a % b;
    }
}
