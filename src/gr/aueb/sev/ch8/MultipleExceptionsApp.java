package gr.aueb.sev.ch8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleExceptionsApp {

    public static void main(String[] args) {
        String numStr = "";

//        System.out.println("Working director: " + System.getProperty("user.dir"));
//        String projectDir = System.getProperty("user.dir");
//        System.out.println(projectDir);


        // try-with-resources
        // Scanner sc = new Scanner(System.in); // αλλάζω το όρισμα του constructor και διαβάζω από αλλου
        //Scanner sc = new Scanner(new File("test.txt"));
//        try(Scanner sc = new Scanner(new File("test2.txt"))) {

       try(Scanner sc = new Scanner(new File("C:\\ΣΕΒ\\IdeaProjects\\SevOpa\\src\\gr\\aueb\\sev\\ch8\\test.txt"))) {
            while (!isInteger(numStr = sc.nextLine())){
                System.out.println("Παρακαλώ για έναν ακέραιο");
            }
            System.out.println(numStr);

        } catch (FileNotFoundException | InputMismatchException e) {
            System.out.println("FileNotFoundException or InputMismatchException: " + e);
        } catch (IOException ex1) {
            System.out.println("IOException: "+ ex1);
        } catch (Exception ex2) {
            System.out.println("Exception: " + ex2);
        }
    }

    // -? : Επιτρέπει αρνητικούς αριθμούς
    // \d : Ένα ακέραιο ψηφίο, δλδ (0-9)
    //  + : Ένα ή περισσότερα
    // πχ : true for 12345, -71, false for 9.2,  " 15"
    public static boolean isInteger(String s) {
        return s.matches("-?\\d+");
    }
}
