package gr.aueb.sev.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το a ^ n. Για παράδειγμα το
 * 2 ^ 10
 */
public class PowerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int n = 0;
        int mul = 1;

        System.out.println("Παρακαλώ δώστε τον ακέραιο αριθμό που θα υψωθεί σε δύναμη");
        a = scanner.nextInt();

        mul = a;
        System.out.printf("Παρακαλώ δώστε τη δύναμη στην οποία θα υψωθεί ο αριθμός %d\n",a);
        n = scanner.nextInt();

        while (n >= 1){
            mul *= a;
            n--;
        }

        System.out.printf("Ο αριθμός %d υψωμένος στη δύναμη %d είναι: %d",a, n, mul);

    }
}
