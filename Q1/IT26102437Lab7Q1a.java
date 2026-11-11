import java.util.Scanner; 
public class IT26102437Lab7Q1a{
	public static void main (String[]args){
		double mark1, mark2, mark3, mark4, average;
		String grade;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter marks for four subjects : ");
		
		System.out.print("Enter Subject Mark 1 : ");
		mark1 = input.nextDouble();
		
		System.out.print("Enter Subject Mark 2 : ");
		mark2 = input.nextDouble();
		
		System.out.print("Enter Subject Mark 3 : ");
		mark3 = input.nextDouble();
		
		System.out.print("Enter Subject Mark 4 : ");
		mark4 = input.nextDouble();
		
		average = mark1 + mark2 + mark3 + mark4 / 4.0;
		
		System.out.println();
		System.out.println("Average is : " + average);
		
		if (average>=75) {
			grade = "Distinction";
			
		} else if (average >= 50) {
			grade = "Credit";
			
		} else {
			grade = "Fail";
			
		}
		
		System.out.println();
		System.out.println("Overall Grade is : " + grade);
	}
}