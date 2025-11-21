package gr.aueb.sev.ch12.review;

/**
 * A simple data class.
 * Java Bean: A data class that got at least one default constructor
 * and conventional getters and setters (get...(), set...() in camelcase)
 */
public class Teacher {
    private int id;
    private String firstname;
    private String lastname;

//    // Default constructor - argumentless
//    public Teacher() {
//    }

    // Overloeaded constructor
    public Teacher(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    // If we want the default constructor when an overloaded is present we need to define it
    public Teacher(){

    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
