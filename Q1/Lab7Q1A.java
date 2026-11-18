import java.util.Scanner;

public class IT26102753Lab7Q1A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        for (int i = 1; i <= 4; i++) {
            System.out.print("Enter Subject Mark " + i + ": ");
            sum += sc.nextInt();
        }

        double avg = sum / 4.0;

        System.out.println("Average = " + avg);

        if (avg >= 75)
            System.out.println("Grade = Distinction");
        else if (avg >= 50)
            System.out.println("Grade = Credit");
        else
            System.out.println("Grade = Fail");
    }
}