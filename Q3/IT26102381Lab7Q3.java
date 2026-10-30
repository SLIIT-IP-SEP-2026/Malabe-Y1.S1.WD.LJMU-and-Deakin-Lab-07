import java.util.Scanner;

public class IT26102381Lab7Q3 {

    public static void main(String[] args) {

        final int CUSTOMER_COUNT = 5;
        final double discountRate = 0.05; // 5% discount rate
        final char[] validPaymentModes = {'C', 'O'};

        Scanner sc = new Scanner(System.in);

        for (int i=1; i <= CUSTOMER_COUNT; i++) {

            double totalBill, discountPrice, finalBill;
            // java compiler flags a false positive error:
            // otherwise: error: variable modeOfPayment might not have been initialized
            // even though the while loop below will ALWAYS initialize it before use,
            // but java compiler is too stupid to figure that out
            char modeOfPayment = ' ';

            System.out.println("Customer " + i);

            System.out.print("Enter total bill amount: ");
            totalBill = sc.nextDouble();

            // Validate payment mode
            boolean validPayment = false;
            while (!validPayment) {
                System.out.print("Enter mode of payment (C for cash, O for other): ");
                modeOfPayment = sc.next().toUpperCase().charAt(0);

                validPayment = modeOfPayment == validPaymentModes[0] || modeOfPayment == validPaymentModes[1];

                if (!validPayment) {
                    System.out.println("Invalid payment mode. Please enter C for cash or O for other.");
                }
            }

            if (modeOfPayment == 'C') {
                discountPrice = totalBill * discountRate;
                finalBill = totalBill - discountPrice;
                System.out.println("Discount is: " + discountPrice);
            } else {
                finalBill = totalBill;
                System.out.println("No discount applicable");
            }

            System.out.println("Amount to be paid: " + finalBill);

            System.out.println("");
        }
    }

}