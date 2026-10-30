import java.util.Scanner;

public class IT26102759Lab7Q1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Loop for 3 students
        for (int i = 1; i <= 3; i++) {
            System.out.println("Student " + i);
            System.out.print("Enter marks: ");
            
            double mark1 = scanner.nextDouble();
            double mark2 = scanner.nextDouble();
            double mark3 = scanner.nextDouble();
            double mark4 = scanner.nextDouble();
            
            // Calculate average
            double average = (mark1 + mark2 + mark3 + mark4) / 4.0;
            
            System.out.println("Average is : " + average);
            
            // Determine and display overall grade
            if (average >= 75) {
                System.out.println("Overall Grade is : Distinction\n");
            } else if (average >= 50) {
                System.out.println("Overall Grade is : Credit\n");
            } else {
                System.out.println("Overall Grade is : Fail\n");
            }
        }
        
        scanner.close();
    }
}