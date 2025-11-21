package gr.aueb.sev.ch12;

public class StaticBlockExample {

    // 1. Static field (shared by ALL objects)
    static int counter;

    // 2. Static Block
    // Runs ONCE when class is loaded
    static {
        System.out.println("Static block started");
        counter = 100;
        System.out.println("Static block ended");
    }

    // 3. Constructor
    // Runs everytime an object is created
    public StaticBlockExample(){
        counter++;
    }

    // 4. Instance method
    public void showCounter(){
        System.out.println("Counter value is: " + counter);
    }
}
