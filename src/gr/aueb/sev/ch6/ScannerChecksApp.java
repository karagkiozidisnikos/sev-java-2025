package gr.aueb.sev.ch6;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Reads six integers from standard input and performs several checks on them:
 * - whether there are at most three even numbers
 * - whether there are at most three odd numbers
 * - whether there are at most three consecutive numbers
 * - whether at most three numbers share the same last digit
 * - whether at most three numbers belong to the same decade (0-9,10-19,...,40-49)
 *
 * This class is an educational example showing simple array processing and
 * use of Scanner for input.
 */
public class ScannerChecksApp {

    public static void main(String[] args) {
        int[] arr = new int[6];

        populateArray(arr);

        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("-".repeat(31));

        System.out.println("1. There are not more than 3 evens: " + checkEvens(arr));
        System.out.println("2. There are not more than 3 odds: " + checkOdds(arr));
        System.out.println("3. There are not more than 3 consecutives: " + checkConsecutives(arr));
        System.out.println("4. There are not more than 3 number with the same last digit: " + checkLastDigit(arr));
        System.out.println("5. There are not more than 3 numbers with the same decade: " + checkDecade(arr));
    }

    /**
     * Reads an integer from System.in in the range 1..49 (inclusive).
     * The method will repeatedly prompt until a valid integer in the range
     * is provided.
     *
     * @return a valid integer between 1 and 49 (inclusive)
     * @throws java.util.InputMismatchException if the user enters a non-integer
     */
    public static int readNum(){
        Scanner scanner = new Scanner(System.in);

        int num = 0;

        do {
            System.out.println("Please insert an integer between 1 and 49");
            num = scanner.nextInt();

            if (num < 1 || num > 49){
                continue;
            } else {
                System.out.println("Inserted " + num);
                return num;
            }
        } while(true);
    }

    /**
     * Fills the provided array by reading values from the user using {@link #readNum()}.
     *
     * @param arr the array to populate (expected length: 6)
     * @return the same array reference after population
     */
    public static int[] populateArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            arr[i] = readNum();
        }
        return arr;
    }

    /**
     * Checks whether there are at most three even numbers in the array.
     *
     * @param arr input array of integers
     * @return true if the number of even values is <= 3, false otherwise
     */
    public static boolean checkEvens(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        return count <= 3;
    }

    /**
     * Checks whether there are at most three odd numbers in the array.
     *
     * @param arr input array of integers
     * @return true if the number of odd values is <= 3, false otherwise
     */
    public static boolean checkOdds(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 != 0) {
                count++;
            }
        }
        return count <= 3;
    }

    /**
     * Checks whether the array contains a consecutive sequence longer than 3.
     * The method sorts a copy of the array and computes the length of the
     * longest run of values where each next value equals previous + 1.
     *
     * @param arr input array of integers (original array is not modified)
     * @return true if the longest consecutive run length is <= 3, false otherwise
     */
    public static boolean checkConsecutives(int[] arr){
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);

        int count = 1;
        int maxCount = 1;
        for (int i = 1; i < sortedArr.length; i++){
            if (sortedArr[i] == sortedArr[i-1] + 1){
                count++;
                if (count > maxCount){
                    maxCount = count;
                }
            } else {
                count = 1;
            }
        }
        return maxCount <= 3;
    }

    /**
     * Checks whether more than three numbers share the same last digit.
     * The last digit is computed using modulo 10.
     *
     * @param arr input array of integers
     * @return true if no last digit appears more than 3 times, false otherwise
     */
    public static boolean checkLastDigit(int[] arr) {
        int[] count = new int[10];
        int last = 0;
        for (int n : arr) {
            last = n % 10;
            count[last]++;
            if (count[last] > 3) {
                return false;
            }
        }
        return true;
    }

    /**
     * Checks whether more than three numbers belong to the same decade
     * Assumes input values are in the range 1..49.
     *
     * @param arr input array of integers
     * @return true if no decade appears more than 3 times, false otherwise
     */
    public static boolean checkDecade(int[] arr) {
        int[] count = new int[5];
        int decade = 0;
        for (int n : arr) {
            decade = n / 10;
            count[decade]++;
            if (count[decade] > 3) {
                return false;
            }
        }
        return true;
    }
}
