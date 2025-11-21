package gr.aueb.sev.ch8;

import java.util.Scanner;

public class ArithmeticExceptionsWithStateTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        while (true) {
            System.out.println("Please insert a numerator and a denominator");
            numerator = sc.nextInt();
            denominator = sc.nextInt();

            // State testing
            if (isZero(denominator)){
                System.out.println("Please insert a valid denominator");
                continue;
            }

            result = numerator / denominator;
            System.out.printf("%d / %d = %d", numerator, denominator, result);

            if (result == 1) break;

        }
    }

    /**
     * State testing method for zero
     * @param num the number to check for
     * @return true if num is zero else false
     */
    public static boolean isZero(int num){
        return num == 0;
    }

}
