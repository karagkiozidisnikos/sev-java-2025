package gr.aueb.sev.ch7;

public class StringSplitApp {

    public static void main(String[] args) {
        String email = "pmoschos@aueb.gr";

        // Split email at '@'
        String[] parts = email.split("@");

        for (String s : parts) {
            System.out.print(s + " ");
        }

        System.out.println();
        // pick the first part to be the username
        String username = parts[0];

        System.out.println("E-mail: " + email);
        System.out.println("Username: " + username);

        // 2nd Example
        String s = "Athens:Uni:Of:Econ:And:Business";
        // Split based on character :
        String[] tokens = s.split(":");
        for(String token : tokens) {
            System.out.print(token + " ");
        }

        System.out.println();
        // csv files (comma separated values)
        String csv = "apple,banana,orange";
        String[] fruits = csv.split(",");
        for(String fruit : fruits){
            System.out.print(fruit + " ");
        }

        System.out.println();

        // Example with names an extra spaces
        String names = "  John ,   Mary,     Nick";
        String[] firstNames = names.split(",");
        for (String firstName : firstNames){
            System.out.println(firstName.trim());
        }

        String text = "Java;Python|C++#Kotlin";
        String[] langs = text.split("[;|#]");
        for (String lang : langs) {
            System.out.println(lang);
        }
    }
}
