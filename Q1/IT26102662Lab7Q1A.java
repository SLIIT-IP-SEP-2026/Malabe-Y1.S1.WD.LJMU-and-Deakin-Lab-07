import java.util.Scanner;

public class IT26102662Lab7Q1A {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter marks for four subjects: ");
        System.out.print("Enter Subject Mark 1: ");
        int subjectMark1 = input.nextInt();
        System.out.print("Enter Subject Mark 2: ");
        int subjectMark2 = input.nextInt();
        System.out.print("Enter Subject Mark 3: ");
        int subjectMark3 = input.nextInt();
        System.out.print("Enter Subject Mark 4: ");
        int subjectMark4 = input.nextInt();

        System.out.println();

        double avg = (subjectMark1 + subjectMark2 + subjectMark3 + subjectMark4) / 4.0;
        System.out.println("Average is : " + avg);

        if (avg >= 75 && avg <= 100) {
            System.out.println("Overall Grade is : Distinction");
        } else if (avg >= 50 && avg <= 74) {
            System.out.println("Overall Grade is : Credit");
        } else {
            System.out.println("Overall Grade is : Fail");
        }
    }
}