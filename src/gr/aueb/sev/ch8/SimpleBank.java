package gr.aueb.sev.ch8;

import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * A very small console-based bank demo used for educational purposes.
 * <p>
 * The class maintains a single static account balance and provides
 * simple operations: deposit, withdraw and view balance. User input
 * is read from the standard input using a shared Scanner.
 * </p>
 * Note: This is a minimal example and is not thread-safe nor suitable
 * for production use. It intentionally throws generic Exceptions to
 * demonstrate basic error handling.
 */
public class SimpleBank {
    static double balance = 500;
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;
        double amount = 0.0;

        do {
            do {
                System.out.println("Please choose one from below ");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. View balance");
                System.out.println("4. Exit");

                choice = in.nextInt();

                if (choice >= 1 && choice <= 4) {
                    break;
                }

            } while (true);


            switch (choice) {
                case 1:
                    try {
                        System.out.println("Please insert amount to be deposited");
                        amount = insertAmount();
                        deposit(amount);
                    } catch (Exception e) {
                        System.out.println("The amount you've inserted is negative. Please insert a positive amount");
                    }
                    break;

                case 2:
                    try {
                        System.out.println("Please insert amount to be withdrawn");
                        amount = insertAmount();
                        withdraw(amount);
                    } catch (Exception e){
                        System.out.println("The amount you've inserted is invalid. Please try again");
                    }
                    break;
                case 3:
                    viewBalance();
                    break;
                case 4:
                    System.out.println("Thank you!");
                    break;
            }
        }while (choice != 4);

        in.close();
    }

    /**
     * Reads an amount from standard input and returns it as a double.
     * <p>
     * The method uses the shared Scanner to read the next integer token
     * and returns it as a double. If the next token is not an integer,
     * a runtime InputMismatchException will be thrown by the Scanner.
     * </p>
     * @return the inserted amount as a double
     * @throws java.util.InputMismatchException if the input is not an integer
     */
    public static double insertAmount(){
        return in.nextInt();
    }

    /**
     * Prints the current account balance to standard output.
     * This method does not modify state and does not return a value.
     */
    public static void viewBalance(){
        System.out.println("Your balance is: " + balance);
    }

    /**
     * Deposits the specified amount into the account.
     * <p>
     * If the amount is negative, the method logs the error with a timestamp
     * and rethrows an Exception to signal the failure to the caller.
     * </p>
     * @param amount the amount to deposit; must be non-negative
     * @throws Exception if the amount is negative
     */
    public static void deposit(double amount) throws Exception{
        try {
            if (amount < 0) throw new Exception("Amount cannot be negative.");
            balance += amount;
        } catch (Exception e){
            System.err.println(LocalDateTime.now() + " " + e.getMessage() + " Negative amount: " + amount);
            throw e;
        }
    }

    /**
     * Withdraws the specified amount from the account.
     * <p>
     * The method validates that the amount is non-negative and that the
     * account has sufficient funds. On validation failure it logs the
     * error with a timestamp and rethrows an Exception to the caller.
     * </p>
     * @param amount the amount to withdraw; must be non-negative and less than or equal to the balance
     * @throws Exception if the amount is negative or if there is insufficient balance
     */
    public static void withdraw(double amount) throws Exception{
        try {
            if (amount < 0) throw new Exception("Amount cannot be negative.");
            if (amount > balance) throw new Exception("Insufficient balance");
            balance -= amount;
        } catch (Exception e) {
            System.err.println(LocalDateTime.now() + " " + e.getMessage() + " Withdraw failed.");
            throw  e;
        }
    }


}
