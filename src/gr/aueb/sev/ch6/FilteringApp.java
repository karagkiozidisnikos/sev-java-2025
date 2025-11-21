package gr.aueb.sev.ch6;

import java.util.Arrays;

public class FilteringApp {

    public static void main(String[] args) {
        int[] grades = {4, 9, 9, 8, 7, 2, 1, 4, 10};
        final int PASS_THRESHOLD = 5;

        int[] passed = getPassedGrades(grades, PASS_THRESHOLD);

        System.out.println("Passed grades: ");
        for (int grade : passed) {
            System.out.println(grade + " ");
        }
    }

    public static int[] getPassedGrades(int[] grades, int passThreshold){
        // if (grades.length == 0 || grades == null) // αν ο πίνακας είναι null δεν εφαρμόζεται η .length
        if (grades == null || grades.length == 0) {
            return new int[0];
        }

        int count = 0;
        int[] temp = new int[grades.length]; // worse case: all grades pass

        for (int grade : grades) {
            if (grade >= passThreshold) {
//                temp[count++] = grade; // πρώτα επιστρέφει την τιμή του count και μετά αυξάνει το count κατά 1

                temp[count] = grade;
                count++;
            }
        }

        return Arrays.copyOf(temp, count); // για να φτιάξουμε τον νέο πίνακα που δημιουργήθηκε ως το count
    }
}
