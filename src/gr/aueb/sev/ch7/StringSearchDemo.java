package gr.aueb.sev.ch7;

/**
 * Demonstrates how to search within a String using
 * contains(), indexOf(), lastIndexOf(), startsWith()
 * and endsWith()
 */
public class StringSearchDemo {

    public static void main(String[] args) {
        String s = "Athens University of Economics and Business";
        int index;

        System.out.println("Original String:");
        System.out.println(s);
        System.out.println("-".repeat(43));

        // contains()
        if (s.contains("Economics")) {
            System.out.println("Contains(\"Economics\") -> true");
        }

        // indexOf()
        index = s.indexOf("Uni");

        System.out.println("indexOf(\"Uni\"): " + index);

        index = s.indexOf('t');
        System.out.println("First indexOf(\'t\'): " + index);

        index = s.lastIndexOf('t');
        System.out.println("Last indexOf(\'t\'): " + index);

        // indexOf(), start after index
        index = s.indexOf('t', s.indexOf("Uni"));
        System.out.println("indexOf(\'t\') after \"Uni\" is: " + index);

        System.out.println(s.startsWith("Athens"));
        System.out.println(s.startsWith("University"));
        System.out.println(s.startsWith("University", 7));
        System.out.println(s.endsWith("Business"));
        System.out.println(s.endsWith("ness"));
    }
}
