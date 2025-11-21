package gr.aueb.sev.ch7;

/**
 * Use of concatenate function/method
 */
public class ConcatApp {

    public static void main(String[] args) {
        String s1 = "Coding";
        String s2 = "SEV";

        // Basic concatenation
        String s3 = s1 + s2; // + operator (string concatenation)

        System.out.println(s3);

        String s4 = s1.concat(s2);
        System.out.println(s4);

        String s5 = s1 + " " + s2;
        System.out.println(s5);

        String s6 = s1.concat(" ").concat(s2); // Chained concat
        System.out.println(s6);

        // StringBuilder (mutable)
        StringBuilder sb = new StringBuilder();
        sb.append(s1).append(" ").append(s2).append(" 2025");

        System.out.println(sb);

        String s7 = sb.toString();

        System.out.println(s7);

        System.out.println(sb.toString());
    }
}
