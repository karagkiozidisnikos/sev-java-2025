package gr.aueb.sev.ch3;

/**
 * Εμφανίζει 10 οριζόντια αστεράκια
 */
public class Stars10App {

    public static void main(String[] args) {

        int i = 0;

        while (i < 10){
            System.out.print("*");
            i++;
        }

        System.out.println(" ");

        int j = 10;

        while (j >= 1){
            System.out.print("*");
            j--;
        }
    }
}

