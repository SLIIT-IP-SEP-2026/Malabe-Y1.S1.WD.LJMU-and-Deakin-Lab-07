public class IT26102618Lab7Q2B {
    public static void main(String[] args) {
        int row, col;

        for (row = 1; row <= 5; row++) {

            System.out.print(row + "-");

            for (col = 1; col <= row; col++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
