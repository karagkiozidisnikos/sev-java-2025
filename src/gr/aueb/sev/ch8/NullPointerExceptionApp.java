package gr.aueb.sev.ch8;

public class NullPointerExceptionApp {

    public static void main(String[] args) {
        String s1 = "Hello there";
        String s2 = null;

        System.out.println("Length of s1" + s1.length());
        System.out.println("Length of s2" + s2.length());
    }
}
