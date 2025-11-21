package gr.aueb.sev.ch8;

import java.io.FileWriter;
import java.io.IOException;
import java.rmi.ServerError;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class SimpleBankApp {
    static double balance = 0;

    public static void main(String[] args) {
        try {
            deposit2(-2200);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    public static void deposit(double amount) throws Exception {
        try {
            if (amount < 0) throw new Exception("Το ποσό κατάθεσης πρέπει να είναι μη αρνητικό");
            balance += amount;
        } catch (Exception e) {
            System.err.println(LocalDateTime.now() + "\n" + e);
            throw e;
        }
    }

    public static void deposit2(double amount) throws Exception {
        try {
            if (amount < 0) throw new Exception("Το ποσό κατάθεσης πρέπει να είναι μη αρνητικό");
            balance += amount;
            // Optional: Log successful deposit
        } catch (Exception e) {
            // 1. Log to stderr for debugging
            System.err.println(LocalDateTime.now() + "\n" + e);

            // 2. Log to file (append mode) Append mode=True, if file not exist it's created else it writes in it
            try (FileWriter writer = new FileWriter("badDeposits.txt", true)){
                writer.write(LocalDateTime.now() + " - " + e.getMessage() + System.lineSeparator() + "Amount tried" + amount + System.lineSeparator());
            } catch (IOException ioEx){
                System.err.println("Error writing to log file: " + ioEx.getMessage());
            }
            // 3. Throw the original exception to propagate it
            throw e;
        }
    }
}
