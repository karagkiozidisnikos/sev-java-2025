package gr.aueb.sev.ch9;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.util.Scanner;

public class FileReaderApp {

    public static void main(String[] args) {
        File file = new File("file-writer.txt");

        try {
            fileReaderRead("file-writer.txt");
            System.out.println("-".repeat(31));
            bufferedRead(file);
            System.out.println("-".repeat(31));
            scannerRead(file);
        } catch (IOException e) {
            System.out.println("Παρουσιάστηκε σφάλμα κατά την ανάγνωση αρχείου");
        }
    }

    /**
     * Ανάγνωση χαρακτήρα-χαρακτήρα
     * @param file
     */
    public static void fileReaderRead(String file) throws IOException {
        try (FileReader fr = new FileReader(file)) {
            int ch;
            while ((ch = fr.read()) != -1) { // -1 επιστρέφεται όταν φτάσω στο τέλος του αρχείου
                System.out.println((char) ch);
            }
        } catch (IOException e) {
            System.err.println(LocalDateTime.now() + "\n" + e);
            throw e;
        }
    }

    /**
     * Ανάγνωση αρχείου γραμμή-γραμμή με BufferedReader
     * @param file
     * @throws IOException
     */
    public static void bufferedRead(File file) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw e;
        }
    }

    /**
     * Ανάγνωση αρχείου με χρήση του scanner ("εύκολη ανάγνωση")
     * @param file
     * @throws IOException
     */
    public static void scannerRead(File file) throws IOException {
        try (Scanner sc = new Scanner(file, StandardCharsets.UTF_8)) {
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.err.println(LocalDateTime.now() + "\n" + e);
            throw e;
        }
    }
}
