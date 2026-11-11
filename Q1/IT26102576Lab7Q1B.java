import java.util.Scanner;

public class IT26102576Lab7Q1B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double mark1, mark2, mark3, mark4, average;

        
        System.out.println("Student 1");
        System.out.print("Enter marks: ");
        mark1 = input.nextDouble();
        mark2 = input.nextDouble();
        mark3 = input.nextDouble();
        mark4 = input.nextDouble();
        average = (mark1 + mark2 + mark3 + mark4) / 4;
        System.out.println("Average is : " + average);
        if (average >= 75) {
            System.out.println("Overall Grade is : Distinction");
        } else if (average >= 50) {
            System.out.println("Overall Grade is : Credit");
        } else {
            System.out.println("Overall Grade is : Fail");
        }
        System.out.println();


        System.out.println("Student 2");
        System.out.print("Enter marks: ");
        mark1 = input.nextDouble();
        mark2 = input.nextDouble();
        mark3 = input.nextDouble();
        mark4 = input.nextDouble();
        average = (mark1 + mark2 + mark3 + mark4) / 4;
        System.out.println("Average is : " + average);
        if (average >= 75) {
            System.out.println("Overall Grade is : Distinction");
        } else if (average >= 50) {
            System.out.println("Overall Grade is : Credit");
        } else {
            System.out.println("Overall Grade is : Fail");
        }
        System.out.println();


        System.out.println("Student 3");
        System.out.print("Enter marks: ");
        mark1 = input.nextDouble();
        mark2 = input.nextDouble();
        mark3 = input.nextDouble();
        mark4 = input.nextDouble();
        average = (mark1 + mark2 + mark3 + mark4) / 4;
        System.out.println("Average is : " + average);
        if (average >= 75) {
            System.out.println("Overall Grade is : Distinction");
        } else if (average >= 50) {
            System.out.println("Overall Grade is : Credit");
        } else {
            System.out.println("Overall Grade is : Fail");
        }
    }
}
