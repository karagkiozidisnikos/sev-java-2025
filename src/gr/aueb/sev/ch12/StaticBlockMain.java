package gr.aueb.sev.ch12;

public class StaticBlockMain {

    public static void main(String[] args) {
        System.out.println("Counter before objects: " + StaticBlockExample.counter);

        // Create an object
        StaticBlockExample staticBlockExample = new StaticBlockExample();
        staticBlockExample.showCounter();
    }
}
