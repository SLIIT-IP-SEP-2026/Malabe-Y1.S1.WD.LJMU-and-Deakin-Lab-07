import java.util.Scanner;

public class IT26102783Lab7Q1A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;

        System.out.println("Enter marks for four subjects:");
        
        for (int i = 1; i <= 4; i++) {
            System.out.print("Enter Subject Mark " + i + ": ");
            int mark = input.nextInt();
            total += mark;
        }

        double average = total / 4.0;
        String grade;

        if (average >= 75 && average <= 100) {
            grade = "Distinction";
        } else if (average >= 50 && average <= 74) {
            grade = "Credit";
        } else {
            grade = "Fail";
        }

        System.out.println("\nAverage is : " + average);
        System.out.println("Overall Grade is : " + grade);
        
        input.close();
    }
}