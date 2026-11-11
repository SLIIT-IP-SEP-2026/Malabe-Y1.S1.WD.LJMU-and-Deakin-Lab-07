import java.util.Scanner;
 
public class IT26102566Lab7Q1A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        System.out.println("Enter marks for four subjects:");
        System.out.print("Enter Subject Mark 1: ");
        double a = sc.nextDouble();
        System.out.print("Enter Subject Mark 2: ");
        double b = sc.nextDouble();
        System.out.print("Enter Subject Mark 3: ");
        double c = sc.nextDouble();
        System.out.print("Enter Subject Mark 4: ");
        double d = sc.nextDouble();
 
        double avg = (a+b+c+d)/4;
 
        System.out.println();
        System.out.println("Average is : "+avg);
 
        if(avg>=75)
            System.out.println("Overall Grade is : Distinction");
        else if(avg>=50)
            System.out.println("Overall Grade is : Credit");
        else
            System.out.println("Overall Grade is : Fail");
    }
}
 