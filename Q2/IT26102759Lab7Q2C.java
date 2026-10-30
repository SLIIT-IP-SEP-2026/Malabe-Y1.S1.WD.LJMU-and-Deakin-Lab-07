public class IT26102759Lab7Q2C {
    public static void main(String[] args) {
        // Outer loop from 5 down to 1
        for (int i = 5; i >= 1; i--) {
            // Inner loop to repeat the digit 'i' times
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}