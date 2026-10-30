import java.util.Scanner;


public class IT26102381Lab7Q1B {

    public static void main(String[] args) {

        double integer, intSqure, intSqureRoot;

        Scanner sc = new Scanner(System.in);

        // for 3 students
        for (int i = 1; i <= 3; i++) {
            System.out.print("Student " + i);

            int sub1 = 0;
            int sub2 = 0;
            int sub3 = 0;
            int sub4 = 0;

            // inline inputs separated by space
            System.out.print("\nEnter marks: ");
            sub1 = sc.nextInt();
            sub2 = sc.nextInt();
            sub3 = sc.nextInt();
            sub4 = sc.nextInt();

            double average = (sub1 + sub2 + sub3 + sub4) / 4.0;
            System.out.println("Average is: " + average);

            String grade = "Overall Grade is: ";
            if (average >= 75) {
                grade += "Distinction";
            } else if (average >= 50) {
                grade += "Pass";
            } else {
                grade += "Fail";
            }

            System.out.println(grade);

            System.out.println("");
        }

        sc.close();
    }

}