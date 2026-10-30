import java.util.Scanner;


public class IT26102381Lab7Q1A {

    public static void main(String[] args) {

        double integer, intSqure, intSqureRoot;

        Scanner sc = new Scanner(System.in);

        // ¯\_(ツ)_/¯ = without using a list or array
        int sub1 = 0;
        int sub2 = 0;
        int sub3 = 0;
        int sub4 = 0;

        System.out.println("Please enter marks for four subjects:");

        for (int i = 1; i <= 4; i++) {
            System.out.print("Enter Subject Mark " + i + ": ");
            int marks = sc.nextInt();

            switch (i) {
                case 1: sub1 = marks; break;
                case 2: sub2 = marks; break;
                case 3: sub3 = marks; break;
                case 4: sub4 = marks; break;
            }
        }

        double average = (sub1 + sub2 + sub3 + sub4) / 4.0;
        System.out.println("\nAverage is: " + average);


        String grade = "Overall Grade is: ";
        if (average >= 75) {
            grade += "Distinction";
        } else if (average >= 50) {
            grade += "Pass";
        } else {
            grade += "Fail";
        }

        System.out.println(grade);

        sc.close();
    }

}