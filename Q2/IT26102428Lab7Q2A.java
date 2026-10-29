
public class IT26102428Lab7Q2A {
    public static void main(String[] args) {
        int row = 1;

        while (row <= 4) {
            int column = 1;

            while (column <= 5) {
                System.out.print("$");
                column++;
            }

            System.out.println();
            row++;
        }
    }
}
