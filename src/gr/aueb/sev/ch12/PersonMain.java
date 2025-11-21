package gr.aueb.sev.ch12;

public class PersonMain {
    public static void main(String[] args) {
        System.out.println("PersonCounter = " + Person.personCount);

        Person bob = new Person();
        System.out.println("bob: " + bob.personCount);

        Person alice = new Person();
        System.out.println("alice: " + alice.personCount);

        System.out.println("bob: " + bob.personCount);
    }
}
