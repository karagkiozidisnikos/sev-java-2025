package gr.aueb.sev.ch1;

import java.util.Scanner;

/**
 * Προσθέτει δύο αριθμούς πυο εισάγει ο χρήστης
 */
public class AdditionApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int sum = 0;

        System.out.println("Παρακαλώ εισάγετε δύο ακεραίους");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        sum = num1 + num2;

        System.out.printf("Το άθροισμα των ακεραίων %d και %d είναι %d", num1, num2, sum);
    }
}
