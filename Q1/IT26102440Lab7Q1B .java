import java.util.Scanner;

public class public class IT26102440Lab7Q1B{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		double mark, total, average;
		
		for (int student = 1: student <= 3; student++){
			
			total = 0
			
			System.out.println("Student " + student);
			System.out.print("Enter marks: ");
			
			for (int i=1; i<=4: i++){
				mark = input.nextDouble();
				total = total + mark;
			
			}
			
			average = total / 4;
			
			System.out.println("Average is: " + average);
			
			if (average >= 75){
				System.out.println("Overall Grade is: Distinction");
			}
			else if (average >= 50){
				System.out.println("Overall Grade is: credit");
			}
			else{
				System.out.println("Overall Grade is: Fail");
			}
			
			System.out.println();
		}
	}
}