package gr.aueb.sev.ch9;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;

public class FileWriterApp {

    public static void main(String[] args) {
        File file = new File("file-writer.txt");

        try {
            fileWriter("file-writer.txt");
            bufferedWriter(file);
            printWriter("file-writer.txt");
        } catch (IOException e) {
            System.out.println("Το αρχείο δεν δημιουργήθηκε ή προέκυψε άλλο σφάλμα");
        }

        try {
            PrintStream ps = new PrintStream("ps-test.txt", StandardCharsets.UTF_8);
            sayHello(ps);
            sayHello(System.out);
            sayHello(System.err);
        } catch (IOException e) {
            System.out.println("Σφάλμα κατά τη δημιουργία αρχείου");
        }
    }

    /**
     * Εγγραφή απλού κειμένου με FileWriter
     * FileWriter = γράφει χαρακτήρες σε αρχείο
     *
     * @param file
     */
    public static void fileWriter(String file) throws IOException {
        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write("Coding with FileWriter\n");
            fw.flush(); // Στέλνει τα δεδομένα στο δίσκο (αρχείο)
        } catch (IOException e) {
            System.err.println(LocalDateTime.now() + "\n" + e);
            throw e;
        }
    }

    /**
     * Εγγραφή απλού κειμένου με BufferedWriter (πιο αποδοτικη)
     *
     * @param file
     */
    public static void bufferedWriter(File file) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
            bw.write("Coding with BufferedWriter");
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            System.err.println(LocalDateTime.now() + "\n" + e);
            throw e;
        }
    }

    /**
     * Εγγραφή με PrintWriter - πιο εύκολη σύνταξη
     * @param file
     * @throws FileNotFoundException
     */
    public static void printWriter(String file) throws FileNotFoundException {
        try (PrintWriter pw = new PrintWriter(new FileOutputStream(file, true), false, StandardCharsets.UTF_8
        )) {
           pw.println("Printing with PrintWriter");
           pw.flush();
        } catch (IOException e){
            System.err.println(LocalDateTime.now() + "\n" + e);
            throw e;
        }
    }

    /**
     * Εκτύπωση ενός μηνύματος σε οποιοδήποτε PrintStream (αρχείο ή System.out)
     * @param ps
     */
    public static void sayHello(PrintStream ps){
        ps.println("Hello SEV 2025!");
    }
}
