package gr.aueb.sev.ch4;

import java.util.Scanner;

public class TrainingApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (true){

            System.out.println("Παρακαλώ επιλέξτε ένα από τα παρακάτω προγράμματα");
            System.out.println("1. Εκτύπωση όλων των ζυγών από 1 έως 20");
            System.out.println("2. Άθροισμα των ακεραίων από 1 έως 50");
            System.out.println("3. Εκτύπωση από 1 έως 10 με αντίστροφη σειρά");
            System.out.println("4. Εκτύπωση πυραμίδας από * με 4 σειρές");
            System.out.println("5. Έξοδος");
            System.out.println("Δώστε αριθμό επιλογής:");

            choice = scanner.nextInt();

            if (choice < 0 || choice > 5) {
                System.out.println("Παρακαλώ δώστε κατάλληλη επιλογή");
                continue;
            }

            if (choice == 5) {
                System.out.println("Exiting...");
                break;
            }

            switch (choice){
                case 1:
                    printEvenNumbers1To20();
                    break;
                case 2:
                    sum1To50();
                    break;
                case 3:
                    print10To1();
                    break;
                case 4:
                    printPyramid();
                    break;
                default:
                    break;
            }
        }
    }
    public static void printEvenNumbers1To20() {
        for (int i = 1; i <= 20; i++){
            if (i % 2 == 0) System.out.println(i);
        }
        System.out.print("\n");
    }

    public static void sum1To50(){
        int sum = 0;

        for (int i = 1; i <= 50; i++){
            sum += i;
        }
        System.out.printf("Το άθροισμα είναι: %d\n", sum);
    }

    public static void print10To1(){
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.print("\n");
    }

    public static void printPyramid() {
        System.out.println("   *   ");
        System.out.println("  ***  ");
        System.out.println(" ***** ");
        System.out.println("*******");

    }
}
