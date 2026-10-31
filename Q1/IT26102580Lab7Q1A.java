import java.util.Scanner;

public class IT26102580Lab7Q1A {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int mark1, mark2, mark3, mark4;
        double average;

        System.out.println("Enter marks for four subjects: ");
		
		System.out.print("Enter Subject Mark 1: ");
        mark1 = input.nextInt();
		
		System.out.print("Enter Subject Mark 2: ");
        mark2 = input.nextInt();
		
		System.out.print("Enter Subject Mark 3: ");
        mark3 = input.nextInt();
		
		System.out.print("Enter Subject Mark 4: ");
        mark4 = input.nextInt();

        average = (mark1 + mark2 + mark3 + mark4) / 4.0;

        System.out.println("\nAverage: " + average);

        if (average >= 75) {
            System.out.println("Grade: Distinction");
        }
        else if (average >= 50) {
            System.out.println("Grade: Credit");
        }
        else {
            System.out.println("Grade: Fail");
        }
    }
}
