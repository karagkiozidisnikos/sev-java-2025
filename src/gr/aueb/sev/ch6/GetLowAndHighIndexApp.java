package gr.aueb.sev.ch6;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Utility application that demonstrates searching a sorted array for the
 * lowest and highest index of a given key value.
 *
 * The program prints a table of available values, reads a user-selected key
 * (validated to exist in the table) and prints the low and high indices of
 * the key in the array. This is an educational example of linear scans
 * to find range bounds in an array containing duplicate values.
 */
public class GetLowAndHighIndexApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int key = 0;
        int[] arr = {0, 1, 4, 4, 4, 6, 7, 8, 8, 8, 8, 8};

        System.out.println("Please choose a value from the following table");
        for (int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();

        do {
            key = scanner.nextInt();
            if (contains(arr, key)) {
                break;
            } else {
                System.out.println("Please choose a valid value");
            }
        } while (true);

        int[] range = getLowAndHighIndexOf(arr, key);

        System.out.printf("The low and high index of key %d is {%d, %d}", key, range[0], range[1]);
    }

    /**
     * Checks whether the given array contains the specified key.
     *
     * @param arr the array to search (may be null)
     * @param key the value to look for
     * @return true if the key is present in the array, false otherwise
     */
    public static boolean contains(int[] arr, int key){
        for (int num : arr){
            if (num == key) return true;
        }
        return false;
    }

    /**
     * Returns the low (first) and high (last) indices of the specified key
     * inside the provided array. If the array is null, empty, or the key is
     * not found, returns {-1, -1}.
     *
     * The method performs two linear scans: one from the start to find the
     * first occurrence and one from the end to find the last occurrence.
     *
     * @param arr the array to search (expected sorted or containing duplicates)
     * @param key the value to find
     * @return a two-element array {lowIndex, highIndex} or {-1, -1} if not found
     */
    public static int[] getLowAndHighIndexOf(int[] arr, int key){
        int[] range = {-1, -1};

        if (arr == null || arr.length < 1) return range;

        int low = 0;
        int high = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] == key){
                range[0] = i;
                break;
            }
        }

        if (range[0] == -1) return range;

        for (int i = arr.length - 1; i >= range[0]; i--){
            if (arr[i] == key){
                range[1] = i;
                break;
            }
        }

        return range;
    }
}
