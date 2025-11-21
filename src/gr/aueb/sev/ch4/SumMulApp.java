package gr.aueb.sev.ch4;

/**
 * Υπολογίζει το άθροισμα και το γινόμενο των
 * 10 πρώτων ακεραίων από 1 - 10
 */
public class SumMulApp {

    public static void main(String[] args) {
        int sum = 0;
        int mul = 1;

        for (int i = 1; i <= 10; i++) {
            sum += i;
            mul *= i;
        }

        System.out.println("Το άθροισμα των 10 πρώτων ακεραίων είναι " + sum);
        System.out.println("Το γινόμενο των 10 πρώτων ακεραίων είναι " + mul);

    }
}