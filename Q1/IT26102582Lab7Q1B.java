import java.util.Scanner;

public class IT26102582Lab7Q1B {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Student 1");
        System.out.print("Enter marks: ");

        int mark1 = input.nextInt();
        int mark2 = input.nextInt();
        int mark3 = input.nextInt();
        int mark4 = input.nextInt();

        int totalMark = mark1 + mark2 + mark3 + mark4;
        double average = totalMark / 4.0;

        System.out.println("Average is : " + average);

        if (average >= 75) {
            System.out.println("Overall Grade is : Distinction");
		}
		
        else if (average >= 50) {
            System.out.println("Overall Grade is : Credit");
		}
		
        else {
            System.out.println("Overall Grade is : Fail");
        }

        System.out.println();
		
		System.out.println("Student 2");
        System.out.print("Enter marks: ");

        mark1 = input.nextInt();
        mark2 = input.nextInt();
        mark3 = input.nextInt();
        mark4 = input.nextInt();

        totalMark = mark1 + mark2 + mark3 + mark4;
        average = totalMark / 4.0;

        System.out.println("Average is : " + average);

        if (average >= 75) {
            System.out.println("Overall Grade is : Distinction");
		}
		
        else if (average >= 50) {
            System.out.println("Overall Grade is : Credit");
		}
		
        else {
            System.out.println("Overall Grade is : Fail");
        }

        System.out.println();
		
		System.out.println("Student 3");
        System.out.print("Enter marks: ");

        mark1 = input.nextInt();
        mark2 = input.nextInt();
        mark3 = input.nextInt();
        mark4 = input.nextInt();

        totalMark = mark1 + mark2 + mark3 + mark4;
        average = totalMark / 4.0;

        System.out.println("Average is : " + average);

        if (average >= 75) {
            System.out.println("Overall Grade is : Distinction");
		}
		
        else if (average >= 50) {
            System.out.println("Overall Grade is : Credit");
		}
		
        else {
            System.out.println("Overall Grade is : Fail");
        }

        System.out.println();
		
	}
}