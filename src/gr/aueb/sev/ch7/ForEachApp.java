package gr.aueb.sev.ch7;

public class ForEachApp {
    public static void main(String[] args) {
        String s = "Coding with Java";

        // for each loop
        for (char character: s.toCharArray()) {
            System.out.print(character + " ");
        }

        System.out.println();

        // Unicode characters
        System.out.println("\u2764".repeat(20));
    }
}
