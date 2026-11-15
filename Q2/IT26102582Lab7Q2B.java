public class IT26102582Lab7Q2B {

    public static void main(String[] args) {
		
		int number;
		int star;

        for (number = 1; number <= 5; number++) {

            System.out.print(number + " - ");

            for (star = 1; star <= number; star++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}