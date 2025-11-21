package gr.aueb.sev.ch6;

/**
 * Print grades perecentage. Grades exist in range 0-5
 */
public class GradesPercentageApp {

    public static void main(String[] args) {
        int[] grades = new int[] {1, 2, 2, 4, 5, 5, 4, 3, 2, 1, 1, 1, 5 , 4, 0, 0, 0, 2, 3};
        int[] counts = new int[6]; // το length είναι όσο και οι βαθμοί που μπορεί να έχω

        // count grades πόσες φορές ο κάθε βαθμός βρίσκεται στον πίνακα grades
        // enchanced for
        for(int grade : grades) {
            counts[grade]++; // αυξάνω τον μετρητή στη θέση χ όποτε συναντάω τον βαθμό
        }

        // some calculations
        for (int i = 0; i < counts.length; i++) {
            System.out.printf("Grade %d: %.2f%%\n", i, ((double)counts[i] / grades.length) * 100);
        }
    }
}
