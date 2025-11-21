package gr.aueb.sev.ch6;

public class ReducingApp {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 2, 12, 23, 55};

        System.out.println("Total of array: " + getTotal(arr));
        System.out.printf("Average: %.2f%n", getAverage(arr));

    }

    /**
     * Returns the sum of the array elements
     * @param arr the source array
     * @return the total (sum)
     */
    public static int getTotal(int[] arr) {
        if (arr == null || arr.length == 0) return 0;

        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        return sum;
    }

    /**
     * Returns the average of the elements of the table
     * @param arr the source array
     * @return the average of the array
     */
    public static double getAverage(int[] arr) {
        if (arr == null || arr.length == 0) return 0;

        return (double) getTotal(arr) / arr.length;
    }
}
