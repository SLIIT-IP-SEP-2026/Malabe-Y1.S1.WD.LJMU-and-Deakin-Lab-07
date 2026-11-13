import java.util.Scanner;

public class IT26102756Lab7Q1B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int student = 1; student <= 3; student++) {
            System.out.println("Student " + student);
            System.out.print("Enter marks: ");

            double total = 0;
            for (int subj = 1; subj <= 4; subj++) {
                total += input.nextDouble();
            }

            double average = total / 4.0;
            String grade;

            if (average >= 75 && average <= 100) {
                grade = "Distinction";
            } else if (average >= 50 && average < 75) {
                grade = "Credit";
            } else {
                grade = "Fail";
            }

            System.out.println("Average is: " + average);
            System.out.println("Overall Grade is: " + grade);
            System.out.println();
        }

        input.close();
    }
}