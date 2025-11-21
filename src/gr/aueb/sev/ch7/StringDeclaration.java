package gr.aueb.sev.ch7;

/**
 * Two types of String declaration and initialization
 */
public class StringDeclaration {

    public static void main(String[] args) {
        String alice = "Alice";
        String bob = new String("Bob");

        System.out.println(alice + " and " + bob);
        System.out.println("Total length = " + (alice.length() + bob.length()));

    }
}
