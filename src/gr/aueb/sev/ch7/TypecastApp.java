package gr.aueb.sev.ch7;

public class TypecastApp {

    public static void main(String[] args) {
        // Primitive types
        double myDouble = 3.5;
        int myInt = 41;
        boolean myBool = true;
        char myChar = 'A';

        // Convert to String
        String strDouble = String.valueOf(myDouble);
        String strInt = String.valueOf(myInt);
        String strBool = String.valueOf(myBool);
        String strChar = String.valueOf(myChar);

        System.out.println(strDouble);
        System.out.println(strInt);
        System.out.println(strBool);
        System.out.println(strChar);

        String alterStrDouble = myDouble + "";
        System.out.println(alterStrDouble);
    }
}
