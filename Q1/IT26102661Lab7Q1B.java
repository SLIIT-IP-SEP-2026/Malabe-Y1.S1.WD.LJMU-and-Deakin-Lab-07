import java.util.Scanner;

public class IT26102661Lab7Q1B {
	
    public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);
		
        double mark;
        double sum;
        double average;
        String grade;
        int student, subject;

        for (student = 1; student <= 3; student++) {
            sum = 0;

            System.out.println("Student " + student);
            System.out.print("Enter marks: ");

            for (subject = 1; subject <= 4; subject++) {
                mark = input.nextDouble();
                sum = sum + mark;
            }

            average = sum / 4;

            if (average >= 75) {
                grade = "Distinction";
            } else if (average >= 50) {
                grade = "Credit";
            } else {
                grade = "Fail";
            }

            System.out.println("Average is : " + average);
            System.out.println("Overall Grade is : " + grade);
            System.out.println();
        }
    }
}