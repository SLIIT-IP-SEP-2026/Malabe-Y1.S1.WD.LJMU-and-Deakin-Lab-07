import java.util.Scanner;
public class IT26102441Lab7Q3{
	public static void main(String[] args){
		Scanner obj=new Scanner(System.in);
		int i;
		
		for(i=1;i<=5;i++){
			System.out.println("Customer "+i);
			System.out.println("Enter total bill amount: ");
			int total_amount = obj.nextInt();
			System.out.println("Enter mode of payment(C for cash, O for other):");
			char mode = obj.next().charAt(0);
			if(mode =='C'){
				
				double discount=total_amount*(0.05);
				double amount_to_paid = total_amount-discount;
				System.out.println("Didcount is: "+discount);
				System.out.println("Amount to be paid: "+amount_to_paid);
			}
			else if(mode == 'c'){
				double discount=total_amount*(0.05);
				double amount_to_paid = total_amount-discount;
				System.out.println("Didcount is: "+discount);
				System.out.println("Amount to be paid: "+amount_to_paid);
			}
			
			else if(mode == 'O'){
				System.out.println("No discount applicable");
				System.out.println("Amount to be paid: "+total_amount);
			}
			
			else if(mode == 'o'){
				System.out.println("No discount applicable");
				System.out.println("Amount to be paid: "+total_amount);
			}
			else{
				System.out.println("Payment Mode is Not Valid");
			}
			
			
		}
	}
}