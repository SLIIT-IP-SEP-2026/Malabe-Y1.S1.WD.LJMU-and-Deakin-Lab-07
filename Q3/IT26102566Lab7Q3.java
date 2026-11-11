import java.util.Scanner;
 
public class IT26102566Lab7Q3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        for(int i=1; i<=5; i++){
            System.out.println("Customer "+i);
            System.out.print("Enter total bill amount: ");
            double bill = sc.nextDouble();
            System.out.print("Enter mode of payment (C for cash, O for other): ");
            String mode = sc.next();
 
            if(mode.equals("C") || mode.equals("c")){
                double disc = bill*5/100;
                System.out.println("Discount is : "+disc);
                System.out.println("Amount to be paid: "+(bill-disc));
            }
            else if(mode.equals("O") || mode.equals("o")){
                System.out.println("No discount applicable");
                System.out.println("Amount to be paid: "+bill);
            }
            else{
                System.out.println("Payment Mode is Not Valid");
            }
            System.out.println();
        }
    }
}