package gr.aueb.sev.ch7;

/**
 * Strings are cached in SCP (string Constant Pool)
 * pr Intern Arrea for efficiency. In order to be
 * secure Strings are immutable
 */
public class StringImmutable {
    public static void main(String[] args) {
        String s1 = "Coding";
        String s2 = "Coding";

        s1 = "year 2025";

        System.out.println(s1);
        System.out.println(s2);
    }
}
