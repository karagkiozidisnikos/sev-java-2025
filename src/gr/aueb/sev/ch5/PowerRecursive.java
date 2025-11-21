package gr.aueb.sev.ch5;

public class PowerRecursive {

    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 10;

        System.out.println(pow(num1, num2));
    }

    public static int pow(int base, int power) {
        return (power == 0)? 1 : base * pow(base, power-1);
    }
}
