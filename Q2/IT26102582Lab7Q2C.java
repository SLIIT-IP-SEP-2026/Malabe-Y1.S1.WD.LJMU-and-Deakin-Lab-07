public class IT26102582Lab7Q2C {

    public static void main(String[] args) {
		
		int number;
		int count;

        for (number = 5; number >= 1; number--) {

            for (count = 1; count <= number; count++) {
                System.out.print(number);
            }

            System.out.println();
        }
    }
}