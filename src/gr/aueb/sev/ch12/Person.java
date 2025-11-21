package gr.aueb.sev.ch12;

public class Person {
    public static int personCount = 0;
    public int id;
    public int age;
    public String name;

    public Person() {
        personCount++;
    }

    public static void printAttr(){
        System.out.println(personCount);
    }

    public void printAttributes(){
        System.out.println(id);
        System.out.println(personCount);
    }
}
