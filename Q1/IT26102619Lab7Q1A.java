import java.util.Scanner;
public class IT26102619Lab7Q1A{
    public static void main(String[] args){
	
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Marks for four subjects: ");
        System.out.print("Enter subject Mark 1: ");
        int mark1 = input.nextInt();
        System.out.print("Enter subject Mark 2: ");
        int mark2 = input.nextInt();
        System.out.print("Enter subject Mark 3: ");
        int mark3 = input.nextInt();
        System.out.print("Enter subject Mark 4: ");
        int mark4 = input.nextInt();

        System.out.println();

        double avg = (mark1 + mark2 + mark3 + mark4)/4;
        System.out.println("Average is : " + avg);

        if(avg>=75 && avg<=100)
        {
            System.out.println("Overall Grade is : Distinction");
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