package gr.aueb.sev.ch10;

import java.util.Scanner;

public class ArmstrongApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert an integer");
        int num = sc.nextInt();
        System.out.println("num is Armstrong: " + isArmstrong(num));
        System.out.println("num is Armstrong2: " + isArmstrong2(num));
        System.out.println("num is Armstrong3: " + isArmstrong3(num));
    }

    public static boolean isArmstrong(int num){
        int originalNum = num;
        int numberOfDigits = String.valueOf(num).length();
        int sum = 0;

        while (num != 0) {
            int digit = num % 10; // get the digit
            sum += (int) Math.pow(digit, numberOfDigits);
            num /= 10;
        }

        return originalNum == sum;
    }

    public static boolean isArmstrong2(int num) {
        int originalNum = num;
        int numberOfDigits = String.valueOf(num).length();
        int sum = 0;
        StringBuilder sn = new StringBuilder(String.valueOf(num));

        for (int i = 0; i < sn.length(); i++){
            int digit = sn.charAt(i) - '0';
            sum += (int) Math.pow(digit, numberOfDigits);
        }

        return originalNum == sum;
    }

    public static boolean isArmstrong3(int num) {
        int originalNum = num;
        int numberOfDigits = String.valueOf(num).length();
        int sum = 0;
        char[] chars = String.valueOf(num).toCharArray();

        for (int i = 0; i < chars.length; i++){
            int digit = chars[i] - '0';
            sum += (int) Math.pow(digit, numberOfDigits);
        }
        return originalNum == sum;
    }

    public static int digitCount(int num) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = num;
        int count = 0;

        do {
            num = num / 10;
            count++;
        } while (num != 0);

        return count;
    }
}
