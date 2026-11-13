

public class IT26102758Lab7Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {

            System.out.println("\nCustomer " + i);

            System.out.print("Enter total bill amount: ");
            double bill = input.nextDouble();

            System.out.print("Enter payment mode (C/O): ");
            String mode = input.next().toUpperCase();

            while (!mode.equals("C") && !mode.equals("O")) {

                System.out.println("Payment Mode is Not Valid");

                System.out.print("Enter payment mode (C/O): ");
                mode = input.next().toUpperCase();
            }

            double discount = 0;

            if (mode.equals("C")) {
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
