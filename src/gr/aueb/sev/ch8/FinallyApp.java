package gr.aueb.sev.ch8;

/**
 * try / catch /finally
 */
public class FinallyApp {

    public static void main(String[] args) {
        int num = 31;

        try {
            if (num == 31) {
                throw new Exception();
            }
        } catch (Exception e){
            System.out.println("Error caught");
            return;
        } finally {
            System.out.println("This code is always executed!");
        }

        System.out.println("This piece of code is executed...");
    }
}
