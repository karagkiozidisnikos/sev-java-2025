package gr.aueb.sev.ch7;

public class LowerUpperTrimApp {

    public static void main(String[] args) {
        String str1 = "Athens";
        String str2 = "ATHENS";
        String strWithSpaces = "      ATHENS    ";

        // Transform to lower and upper case
        String upper = str1.toUpperCase(); // ATHENS
        String lower = str2.toLowerCase(); // athens

        String trim = strWithSpaces.trim(); // ATHENS

        System.out.println(strWithSpaces);
        System.out.println(upper + " " + lower + " " + trim);

        String input1 = "      aThEns  ";
        String input2 = "ATHENS";

        System.out.println(input1.trim().equalsIgnoreCase(input2.trim()));
        System.out.println(input1.trim().toLowerCase().equals(input2.trim().toLowerCase()));
    }
}
