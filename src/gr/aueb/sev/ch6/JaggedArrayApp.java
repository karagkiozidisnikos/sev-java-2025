package gr.aueb.sev.ch6;

/**
 * Μπορούμε να δώσουμε διαφορετικές διαστάσεις
 * σε κάθε γραμμή του δισδιάστατου πίνακα.
 */
public class JaggedArrayApp {

    public static void main(String[] args) {
        int[][] arr = new int[3][];

        // Σε κάθε γραμμή εκχωρούμε ένα πίνακα με διαφορετική διάσταση
        arr[0] = new int[4];
        arr[1] = new int[3];
        arr[2] = new int[2];

        for(int[] row : arr) {
            for (int col : row){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
