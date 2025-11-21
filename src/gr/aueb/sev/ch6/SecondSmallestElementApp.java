package gr.aueb.sev.ch6;

/**
 * Returns the second minimum number of an array
 */
public class SecondSmallestElementApp {

    public static void main(String[] args) {
        int[] arr = {2, 22, 355, 1233, 5332, 123, 14, 4, 21, 6562, 221, 13, 975, 36};

        System.out.printf("The second smallest element of the array is %d", getSecondSmallestElement(arr, 3, 4));

    }

    /**
     * Returns the second-smallest element of an array
     * @param arr Array
     * @param low Lower position of array
     * @param high Highest position of array
     * @return the value of the second-smallest element
     */
    public static int getSecondSmallestElement(int[] arr, int low, int high) {
        if (arr == null || Math.abs(high - low) + 1 < 2) return -1;
        if (low < 0 || high > arr.length - 1) return -1;
        if (low > high) {
            swap(low, high);
        }

        int min = arr[low];
        int minPos = low;
        int small2 = arr[high];

        for (int i = low; i <= high; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minPos = i;
            }
        }

        for (int i = low; i<= high; i++){
            if (arr[i] == min && i == minPos) continue;
            if (arr[i] < small2){
                small2 = arr[i];
            }

        }
        return small2;
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

