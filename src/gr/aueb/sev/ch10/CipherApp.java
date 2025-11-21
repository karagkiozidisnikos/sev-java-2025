package gr.aueb.sev.ch10;

public class CipherApp {

    public static void main(String[] args) {
        String message = "HELLO SEV2025";
        int key = 127;
        StringBuilder encrypted = new StringBuilder();
        StringBuilder decrypted = new StringBuilder();
        int prev = -1;

        // encryption
        for (char ch : message.toCharArray()){
            int cipherVal = cipher(ch, prev, key);
            encrypted.append((char) cipherVal);
            prev = cipherVal;
        }

        System.out.println("Original message: " + message);
        System.out.println("Enrypted message: " + encrypted);

        // decryption
        prev = -1;

        for (char cipherCh : encrypted.toString().toCharArray()){
            char decipherChar = decipher(cipherCh, prev, key);
            decrypted.append(decipherChar);
            prev = cipherCh;
        }

        System.out.println("-".repeat(31));
        System.out.println("Decrypted message: " + decrypted);
    }

    /**
     * Encrypt a character using a simple dependency-based cipher
     * @param ch The character to be encrypted
     * @param prev The previous cipher value, or -1 for the first character
     * @param key The module key (range of cipher values)
     * @return The ciphered character code
     */
    public static int cipher (char ch, int prev, int key){
        if (prev == -1) return ch;
        // cipher between 0 and key -1
        return (ch + prev) % key;
    }

    /**
     * Decrypt a ciphered integer to the original character
     * @param cipher The encrypted character as integer
     * @param prev The previous ciphered value, or -1 for the first character
     * @param key The module key (range of cipher values)
     * @return The decrypted original character
     */
    public static char decipher(int cipher, int prev, int key){
        if (prev == -1) return (char) cipher;
        int m = 0;
        // Ensure non-negative values before module
        m = (cipher - prev + key) % key;

        return (char) m;
    }
}
