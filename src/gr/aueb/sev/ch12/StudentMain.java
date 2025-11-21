package gr.aueb.sev.ch12;

public class StudentMain {

    public static void main(String[] args) {
        Student alice = new Student();
        Student bob = new Student(2, "Bob", "S.");
        Car myCar = new Car();


        System.out.println("Id: " + bob.getId()); // Can get the fields' values because they're public
        System.out.println("FirstName: " + bob.getFirstName());
        System.out.println("LastName: " + bob.getLastName());

        System.out.println(bob);

        System.out.println(myCar);

        // Check the values of alice fields
        System.out.println("Id: " + alice.getId()); // Can get the fields' values because they're public
        System.out.println("FirstName: " + alice.getFirstName());
        System.out.println("LastName: " + alice.getLastName());

        // Set specific values to alice fields
        alice.setId(1);
        alice.setFirstName("Alice");
        alice.setLastName("W.");

        System.out.println("Id: " + alice.getId());
        System.out.println("FirstName: " + alice.getFirstName());
        System.out.println("LastName: " + alice.getLastName());

    }
}
