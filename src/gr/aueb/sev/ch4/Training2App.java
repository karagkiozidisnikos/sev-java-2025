package gr.aueb.sev.ch4;

import java.util.Scanner;

public class Training2App {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;

        while (true){

            System.out.println("Παρακαλώ επιλέξτε ένα από τα παρακάτω προγράμματα");
            System.out.println("1. Εκτύπωση ημέρα εβδομάδας");
            System.out.println("2. Calculator");
            System.out.println("3. Έλεγχος φωνήεν");
            System.out.println("4. Έξοδος");
            System.out.println("Δώστε αριθμό επιλογής:");

            choice = scanner.nextInt();

            if (choice == 4) {
                System.out.println("Exiting...");
                break;
            }

            if (choice < 0 || choice > 4) {
                System.out.println("Παρακαλώ δώστε κατάλληλη επιλογή");
                continue;
            }

            switch (choice){
                case 1:
                    printDayOfTheWeek();
                    break;
                case 2:
                    calculator();
                    break;
                case 3:
                    checkVowel();
                    break;
                default:
                    break;
            }
        }
    }
    public static void printDayOfTheWeek() {
        int day = 0;

        System.out.println("Παρακαλώ δώστε την ημέρα της εβδομάδας που θέλετε να εκτυπωθεί");
        day = scanner.nextInt();

        switch (day){
            case 1:
                System.out.println("Δευτέρα");
                break;
            case 2:
                System.out.println("Τρίτη");
                break;
            case 3:
                System.out.println("Τετάρτη");
                break;
            case 4:
                System.out.println("Πέμπτη");
                break;
            case 5:
                System.out.println("Παρασκευή");
                break;
            case 6:
                System.out.println("Σάββατο");
                break;
            case 7:
                System.out.println("Κυριακή");
                break;
            default:
                break;
        }
        System.out.print("\n");
    }

    public static void calculator(){
        int num1 = 0;
        int num2 = 0;
        char operator = '+';
        int result = 0;

        System.out.println("Παρακαλώ δώστε τους δύο ακεραίους");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        System.out.println("Παρακαλώ δηλώστε την πράξη που θέλτε να εκτελεστεί (+, -, *, /)");
        operator = scanner.next().charAt(0);

        String calc = "+-*/";
        if (calc.indexOf(operator) == -1) {
            System.out.println("Εισάγατε λανθασμένη πράξη");
            return;
        }

        switch (operator){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
        }
        System.out.printf("Το αποτέλεσμα της πράξης %c είναι: %d\n", operator, result);
    }

    public static void checkVowel(){
        char letter = 'Α';

        System.out.println("Παρακαλώ δώστε τον ελληνικό χαρακτήρα");
        letter = scanner.next().charAt(0);
        letter = Character.toUpperCase(letter);

        switch (letter){
            case 'Α','Ε','Ι','Ο','Υ','Η','Ω':
                System.out.println("Ο χαρακτήρας που εισάγατε είναι φωνήεν του ελληνικού αλφαβήτου");
                break;
            default:
                System.out.println("Ο χαρακτήρας που εισάγατε δεν είναι φωνήεν του ελληνικού αλφαβήτου");
                break;

        }
        System.out.print("\n");
    }

}
