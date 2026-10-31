import java.util.Scanner;
public class IT26102660Lab7Q1B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int Student = 1; Student <= 3; Student++) {
            System.out.println("Student " + Student);
            System.out.print("Enter marks: ");

            int Tot = 0;
            for (int Sub = 1; Sub <= 4; Sub++) {
                Tot += input.nextInt();
            }

            double Avg = Tot / 4.0;
            System.out.println("Average is : " + Avg);

            if (Avg >= 75 && Avg <= 100) {
                System.out.println("Overall Grade is : Distinction");
            } else if (Avg >= 50) {
                System.out.println("Overall Grade is : Credit");
            } else {
                System.out.println("Overall Grade is : Fail");
            }

            System.out.println();
        }

        input.close();
    }
}