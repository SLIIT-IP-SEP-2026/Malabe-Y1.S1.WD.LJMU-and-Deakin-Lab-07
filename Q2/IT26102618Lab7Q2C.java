public class IT26102618Lab7Q2C {
    public static void main(String[] args) {
        int row, col;

        for (row = 5; row >= 1; row--) {

            for (col = 1; col <= row; col++) {
                System.out.print(row);
            }

            System.out.println();
        }
    }
}
