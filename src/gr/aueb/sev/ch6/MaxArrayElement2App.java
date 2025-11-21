package gr.aueb.sev.ch6;

/**
 * Returns the position of the maximum element of an array
 */
public class MaxArrayElement2App {

    public static void main(String[] args) {
        int[] arr = {2, 22, 355, 1233, 5332, 123, 14, 4, 21 ,6562, 221, 13, 975, 36};

        System.out.printf("The maximum element of the array is located in position %d", getMaxPosition(arr, 0, 3) + 1);
    }

    /**
     * Returns the position of the maximum element
     * @param arr Array
     * @param low Lowest position to be searched
     * @param high Highest position to be searched
     * @return The position of the maximum element
     */
    public static int getMaxPosition(int[] arr, int low, int high){
        if (arr == null || arr.length < 1) return -1;
        if (low < 0 || high > arr.length - 1) return -1;

        if (low > high) {
            swap(low, high);
        }

        int maxPos = low;
        int max = arr[low];

        for (int i = low; i <= high; i++){
            if (arr[i] > max){
                max = arr[i];
                maxPos = i;
            }
        }
        return maxPos;
    }

    /**
     * Swaps the values of two integers
     * @param a Integer
     * @param b Integer
     */
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

}
