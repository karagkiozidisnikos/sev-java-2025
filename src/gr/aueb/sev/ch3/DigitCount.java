package gr.aueb.sev.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το πλήθος των ψηφίων ενός ακεραίου
 * Για παράδειγμα το πλήθος των ψηφίων του αριθμού
 * 123 είναι 3
 */
public class DigitCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;
        int num = 0;
        int count = 0;

        System.out.println("Παρακαλώ δώστε τον ακέραιο αριθμό");
        inputNum = scanner.nextInt();

        num = inputNum;

        do {
            num = num / 10;
            count++;
        } while (num != 0);

        System.out.printf("Το πλήθος των ψηφίων του αριθμού %d είναι: %d", inputNum, count);
    }
}
