import java.util.Scanner;

public class IT26102582Lab7Q1A {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter marks for four subjects:");

        System.out.print("Enter Subject Mark 1: ");
        int mark_1 = input.nextInt();

        System.out.print("Enter Subject Mark 2: ");
        int mark_2 = input.nextInt();

        System.out.print("Enter Subject Mark 3: ");
        int mark_3 = input.nextInt();

        System.out.print("Enter Subject Mark 4: ");
        int mark_4 = input.nextInt();

        System.out.println();

        int totalMark = mark_1 + mark_2 + mark_3 + mark_4;

        double average = totalMark / 4.0;

        System.out.println("Average is: " + average);

        if (average >= 75 && average <= 100) {
            System.out.println("Overall Grade is: Distinction");
			}
			
		else if (average >= 50 && average < 75) {
            System.out.println("Overall Grade is: Credit");
			}
			
		else {
            System.out.println("Overall Grade is: Fail");
			}
    }
}