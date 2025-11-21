package gr.aueb.sev.ch6;

/**
 * Array checks
 */
public class ArrayChecksApp {

    public static void main(String[] args) {
        int[] arr = {44, 293, -818, 13, 2315, 231, 56, 5, 12, 31, 243, 5, 21231, 213};
//        int[] arr = {-1, 2, -3, -4, -5, -6, -7};
        int[] doubleArray = doubleArray(arr);

        System.out.printf("The position of %d is %d\n", 2315, getPositionOfElement(arr, 2315));

        printEvens(arr);

        System.out.println();

        for (int da : doubleArray){
            System.out.print(da + " ");
        }
        System.out.println();

        System.out.println("Positive exists: " + existsPositive(arr));

        System.out.println("All positive: " + allPositive(arr));

    }

    /**
     *
     * @param arr Array to be checked
     * @param a Value to be checked
     * @return position of value
     */
    public static int getPositionOfElement(int[] arr, int a){
        int pos = -1;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] == a){
                pos = i;
            }
        }
            return pos;

    }

    public static void printEvens(int[] arr){
        for (int a : arr){
            if (a % 2 == 0){
                System.out.print(a + " ");
            }
        }
    }

    public static int[] doubleArray(int[] arr){
        int[] doubles = new int[arr.length];

        for (int i = 0; i < doubles.length; i++){
            doubles[i] = arr[i] * 2;
        }
        return doubles;
    }

    public static boolean existsPositive(int arr[]){
        for (int a : arr){
            if (a > 0) return true;
        }

        return false;
    }

    public static boolean allPositive(int arr[]){
        for (int a : arr){
            if (a < 0) return false;
        }

        return true;
    }
}
