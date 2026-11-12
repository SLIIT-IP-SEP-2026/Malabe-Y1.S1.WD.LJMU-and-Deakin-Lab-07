import java.util.Scanner;

public class IT26102577Lab7Q1B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int student = 1;

        while (student <= 3) {
            System.out.println("Student " + student);
            System.out.print("Enter marks: ");

            int mark1 = input.nextInt();
            int mark2 = input.nextInt();
            int mark3 = input.nextInt();
            int mark4 = input.nextInt();

            double average = (mark1 + mark2 + mark3 + mark4) / 4.0;

            System.out.println("Average is : " + average);

            if (average >= 75) {
                System.out.println("Overall Grade is : Distinction");
            } else if (average >= 50) {
                System.out.println("Overall Grade is : Credit");
            } else {
                System.out.println("Overall Grade is : Fail");
            }

            System.out.println();
            student++;
        }

        input.close();
    }
}
