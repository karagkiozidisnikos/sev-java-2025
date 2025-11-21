package gr.aueb.sev.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το παραγοντικό n!
 */

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int facto = 1;
        int i = 1;

        System.out.println("Παρακαλώ εισάγετε ένα ακέραιο");
        n = scanner.nextInt();

        while (i <= n){
            facto *= i;
            i++;
        }

        System.out.printf("Το παραγοντικό του %d είναι ίσο με %d",n ,facto);
    }
}
