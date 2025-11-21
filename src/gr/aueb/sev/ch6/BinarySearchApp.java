package gr.aueb.sev.ch6;

public class BinarySearchApp {

    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};

        int value = 13;

        int index = binarySearch(numbers, value, 0, numbers.length-1);

        if (index != -1){
            System.out.println("Value " + value + " found at index " + index);
        } else {
            System.out.println("Value " + value + " not found in the array");
        }
    }

    public static int binarySearch(int[] arr, int value, int low, int high) {
        if (arr == null) return -1;
        if (low < 0 || high > arr.length - 1) return -1;
        if (low > high) return -1;

        int mid = (low + high) / 2;

        if (arr[mid] == value) return mid;
        if (value > arr[mid]) return binarySearch(arr, value, mid + 1, high);
        else return binarySearch(arr, value, low , mid - 1);
    }
}
