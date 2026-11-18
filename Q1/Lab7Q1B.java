import java.util.Scanner;

public class IT26102753Lab7Q1B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int s = 1; s <= 3; s++) {
            System.out.println("Enter 4 subject marks for Student " + s + ":");

            int m1 = sc.nextInt();
            int m2 = sc.nextInt();
            int m3 = sc.nextInt();
            int m4 = sc.nextInt();

            double avg = (m1 + m2 + m3 + m4) / 4.0;

            if (avg >= 75)
                System.out.println("Grade = Distinction");
            else if (avg >= 50)
                System.out.println("Grade = Credit");
            else
                System.out.println("Grade = Fail");
        }
    }
}