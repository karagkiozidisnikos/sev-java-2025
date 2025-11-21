package gr.aueb.sev.ch12;

public class MyScopingApp {

    public static void main(String[] args) {
        int a = 10;

        { // Start of scoping
            int b = 200;

            System.out.println("a = " + a);
            a = 100;

            System.out.println("b = " + b);

        } // End of scoping

        System.out.println("-".repeat(31));
        System.out.println("a = " + a);


        // Error...
        // System.out.println(b);
    }
}
