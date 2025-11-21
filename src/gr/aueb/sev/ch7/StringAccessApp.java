package gr.aueb.sev.ch7;

/**
 * How to traverse a String
 * with for
 */
public class StringAccessApp {

    public static void main(String[] args) {
        String s = "Coding with Java";

        System.out.println("Forward traversal");

        for (int i = 0; i < s.length(); i ++) {
            System.out.print(s.charAt(i) + " ");
        }

        System.out.println();

        System.out.println("Reverse traversal");
        for (int i = s.length() - 1; i >= 0; i --) {
            System.out.print(s.charAt(i) + " ");
        }
    }
}
