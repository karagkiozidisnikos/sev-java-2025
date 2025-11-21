package gr.aueb.sev.ch6;

/**
 * Unsized array initialization
 */
public class UnsizedInitApp {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; // Το unsized γίνεται σε ένα βήμα
//      int[] arr2 = new int[] {1, 8, 12, 23}; // Με τον array initializer γίνεται και σε δύο βήματα
        int[] arr2;
        arr2 = new int[] {1, 8, 12, 23};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Enhanced for
        for (int item: arr) {
            System.out.print(arr[item] + " ");
        }
    }
}
