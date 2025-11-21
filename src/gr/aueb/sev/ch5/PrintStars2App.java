package gr.aueb.sev.ch5;

import java.util.Scanner;

public class PrintStars2App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stars = 0;
        int choice = 0;

        while (true){

            System.out.println("Παρακαλώ επιλέξτε ένα από τις παρακάτω εκτυπώσεις");
            System.out.println("1. N οριζόντια αστεράκια");
            System.out.println("2. N κάθετα αστεράκια");
            System.out.println("3. Πλέγμα NxN");
            System.out.println("4. Από 1 εώς N");
            System.out.println("5. Από N εώς 1");
            System.out.println("6. Έξοδος");
            System.out.println("Δώστε αριθμό επιλογής:");

            choice = scanner.nextInt();

            if (choice == 6) {
                System.out.println("Exiting...");
                break;
            }

            if (choice < 0 || choice > 6) {
                System.out.println("Παρακαλώ δώστε κατάλληλη επιλογή");
                continue;
            }

            System.out.println("Παρακαλώ δώστε τον αριθμό των αστεριών (-1 για έξοδο)");
            stars = scanner.nextInt();

            if (stars == -1){
                System.out.println("Exiting...");
                break;
            }

            switch (choice){
                case 1:
                    printHorizontalStars(stars);
                    break;
                case 2:
                    printVerticalStars(stars);
                    break;
                case 3:
                    printGridOfStars(stars);
                    break;
                case 4:
                    printOneToNStars(stars);
                    break;
                case 5:
                    printNToOneStars(stars);
                    break;
                default:
                    break;
            }

            System.out.print("\n");
        }
    }
    public static void printHorizontalStars(int stars) {
        for (int i = 1; i <= stars; i++){
            System.out.print("*");
        }
    }

    public static void printVerticalStars(int stars){
        for (int i = 1; i <= stars; i++){
            System.out.println("*");
        }
    }

    public static void printGridOfStars(int stars){
        for (int i = 1; i <= stars; i++) {
            printHorizontalStars(stars);
            System.out.println();
        }
    }

    public static void printOneToNStars(int stars) {
        for (int i = 1; i <= stars; i++) {
            printHorizontalStars(i);
            System.out.println();
        }
    }

    public static void printNToOneStars(int stars) {
        for (int i = stars; i >= 1; i--) {
            printHorizontalStars(i);
            System.out.println();
        }
    }
}
