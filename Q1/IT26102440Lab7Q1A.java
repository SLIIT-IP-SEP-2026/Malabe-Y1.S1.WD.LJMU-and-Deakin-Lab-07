import java.util.Scanner;
public class IT26102440Lab7Q1A{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		double mark, total = 0, average;
		
		System.out.println("Enter marks for four subjects:");
		
		for(int i = 1; i<=4; i++){
			System.out.print("Enter Subject Mark" + i + ": ");
			mark = input.nextDouble();
			
			total = total + mark;
		}
		
		average = total / 4;
		
		System.out.println("Average is :" + average);
		
		if (average >= 75){
			System.out.println("Overall Grade is : Distinction");
		}
		else if (average >= 50){
			System.out.println("Overall Grade is: credit");
		}
		else{
			System.out.println("Overall Grade is : Fail");
		}
	}
}
