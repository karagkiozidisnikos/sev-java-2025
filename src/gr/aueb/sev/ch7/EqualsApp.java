package gr.aueb.sev.ch7;

/**
 * String comparisons
 */
public class EqualsApp {

    public static void main(String[] args) {
        String s1 = "Athens";
        String s2 = "Athens";
        String s3 = new String("Athens");
        String s4 = "ATHENS";

        // Reference equality
        boolean eq1 = s1 == s2;
        System.out.println(eq1);

        boolean eq2 = s1 == s3;
        System.out.println(eq2);

        boolean eq3 = s1 == s4;
        System.out.println(eq3);

        // Content equality (.equals())
        boolean eq4 = s1.equals(s2);
        System.out.println(eq4);

        boolean eq5 = s1.equals(s3);
        System.out.println(eq5);

        boolean eq6 = s1.equals(s4);
        System.out.println(eq6);

        boolean eq7 = s1.equalsIgnoreCase(s4);
        System.out.println(eq7);
    }
}
