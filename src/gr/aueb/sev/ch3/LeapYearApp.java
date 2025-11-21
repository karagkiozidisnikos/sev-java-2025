package gr.aueb.sev.ch3;

import java.util.Scanner;

/**
 * Ελέγχει αν το εισαγόμενο έτος είναι δίσκεκτο
 */
public class LeapYearApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = 0;
        int digitCount = 0;

        while (true) {
            System.out.println("Παρακαλώ εισάγετε το έτος (0 για έξοδο)");

            year = scanner.nextInt();

            if (year == 0){
                break;
            }

            if (year % 4 == 0){
                if (year % 100 != 0){
                    System.out.printf("Το έτος %d είναι δίσεκτο\n", year);
                } else {
                    if (year % 400 == 0) {
                        System.out.printf("Το έτος %d είναι δίσεκτο\n", year);
                    } else {
                        System.out.printf("Το έτος %d δεν είναι δίσεκτο\n", year);
                    }
                }
            } else {
                System.out.printf("Το έτος %d δεν είναι δίσεκτο\n", year);
            }

            }}
    }