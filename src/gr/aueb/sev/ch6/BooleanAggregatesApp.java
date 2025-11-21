package gr.aueb.sev.ch6;

import java.security.PublicKey;

/**
 * Method that checks if ALL students have passed
 */
public class BooleanAggregatesApp {

    public static void main(String[] args) {
        int[] grades = {9, 8, 6, 10, 5, 4};
        final int THRESHOLD = 5;
        final int PERFECT = 10;

        System.out.println("ALl students passed: " + allPassed(grades, THRESHOLD));
        System.out.println("Any perfect score (== 10): " + anyPerfect(grades, PERFECT));
        System.out.println("None failed: " + noneFailed(grades, THRESHOLD));

    }

    /**
     * Returns true if all grades are  >= passThreshold
     * @param grades the array of grades
     * @param passThreshold the minimum threshold
     * @return true if all grades are >= passThreshold, else false
     */
    public static boolean allPassed(int [] grades, int passThreshold){
        if (grades == null || grades.length == 0) return false;

        for (int grade : grades) {
            if (grade < passThreshold) return false;
        }

        return true;

    }

    /**
     * Checks if any grade = 10
     * @param grades the array of grades
     * @param perfect the perfect score
     * @return true if there is one perfect score, else false
     */
    public static boolean anyPerfect(int[] grades,int perfect) {
        if (grades == null || grades.length == 0) return false;

        for (int grade : grades) {
            if (grade == perfect) return true;
        }
        return false;
    }

    /**
     * Check if all grades are >= 5
     * @param grades the array of grades
     * @param passThreshold the minimum threshold
     * @return true if all grades are >= 5, else false
     */
    public static boolean noneFailed(int[] grades, int passThreshold){
        if (grades == null || grades.length == 0) return false;

        for (int grade : grades){
            if (grade < passThreshold) return false;
        }

        return true;
    }
}
