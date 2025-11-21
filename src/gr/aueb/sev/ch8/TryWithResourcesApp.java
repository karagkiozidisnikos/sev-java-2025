package gr.aueb.sev.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithResourcesApp {

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int num = 0;

        try (Scanner sc = new Scanner(System.in)){
            num = sc.nextInt();
            System.out.println(num);
        } catch (InputMismatchException e) {
            System.out.println(e);
            e.printStackTrace();
        }
        // κλείνει ο Scanner χωρίς sc.close()

    }
}
