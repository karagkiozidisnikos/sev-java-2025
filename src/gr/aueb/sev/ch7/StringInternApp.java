package gr.aueb.sev.ch7;

public class StringInternApp {

    public static void main(String[] args) {
        // Case 1: String literals (automatically interned)
        String s1 = "Hello";
        String s2 = "Hello";

        // Case 2: Explicit new String() (different object in heap)
        String s3 = new String("Hello");

        // Case 3: Manually interned string
        String s4 = s3.intern();

        // Compare object references
        System.out.println("s1 == s2: " + (s1 == s2)); // true (same interned object)
        System.out.println("s1 == s3: " + (s1 == s3)); // false (different heap object)
        System.out.println("s1 == s4: " + (s1 == s4)); // true (s4 points to interned string)

        // equals() : compares the content
        System.out.println("s1.equals(s3): " + s1.equals(s3));
        System.out.println("s1.equals(s4): " + s1.equals(s4));

        // memory
        System.out.println("s1: " + System.identityHashCode(s1));
        System.out.println("s2: " + System.identityHashCode(s2));
        System.out.println("s3: " + System.identityHashCode(s3));
        System.out.println("s4: " + System.identityHashCode(s4));


    }
}
