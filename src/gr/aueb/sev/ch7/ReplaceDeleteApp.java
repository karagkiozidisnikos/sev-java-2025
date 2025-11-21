package gr.aueb.sev.ch7;

/**
 * Use of replace() and delete() functions/methods
 */
public class ReplaceDeleteApp {

    public static void main(String[] args) {
        String s1 = "Coding SEV";
        String s2 = "Coding.SEV.2025";
        String s3 = "Coding      2025";

        System.out.println("Original strings: ");
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        System.out.println("s3: " + s3);

        // 1. replace() - replaces literal substrings
        String replaced1 = s1.replace(" ", ":");
        System.out.println(replaced1);

        String replaced2 = s3.replace(" ", ":");
        System.out.println(replaced2);
        String replaced9 = s3.replaceFirst(" ", ":");
        replaced9 = replaced9.replaceAll("\\s+", "");
        System.out.println(replaced9);

        System.out.println("-".repeat(31));
        // replaceAll()
        String replaced3  = s2.replaceAll("\\.", " ");
        System.out.println(replaced3);

        String replaced4 = s3.replaceAll("\\s", ":"); // \s is blank
        System.out.println(replaced4);

        String replaced5 = s1.replaceAll("\\s+", ":"); // \s+ one or more blanks
        System.out.println(replaced5);

        String replaceFirst = s2.replaceFirst("\\.", ":");
        System.out.println(replaceFirst);
    }
}
