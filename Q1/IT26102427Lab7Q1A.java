import java.util.Scanner;

public class IT26102427Lab7Q1A {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter marks for four subjects:");

        System.out.print("Enter Subject Mark 1: ");
        double mark1 = input.nextDouble();

        System.out.print("Enter Subject Mark 2: ");
        double mark2 = input.nextDouble();

        System.out.print("Enter Subject Mark 3: ");
        double mark3 = input.nextDouble();

        System.out.print("Enter Subject Mark 4: ");
        double mark4 = input.nextDouble();

        double average = (mark1 + mark2 + mark3 + mark4) / 4;

        System.out.println();
        System.out.println("Average is : " + average);

        if (average >= 75) {
            System.out.println("Overall Grade is : Distinction");
        } else if (average >= 50) {
            System.out.println("Overall Grade is : Credit");
        } else {
            System.out.println("Overall Grade is : Fail");
        }

        input.close();
    }
}