import java.util.Scanner;
public class IT26102754Lab7Q1A
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Marks for four subjects : ");
        System.out.print("Enter subject mark 1 : ");
        int mark1 = sc.nextInt();
        System.out.print("Enter subject mark 2 : ");
        int mark2 = sc.nextInt();
        System.out.print("Enter subject mark 3 : ");
        int mark3 = sc.nextInt();
        System.out.print("Enter subject mark 4 : ");
        int mark4 = sc.nextInt();

        System.out.println(" ");

        double avg = (mark1 + mark2 + mark3 + mark4)/4;
        System.out.println("Average is : " + avg);

        if(avg>=75 && avg<=100)
        {
            System.out.println("Overall Grade is : Credit");
        }
        else if (avg>=50 && avg<=74)
        {
            System.out.println("Overall Grade is : Credit");
        }
        else
        {
            System.out.println("Overall Grade is : Fail");
        }

    }
}