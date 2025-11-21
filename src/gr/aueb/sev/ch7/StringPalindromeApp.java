package gr.aueb.sev.ch7;

/**
 * Checks if a given String is a palindrome
 */
public class StringPalindromeApp {

    public static void main(String[] args) {
        String s = "Anna";

        System.out.println("String s is a palindrome: " + isPalindrome(s));
    }

    public static boolean isPalindrome(String s){
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString().toLowerCase().trim().equalsIgnoreCase(s.trim());

    }
}
