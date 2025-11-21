package gr.aueb.sev.ch7;

import java.util.Scanner;

public class EncryptionApp {

public static final int ENGLISHLETTERS = 26;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder encrypted = new StringBuilder();
        StringBuilder decrypted = new StringBuilder();
        String originalString = "";
        int key = 0;

        System.out.println("Please insert a string to be encrypted");
        originalString = scanner.nextLine();

        System.out.println("Please insert the encryption key");
        key = scanner.nextInt() % ENGLISHLETTERS;

        for (char ch : originalString.toCharArray()){
            int cipherval = cipher(ch, key);
            encrypted.append((char) cipherval);
        }

        System.out.println("Original message: " + originalString);
        System.out.println("Encrypted message: " + encrypted);

        for (char ch : encrypted.toString().toCharArray()){
            char decipherVal = decipher(ch, key);
            decrypted.append(decipherVal);
        }

        System.out.println("-".repeat(31));
        System.out.println("Decrypted message: " + decrypted);

        scanner.close();
    }

    public static int cipher(char ch, int key) {
        if (Character.isUpperCase(ch)) {
            return (ch - 'A' + key) % 26 + 'A';
        } else if (Character.isLowerCase(ch)){
            return (ch - 'a' + key) % 26 + 'a';
        } else {
            return ch;
        }
    }

    public static char decipher(char ch, int key){
        int m = 0;

        if (Character.isUpperCase(ch)) {
            m = ((ch - 'A' - key + 26) % 26 + 'A');
        } else if (Character.isLowerCase(ch)){
            m = ((ch - 'a' - key + 26) % 26 + 'a');
        } else {
            m = ch;
        }
        return (char) m;
    }
}
