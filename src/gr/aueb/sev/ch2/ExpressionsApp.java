package gr.aueb.sev.ch2;

/**
 * Επίδειξω των αριθμητικών τελεστών
 */
public class ExpressionsApp {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 12;
        int num3 = 24;
        int result1 = 0;
        int result2 = 0;
        int result3 = 0;
        int result4 = 0;
        int result5 = 0;

        result1 = num1 + num2;
        result2 = num3++; // post increment πρώτα στο result2 εκχωρείται το 24 και μετά το num3 γίνεται 25
        result4 = ++num3; // pre increment πρώτα το num3 γίνεται 25 και μετά στo result4 εκχωρείται 25

        result1 = result1 + 10;
        result2 += 20;
        result4 = num1 / num2;
        result3 = num2 % num3;

        result5 = (num1 + num2) * (num3 * 2) / (num1 - num2);

    }
}
