package gr.aueb.sev.ch6;

import java.security.PublicKey;

/**
 * Εκτυπώνει τα στοιχεία ενός πίνακα με μέθοδο
 */
public class PrintArrayApp {

    public static void main(String[] args) {
        int[] arr = {10, 12, 14, 19, 23, 27};

        printArray(arr, 1, arr.length-2);
        System.out.println(" ");
        printArray(arr, 0, arr.length-1);
    }

    public static void printArray(int[] arr) {
        for(int item : arr) {
            System.out.print(item + " ");
        }
    }

    public static void printArray(int[] arr, int low, int high) {
        if (low < 0 || high > arr.length-1) return;

        for (int i = low; i <= high; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
