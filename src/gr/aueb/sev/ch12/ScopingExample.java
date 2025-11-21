package gr.aueb.sev.ch12;

public class ScopingExample {

    // 1. Class-level variable (field)
    // Accessible from All Methods in this class
    static int classLevelCounter = 0;

    public static void main(String[] args) {
        //2. Method-level variable
        // Exists ONLY inside main()
        int number = 10;
        String studentName = "Alex";

        System.out.println("Inside main(): ");
        System.out.println("number = " + number);
        System.out.println("studentName = " + studentName);

        // access class-level variable
        classLevelCounter++;
        System.out.println("classLevelCounter = " + classLevelCounter);

        //3. Block-level variable
        // Exists ONLY inside the bloack where declared
        if (number > 5){
            int insideIf = 71;
            System.out.println("insideIf = " + insideIf);
        }

        // ERROR:..
        //System.out.println(insideIf);

        // Loop block scope
        for (int i = 0; i < 13; i++) {
            System.out.println("Hello SEV 2025: " + i);
        }

        // ERROR:..
        //System.out.println(i);

        greetStudents("Alice");
    }

    // 4. Method parameters
    // The act as local variables of the method
    public static void greetStudents(String name) {
        String message = "Welcome to Java Programming";

        System.out.println("Hello " + name);
        System.out.println(message);

        // class-level variable is accesible here too
        classLevelCounter++;
        System.out.println("Class-level counter: " + classLevelCounter);
    }
}
