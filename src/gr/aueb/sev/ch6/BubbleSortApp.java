package gr.aueb.sev.ch6;


public class BubbleSortApp {

    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 1};

        System.out.println("Initial Array");
        printArray(arr);

        bubbleSort(arr);

        System.out.println("Final Array after sort");
        printArray(arr);

    }

    public static void bubbleSort(int [] arr) {

        for (int i = 0; i < arr.length-1; i++){
            System.out.println("Πέρασμα " + (i + 1) + ":");

            for (int j = 0; j < arr.length-1; j++){
                System.out.print(" -> Σύγκριση: (" + arr[j] + ", " + arr[j + 1] + "): ");

                if (arr[j] > arr[j + 1]){
                    swap(arr, j, j+1);
                    System.out.println("Ανταλλαγή");
                } else {
                    System.out.println("Καμία αλλαγή");
                }

                System.out.print("\tΤρέχουσα κατάσταση: ");
                printArray(arr);
            }

            System.out.println("\tΜετά το πέρασμα: ");
            printArray(arr);
            System.out.println("-----------------------------");
        }
    }

    public static void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void printArray(int [] arr){
        for (int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
