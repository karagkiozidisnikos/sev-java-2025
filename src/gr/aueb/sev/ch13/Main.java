package gr.aueb.sev.ch13;

import java.util.concurrent.ExecutionException;

public class Main {

    public static void main(String[] args) {
        Account aliceAccount = new Account(1, "GR1234", "Alice", "Winderland", "123456789", 1000);

        try{
            aliceAccount.deposit(500);
            System.out.println(aliceAccount);

            aliceAccount.withdraw(200, "123456789");
            System.out.println(aliceAccount);

            aliceAccount.withdraw(200, "45154754"); //Exception thrown
            System.out.println(aliceAccount);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
