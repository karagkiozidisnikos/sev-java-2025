package gr.aueb.sev.ch7;

public class StringFormatApp {

    public static void main(String[] args) {
        String codingLanguage = "Java";
        int currentYear = 2025;

        // Βασική μορφοποίηση
        String formattedStr = String.format("%s : %d", codingLanguage, currentYear);
        System.out.println(formattedStr);

        // Συνδυασμός διαφόρων τύπων δεδομένων
        String name = "Panos";
        int age = 38;
        double height = 1.78;
        String info = String.format("Name: %s, Age: %d, Height: %.2fm", name, age, height);
        System.out.println(info);

        System.out.println("-".repeat(35));

        // %-10σ means
        // % -> format specifier starts
        // - -> left alignment
        // 10 -> width of field 10 characters
        // s -> String
        System.out.println(String.format("%-11s %5s", "Πόλη", "Πληθ."));
        System.out.println(String.format("%-11s %,5d","Αθήνα", 4500000));
        System.out.println(String.format("%-11s %,5d","Θεσσαλονίκη", 1500000));
        System.out.println(String.format("%-11s %,5d","Φλώρινα", 17000));
        System.out.println(String.format("%-11s %,5d","Ξάνθη", 55000));

        // Date format
        int day = 1;
        int month = 8;
        int year = 2025;

        // 01/08/2025
        String date = String.format("%02d/%02d/%d", day, month, year);
        System.out.println("Formatted date: " + date);
    }
}
