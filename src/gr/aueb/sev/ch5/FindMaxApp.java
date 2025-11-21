package gr.aueb.sev.ch5;

import java.util.Scanner;

/**
 * Βρίσκει τον μεγαλύτερο από τρεις ακεραίους αριθμούς
 * με μέθοδο
 */
public class FindMaxApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        System.out.println("Παρακαλώ εισάγετε τους τρεις ακεραίους αριθμούς");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();

        System.out.printf("Ο μεγαλύτερος από τους αριθμους %d, %d, %d είναι ο %d", num1, num2, num3, findMax(num1, num2, num3));
    }

    /**
     * Βρίσκει τον μεγαλύτερο από τους τρεις ακεραίους
     * @param num1 Πρώτος αριθμός προς έλεγχο
     * @param num2 Δεύτερος αριθμός προς έλεγχο
     * @param num3 Τρίτος αριθμός προς έλεγχο
     * @return Επιστρέφει τον μεγαλύτερο από τους τρεις ακεραίους
     */
    public static int findMax(int num1, int num2, int num3){
        int max = num1;

        if (num2 > max) max = num2;
        if (num3 > max) max = num3;

        return max;
    }
}
