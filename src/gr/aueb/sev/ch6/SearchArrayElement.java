package gr.aueb.sev.ch6;

/**
 * Αναζητά ένα στοιχείο σε ένα πίνακα.
 * Η αναζήτηση γίνεται με συγκρίσεις
 */
public class SearchArrayElement {

    public static void main(String[] args) {
        int[] ages = {19, 23, 34, 28, 45, 21};
        int age = 21;
        int position = 0;

        position = getFirstElementPosition(ages, age);

        if (position == -1) {
            System.out.println("Το στοιχείο δεν βρέθηκε");
        } else {
            System.out.println("Το στοιχείο βρέθηκε στη θέση " + (position+1)); // για να είμαστε πιο φιλικοί στον χρήστη
        }
    }

    public static int getFirstElementPosition(int[] arr, int value) {
        if (arr == null) return -1;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == value) {
                return i;
            }
        }

        return -1;

    }
}
