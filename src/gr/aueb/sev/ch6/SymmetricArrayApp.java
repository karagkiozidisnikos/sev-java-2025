package gr.aueb.sev.ch6;

public class SymmetricArrayApp {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 2, 1};
        int[] arr2 = {1, 2, 3, 4, 5};
        int[] arr3 = {};
        int[] arr4 = {1};

        System.out.println("arr1: " + isArraySymmetric(arr1));
        System.out.println("arr1: " + isSymmetric(arr1));
        System.out.println("arr2: " + isArraySymmetric(arr2));
        System.out.println("arr2: " + isSymmetric(arr2));
        System.out.println("arr3: " + isArraySymmetric(arr3));
        System.out.println("arr3: " + isSymmetric(arr3));
        System.out.println("arr4: " + isArraySymmetric(arr4));
        System.out.println("arr4: " + isSymmetric(arr4));

        System.out.printf("arr3: %b%n", isArraySymmetric(arr3));
    }

    public static boolean isArraySymmetric(int[] arr){
        if (arr == null || arr.length <= 1) return true; // παραδοχή

        boolean isSymmetric = true;

        for (int i =0,  j=arr.length - 1; i < j; i++, j--) {
            if (arr[i] != arr[j]) { //return false;
                isSymmetric = false;
                break;
            }
        }
        return isSymmetric;
//        return true;
    }

    public static boolean isSymmetric(int[] arr) {
        if (arr == null || arr.length <= 1) return true; // παραδοχή

        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i])  return false;
        }
        return true;
    }

    public static void printResult(int [] arr) {
        if (isArraySymmetric(arr)) System.out.println("Ο πίνακας " + arr + " είναι συμμετρικός");
        else System.out.println("Ο πίνακας δεν είναι συμμετρικός");
    }
}
