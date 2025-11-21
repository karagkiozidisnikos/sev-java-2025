package gr.aueb.sev.ch7;

public class CompareApp {

    public static void main(String[] args) {
        String s1 = "Athens";
        String s2 = "ATHENS";
        String s3 = "Athens University";

        int result1 = s2.compareTo(s1);
        System.out.println(result1);

        if (result1 > 0) {
            System.out.println("s1 > s2");
        } else if (result1 < 0) {
            System.out.println("s1 < s2");
        } else {
            System.out.println("s1 = s2");
        }

        int result2 = s1.compareToIgnoreCase(s2);

        if (result2 > 0) {
            System.out.println("s1 > s2");
        } else if (result2 < 0) {
            System.out.println("s1 < s2");
        } else {
            System.out.println("s1 = s2");
        }
    }
}
