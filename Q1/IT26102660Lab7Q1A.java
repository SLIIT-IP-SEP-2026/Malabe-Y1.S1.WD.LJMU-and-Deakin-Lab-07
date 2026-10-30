import java.util.Scanner;
public class IT26102660Lab7Q1A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Num = 1;
        int Total = 0;
        while (Num <= 4){
            System.out.print("Enter Subject Mark " + Num + ": ");
            int Mark = input.nextInt();
            Total += Mark;
            Num++;
        }
        double Average = Total / 4.0;
        if (Average<=100 && Average>=75){
            System.out.println("Average is " + Average);
            System.out.println("Overall Grade is: Distinction");
        } else if (Average<74 && Average>=50){
            System.out.println("Average is " + Average);
            System.out.println("Overall Grade is: Credit");
        } else if (Average<49 && Average>=0){
            System.out.println("Average is " + Average);
            System.out.println("Overall Grade is: Fail");
        }
        input.close();
    }   
}
