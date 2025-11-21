package gr.aueb.sev.ch6;

import java.util.Arrays;

/**
 * Mapping
 */
public class MappingApp {

    public static void main(String[] args) {
        int[] salaries = {1000, 1200, 900, 1700};
        final double BONUS_PERCENT = 0.25;

        double[] salariesWithBonus = getSalariesWithBonus(salaries, BONUS_PERCENT);

        System.out.println("Salaries with bonus: ");
        for (double salary : salariesWithBonus) {
            System.out.printf("%.2f ", salary);
        }
    }

    /**
     * Returns a new array of salaries after applying the bonus
     * @param salaries the array of base salaries
     * @param bonusRate the bonus rate (e.g. 0.10 for 10%)
     * @return a new array containing the updated salaries
     */
    public static double[] getSalariesWithBonus(int[] salaries, double bonusRate) {
        if (salaries == null || salaries.length == 0) {
            return new double[0];
        }

        double[] updated = new double[salaries.length];

        for (int i = 0; i < salaries.length; i++) {
            updated[i] = salaries[i] + (salaries[i] * bonusRate);
        }

        return updated;

    }
}
