package gr.aueb.sev.ch6;

public class MaxArrayElement {

    public static void main(String[] args) {
        int[] grades = {7, 10, 7, 4, 2, 3};
        int maxPosition = 0;

        maxPosition = getMaxPosition(grades);

        System.out.println("Max grade: " + grades[maxPosition] + " Max Position: " + (maxPosition+1));

    }

    public static int getMaxPosition(int[] arr) {
        if (arr == null || arr.length < 1) return -1;

        int maxPosition = 0;
        int maxValue = arr[maxPosition];

        for (int i =0; i < arr.length; i++ ) {
            if  (arr[i] > maxValue) {
                maxPosition = i;
                maxValue = arr[i];
            }
        }

        return maxPosition;
    }
}

