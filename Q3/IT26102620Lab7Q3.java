import java.util.Scanner;

public class IT26102620Lab7Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double billAmount, discount, amountToPay;
        char paymentMode;

        for (int i = 1; i <= 5; i++) {

            System.out.println("Customer " + i);

            System.out.print("Enter total bill amount: ");
            billAmount = input.nextDouble();

            System.out.print("Enter payment mode (C/O): ");
            paymentMode = input.next().charAt(0);

            if (paymentMode == 'C' || paymentMode == 'c') {

                discount = billAmount * 0.05;
                amountToPay = billAmount - discount;

                System.out.println("Discount: " + discount);
                System.out.println("Amount to be paid: " + amountToPay);

            } else if (paymentMode == 'O' || paymentMode == 'o') {

                discount = 0;
                amountToPay = billAmount;

                System.out.println("Discount: " + discount);
                System.out.println("Amount to be paid: " + amountToPay);

            } else {

                System.out.println("Payment Mode is Not Valid");
            }
        }

        input.close();
    }
}
