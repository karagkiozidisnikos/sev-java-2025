package gr.aueb.sev.ch1;

public class PrintStars {
    public static void main(String[] args) {
        int len = 11;

        for (int i = 0; i < (len / 2 + 1); i++) {
            for (int j = 0; j < len; j++) {
                if ((j <= (len / 2) + i) && (j >= (len / 2) - i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
