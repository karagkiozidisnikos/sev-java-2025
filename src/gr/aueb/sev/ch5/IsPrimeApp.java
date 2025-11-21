package gr.aueb.sev.ch5;

import java.util.Scanner;

/**
 * Ελέγχει αν ένας αριθμός είναι πρώτος
 */
public class IsPrimeApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        while (true) {
            System.out.println("Παρακαλώ εισάγετε τον αριθμό (0 για έξοδο)");
            num = scanner.nextInt();

            if (num == 0) break;

            if (isPrime(num)) {
                System.out.println("Ο αριθμός που εισάγατε είναι πρώτος");
            }else {
                System.out.println("Ο αριθμός που εισάγατε ΔΕΝ ειναι πρώτος");
            }
        }
    }

    /**
     * Ελέγχει αν ένας αριθμός είναι πρώτος
     * @param num ο αριθμός που θα ελεγχθεί
     * @return true αν είναι πρώτος, false αν δεν είναι
     */
    public static boolean isPrime(int num){
        if (num == 0) return false;
        if (num <= 2) return true;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
