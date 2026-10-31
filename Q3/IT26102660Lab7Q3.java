import java.util.Scanner;
public class IT26102660Lab7Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int customer = 1; customer <= 5; customer++) {
            System.out.println("Customer " + customer);
            System.out.print("Enter total bill amount: ");
            double Amt = input.nextDouble();

            System.out.print("Enter mode of payment (C for cash, O for other): ");
            char Mode = input.next().charAt(0);

            if (Mode == 'C' || Mode == 'c') {
                double discount = Amt * 0.05;
                double AmtPay = Amt - discount;

                System.out.println("Discount is : " + discount);
                System.out.println("Amount to be paid: " + AmtPay);
            } else if (Mode == 'O' || Mode == 'o') {
                System.out.println("No discount applicable");
                System.out.println("Amount to be paid: " + Amt);
            } else {
                System.out.println("Payment Mode is Not Valid");
            }

            System.out.println();
        }

        input.close();
    }
}