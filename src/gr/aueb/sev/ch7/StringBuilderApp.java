package gr.aueb.sev.ch7;

/**
 * {@link StringBuilder} is mutable
 *
 * This program compares the time it takes to concatenate numbers
 * using a regular immutable String versus using a mutable StringBuilder
 */
public class StringBuilderApp {

    public static void main(String[] args) {
        String concatStr = ""; // Immutable String
        StringBuilder sb = new StringBuilder(); // Mutable StringBuilder
        long timeStart = 0L;
        long timeEnd = 0L;
        double strElapsedTime = 0.0;
        double sbElapsedTime = 0.0;

        timeStart = System.currentTimeMillis();

        for (int i = 1; i < 50_000; i++){
            concatStr = concatStr + i;
        }

        timeEnd = System.currentTimeMillis();
        strElapsedTime = (timeEnd - timeStart) / 1000.0;

        System.out.println("String elapsed time:  " + strElapsedTime + " seconds");
        timeStart = System.currentTimeMillis();

        for (int i = 1; i < 50_000_000; i++){
            sb.append(i);
        }
        timeEnd = System.currentTimeMillis();
        sbElapsedTime = (timeEnd - timeStart) / 1000.0;

        System.out.println("SB elapsed time: " + sbElapsedTime + " seconds");
    }
}
