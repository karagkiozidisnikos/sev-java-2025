package gr.aueb.sev.ch7;

/**
 * Use of function substring()
 */
public class SubstringApp {

    public static void main(String[] args) {
        String s = "This is AUEB";

        System.out.println("Original String: " + s);
        System.out.println("Length of s: " + s.length());
        System.out.println("-".repeat(30));

        System.out.println(s.substring(0));
        System.out.println(s.substring(5));
        System.out.println(s.substring(0, s.length())); // the endIndex is excepted

        System.out.println("1. Print each character as a substring");
        for (int i = 0; i < s.length(); i++){
            System.out.print(s.substring(i, i + 1) + " ");
        }

        System.out.println("\n\n2. Progressive substring (prefixes)");
        for (int i = 0; i < s.length(); i++){
            System.out.println(s.substring(0, i + 1));
        }

        System.out.println("\n\n3. Middle extraction example");
        int start = s.indexOf("AUEB");

        int end = start + "AUEB".length();
        System.out.println("Substring from " + start + " to " + end + " -> substring: " + s.substring(start, end));
    }
}
