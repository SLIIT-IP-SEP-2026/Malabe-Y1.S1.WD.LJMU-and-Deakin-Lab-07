import java.util.Scanner;

public class IT26102438Lab7Q1B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int student = 1; student <= 3; student++) {
            System.out.println("Student " + student);
            System.out.print("Enter marks: ");

            int total = 0;
            for (int i = 1; i <= 4; i++) {
                int mark = input.nextInt();
                total = total + mark;
            }

            double average = total / 4.0;

            String grade;
            if (average >= 75) {
                grade = "Distinction";
            } else if (average >= 50) {
                grade = "Credit";
            } else {
                grade = "Fail";
            }

            System.out.println("Average is : " + average);
            System.out.println("Overall Grade is : " + grade);

            if (student < 3) {
                System.out.println();
            }
        }
    }
}
