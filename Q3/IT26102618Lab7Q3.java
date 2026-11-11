
import java.util.Scanner;

public class IT26102618Lab7Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double bill1, bill2, bill3, bill4, bill5;
        double discount1, discount2, discount3, discount4, discount5;
        double amount1, amount2, amount3, amount4, amount5;

        char Mode1, Mode2, Mode3, Mode4, Mode5;

        // Customer 1
        System.out.println("Customer 1");

        System.out.print("Enter total bill amount: ");
        bill1 = input.nextDouble();

        System.out.print("Enter mode of payment (C for cash/O for other): ");
        Mode1 = input.next().charAt(0);

        if (Mode1 != 'C' && Mode1 != 'c' && Mode1 != 'O' && Mode1 != 'o') {
            System.out.println("Payment Mode is Not Valid");
            discount1 = 0;
        }
        else if (Mode1 == 'C' || Mode1 == 'c') {
            discount1 = bill1 * 0.05;
        }
        else {
            discount1 = 0;
        }

        amount1 = bill1 - discount1;

        System.out.println("Discount = " + discount1);
        System.out.println("Amount to pay = " + amount1);


        // Customer 2
        System.out.println("\nCustomer 2");

        System.out.print("Enter total bill amount: ");
        bill2 = input.nextDouble();

        System.out.print("Enter mode of payment (C for cash/O for other): ");
        Mode2 = input.next().charAt(0);

        if (Mode2 != 'C' && Mode2 != 'c' && Mode2 != 'O' && Mode2 != 'o') {
            System.out.println("Payment Mode is Not Valid");
            discount2 = 0;
        }
        else if (Mode2 == 'C' || Mode2 == 'c') {
            discount2 = bill2 * 0.05;
        }
        else {
            discount2 = 0;
        }

        amount2 = bill2 - discount2;

        System.out.println("Discount = " + discount2);
        System.out.println("Amount to pay = " + amount2);


        // Customer 3
        System.out.println("\nCustomer 3");

        System.out.print("Enter total bill amount: ");
        bill3 = input.nextDouble();

        System.out.print("Enter mode of payment (C for cash/O for other): ");
        Mode3 = input.next().charAt(0);

        if (Mode3 != 'C' && Mode3 != 'c' && Mode3 != 'O' && Mode3 != 'o') {
            System.out.println("Payment Mode is Not Valid");
            discount3 = 0;
        }
        else if (Mode3 == 'C' || Mode3 == 'c') {
            discount3 = bill3 * 0.05;
        }
        else {
            discount3 = 0;
        }

        amount3 = bill3 - discount3;

        System.out.println("Discount = " + discount3);
        System.out.println("Amount to pay = " + amount3);


        // Customer 4
        System.out.println("\nCustomer 4");

        System.out.print("Enter total bill amount: ");
        bill4 = input.nextDouble();

        System.out.print("Enter mode of payment (C for cash/O for other): ");
        Mode4 = input.next().charAt(0);

        if (Mode4 != 'C' && Mode4 != 'c' && Mode4 != 'O' && Mode4 != 'o') {
            System.out.println("Payment Mode is Not Valid");
            discount4 = 0;
        }
        else if (Mode4 == 'C' || Mode4 == 'c') {
            discount4 = bill4 * 0.05;
        }
        else {
            discount4 = 0;
        }

        amount4 = bill4 - discount4;

        System.out.println("Discount = " + discount4);
        System.out.println("Amount to pay = " + amount4);


        // Customer 5
        System.out.println("\nCustomer 5");

        System.out.print("Enter total bill amount: ");
        bill5 = input.nextDouble();

        System.out.print("Enter mode of payment (C for cash/O for other): ");
        Mode5 = input.next().charAt(0);

        if (Mode5 != 'C' && Mode5 != 'c' && Mode5 != 'O' && Mode5 != 'o') {
            System.out.println("Payment Mode is Not Valid");
            discount5 = 0;
        }
        else if (Mode5 == 'C' || Mode5 == 'c') {
            discount5 = bill5 * 0.05;
        }
        else {
            discount5 = 0;
        }

        amount5 = bill5 - discount5;

        System.out.println("Discount = " + discount5);
        System.out.println("Amount to pay = " + amount5);

    }
}
