import java.util.Scanner;

public class IT26102753Lab7Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter Bill Amount: ");
            double bill = sc.nextDouble();

            System.out.print("Enter Payment Mode (C/O): ");
            char mode = sc.next().charAt(0);

            double discount = 0;

            if (mode == 'C' || mode == 'c') {
                discount = bill * 0.05;
                System.out.println("Discount = " + discount);
                System.out.println("Amount to Pay = " + (bill - discount));
            } 
            else if (mode == 'O' || mode == 'o') {
                System.out.println("Discount = 0");
                System.out.println("Amount to Pay = " + bill);
            } 
            else {
                System.out.println("Payment Mode is Not Valid");
            }

            System.out.println();
        }
    }
}