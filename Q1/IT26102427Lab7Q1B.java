import java.util.Scanner;

public class IT26102427Lab7Q1B {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {

            System.out.println("Student " + i);

            System.out.print("Enter marks: ");
            double m1 = input.nextDouble();
            double m2 = input.nextDouble();
            double m3 = input.nextDouble();
            double m4 = input.nextDouble();

            double average = (m1 + m2 + m3 + m4) / 4;

            System.out.println("Average is : " + average);

            if (average >= 75)
                System.out.println("Overall Grade is : Distinction");
            else if (average >= 50)
                System.out.println("Overall Grade is : Credit");
            else
                System.out.println("Overall Grade is : Fail");

            System.out.println();
        }


    }
}
