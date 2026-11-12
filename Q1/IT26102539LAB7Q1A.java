
import java.util.Scanner;

public class IT26102539LAB7Q1A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Subject Mark 1: ");
        double submrk1 = input.nextDouble();

        System.out.print("Enter Subject Mark 2: ");
        double submrk2 = input.nextDouble();

        System.out.print("Enter Subject Mark 3: ");
        double submrk3 = input.nextDouble();

        System.out.print("Enter Subject Mark 4: ");
        double submrk4 = input.nextDouble();

        double total = submrk1 + submrk2 + submrk3 + submrk4;
        double avg = total / 4;

        System.out.println("Average Is: " + avg);

        if (avg >= 75) {
            System.out.println("Overall Grade Is: Distinction");
        } else if (avg >= 50) {
            System.out.println("Overall Grade Is: Credit");
        } else {
            System.out.println("Overall Grade Is: Fail");
        }

        input.close();
    }
}
