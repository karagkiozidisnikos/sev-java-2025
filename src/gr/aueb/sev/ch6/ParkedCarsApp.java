package gr.aueb.sev.ch6;

public class ParkedCarsApp {

    /**
     * Program entry point.
     *
     * Creates a sample 2D array of parked car time intervals, normalizes the
     * data into a 2-row representation (timestamps and occupancy markers),
     * sorts the timestamps while keeping markers aligned, and computes the
     * maximum number of parked cars within any contiguous time frame.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        int[][] arr = {{1012, 1136}, {1317, 1417}, {1015, 1020}, {1015, 1020},{1015, 1020},{1015, 1020},{1015, 1020},{1015, 1020},{1015, 1020}, {1317, 1417}, {1317, 1417}, {1317, 1417}};
        int[][] arr2 = new int[arr[0].length][arr[0].length * arr.length];
        int k = 0;

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++) {
                arr2[0][k] = arr[i][j];
                arr2[1][k] = (j == 0) ? 1 : 0;
                k++;
            }
        }

        print2dArray(arr2);
        System.out.println("-".repeat(31));

        bubble2DSort(arr2);

        print2dArray(arr2);
        System.out.println("-".repeat(31));

        int count = 0;
        int maxCount = 0;

        for (int n : arr2[1]){
            if (n == 1){
                count++;
                if ( count >  maxCount){
                    maxCount = count;
                }
            } else {
                count = 0;
            }
        }

        System.out.println("The maximum parked cars in a given timeframe is: " + maxCount);
    }

    /**
     * Sorts a 2-row array by the values in the first row using a simple
     * bubble-sort algorithm. The second row is swapped in parallel so that
     * each column's associated marker stays aligned with its timestamp.
     *
     * This method modifies the provided array in-place.
     *
     * @param arr a 2xN integer array where row 0 contains keys to sort and
     *            row 1 contains associated markers that must follow their keys
     */
    public static void bubble2DSort(int [][] arr) {
        for (int i = 0; i < arr[0].length-1; i++){
            for (int j = 0; j < arr[0].length-1; j++){
                if (arr[0][j] > arr[0][j + 1]){
                    swap(arr[0], j, j+1);
                    swap(arr[1], j, j+1);
                }
            }
        }
    }

    /**
     * Swaps two elements in a single integer array.
     *
     * @param arr the array containing elements to swap
     * @param i index of the first element
     * @param j index of the second element
     */
    public static void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    /**
     * Prints a two-dimensional integer array to standard output. Each row is
     * printed on its own line with values separated by a space.
     *
     * @param arr 2D array to print
     */
    public static void print2dArray(int [][] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
