package gr.aueb.sev.ch3;

/**
 * Υπολογίζει το άθροισμα των 10 πρώτων ακεραίων
 */
public class Sum10 {

    public static void main(String[] args) {

        int sum = 0;
        int mul = 1;
        int i = 1;

        while (i <= 10){
            sum = sum + i; // sum += i;
            mul = mul * i; // mul *= i;
            i++;
        }

        System.out.println("Το άθροισμα των 10 πρώτων ακεραίων είναι: " + sum);
        System.out.printf("Το γινόμενο των 10 πρώτων ακεραίων είναι: %,d\n", mul);

    }
}
