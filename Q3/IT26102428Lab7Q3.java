
import java.util.Scanner;

public class IT26102428Lab7Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int customer = 1; customer <= 5; customer++) {
            System.out.println("\nCustomer " + customer);

            System.out.print("Enter total bill amount: ");
            double bill = input.nextDouble();

            System.out.print("Enter payment mode (C/O): ");
            char mode = input.next().charAt(0);

            while (mode != 'C' && mode != 'c'
                    && mode != 'O' && mode != 'o') {
                System.out.println("Payment Mode is Not Valid");
                System.out.print("Enter payment mode (C/O): ");
                mode = input.next().charAt(0);
            }

            double discount = 0;

            if (mode == 'C' || mode == 'c') {
                discount = bill * 0.05;
            }

            double amountToPay = bill - discount;

            System.out.println("Total Bill = " + bill);
            System.out.println("Discount = " + discount);
            System.out.println("Amount to Pay = " + amountToPay);
        }

        input.close();
    }
}
