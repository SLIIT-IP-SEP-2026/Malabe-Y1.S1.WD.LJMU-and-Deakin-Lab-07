public class IT26102759Lab7Q2B {
    public static void main(String[] args) {
        // Loop from 1 to 5
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " - ");
            // Print 'i' number of stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}